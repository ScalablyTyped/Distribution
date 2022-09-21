package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1HyperparameterSpec extends StObject {
  
  /**
    * Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
    */
  var algorithm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Indicates if the hyperparameter tuning job enables auto trial early stopping.
    */
  var enableTrialEarlyStopping: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The type of goal to use for tuning. Available types are `MAXIMIZE` and `MINIMIZE`. Defaults to `MAXIMIZE`.
    */
  var goal: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The TensorFlow summary tag name to use for optimizing trials. For current versions of TensorFlow, this tag name should exactly match what is shown in TensorBoard, including all scopes. For versions of TensorFlow prior to 0.12, this should be only the tag passed to tf.Summary. By default, "training/hptuning/metric" will be used.
    */
  var hyperparameterMetricTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The number of failed trials that need to be seen before failing the hyperparameter tuning job. You can specify this field to override the default failing criteria for AI Platform hyperparameter tuning jobs. Defaults to zero, which means the service decides when a hyperparameter job should fail.
    */
  var maxFailedTrials: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The number of training trials to run concurrently. You can reduce the time it takes to perform hyperparameter tuning by adding trials in parallel. However, each trail only benefits from the information gained in completed trials. That means that a trial does not get access to the results of trials running at the same time, which could reduce the quality of the overall optimization. Each trial will use the same scale tier and machine types. Defaults to one.
    */
  var maxParallelTrials: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. How many training trials should be attempted to optimize the specified hyperparameters. Defaults to one.
    */
  var maxTrials: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The set of parameters to tune.
    */
  var params: js.UndefOr[js.Array[SchemaGoogleCloudMlV1ParameterSpec]] = js.undefined
  
  /**
    * Optional. The prior hyperparameter tuning job id that users hope to continue with. The job id will be used to find the corresponding vizier study guid and resume the study.
    */
  var resumePreviousJobId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1HyperparameterSpec {
  
  inline def apply(): SchemaGoogleCloudMlV1HyperparameterSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterSpec]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1HyperparameterSpec](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmNull: Self = StObject.set(x, "algorithm", null)
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setEnableTrialEarlyStopping(value: Boolean): Self = StObject.set(x, "enableTrialEarlyStopping", value.asInstanceOf[js.Any])
    
    inline def setEnableTrialEarlyStoppingNull: Self = StObject.set(x, "enableTrialEarlyStopping", null)
    
    inline def setEnableTrialEarlyStoppingUndefined: Self = StObject.set(x, "enableTrialEarlyStopping", js.undefined)
    
    inline def setGoal(value: String): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    inline def setGoalNull: Self = StObject.set(x, "goal", null)
    
    inline def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    inline def setHyperparameterMetricTag(value: String): Self = StObject.set(x, "hyperparameterMetricTag", value.asInstanceOf[js.Any])
    
    inline def setHyperparameterMetricTagNull: Self = StObject.set(x, "hyperparameterMetricTag", null)
    
    inline def setHyperparameterMetricTagUndefined: Self = StObject.set(x, "hyperparameterMetricTag", js.undefined)
    
    inline def setMaxFailedTrials(value: Double): Self = StObject.set(x, "maxFailedTrials", value.asInstanceOf[js.Any])
    
    inline def setMaxFailedTrialsNull: Self = StObject.set(x, "maxFailedTrials", null)
    
    inline def setMaxFailedTrialsUndefined: Self = StObject.set(x, "maxFailedTrials", js.undefined)
    
    inline def setMaxParallelTrials(value: Double): Self = StObject.set(x, "maxParallelTrials", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelTrialsNull: Self = StObject.set(x, "maxParallelTrials", null)
    
    inline def setMaxParallelTrialsUndefined: Self = StObject.set(x, "maxParallelTrials", js.undefined)
    
    inline def setMaxTrials(value: Double): Self = StObject.set(x, "maxTrials", value.asInstanceOf[js.Any])
    
    inline def setMaxTrialsNull: Self = StObject.set(x, "maxTrials", null)
    
    inline def setMaxTrialsUndefined: Self = StObject.set(x, "maxTrials", js.undefined)
    
    inline def setParams(value: js.Array[SchemaGoogleCloudMlV1ParameterSpec]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: SchemaGoogleCloudMlV1ParameterSpec*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setResumePreviousJobId(value: String): Self = StObject.set(x, "resumePreviousJobId", value.asInstanceOf[js.Any])
    
    inline def setResumePreviousJobIdNull: Self = StObject.set(x, "resumePreviousJobId", null)
    
    inline def setResumePreviousJobIdUndefined: Self = StObject.set(x, "resumePreviousJobId", js.undefined)
  }
}
