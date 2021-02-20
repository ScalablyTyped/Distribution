package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
trait SchemaGoogleCloudMlV1HyperparameterOutput extends StObject {
  
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
  implicit class SchemaGoogleCloudMlV1HyperparameterOutputMutableBuilder[Self <: SchemaGoogleCloudMlV1HyperparameterOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllMetrics(value: js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]): Self = StObject.set(x, "allMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllMetricsUndefined: Self = StObject.set(x, "allMetrics", js.undefined)
    
    @scala.inline
    def setAllMetricsVarargs(value: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric*): Self = StObject.set(x, "allMetrics", js.Array(value :_*))
    
    @scala.inline
    def setBuiltInAlgorithmOutput(value: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput): Self = StObject.set(x, "builtInAlgorithmOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltInAlgorithmOutputUndefined: Self = StObject.set(x, "builtInAlgorithmOutput", js.undefined)
    
    @scala.inline
    def setFinalMetric(value: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric): Self = StObject.set(x, "finalMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalMetricUndefined: Self = StObject.set(x, "finalMetric", js.undefined)
    
    @scala.inline
    def setHyperparameters(value: StringDictionary[String]): Self = StObject.set(x, "hyperparameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperparametersUndefined: Self = StObject.set(x, "hyperparameters", js.undefined)
    
    @scala.inline
    def setIsTrialStoppedEarly(value: Boolean): Self = StObject.set(x, "isTrialStoppedEarly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTrialStoppedEarlyUndefined: Self = StObject.set(x, "isTrialStoppedEarly", js.undefined)
    
    @scala.inline
    def setTrialId(value: String): Self = StObject.set(x, "trialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialIdUndefined: Self = StObject.set(x, "trialId", js.undefined)
  }
}
