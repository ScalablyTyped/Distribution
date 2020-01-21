package typings.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrpcLbConfig extends js.Object {
  var childPolicy: js.Array[LoadBalancingConfig]
}

object GrpcLbConfig {
  @scala.inline
  def apply(childPolicy: js.Array[LoadBalancingConfig]): GrpcLbConfig = {
    val __obj = js.Dynamic.literal(childPolicy = childPolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GrpcLbConfig]
  }
}

