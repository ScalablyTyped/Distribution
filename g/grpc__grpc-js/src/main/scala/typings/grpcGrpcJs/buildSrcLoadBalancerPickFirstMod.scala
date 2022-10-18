package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import typings.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcLoadBalancerPickFirstMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-pick-first", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-pick-first", "PickFirstLoadBalancer")
  @js.native
  open class PickFirstLoadBalancer protected ()
    extends StObject
       with LoadBalancer {
    /**
      * Load balancer that attempts to connect to each backend in the address list
      * in order, and picks the first one that connects, using it for every
      * request.
      * @param channelControlHelper `ChannelControlHelper` instance provided by
      *     this load balancer's owner.
      */
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    /* private */ val channelControlHelper: Any = js.native
    
    /**
      * Start connecting to the address list most recently passed to
      * `updateAddressList`.
      */
    /* private */ var connectToAddressList: Any = js.native
    
    /**
      * Timer reference for the timer tracking when to start
      */
    /* private */ var connectionDelayTimeout: Any = js.native
    
    /**
      * The currently picked subchannel used for making calls. Populated if
      * and only if the load balancer's current state is READY. In that case,
      * the subchannel's current state is also READY.
      */
    /* private */ var currentPick: Any = js.native
    
    /**
      * The current connectivity state of the load balancer.
      */
    /* private */ var currentState: Any = js.native
    
    /**
      * The index within the `subchannels` array of the subchannel with the most
      * recently started connection attempt.
      */
    /* private */ var currentSubchannelIndex: Any = js.native
    
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
      * The list of backend addresses most recently passed to `updateAddressList`.
      */
    /* private */ var latestAddressList: Any = js.native
    
    /* private */ var pickSubchannel: Any = js.native
    
    /**
      * Listener callback attached to the current picked subchannel.
      */
    /* private */ var pickedSubchannelStateListener: Any = js.native
    
    /**
      * If the load balancer is currently in the CONNECTING or TRANSIENT_FAILURE
      * state, reset the current connection backoff timeout to its base value and
      * transition to CONNECTING if in TRANSIENT_FAILURE.
      */
    /* CompleteClass */
    override def resetBackoff(): Unit = js.native
    
    /* private */ var resetSubchannelList: Any = js.native
    
    /**
      * Have a single subchannel in the `subchannels` list start connecting.
      * @param subchannelIndex The index into the `subchannels` list.
      */
    /* private */ var startConnecting: Any = js.native
    
    /* private */ var startNextSubchannelConnecting: Any = js.native
    
    /* private */ var subchannelStateCounts: Any = js.native
    
    /**
      * Listener callback attached to each subchannel in the `subchannels` list
      * while establishing a connection.
      */
    /* private */ var subchannelStateListener: Any = js.native
    
    /**
      * The list of subchannels this load balancer is currently attempting to
      * connect to.
      */
    /* private */ var subchannels: Any = js.native
    
    /* private */ var triedAllSubchannels: Any = js.native
    
    def updateAddressList(addressList: js.Array[SubchannelAddress], lbConfig: LoadBalancingConfig): Unit = js.native
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
      attributes: StringDictionary[Any]
    ): Unit = js.native
    
    /* private */ var updateState: Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-pick-first", "PickFirstLoadBalancingConfig")
  @js.native
  open class PickFirstLoadBalancingConfig ()
    extends StObject
       with LoadBalancingConfig {
    
    /* CompleteClass */
    override def getLoadBalancerName(): String = js.native
    
    /* CompleteClass */
    override def toJsonObject(): js.Object = js.native
  }
  /* static members */
  object PickFirstLoadBalancingConfig {
    
    @JSImport("@grpc/grpc-js/build/src/load-balancer-pick-first", "PickFirstLoadBalancingConfig")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromJson(obj: Any): PickFirstLoadBalancingConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromJson")(obj.asInstanceOf[js.Any]).asInstanceOf[PickFirstLoadBalancingConfig]
  }
  
  inline def setup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")().asInstanceOf[Unit]
}
