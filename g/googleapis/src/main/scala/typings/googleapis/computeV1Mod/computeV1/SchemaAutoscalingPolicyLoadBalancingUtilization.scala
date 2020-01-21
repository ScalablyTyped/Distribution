package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration parameters of autoscaling based on load balancing.
  */
@js.native
trait SchemaAutoscalingPolicyLoadBalancingUtilization extends js.Object {
  /**
    * Fraction of backend capacity utilization (set in HTTP(S) load balancing
    * configuration) that autoscaler should maintain. Must be a positive float
    * value. If not defined, the default is 0.8.
    */
  var utilizationTarget: js.UndefOr[Double] = js.native
}

object SchemaAutoscalingPolicyLoadBalancingUtilization {
  @scala.inline
  def apply(utilizationTarget: Int | Double = null): SchemaAutoscalingPolicyLoadBalancingUtilization = {
    val __obj = js.Dynamic.literal()
    if (utilizationTarget != null) __obj.updateDynamic("utilizationTarget")(utilizationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalingPolicyLoadBalancingUtilization]
  }
}

