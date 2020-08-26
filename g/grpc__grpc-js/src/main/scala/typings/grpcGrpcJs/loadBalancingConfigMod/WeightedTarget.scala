package typings.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightedTarget extends js.Object {
  var child_policy: js.Array[LoadBalancingConfig] = js.native
  var weight: Double = js.native
}

object WeightedTarget {
  @scala.inline
  def apply(child_policy: js.Array[LoadBalancingConfig], weight: Double): WeightedTarget = {
    val __obj = js.Dynamic.literal(child_policy = child_policy.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedTarget]
  }
  @scala.inline
  implicit class WeightedTargetOps[Self <: WeightedTarget] (val x: Self) extends AnyVal {
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
    def setChild_policyVarargs(value: LoadBalancingConfig*): Self = this.set("child_policy", js.Array(value :_*))
    @scala.inline
    def setChild_policy(value: js.Array[LoadBalancingConfig]): Self = this.set("child_policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

