package typings.grpcGrpcJs.loadBalancerMod

import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/load-balancer", "getFirstUsableConfig")
@js.native
object getFirstUsableConfig extends js.Object {
  
  def apply(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig | Null = js.native
}
