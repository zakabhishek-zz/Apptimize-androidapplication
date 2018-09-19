package com.example.abhi_macbookpro.apptimize_sdk_abhishek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.apptimize.Apptimize;
import com.apptimize.ApptimizeVar;

public class MainActivity extends AppCompatActivity {
    ApptimizeVar<Integer> dynamicVariable = ApptimizeVar.createInteger("displayresult", 10); //Dynamic Apptimize Variable


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Apptimize.setup(this,"DwVUaVsMXjEaKeGbPTFXwx9HjqHdHcA");
        Integer repeatCountInteger = dynamicVariable.value();
        Apptimize.track("displayresult");
        Apptimize.track("displayresult", 10);
        TextView textView = (TextView) findViewById(R.id.myText);
        textView.setText(String.format("the variable being passed is %d", repeatCountInteger));

    }
}
