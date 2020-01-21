package typings.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XdsConfig extends js.Object {
  var balancerName: String
  var childPolicy: js.Array[LoadBalancingConfig]
  var fallbackPolicy: js.Array[LoadBalancingConfig]
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
}

