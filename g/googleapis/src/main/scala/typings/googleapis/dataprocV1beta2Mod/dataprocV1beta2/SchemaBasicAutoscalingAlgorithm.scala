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
  def apply(cooldownPeriod: String = null, yarnConfig: SchemaBasicYarnAutoscalingConfig = null): SchemaBasicAutoscalingAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (cooldownPeriod != null) __obj.updateDynamic("cooldownPeriod")(cooldownPeriod.asInstanceOf[js.Any])
    if (yarnConfig != null) __obj.updateDynamic("yarnConfig")(yarnConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasicAutoscalingAlgorithm]
  }
}

