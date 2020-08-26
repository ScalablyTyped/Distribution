package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic algorithm for autoscaling.
  */
@js.native
trait SchemaBasicAutoscalingAlgorithm extends js.Object {
  /**
    * Optional. Duration between scaling events. A scaling period starts after
    * the update operation from the previous event has completed.Bounds: 2m,
    * 1d. Default: 2m.
    */
  var cooldownPeriod: js.UndefOr[String] = js.native
  /**
    * Required. YARN autoscaling configuration.
    */
  var yarnConfig: js.UndefOr[SchemaBasicYarnAutoscalingConfig] = js.native
}

object SchemaBasicAutoscalingAlgorithm {
  @scala.inline
  def apply(): SchemaBasicAutoscalingAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicAutoscalingAlgorithm]
  }
  @scala.inline
  implicit class SchemaBasicAutoscalingAlgorithmOps[Self <: SchemaBasicAutoscalingAlgorithm] (val x: Self) extends AnyVal {
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
    def setCooldownPeriod(value: String): Self = this.set("cooldownPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCooldownPeriod: Self = this.set("cooldownPeriod", js.undefined)
    @scala.inline
    def setYarnConfig(value: SchemaBasicYarnAutoscalingConfig): Self = this.set("yarnConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYarnConfig: Self = this.set("yarnConfig", js.undefined)
  }
  
}

