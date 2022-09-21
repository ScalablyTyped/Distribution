package typings.grpcGrpcJs

import typings.grpcGrpcJs.callStreamMod.Call
import typings.grpcGrpcJs.callStreamMod.Deadline
import typings.grpcGrpcJs.callStreamMod.Http2CallStream
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.channelzMod.ChannelRef
import typings.grpcGrpcJs.connectivityStateMod.ConnectivityState
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.grpcGrpcJs.serverCallMod.ServerSurfaceCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("@grpc/grpc-js/build/src/channel", "ChannelImplementation")
  @js.native
  open class ChannelImplementation protected ()
    extends StObject
       with Channel {
    def this(target: String, credentials: ChannelCredentials, options: ChannelOptions) = this()
    
    def _startCallStream(stream: Http2CallStream, metadata: Metadata): Unit = js.native
    
    /**
      * This timer does not do anything on its own. Its purpose is to hold the
      * event loop open while there are any pending calls for the channel that
      * have not yet been assigned to specific subchannels. In other words,
      * the invariant is that callRefTimer is reffed if and only if pickQueue
      * is non-empty.
      */
    /* private */ var callRefTimer: Any = js.native
    
    /* private */ var callRefTimerRef: Any = js.native
    
    /* private */ var callRefTimerUnref: Any = js.native
    
    /* private */ var callTracker: Any = js.native
    
    /* private */ val channelzEnabled: Any = js.native
    
    /* private */ var channelzRef: Any = js.native
    
    /* private */ var channelzTrace: Any = js.native
    
    /* private */ var childrenTracker: Any = js.native
    
    /**
      * Calls queued up to get a call config. Should only be populated before the
      * first time the resolver returns a result, which includes the ConfigSelector.
      */
    /* private */ var configSelectionQueue: Any = js.native
    
    /* private */ var configSelector: Any = js.native
    
    /* private */ var connectivityState: Any = js.native
    
    /* private */ var connectivityStateWatchers: Any = js.native
    
    /* private */ val credentials: Any = js.native
    
    /* private */ var currentPicker: Any = js.native
    
    /**
      * This is the error from the name resolver if it failed most recently. It
      * is only used to end calls that start while there is no config selector
      * and the name resolver is in backoff, so it should be nulled if
      * configSelector becomes set or the channel state becomes anything other
      * than TRANSIENT_FAILURE.
      */
    /* private */ var currentResolutionError: Any = js.native
    
    /* private */ var defaultAuthority: Any = js.native
    
    /* private */ var filterStackFactory: Any = js.native
    
    /* private */ var getChannelzInfo: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ var originalTarget: Any = js.native
    
    /* private */ var pickQueue: Any = js.native
    
    /* private */ var pushPick: Any = js.native
    
    /* private */ var removeConnectivityStateWatcher: Any = js.native
    
    /* private */ var resolvingLoadBalancer: Any = js.native
    
    /* private */ var subchannelPool: Any = js.native
    
    /* private */ var target: Any = js.native
    
    /* private */ var trace: Any = js.native
    
    /* private */ var tryGetConfig: Any = js.native
    
    /**
      * Check the picker output for the given call and corresponding metadata,
      * and take any relevant actions. Should not be called while iterating
      * over pickQueue.
      * @param callStream
      * @param callMetadata
      */
    /* private */ var tryPick: Any = js.native
    
    /* private */ var updateState: Any = js.native
  }
  
  @js.native
  trait Channel extends StObject {
    
    /**
      * Close the channel. This has the same functionality as the existing
      * grpc.Client.prototype.close
      */
    def close(): Unit = js.native
    
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
    def createCall(method: String, deadline: Deadline): Call = js.native
    def createCall(method: String, deadline: Deadline, host: String): Call = js.native
    def createCall(method: String, deadline: Deadline, host: String, parentCall: Null, propagateFlags: Double): Call = js.native
    def createCall(method: String, deadline: Deadline, host: String, parentCall: ServerSurfaceCall): Call = js.native
    def createCall(
      method: String,
      deadline: Deadline,
      host: String,
      parentCall: ServerSurfaceCall,
      propagateFlags: Double
    ): Call = js.native
    def createCall(method: String, deadline: Deadline, host: Null, parentCall: Null, propagateFlags: Double): Call = js.native
    def createCall(method: String, deadline: Deadline, host: Null, parentCall: ServerSurfaceCall): Call = js.native
    def createCall(
      method: String,
      deadline: Deadline,
      host: Null,
      parentCall: ServerSurfaceCall,
      propagateFlags: Double
    ): Call = js.native
    def createCall(method: String, deadline: Deadline, host: Unit, parentCall: Null, propagateFlags: Double): Call = js.native
    def createCall(method: String, deadline: Deadline, host: Unit, parentCall: ServerSurfaceCall): Call = js.native
    def createCall(
      method: String,
      deadline: Deadline,
      host: Unit,
      parentCall: ServerSurfaceCall,
      propagateFlags: Double
    ): Call = js.native
    
    /**
      * Get the channelz reference object for this channel. A request to the
      * channelz service for the id in this object will provide information
      * about this channel.
      */
    def getChannelzRef(): ChannelRef = js.native
    
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
      deadline: js.Date,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    def watchConnectivityState(
      currentState: ConnectivityState,
      deadline: Double,
      callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
  }
}
