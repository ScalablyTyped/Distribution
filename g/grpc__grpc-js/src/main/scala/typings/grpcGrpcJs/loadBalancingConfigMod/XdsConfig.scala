package typings.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XdsConfig extends js.Object {
  var balancerName: String = js.native
  var childPolicy: js.Array[LoadBalancingConfig] = js.native
  var fallbackPolicy: js.Array[LoadBalancingConfig] = js.native
}

object XdsConfig {
  @scala.inline
  def apply(
    balancerName: String,
    childPolicy: js.Array[LoadBalancingConfig],
    fallbackPolicy: js.Array[LoadBalancingConfig]
  ): XdsConfig = {
    val __obj = js.Dynamic.literal(balancerName = balancerName.asInstanceOf[js.Any], childPolicy = childPolicy.asInstanceOf[js.Any], fallbackPolicy = fallbackPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[XdsConfig]
  }
  @scala.inline
  implicit class XdsConfigOps[Self <: XdsConfig] (val x: Self) extends AnyVal {
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
    def setBalancerName(value: String): Self = this.set("balancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildPolicyVarargs(value: LoadBalancingConfig*): Self = this.set("childPolicy", js.Array(value :_*))
    @scala.inline
    def setChildPolicy(value: js.Array[LoadBalancingConfig]): Self = this.set("childPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setFallbackPolicyVarargs(value: LoadBalancingConfig*): Self = this.set("fallbackPolicy", js.Array(value :_*))
    @scala.inline
    def setFallbackPolicy(value: js.Array[LoadBalancingConfig]): Self = this.set("fallbackPolicy", value.asInstanceOf[js.Any])
  }
  
}

