package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1HyperparameterOutput extends StObject {
  
  /**
    * All recorded object metrics for this trial. This field is not currently populated.
    */
  var allMetrics: js.UndefOr[js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.undefined
  
  /**
    * Details related to built-in algorithms jobs. Only set for trials of built-in algorithms jobs that have succeeded.
    */
  var builtInAlgorithmOutput: js.UndefOr[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput] = js.undefined
  
  /**
    * Output only. End time for the trial.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The final objective metric seen for this trial.
    */
  var finalMetric: js.UndefOr[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.undefined
  
  /**
    * The hyperparameters given to this trial.
    */
  var hyperparameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * True if the trial is stopped early.
    */
  var isTrialStoppedEarly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Start time for the trial.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The detailed state of the trial.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The trial id for these results.
    */
  var trialId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URIs for accessing [interactive shells](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) (one URI for each training node). Only available if this trial is part of a hyperparameter tuning job and the job's training_input.enable_web_access is `true`. The keys are names of each node in the training job; for example, `master-replica-0` for the master node, `worker-replica-0` for the first worker, and `ps-replica-0` for the first parameter server. The values are the URIs for each node's interactive shell.
    */
  var webAccessUris: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudMlV1HyperparameterOutput {
  
  inline def apply(): SchemaGoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterOutput]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1HyperparameterOutput](x: Self) {
    
    inline def setAllMetrics(value: js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = StObject.set(x, "allMetrics", value.asInstanceOf[js.Any])
    
    inline def setAllMetricsUndefined: Self = StObject.set(x, "allMetrics", js.undefined)
    
    inline def setAllMetricsVarargs(value: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric*): Self = StObject.set(x, "allMetrics", js.Array(value*))
    
    inline def setBuiltInAlgorithmOutput(value: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput): Self = StObject.set(x, "builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    inline def setBuiltInAlgorithmOutputUndefined: Self = StObject.set(x, "builtInAlgorithmOutput", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFinalMetric(value: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = StObject.set(x, "finalMetric", value.asInstanceOf[js.Any])
    
    inline def setFinalMetricUndefined: Self = StObject.set(x, "finalMetric", js.undefined)
    
    inline def setHyperparameters(value: StringDictionary[String]): Self = StObject.set(x, "hyperparameters", value.asInstanceOf[js.Any])
    
    inline def setHyperparametersNull: Self = StObject.set(x, "hyperparameters", null)
    
    inline def setHyperparametersUndefined: Self = StObject.set(x, "hyperparameters", js.undefined)
    
    inline def setIsTrialStoppedEarly(value: Boolean): Self = StObject.set(x, "isTrialStoppedEarly", value.asInstanceOf[js.Any])
    
    inline def setIsTrialStoppedEarlyNull: Self = StObject.set(x, "isTrialStoppedEarly", null)
    
    inline def setIsTrialStoppedEarlyUndefined: Self = StObject.set(x, "isTrialStoppedEarly", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrialId(value: String): Self = StObject.set(x, "trialId", value.asInstanceOf[js.Any])
    
    inline def setTrialIdNull: Self = StObject.set(x, "trialId", null)
    
    inline def setTrialIdUndefined: Self = StObject.set(x, "trialId", js.undefined)
    
    inline def setWebAccessUris(value: StringDictionary[String]): Self = StObject.set(x, "webAccessUris", value.asInstanceOf[js.Any])
    
    inline def setWebAccessUrisNull: Self = StObject.set(x, "webAccessUris", null)
    
    inline def setWebAccessUrisUndefined: Self = StObject.set(x, "webAccessUris", js.undefined)
  }
}
