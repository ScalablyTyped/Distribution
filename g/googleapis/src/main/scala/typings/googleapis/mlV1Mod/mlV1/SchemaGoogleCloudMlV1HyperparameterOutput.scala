package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    allMetrics: js.Array[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric] = null,
    builtInAlgorithmOutput: SchemaGoogleCloudMlV1BuiltInAlgorithmOutput = null,
    finalMetric: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric = null,
    hyperparameters: StringDictionary[String] = null,
    isTrialStoppedEarly: js.UndefOr[Boolean] = js.undefined,
    trialId: String = null
  ): SchemaGoogleCloudMlV1HyperparameterOutput = {
    val __obj = js.Dynamic.literal()
    if (allMetrics != null) __obj.updateDynamic("allMetrics")(allMetrics.asInstanceOf[js.Any])
    if (builtInAlgorithmOutput != null) __obj.updateDynamic("builtInAlgorithmOutput")(builtInAlgorithmOutput.asInstanceOf[js.Any])
    if (finalMetric != null) __obj.updateDynamic("finalMetric")(finalMetric.asInstanceOf[js.Any])
    if (hyperparameters != null) __obj.updateDynamic("hyperparameters")(hyperparameters.asInstanceOf[js.Any])
    if (!js.isUndefined(isTrialStoppedEarly)) __obj.updateDynamic("isTrialStoppedEarly")(isTrialStoppedEarly.get.asInstanceOf[js.Any])
    if (trialId != null) __obj.updateDynamic("trialId")(trialId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterOutput]
  }
}

