package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerEdsMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-eds", "EdsLoadBalancer")
  @js.native
  class EdsLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    val channelControlHelper: js.Any = js.native
    
    /**
      * Check whether a single call should be dropped according to the current
      * policy, based on randomly chosen numbers. Returns the drop category if
      * the call should be dropped, and null otherwise.
      */
    var checkForDrop: js.Any = js.native
    
    /**
      * The child load balancer that will handle balancing the results of the EDS
      * requests.
      */
    var childBalancer: js.Any = js.native
    
    var clusterDropStats: js.Any = js.native
    
    var edsServiceName: js.Any = js.native
    
    /**
      * Indicates whether the watcher has already been passed to this.xdsClient
      * and is getting updates.
      */
    var isWatcherActive: js.Any = js.native
    
    var lastestConfig: js.Any = js.native
    
    var latestAttributes: js.Any = js.native
    
    var latestEdsUpdate: js.Any = js.native
    
    /**
      * The priority of each locality the last time we got an update.
      */
    var localityPriorities: js.Any = js.native
    
    var nextPriorityChildNumber: js.Any = js.native
    
    /**
      * The name we assigned to each priority number the last time we got an
      * update.
      */
    var priorityNames: js.Any = js.native
    
    /**
      * Should be called when this balancer gets a new config and when the
      * XdsClient returns a new ClusterLoadAssignment.
      */
    var updateChild: js.Any = js.native
    
    var watcher: js.Any = js.native
    
    var xdsClient: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-eds", "setup")
  @js.native
  def setup(): Unit = js.native
}
