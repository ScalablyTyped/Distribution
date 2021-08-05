package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerEdsMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-eds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-eds", "EdsLoadBalancer")
  @js.native
  class EdsLoadBalancer protected ()
    extends StObject
       with LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    /* private */ val channelControlHelper: js.Any = js.native
    
    /**
      * Check whether a single call should be dropped according to the current
      * policy, based on randomly chosen numbers. Returns the drop category if
      * the call should be dropped, and null otherwise.
      */
    /* private */ var checkForDrop: js.Any = js.native
    
    /**
      * The child load balancer that will handle balancing the results of the EDS
      * requests.
      */
    /* private */ var childBalancer: js.Any = js.native
    
    /* private */ var clusterDropStats: js.Any = js.native
    
    /**
      * The load balancer unrefs all of its subchannels and stops calling methods
      * of its channel control helper.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* private */ var edsServiceName: js.Any = js.native
    
    /**
      * If the load balancer is currently in the IDLE state, start connecting.
      */
    /* CompleteClass */
    override def exitIdle(): Unit = js.native
    
    /**
      * Get the type name for this load balancer type. Must be constant across an
      * entire load balancer implementation class and must match the name that the
      * balancer implementation class was registered with.
      */
    /* CompleteClass */
    override def getTypeName(): String = js.native
    
    /**
      * Indicates whether the watcher has already been passed to this.xdsClient
      * and is getting updates.
      */
    /* private */ var isWatcherActive: js.Any = js.native
    
    /* private */ var lastestConfig: js.Any = js.native
    
    /* private */ var latestAttributes: js.Any = js.native
    
    /* private */ var latestEdsUpdate: js.Any = js.native
    
    /**
      * The priority of each locality the last time we got an update.
      */
    /* private */ var localityPriorities: js.Any = js.native
    
    /* private */ var nextPriorityChildNumber: js.Any = js.native
    
    /**
      * The name we assigned to each priority number the last time we got an
      * update.
      */
    /* private */ var priorityNames: js.Any = js.native
    
    /**
      * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
      * state, reset the current connection backoff timeout to its base value and
      * transition to CONNECTING if in TRANSIENT_FAILURE.
      */
    /* CompleteClass */
    override def resetBackoff(): Unit = js.native
    
    /**
      * Gives the load balancer a new list of addresses to start connecting to.
      * The load balancer will start establishing connections with the new list,
      * but will continue using any existing connections until the new connections
      * are established
      * @param addressList The new list of addresses to connect to
      * @param lbConfig The load balancing config object from the service config,
      *     if one was provided
      */
    /* CompleteClass */
    override def updateAddressList(
      addressList: js.Array[SubchannelAddress],
      lbConfig: LoadBalancingConfig,
      attributes: StringDictionary[js.Any]
    ): Unit = js.native
    
    /**
      * Should be called when this balancer gets a new config and when the
      * XdsClient returns a new ClusterLoadAssignment.
      */
    /* private */ var updateChild: js.Any = js.native
    
    /* private */ var watcher: js.Any = js.native
    
    /* private */ var xdsClient: js.Any = js.native
  }
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
}
