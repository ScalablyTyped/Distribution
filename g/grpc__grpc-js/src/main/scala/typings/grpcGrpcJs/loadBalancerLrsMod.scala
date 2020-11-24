package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/load-balancer-lrs", JSImport.Namespace)
@js.native
object loadBalancerLrsMod extends js.Object {
  
  def setup(): Unit = js.native
  
  @js.native
  class LrsLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    var channelControlHelper: js.Any = js.native
    
    var childBalancer: js.Any = js.native
    
    var localityStatsReporter: js.Any = js.native
  }
}
