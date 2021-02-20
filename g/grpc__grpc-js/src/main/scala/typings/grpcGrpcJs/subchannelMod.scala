package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Http2CallStream
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelMod.ConnectivityState
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterMod.FilterFactory
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subchannelMod {
  
  @JSImport("@grpc/grpc-js/build/src/subchannel", "Subchannel")
  @js.native
  class Subchannel protected () extends StObject {
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
    
    var backoffTimeout: js.Any = js.native
    
    def callRef(): Unit = js.native
    
    /**
      * Tracks calls with references to this subchannel
      */
    var callRefcount: js.Any = js.native
    
    def callUnref(): Unit = js.native
    
    var channelTarget: js.Any = js.native
    
    /**
      * Check if the subchannel associated with zero calls and with zero channels.
      * If so, shut it down.
      */
    var checkBothRefcounts: js.Any = js.native
    
    /**
      * The subchannel's current connectivity state. Invariant: `session` === `null`
      * if and only if `connectivityState` is IDLE or TRANSIENT_FAILURE.
      */
    var connectivityState: js.Any = js.native
    
    /**
      * Indicates that the subchannel should transition from TRANSIENT_FAILURE to
      * CONNECTING instead of IDLE when the backoff timeout ends.
      */
    var continueConnecting: js.Any = js.native
    
    var createSession: js.Any = js.native
    
    var credentials: js.Any = js.native
    
    /**
      * A list of listener functions that will be called when the underlying
      * socket disconnects. Used for ending active calls with an UNAVAILABLE
      * status.
      */
    var disconnectListeners: js.Any = js.native
    
    def getAddress(): String = js.native
    
    /**
      * Get the subchannel's current connectivity state.
      */
    def getConnectivityState(): ConnectivityState = js.native
    
    var handleBackoffTimer: js.Any = js.native
    
    /**
      * Timer reference for timeout that indicates when to send the next ping
      */
    var keepaliveIntervalId: js.Any = js.native
    
    /**
      * The amount of time in between sending pings
      */
    var keepaliveTimeMs: js.Any = js.native
    
    /**
      * Timer reference tracking when the most recent ping will be considered lost
      */
    var keepaliveTimeoutId: js.Any = js.native
    
    /**
      * The amount of time to wait for an acknowledgement after sending a ping
      */
    var keepaliveTimeoutMs: js.Any = js.native
    
    var options: js.Any = js.native
    
    def ref(): Unit = js.native
    
    /**
      * Tracks channels and subchannel pools with references to this subchannel
      */
    var refcount: js.Any = js.native
    
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
    
    var sendPing: js.Any = js.native
    
    /**
      * The underlying http2 session used to make requests.
      */
    var session: js.Any = js.native
    
    /**
      * Start a backoff timer with the current nextBackoff timeout
      */
    var startBackoff: js.Any = js.native
    
    /**
      * Start a stream on the current session with the given `metadata` as headers
      * and then attach it to the `callStream`. Must only be called if the
      * subchannel's current connectivity state is READY.
      * @param metadata
      * @param callStream
      */
    def startCallStream(metadata: Metadata, callStream: Http2CallStream): Unit = js.native
    def startCallStream(metadata: Metadata, callStream: Http2CallStream, extraFilterFactory: FilterFactory[Filter]): Unit = js.native
    
    /**
      * If the subchannel is currently IDLE, start connecting and switch to the
      * CONNECTING state. If the subchannel is current in TRANSIENT_FAILURE,
      * the next time it would transition to IDLE, start connecting again instead.
      * Otherwise, do nothing.
      */
    def startConnecting(): Unit = js.native
    
    var startConnectingInternal: js.Any = js.native
    
    var startKeepalivePings: js.Any = js.native
    
    /**
      * A list of listener functions that will be called whenever the connectivity
      * state changes. Will be modified by `addConnectivityStateListener` and
      * `removeConnectivityStateListener`
      */
    var stateListeners: js.Any = js.native
    
    var stopBackoff: js.Any = js.native
    
    var stopKeepalivePings: js.Any = js.native
    
    var subchannelAddress: js.Any = js.native
    
    /**
      * A string representation of the subchannel address, for logging/tracing
      */
    var subchannelAddressString: js.Any = js.native
    
    /**
      * Initiate a state transition from any element of oldStates to the new
      * state. If the current connectivityState is not in oldStates, do nothing.
      * @param oldStates The set of states to transition from
      * @param newState The state to transition to
      * @returns True if the state changed, false otherwise
      */
    var transitionToState: js.Any = js.native
    
    def unref(): Unit = js.native
    
    def unrefIfOneRef(): Boolean = js.native
    
    /**
      * The complete user agent string constructed using channel args.
      */
    var userAgent: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/subchannel", "isTcpSubchannelAddress")
  @js.native
  def isTcpSubchannelAddress(address: SubchannelAddress): /* is @grpc/grpc-js.@grpc/grpc-js/build/src/subchannel.TcpSubchannelAddress */ Boolean = js.native
  
  @JSImport("@grpc/grpc-js/build/src/subchannel", "subchannelAddressEqual")
  @js.native
  def subchannelAddressEqual(address1: SubchannelAddress, address2: SubchannelAddress): Boolean = js.native
  
  @JSImport("@grpc/grpc-js/build/src/subchannel", "subchannelAddressToString")
  @js.native
  def subchannelAddressToString(address: SubchannelAddress): String = js.native
  
  type ConnectivityStateListener = js.Function3[
    /* subchannel */ Subchannel, 
    /* previousState */ ConnectivityState, 
    /* newState */ ConnectivityState, 
    Unit
  ]
  
  @js.native
  trait IpcSubchannelAddress extends SubchannelAddress {
    
    var path: String = js.native
  }
  object IpcSubchannelAddress {
    
    @scala.inline
    def apply(path: String): IpcSubchannelAddress = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IpcSubchannelAddress]
    }
    
    @scala.inline
    implicit class IpcSubchannelAddressMutableBuilder[Self <: IpcSubchannelAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcGrpcJs.subchannelMod.TcpSubchannelAddress
    - typings.grpcGrpcJs.subchannelMod.IpcSubchannelAddress
  */
  trait SubchannelAddress extends StObject
  object SubchannelAddress {
    
    @scala.inline
    def IpcSubchannelAddress(path: String): typings.grpcGrpcJs.subchannelMod.IpcSubchannelAddress = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.subchannelMod.IpcSubchannelAddress]
    }
    
    @scala.inline
    def TcpSubchannelAddress(host: String, port: Double): typings.grpcGrpcJs.subchannelMod.TcpSubchannelAddress = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.grpcGrpcJs.subchannelMod.TcpSubchannelAddress]
    }
  }
  
  @js.native
  trait TcpSubchannelAddress extends SubchannelAddress {
    
    var host: String = js.native
    
    var port: Double = js.native
  }
  object TcpSubchannelAddress {
    
    @scala.inline
    def apply(host: String, port: Double): TcpSubchannelAddress = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[TcpSubchannelAddress]
    }
    
    @scala.inline
    implicit class TcpSubchannelAddressMutableBuilder[Self <: TcpSubchannelAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
