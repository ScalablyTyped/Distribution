package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single hyperparameter tuning trial from a
  * training job. The TrainingOutput object that is returned on successful
  * completion of a training job with hyperparameter tuning includes a list of
  * HyperparameterOutput objects, one for each successful trial.
  */
trait SchemaGoogleCloudMlV1HyperparameterOutput extends StObject {
  
  /**
    * All recorded object metrics for this trial. This field is not currently
    * populated.
    */
  var allMetrics: js.UndefOr[js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.undefined
  
  /**
    * Details related to built-in algorithms job. Only set this for built-in
    * algorithms jobs and for trials that succeeded.
    */
  var builtInAlgorithmOutput: js.UndefOr[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput] = js.undefined
  
  /**
    * The final objective metric seen for this trial.
    */
  var finalMetric: js.UndefOr[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.undefined
  
  /**
    * The hyperparameters given to this trial.
    */
  var hyperparameters: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * True if the trial is stopped early.
    */
  var isTrialStoppedEarly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The trial id for these results.
    */
  var trialId: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1HyperparameterOutput {
  
  inline def apply(): SchemaGoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterOutput]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1HyperparameterOutput](x: Self) {
    
    inline def setAllMetrics(value: js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = StObject.set(x, "allMetrics", value.asInstanceOf[js.Any])
    
    inline def setAllMetricsUndefined: Self = StObject.set(x, "allMetrics", js.undefined)
    
    inline def setAllMetricsVarargs(value: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric*): Self = StObject.set(x, "allMetrics", js.Array(value :_*))
    
    inline def setBuiltInAlgorithmOutput(value: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput): Self = StObject.set(x, "builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    inline def setBuiltInAlgorithmOutputUndefined: Self = StObject.set(x, "builtInAlgorithmOutput", js.undefined)
    
    inline def setFinalMetric(value: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = StObject.set(x, "finalMetric", value.asInstanceOf[js.Any])
    
    inline def setFinalMetricUndefined: Self = StObject.set(x, "finalMetric", js.undefined)
    
    inline def setHyperparameters(value: StringDictionary[String]): Self = StObject.set(x, "hyperparameters", value.asInstanceOf[js.Any])
    
    inline def setHyperparametersUndefined: Self = StObject.set(x, "hyperparameters", js.undefined)
    
    inline def setIsTrialStoppedEarly(value: Boolean): Self = StObject.set(x, "isTrialStoppedEarly", value.asInstanceOf[js.Any])
    
    inline def setIsTrialStoppedEarlyUndefined: Self = StObject.set(x, "isTrialStoppedEarly", js.undefined)
    
    inline def setTrialId(value: String): Self = StObject.set(x, "trialId", value.asInstanceOf[js.Any])
    
    inline def setTrialIdUndefined: Self = StObject.set(x, "trialId", js.undefined)
  }
}
