package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.callStreamMod.Deadline
import typings.grpcGrpcJs.callStreamMod.Http2CallStream
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("@grpc/grpc-js/build/src/channel", "ChannelImplementation")
  @js.native
  class ChannelImplementation protected () extends Channel {
    def this(target: String, credentials: ChannelCredentials, options: ChannelOptions) = this()
    
    def _startCallStream(stream: Http2CallStream, metadata: Metadata): Unit = js.native
    
    /**
      * This timer does not do anything on its own. Its purpose is to hold the
      * event loop open while there are any pending calls for the channel that
      * have not yet been assigned to specific subchannels. In other words,
      * the invariant is that callRefTimer is reffed if and only if pickQueue
      * is non-empty.
      */
    var callRefTimer: js.Any = js.native
    
    var connectivityState: js.Any = js.native
    
    var connectivityStateWatchers: js.Any = js.native
    
    val credentials: js.Any = js.native
    
    var currentPicker: js.Any = js.native
    
    var defaultAuthority: js.Any = js.native
    
    var filterStackFactory: js.Any = js.native
    
    val options: js.Any = js.native
    
    var pickQueue: js.Any = js.native
    
    var pushPick: js.Any = js.native
    
    var removeConnectivityStateWatcher: js.Any = js.native
    
    var resolvingLoadBalancer: js.Any = js.native
    
    var subchannelPool: js.Any = js.native
    
    var target: js.Any = js.native
    
    /**
      * Check the picker output for the given call and corresponding metadata,
      * and take any relevant actions. Should not be called while iterating
      * over pickQueue.
      * @param callStream
      * @param callMetadata
      */
    var tryPick: js.Any = js.native
    
    var updateState: js.Any = js.native
  }
  
  @js.native
  sealed trait ConnectivityState extends StObject
  @JSImport("@grpc/grpc-js/build/src/channel", "ConnectivityState")
  @js.native
  object ConnectivityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConnectivityState with Double] = js.native
    
    @js.native
    sealed trait CONNECTING extends ConnectivityState
    /* 0 */ val CONNECTING: typings.grpcGrpcJs.channelMod.ConnectivityState.CONNECTING with Double = js.native
    
    @js.native
    sealed trait IDLE extends ConnectivityState
    /* 3 */ val IDLE: typings.grpcGrpcJs.channelMod.ConnectivityState.IDLE with Double = js.native
    
    @js.native
    sealed trait READY extends ConnectivityState
    /* 1 */ val READY: typings.grpcGrpcJs.channelMod.ConnectivityState.READY with Double = js.native
    
    @js.native
    sealed trait SHUTDOWN extends ConnectivityState
    /* 4 */ val SHUTDOWN: typings.grpcGrpcJs.channelMod.ConnectivityState.SHUTDOWN with Double = js.native
    
    @js.native
    sealed trait TRANSIENT_FAILURE extends ConnectivityState
    /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.channelMod.ConnectivityState.TRANSIENT_FAILURE with Double = js.native
  }
  
  @js.native
  trait Channel extends StObject {
    
    /**
      * Close the channel. This has the same functionality as the existing
      * grpc.Client.prototype.close
      */
    def close(): Unit = js.native
    
    def createCall(method: String, deadline: Deadline, host: js.UndefOr[scala.Nothing], parentCall: js.Any): Call = js.native
    def createCall(
      method: String,
      deadline: Deadline,
      host: js.UndefOr[scala.Nothing],
      parentCall: js.Any,
      // eslint-disable-line @typescript-eslint/no-explicit-any
    propagateFlags: Double
    ): Call = js.native
    /**
      * Create a call object. Call is an opaque type that is used by the Client
      * class. This function is called by the gRPC library when starting a
      * request. Implementers should return an instance of Call that is returned
      * from calling createCall on an instance of the provided Channel class.
      * @param method The full method string to request.
      * @param deadline The call deadline
      * @param host A host string override for making the request
      * @param parentCall A server call to propagate some information from
      * @param propagateFlags A bitwise combination of elements of grpc.propagate
      *     that indicates what information to propagate from parentCall.
      */
    def createCall(method: String, deadline: Deadline, host: String, parentCall: js.Any): Call = js.native
    def createCall(
      method: String,
      deadline: Deadline,
      host: String,
      parentCall: js.Any,
      // eslint-disable-line @typescript-eslint/no-explicit-any
    propagateFlags: Double
    ): Call = js.native
    def createCall(method: String, deadline: Deadline, host: Null, parentCall: js.Any): Call = js.native
    def createCall(
      method: String,
      deadline: Deadline,
      host: Null,
      parentCall: js.Any,
      // eslint-disable-line @typescript-eslint/no-explicit-any
    propagateFlags: Double
    ): Call = js.native
    
    /**
      * Get the channel's current connectivity state. This method is here mainly
      * because it is in the existing internal Channel class, and there isn't
      * another good place to put it.
      * @param tryToConnect If true, the channel will start connecting if it is
      *     idle. Otherwise, idle channels will only start connecting when a
      *     call starts.
      */
    def getConnectivityState(tryToConnect: Boolean): ConnectivityState = js.native
    
    /**
      * Return the target that this channel connects to
      */
    def getTarget(): String = js.native
    
    def watchConnectivityState(
      currentState: ConnectivityState,
      deadline: Double,
      callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
    ): Unit = js.native
    /**
      * Watch for connectivity state changes. This is also here mainly because
      * it is in the existing external Channel class.
      * @param currentState The state to watch for transitions from. This should
      *     always be populated by calling getConnectivityState immediately
      *     before.
      * @param deadline A deadline for waiting for a state change
      * @param callback Called with no error when a state change, or with an
      *     error if the deadline passes without a state change.
      */
    def watchConnectivityState(
      currentState: ConnectivityState,
      deadline: Date,
      callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
    ): Unit = js.native
  }
}
