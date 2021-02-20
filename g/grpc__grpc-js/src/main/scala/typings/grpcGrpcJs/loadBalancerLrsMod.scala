package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerLrsMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-lrs", "LrsLoadBalancer")
  @js.native
  class LrsLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    var channelControlHelper: js.Any = js.native
    
    var childBalancer: js.Any = js.native
    
    var localityStatsReporter: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-lrs", "setup")
  @js.native
  def setup(): Unit = js.native
}
