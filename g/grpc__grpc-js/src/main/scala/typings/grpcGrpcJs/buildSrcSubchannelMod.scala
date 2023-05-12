package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcChannelzMod.SubchannelRef
import typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typings.grpcGrpcJs.buildSrcSubchannelCallMod.SubchannelCall
import typings.grpcGrpcJs.buildSrcSubchannelCallMod.SubchannelCallInterceptingListener
import typings.grpcGrpcJs.buildSrcSubchannelInterfaceMod.ConnectivityStateListener
import typings.grpcGrpcJs.buildSrcTransportMod.SubchannelConnector
import typings.grpcGrpcJs.buildSrcUriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSubchannelMod {
  
  @JSImport("@grpc/grpc-js/build/src/subchannel", "Subchannel")
  @js.native
  open class Subchannel protected () extends StObject {
    /**
      * A class representing a connection to a single backend.
      * @param channelTarget The target string for the channel as a whole
      * @param subchannelAddress The address for the backend that this subchannel
      *     will connect to
      * @param options The channel options, plus any specific subchannel options
      *     for this subchannel
      * @param credentials The channel credentials used to establish this
      *     connection
      */
    def this(
      channelTarget: GrpcUri,
      subchannelAddress: SubchannelAddress,
      options: ChannelOptions,
      credentials: ChannelCredentials,
      connector: SubchannelConnector
    ) = this()
    
    /**
      * Add a listener function to be called whenever the subchannel's
      * connectivity state changes.
      * @param listener
      */
    def addConnectivityStateListener(listener: ConnectivityStateListener): Unit = js.native
    
    /* private */ var backoffTimeout: Any = js.native
    
    /* private */ var callTracker: Any = js.native
    
    /* private */ var channelTarget: Any = js.native
    
    /* private */ val channelzEnabled: Any = js.native
    
    /* private */ var channelzRef: Any = js.native
    
    /* private */ var channelzTrace: Any = js.native
    
    /* private */ var childrenTracker: Any = js.native
    
    /**
      * The subchannel's current connectivity state. Invariant: `session` === `null`
      * if and only if `connectivityState` is IDLE or TRANSIENT_FAILURE.
      */
    /* private */ var connectivityState: Any = js.native
    
    /* private */ var connector: Any = js.native
    
    /**
      * Indicates that the subchannel should transition from TRANSIENT_FAILURE to
      * CONNECTING instead of IDLE when the backoff timeout ends.
      */
    /* private */ var continueConnecting: Any = js.native
    
    def createCall(metadata: Metadata, host: String, method: String, listener: SubchannelCallInterceptingListener): SubchannelCall = js.native
    
    /* private */ var credentials: Any = js.native
    
    def getAddress(): String = js.native
    
    /* private */ var getChannelzInfo: Any = js.native
    
    def getChannelzRef(): SubchannelRef = js.native
    
    /**
      * Get the subchannel's current connectivity state.
      */
    def getConnectivityState(): ConnectivityState = js.native
    
    def getRealSubchannel(): this.type = js.native
    
    /* private */ var handleBackoffTimer: Any = js.native
    
    /* private */ var keepaliveTime: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def ref(): Unit = js.native
    
    /* private */ var refTrace: Any = js.native
    
    /**
      * Tracks channels and subchannel pools with references to this subchannel
      */
    /* private */ var refcount: Any = js.native
    
    /**
      * Remove a listener previously added with `addConnectivityStateListener`
      * @param listener A reference to a function previously passed to
      *     `addConnectivityStateListener`
      */
    def removeConnectivityStateListener(listener: ConnectivityStateListener): Unit = js.native
    
    /**
      * Reset the backoff timeout, and immediately start connecting if in backoff.
      */
    def resetBackoff(): Unit = js.native
    
    /**
      * Start a backoff timer with the current nextBackoff timeout
      */
    /* private */ var startBackoff: Any = js.native
    
    /**
      * If the subchannel is currently IDLE, start connecting and switch to the
      * CONNECTING state. If the subchannel is current in TRANSIENT_FAILURE,
      * the next time it would transition to IDLE, start connecting again instead.
      * Otherwise, do nothing.
      */
    def startConnecting(): Unit = js.native
    
    /* private */ var startConnectingInternal: Any = js.native
    
    /**
      * A list of listener functions that will be called whenever the connectivity
      * state changes. Will be modified by `addConnectivityStateListener` and
      * `removeConnectivityStateListener`
      */
    /* private */ var stateListeners: Any = js.native
    
    /* private */ var stopBackoff: Any = js.native
    
    /* private */ var streamTracker: Any = js.native
    
    /* private */ var subchannelAddress: Any = js.native
    
    /**
      * A string representation of the subchannel address, for logging/tracing
      */
    /* private */ var subchannelAddressString: Any = js.native
    
    def throttleKeepalive(newKeepaliveTime: Double): Unit = js.native
    
    /* private */ var trace: Any = js.native
    
    /**
      * Initiate a state transition from any element of oldStates to the new
      * state. If the current connectivityState is not in oldStates, do nothing.
      * @param oldStates The set of states to transition from
      * @param newState The state to transition to
      * @returns True if the state changed, false otherwise
      */
    /* private */ var transitionToState: Any = js.native
    
    /**
      * The underlying http2 session used to make requests.
      */
    /* private */ var transport: Any = js.native
    
    def unref(): Unit = js.native
    
    def unrefIfOneRef(): Boolean = js.native
  }
}
