package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of a single hyperparameter tuning trial from a
  * training job. The TrainingOutput object that is returned on successful
  * completion of a training job with hyperparameter tuning includes a list of
  * HyperparameterOutput objects, one for each successful trial.
  */
@js.native
trait SchemaGoogleCloudMlV1HyperparameterOutput extends js.Object {
  
  /**
    * All recorded object metrics for this trial. This field is not currently
    * populated.
    */
  var allMetrics: js.UndefOr[js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]] = js.native
  
  /**
    * Details related to built-in algorithms job. Only set this for built-in
    * algorithms jobs and for trials that succeeded.
    */
  var builtInAlgorithmOutput: js.UndefOr[SchemaGoogleCloudMlV1BuiltInAlgorithmOutput] = js.native
  
  /**
    * The final objective metric seen for this trial.
    */
  var finalMetric: js.UndefOr[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = js.native
  
  /**
    * The hyperparameters given to this trial.
    */
  var hyperparameters: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * True if the trial is stopped early.
    */
  var isTrialStoppedEarly: js.UndefOr[Boolean] = js.native
  
  /**
    * The trial id for these results.
    */
  var trialId: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1HyperparameterOutput {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterOutput]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1HyperparameterOutputOps[Self <: SchemaGoogleCloudMlV1HyperparameterOutput] (val x: Self) extends AnyVal {
    
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
    def setAllMetricsVarargs(value: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric*): Self = this.set("allMetrics", js.Array(value :_*))
    
    @scala.inline
    def setAllMetrics(value: js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = this.set("allMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllMetrics: Self = this.set("allMetrics", js.undefined)
    
    @scala.inline
    def setBuiltInAlgorithmOutput(value: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput): Self = this.set("builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltInAlgorithmOutput: Self = this.set("builtInAlgorithmOutput", js.undefined)
    
    @scala.inline
    def setFinalMetric(value: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = this.set("finalMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalMetric: Self = this.set("finalMetric", js.undefined)
    
    @scala.inline
    def setHyperparameters(value: StringDictionary[String]): Self = this.set("hyperparameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperparameters: Self = this.set("hyperparameters", js.undefined)
    
    @scala.inline
    def setIsTrialStoppedEarly(value: Boolean): Self = this.set("isTrialStoppedEarly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTrialStoppedEarly: Self = this.set("isTrialStoppedEarly", js.undefined)
    
    @scala.inline
    def setTrialId(value: String): Self = this.set("trialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialId: Self = this.set("trialId", js.undefined)
  }
}
