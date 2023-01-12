package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcCallStreamMod.Http2CallStream
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcChannelzMod.SubchannelRef
import typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typings.grpcGrpcJs.buildSrcFilterMod.Filter
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcSubchannelAddressMod.SubchannelAddress
import typings.grpcGrpcJs.buildSrcSubchannelInterfaceMod.ConnectivityStateListener
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
      credentials: ChannelCredentials
    ) = this()
    
    /**
      * Add a listener function to be called whenever the subchannel's
      * connectivity state changes.
      * @param listener
      */
    def addConnectivityStateListener(listener: ConnectivityStateListener): Unit = js.native
    
    def addDisconnectListener(listener: js.Function0[Unit]): Unit = js.native
    
    /* private */ var backoffTimeout: Any = js.native
    
    def callRef(): Unit = js.native
    
    /**
      * Tracks calls with references to this subchannel
      */
    /* private */ var callRefcount: Any = js.native
    
    /* private */ var callTracker: Any = js.native
    
    def callUnref(): Unit = js.native
    
    /* private */ var channelTarget: Any = js.native
    
    /* private */ val channelzEnabled: Any = js.native
    
    /* private */ var channelzRef: Any = js.native
    
    /* private */ var channelzSocketRef: Any = js.native
    
    /* private */ var channelzTrace: Any = js.native
    
    /**
      * Check if the subchannel associated with zero calls and with zero channels.
      * If so, shut it down.
      */
    /* private */ var checkBothRefcounts: Any = js.native
    
    /* private */ var childrenTracker: Any = js.native
    
    /**
      * The subchannel's current connectivity state. Invariant: `session` === `null`
      * if and only if `connectivityState` is IDLE or TRANSIENT_FAILURE.
      */
    /* private */ var connectivityState: Any = js.native
    
    /**
      * Indicates that the subchannel should transition from TRANSIENT_FAILURE to
      * CONNECTING instead of IDLE when the backoff timeout ends.
      */
    /* private */ var continueConnecting: Any = js.native
    
    /* private */ var createSession: Any = js.native
    
    /* private */ var credentials: Any = js.native
    
    /**
      * A list of listener functions that will be called when the underlying
      * socket disconnects. Used for ending active calls with an UNAVAILABLE
      * status.
      */
    /* private */ var disconnectListeners: Any = js.native
    
    /* private */ var flowControlTrace: Any = js.native
    
    def getAddress(): String = js.native
    
    /* private */ var getChannelzInfo: Any = js.native
    
    def getChannelzRef(): SubchannelRef = js.native
    
    /* private */ var getChannelzSocketInfo: Any = js.native
    
    /**
      * Get the subchannel's current connectivity state.
      */
    def getConnectivityState(): ConnectivityState = js.native
    
    def getRealSubchannel(): this.type = js.native
    
    /* private */ var handleBackoffTimer: Any = js.native
    
    /* private */ var handleDisconnect: Any = js.native
    
    /* private */ var internalsTrace: Any = js.native
    
    /**
      * Timer reference for timeout that indicates when to send the next ping
      */
    /* private */ var keepaliveIntervalId: Any = js.native
    
    /**
      * The amount of time in between sending pings
      */
    /* private */ var keepaliveTimeMs: Any = js.native
    
    /**
      * Timer reference tracking when the most recent ping will be considered lost
      */
    /* private */ var keepaliveTimeoutId: Any = js.native
    
    /**
      * The amount of time to wait for an acknowledgement after sending a ping
      */
    /* private */ var keepaliveTimeoutMs: Any = js.native
    
    /* private */ var keepaliveTrace: Any = js.native
    
    /**
      * Indicates whether keepalive pings should be sent without any active calls
      */
    /* private */ var keepaliveWithoutCalls: Any = js.native
    
    /* private */ var keepalivesSent: Any = js.native
    
    /* private */ var lastMessageReceivedTimestamp: Any = js.native
    
    /* private */ var lastMessageSentTimestamp: Any = js.native
    
    /* private */ var messagesReceived: Any = js.native
    
    /* private */ var messagesSent: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def ref(): Unit = js.native
    
    /* private */ var refTrace: Any = js.native
    
    /**
      * Tracks channels and subchannel pools with references to this subchannel
      */
    /* private */ var refcount: Any = js.native
    
    /**
      * Name of the remote server, if it is not the same as the subchannel
      * address, i.e. if connecting through an HTTP CONNECT proxy.
      */
    /* private */ var remoteName: Any = js.native
    
    /**
      * Remove a listener previously added with `addConnectivityStateListener`
      * @param listener A reference to a function previously passed to
      *     `addConnectivityStateListener`
      */
    def removeConnectivityStateListener(listener: ConnectivityStateListener): Unit = js.native
    
    def removeDisconnectListener(listener: js.Function0[Unit]): Unit = js.native
    
    /**
      * Reset the backoff timeout, and immediately start connecting if in backoff.
      */
    def resetBackoff(): Unit = js.native
    
    /* private */ var resetChannelzSocketInfo: Any = js.native
    
    /* private */ var sendPing: Any = js.native
    
    /**
      * The underlying http2 session used to make requests.
      */
    /* private */ var session: Any = js.native
    
    /**
      * Start a backoff timer with the current nextBackoff timeout
      */
    /* private */ var startBackoff: Any = js.native
    
    /**
      * Start a stream on the current session with the given `metadata` as headers
      * and then attach it to the `callStream`. Must only be called if the
      * subchannel's current connectivity state is READY.
      * @param metadata
      * @param callStream
      */
    def startCallStream(metadata: Metadata, callStream: Http2CallStream, extraFilters: js.Array[Filter]): Unit = js.native
    
    /**
      * If the subchannel is currently IDLE, start connecting and switch to the
      * CONNECTING state. If the subchannel is current in TRANSIENT_FAILURE,
      * the next time it would transition to IDLE, start connecting again instead.
      * Otherwise, do nothing.
      */
    def startConnecting(): Unit = js.native
    
    /* private */ var startConnectingInternal: Any = js.native
    
    /* private */ var startKeepalivePings: Any = js.native
    
    /**
      * A list of listener functions that will be called whenever the connectivity
      * state changes. Will be modified by `addConnectivityStateListener` and
      * `removeConnectivityStateListener`
      */
    /* private */ var stateListeners: Any = js.native
    
    /* private */ var stopBackoff: Any = js.native
    
    /**
      * Stop keepalive pings when terminating a connection. This discards the
      * outstanding ping timeout, so it should not be called if the same
      * connection will still be used.
      */
    /* private */ var stopKeepalivePings: Any = js.native
    
    /* private */ var streamTracker: Any = js.native
    
    /* private */ var subchannelAddress: Any = js.native
    
    /**
      * A string representation of the subchannel address, for logging/tracing
      */
    /* private */ var subchannelAddressString: Any = js.native
    
    /* private */ var trace: Any = js.native
    
    /**
      * Initiate a state transition from any element of oldStates to the new
      * state. If the current connectivityState is not in oldStates, do nothing.
      * @param oldStates The set of states to transition from
      * @param newState The state to transition to
      * @returns True if the state changed, false otherwise
      */
    /* private */ var transitionToState: Any = js.native
    
    def unref(): Unit = js.native
    
    def unrefIfOneRef(): Boolean = js.native
    
    /**
      * The complete user agent string constructed using channel args.
      */
    /* private */ var userAgent: Any = js.native
  }
  
  trait SubchannelCallStatsTracker extends StObject {
    
    def addMessageReceived(): Unit
    
    def addMessageSent(): Unit
  }
  object SubchannelCallStatsTracker {
    
    inline def apply(addMessageReceived: () => Unit, addMessageSent: () => Unit): SubchannelCallStatsTracker = {
      val __obj = js.Dynamic.literal(addMessageReceived = js.Any.fromFunction0(addMessageReceived), addMessageSent = js.Any.fromFunction0(addMessageSent))
      __obj.asInstanceOf[SubchannelCallStatsTracker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubchannelCallStatsTracker] (val x: Self) extends AnyVal {
      
      inline def setAddMessageReceived(value: () => Unit): Self = StObject.set(x, "addMessageReceived", js.Any.fromFunction0(value))
      
      inline def setAddMessageSent(value: () => Unit): Self = StObject.set(x, "addMessageSent", js.Any.fromFunction0(value))
    }
  }
}
