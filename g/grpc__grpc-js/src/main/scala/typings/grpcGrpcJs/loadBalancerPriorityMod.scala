package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.LocalityPath
import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/load-balancer-priority", JSImport.Namespace)
@js.native
object loadBalancerPriorityMod extends js.Object {
  @js.native
  class PriorityLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    /**
      * Inner class for holding a child priority and managing associated timers.
      */
    var PriorityChildImpl: js.Any = js.native
    var channelControlHelper: js.Any = js.native
    var children: js.Any = js.native
    /**
      * After an update, this preserves the currently selected child from before
      * the update. We continue to use that child until it disconnects, or
      * another higher-priority child connects, or it is deleted because it is not
      * in the new priority list at all and its retention interval has expired, or
      * we try and fail to connect to every child in the new priority list.
      */
    var currentChildFromBeforeUpdate: js.Any = js.native
    /**
      * Current chosen priority that requests are sent to
      */
    var currentPriority: js.Any = js.native
    var deleteChild: js.Any = js.native
    /**
      * The attributes object from the latest update, saved to be passed along to
      * each new child as they are created
      */
    var latestAttributes: js.Any = js.native
    /**
      * The latest load balancing policies and address lists for each child from
      * the latest update
      */
    var latestUpdates: js.Any = js.native
    var onChildStateChange: js.Any = js.native
    /**
      * The priority order of child names from the latest config update.
      */
    var priorities: js.Any = js.native
    /**
      * Select the child at the specified priority, and report that child's state
      * as this balancer's state until that child disconnects or a higher-priority
      * child connects.
      * @param priority
      */
    var selectPriority: js.Any = js.native
    /**
      * Check each child in priority order until we find one to use
      * @param reportConnecting Whether we should report a CONNECTING state if we
      *     stop before picking a specific child. This should be true when we have
      *     not already selected a child.
      */
    var tryNextPriority: js.Any = js.native
    var updateState: js.Any = js.native
  }
  
  def isLocalitySubchannelAddress(address: SubchannelAddress): /* is @grpc/grpc-js.@grpc/grpc-js/build/src/load-balancer-priority.LocalitySubchannelAddress */ Boolean = js.native
  def setup(): Unit = js.native
  type LocalitySubchannelAddress = SubchannelAddress with LocalityPath
}

