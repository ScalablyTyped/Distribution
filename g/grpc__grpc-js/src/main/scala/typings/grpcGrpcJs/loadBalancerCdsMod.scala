package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerCdsMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-cds", "CdsLoadBalancer")
  @js.native
  class CdsLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    val channelControlHelper: js.Any = js.native
    
    var childBalancer: js.Any = js.native
    
    var isWatcherActive: js.Any = js.native
    
    var latestAttributes: js.Any = js.native
    
    var latestCdsUpdate: js.Any = js.native
    
    var latestConfig: js.Any = js.native
    
    var watcher: js.Any = js.native
    
    var xdsClient: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-cds", "setup")
  @js.native
  def setup(): Unit = js.native
}
