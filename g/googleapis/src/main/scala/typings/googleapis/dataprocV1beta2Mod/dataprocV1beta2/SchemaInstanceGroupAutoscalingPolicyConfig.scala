package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the size bounds of an instance group, including its
  * proportional size to other groups.
  */
@js.native
trait SchemaInstanceGroupAutoscalingPolicyConfig extends js.Object {
  /**
    * Optional. Maximum number of instances for this group. Required for
    * primary workers. Note that by default, clusters will not use secondary
    * workers. Required for secondary workers if the minimum secondary
    * instances is set.Primary workers - Bounds: [min_instances, ). Required.
    * Secondary workers - Bounds: [min_instances, ). Default: 0.
    */
  var maxInstances: js.UndefOr[Double] = js.native
  /**
    * Optional. Minimum number of instances for this group.Primary workers -
    * Bounds: 2, max_instances. Default: 2. Secondary workers - Bounds: 0,
    * max_instances. Default: 0.
    */
  var minInstances: js.UndefOr[Double] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object SchemaInstanceGroupAutoscalingPolicyConfig {
  @scala.inline
  def apply(
    maxInstances: js.UndefOr[Double] = js.undefined,
    minInstances: js.UndefOr[Double] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): SchemaInstanceGroupAutoscalingPolicyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxInstances)) __obj.updateDynamic("maxInstances")(maxInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minInstances)) __obj.updateDynamic("minInstances")(minInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupAutoscalingPolicyConfig]
  }
}

