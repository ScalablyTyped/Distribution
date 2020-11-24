package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents results of a training job. Output only.
  */
@js.native
trait SchemaGoogleCloudMlV1TrainingOutput extends js.Object {
  
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
  implicit class SchemaGoogleCloudMlV1TrainingOutputOps[Self <: SchemaGoogleCloudMlV1TrainingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuiltInAlgorithmOutput(value: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput): Self = this.set("builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltInAlgorithmOutput: Self = this.set("builtInAlgorithmOutput", js.undefined)
    
    @scala.inline
    def setCompletedTrialCount(value: String): Self = this.set("completedTrialCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedTrialCount: Self = this.set("completedTrialCount", js.undefined)
    
    @scala.inline
    def setConsumedMLUnits(value: Double): Self = this.set("consumedMLUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumedMLUnits: Self = this.set("consumedMLUnits", js.undefined)
    
    @scala.inline
    def setIsBuiltInAlgorithmJob(value: Boolean): Self = this.set("isBuiltInAlgorithmJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBuiltInAlgorithmJob: Self = this.set("isBuiltInAlgorithmJob", js.undefined)
    
    @scala.inline
    def setIsHyperparameterTuningJob(value: Boolean): Self = this.set("isHyperparameterTuningJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHyperparameterTuningJob: Self = this.set("isHyperparameterTuningJob", js.undefined)
    
    @scala.inline
    def setTrialsVarargs(value: SchemaGoogleCloudMlV1HyperparameterOutput*): Self = this.set("trials", js.Array(value :_*))
    
    @scala.inline
    def setTrials(value: js.Array[SchemaGoogleCloudMlV1HyperparameterOutput]): Self = this.set("trials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrials: Self = this.set("trials", js.undefined)
  }
}
