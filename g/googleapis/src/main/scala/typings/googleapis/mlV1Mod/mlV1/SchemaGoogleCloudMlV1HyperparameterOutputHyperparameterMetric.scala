package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An observed value of a metric.
  */
@js.native
trait SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric extends js.Object {
  /**
    * The objective value at this training step.
    */
  var objectiveValue: js.UndefOr[Double] = js.native
  /**
    * The global training step for this metric.
    */
  var trainingStep: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric {
  @scala.inline
  def apply(objectiveValue: js.UndefOr[Double] = js.undefined, trainingStep: String = null): SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(objectiveValue)) __obj.updateDynamic("objectiveValue")(objectiveValue.get.asInstanceOf[js.Any])
    if (trainingStep != null) __obj.updateDynamic("trainingStep")(trainingStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]
  }
}

