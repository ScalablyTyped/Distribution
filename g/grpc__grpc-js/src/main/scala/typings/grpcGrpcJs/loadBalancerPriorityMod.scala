package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.anon.LocalityPath
import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerPriorityMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-priority", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-priority", "PriorityLoadBalancer")
  @js.native
  class PriorityLoadBalancer protected ()
    extends StObject
       with LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    /**
      * Inner class for holding a child priority and managing associated timers.
      */
    /* private */ var PriorityChildImpl: js.Any = js.native
    
    /* private */ var channelControlHelper: js.Any = js.native
    
    /* private */ var children: js.Any = js.native
    
    /**
      * After an update, this preserves the currently selected child from before
      * the update. We continue to use that child until it disconnects, or
      * another higher-priority child connects, or it is deleted because it is not
      * in the new priority list at all and its retention interval has expired, or
      * we try and fail to connect to every child in the new priority list.
      */
    /* private */ var currentChildFromBeforeUpdate: js.Any = js.native
    
    /**
      * Current chosen priority that requests are sent to
      */
    /* private */ var currentPriority: js.Any = js.native
    
    /* private */ var deleteChild: js.Any = js.native
    
    /**
      * The load balancer unrefs all of its subchannels and stops calling methods
      * of its channel control helper.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
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
      * The attributes object from the latest update, saved to be passed along to
      * each new child as they are created
      */
    /* private */ var latestAttributes: js.Any = js.native
    
    /**
      * The latest load balancing policies and address lists for each child from
      * the latest update
      */
    /* private */ var latestUpdates: js.Any = js.native
    
    /* private */ var onChildStateChange: js.Any = js.native
    
    /**
      * The priority order of child names from the latest config update.
      */
    /* private */ var priorities: js.Any = js.native
    
    /**
      * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
      * state, reset the current connection backoff timeout to its base value and
      * transition to CONNECTING if in TRANSIENT_FAILURE.
      */
    /* CompleteClass */
    override def resetBackoff(): Unit = js.native
    
    /**
      * Select the child at the specified priority, and report that child's state
      * as this balancer's state until that child disconnects or a higher-priority
      * child connects.
      * @param priority
      */
    /* private */ var selectPriority: js.Any = js.native
    
    /**
      * Check each child in priority order until we find one to use
      * @param reportConnecting Whether we should report a CONNECTING state if we
      *     stop before picking a specific child. This should be true when we have
      *     not already selected a child.
      */
    /* private */ var tryNextPriority: js.Any = js.native
    
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
    
    /* private */ var updateState: js.Any = js.native
  }
  
  inline def isLocalitySubchannelAddress(address: SubchannelAddress): /* is @grpc/grpc-js.@grpc/grpc-js/build/src/load-balancer-priority.LocalitySubchannelAddress */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalitySubchannelAddress")(address.asInstanceOf[js.Any]).asInstanceOf[/* is @grpc/grpc-js.@grpc/grpc-js/build/src/load-balancer-priority.LocalitySubchannelAddress */ Boolean]
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
  
  type LocalitySubchannelAddress = SubchannelAddress & LocalityPath
}
