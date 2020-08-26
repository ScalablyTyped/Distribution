package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import typings.grpcGrpcJs.subchannelMod.SubchannelAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/load-balancer-pick-first", JSImport.Namespace)
@js.native
object loadBalancerPickFirstMod extends js.Object {
  @js.native
  class PickFirstLoadBalancer protected () extends LoadBalancer {
    /**
      * Load balancer that attempts to connect to each backend in the address list
      * in order, and picks the first one that connects, using it for every
      * request.
      * @param channelControlHelper `ChannelControlHelper` instance provided by
      *     this load balancer's owner.
      */
    def this(channelControlHelper: ChannelControlHelper) = this()
    val channelControlHelper: js.Any = js.native
    /**
      * Start connecting to the address list most recently passed to
      * `updateAddressList`.
      */
    var connectToAddressList: js.Any = js.native
    /**
      * Timer reference for the timer tracking when to start
      */
    var connectionDelayTimeout: js.Any = js.native
    /**
      * The currently picked subchannel used for making calls. Populated if
      * and only if the load balancer's current state is READY. In that case,
      * the subchannel's current state is also READY.
      */
    var currentPick: js.Any = js.native
    /**
      * The current connectivity state of the load balancer.
      */
    var currentState: js.Any = js.native
    /**
      * The index within the `subchannels` array of the subchannel with the most
      * recently started connection attempt.
      */
    var currentSubchannelIndex: js.Any = js.native
    /**
      * The list of backend addresses most recently passed to `updateAddressList`.
      */
    var latestAddressList: js.Any = js.native
    var pickSubchannel: js.Any = js.native
    /**
      * Listener callback attached to the current picked subchannel.
      */
    var pickedSubchannelStateListener: js.Any = js.native
    var resetSubchannelList: js.Any = js.native
    /**
      * Have a single subchannel in the `subchannels` list start connecting.
      * @param subchannelIndex The index into the `subchannels` list.
      */
    var startConnecting: js.Any = js.native
    var startNextSubchannelConnecting: js.Any = js.native
    var subchannelStateCounts: js.Any = js.native
    /**
      * Listener callback attached to each subchannel in the `subchannels` list
      * while establishing a connection.
      */
    var subchannelStateListener: js.Any = js.native
    /**
      * The list of subchannels this load balancer is currently attempting to
      * connect to.
      */
    var subchannels: js.Any = js.native
    var triedAllSubchannels: js.Any = js.native
    var updateState: js.Any = js.native
    def updateAddressList(addressList: js.Array[SubchannelAddress], lbConfig: LoadBalancingConfig): Unit = js.native
  }
  
  def setup(): Unit = js.native
}

