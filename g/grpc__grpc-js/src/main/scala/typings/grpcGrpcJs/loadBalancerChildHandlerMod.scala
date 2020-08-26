package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/load-balancer-child-handler", JSImport.Namespace)
@js.native
object loadBalancerChildHandlerMod extends js.Object {
  @js.native
  class ChildLoadBalancerHandler protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    var ChildPolicyHelper: js.Any = js.native
    val channelControlHelper: js.Any = js.native
    var currentChild: js.Any = js.native
    var pendingChild: js.Any = js.native
  }
  
}

