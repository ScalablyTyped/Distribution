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
  def apply(): SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric]
  }
  @scala.inline
  implicit class SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetricOps[Self <: SchemaGoogleCloudMlV1HyperparameterOutputHyperparameterMetric] (val x: Self) extends AnyVal {
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
    def setObjectiveValue(value: Double): Self = this.set("objectiveValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectiveValue: Self = this.set("objectiveValue", js.undefined)
    @scala.inline
    def setTrainingStep(value: String): Self = this.set("trainingStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingStep: Self = this.set("trainingStep", js.undefined)
  }
  
}

