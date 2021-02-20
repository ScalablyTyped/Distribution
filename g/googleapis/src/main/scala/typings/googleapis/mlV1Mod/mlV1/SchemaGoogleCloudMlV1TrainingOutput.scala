package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents results of a training job. Output only.
  */
@js.native
trait SchemaGoogleCloudMlV1TrainingOutput extends StObject {
  
  /**
    * Details related to built-in algorithms job. Only set for built-in
    * algorithms jobs.
    */
  var builtInAlgorithmOutput: js.UndefOr[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput] = js.native
  
  /**
    * The number of hyperparameter tuning trials that completed successfully.
    * Only set for hyperparameter tuning jobs.
    */
  var completedTrialCount: js.UndefOr[String] = js.native
  
  /**
    * The amount of ML units consumed by the job.
    */
  var consumedMLUnits: js.UndefOr[Double] = js.native
  
  /**
    * Whether this job is a built-in Algorithm job.
    */
  var isBuiltInAlgorithmJob: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this job is a hyperparameter tuning job.
    */
  var isHyperparameterTuningJob: js.UndefOr[Boolean] = js.native
  
  /**
    * Results for individual Hyperparameter trials. Only set for hyperparameter
    * tuning jobs.
    */
  var trials: js.UndefOr[js.Array[SchemaGoogleCloudMlV1HyperparameterOutput]] = js.native
}
object SchemaGoogleCloudMlV1TrainingOutput {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1TrainingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1TrainingOutput]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1TrainingOutputMutableBuilder[Self <: SchemaGoogleCloudMlV1TrainingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuiltInAlgorithmOutput(value: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput): Self = StObject.set(x, "builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInAlgorithmOutputUndefined: Self = StObject.set(x, "builtInAlgorithmOutput", js.undefined)
    
    @scala.inline
    def setCompletedTrialCount(value: String): Self = StObject.set(x, "completedTrialCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedTrialCountUndefined: Self = StObject.set(x, "completedTrialCount", js.undefined)
    
    @scala.inline
    def setConsumedMLUnits(value: Double): Self = StObject.set(x, "consumedMLUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedMLUnitsUndefined: Self = StObject.set(x, "consumedMLUnits", js.undefined)
    
    @scala.inline
    def setIsBuiltInAlgorithmJob(value: Boolean): Self = StObject.set(x, "isBuiltInAlgorithmJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuiltInAlgorithmJobUndefined: Self = StObject.set(x, "isBuiltInAlgorithmJob", js.undefined)
    
    @scala.inline
    def setIsHyperparameterTuningJob(value: Boolean): Self = StObject.set(x, "isHyperparameterTuningJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHyperparameterTuningJobUndefined: Self = StObject.set(x, "isHyperparameterTuningJob", js.undefined)
    
    @scala.inline
    def setTrials(value: js.Array[SchemaGoogleCloudMlV1HyperparameterOutput]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    @scala.inline
    def setTrialsVarargs(value: SchemaGoogleCloudMlV1HyperparameterOutput*): Self = StObject.set(x, "trials", js.Array(value :_*))
  }
}
