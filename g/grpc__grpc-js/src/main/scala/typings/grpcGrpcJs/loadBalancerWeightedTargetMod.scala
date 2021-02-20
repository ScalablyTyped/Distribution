package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerWeightedTargetMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-weighted-target", "WeightedTargetLoadBalancer")
  @js.native
  class WeightedTargetLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    var WeightedChildImpl: js.Any = js.native
    
    var channelControlHelper: js.Any = js.native
    
    /**
      * List of current target names.
      */
    var targetList: js.Any = js.native
    
    /**
      * Map of target names to target children. Includes current targets and
      * previous targets with deactivation timers that have not yet triggered.
      */
    var targets: js.Any = js.native
    
    var updateState: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-weighted-target", "setup")
  @js.native
  def setup(): Unit = js.native
}
