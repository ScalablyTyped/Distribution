package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1TrainingOutput extends StObject {
  
  /**
    * Details related to built-in algorithms jobs. Only set for built-in algorithms jobs.
    */
  var builtInAlgorithmOutput: js.UndefOr[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput] = js.undefined
  
  /**
    * The number of hyperparameter tuning trials that completed successfully. Only set for hyperparameter tuning jobs.
    */
  var completedTrialCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount of ML units consumed by the job.
    */
  var consumedMLUnits: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The TensorFlow summary tag name used for optimizing hyperparameter tuning trials. See [`HyperparameterSpec.hyperparameterMetricTag`](#HyperparameterSpec.FIELDS.hyperparameter_metric_tag) for more information. Only set for hyperparameter tuning jobs.
    */
  var hyperparameterMetricTag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this job is a built-in Algorithm job.
    */
  var isBuiltInAlgorithmJob: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this job is a hyperparameter tuning job.
    */
  var isHyperparameterTuningJob: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Results for individual Hyperparameter trials. Only set for hyperparameter tuning jobs.
    */
  var trials: js.UndefOr[js.Array[SchemaGoogleCloudMlV1HyperparameterOutput]] = js.undefined
  
  /**
    * Output only. URIs for accessing [interactive shells](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) (one URI for each training node). Only available if training_input.enable_web_access is `true`. The keys are names of each node in the training job; for example, `master-replica-0` for the master node, `worker-replica-0` for the first worker, and `ps-replica-0` for the first parameter server. The values are the URIs for each node's interactive shell.
    */
  var webAccessUris: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudMlV1TrainingOutput {
  
  inline def apply(): SchemaGoogleCloudMlV1TrainingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1TrainingOutput]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1TrainingOutput](x: Self) {
    
    inline def setBuiltInAlgorithmOutput(value: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput): Self = StObject.set(x, "builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    inline def setBuiltInAlgorithmOutputUndefined: Self = StObject.set(x, "builtInAlgorithmOutput", js.undefined)
    
    inline def setCompletedTrialCount(value: String): Self = StObject.set(x, "completedTrialCount", value.asInstanceOf[js.Any])
    
    inline def setCompletedTrialCountNull: Self = StObject.set(x, "completedTrialCount", null)
    
    inline def setCompletedTrialCountUndefined: Self = StObject.set(x, "completedTrialCount", js.undefined)
    
    inline def setConsumedMLUnits(value: Double): Self = StObject.set(x, "consumedMLUnits", value.asInstanceOf[js.Any])
    
    inline def setConsumedMLUnitsNull: Self = StObject.set(x, "consumedMLUnits", null)
    
    inline def setConsumedMLUnitsUndefined: Self = StObject.set(x, "consumedMLUnits", js.undefined)
    
    inline def setHyperparameterMetricTag(value: String): Self = StObject.set(x, "hyperparameterMetricTag", value.asInstanceOf[js.Any])
    
    inline def setHyperparameterMetricTagNull: Self = StObject.set(x, "hyperparameterMetricTag", null)
    
    inline def setHyperparameterMetricTagUndefined: Self = StObject.set(x, "hyperparameterMetricTag", js.undefined)
    
    inline def setIsBuiltInAlgorithmJob(value: Boolean): Self = StObject.set(x, "isBuiltInAlgorithmJob", value.asInstanceOf[js.Any])
    
    inline def setIsBuiltInAlgorithmJobNull: Self = StObject.set(x, "isBuiltInAlgorithmJob", null)
    
    inline def setIsBuiltInAlgorithmJobUndefined: Self = StObject.set(x, "isBuiltInAlgorithmJob", js.undefined)
    
    inline def setIsHyperparameterTuningJob(value: Boolean): Self = StObject.set(x, "isHyperparameterTuningJob", value.asInstanceOf[js.Any])
    
    inline def setIsHyperparameterTuningJobNull: Self = StObject.set(x, "isHyperparameterTuningJob", null)
    
    inline def setIsHyperparameterTuningJobUndefined: Self = StObject.set(x, "isHyperparameterTuningJob", js.undefined)
    
    inline def setTrials(value: js.Array[SchemaGoogleCloudMlV1HyperparameterOutput]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    inline def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    inline def setTrialsVarargs(value: SchemaGoogleCloudMlV1HyperparameterOutput*): Self = StObject.set(x, "trials", js.Array(value*))
    
    inline def setWebAccessUris(value: StringDictionary[String]): Self = StObject.set(x, "webAccessUris", value.asInstanceOf[js.Any])
    
    inline def setWebAccessUrisNull: Self = StObject.set(x, "webAccessUris", null)
    
    inline def setWebAccessUrisUndefined: Self = StObject.set(x, "webAccessUris", js.undefined)
  }
}
