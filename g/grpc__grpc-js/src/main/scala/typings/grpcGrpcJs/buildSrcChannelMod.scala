package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcCallInterfaceMod.Call
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcChannelzMod.ChannelRef
import typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typings.grpcGrpcJs.buildSrcDeadlineMod.Deadline
import typings.grpcGrpcJs.buildSrcServerCallMod.ServerSurfaceCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcChannelMod {
  
  @JSImport("@grpc/grpc-js/build/src/channel", "ChannelImplementation")
  @js.native
  open class ChannelImplementation protected ()
    extends StObject
       with Channel {
    def this(target: String, credentials: ChannelCredentials, options: ChannelOptions) = this()
    
    /* private */ var internalChannel: Any = js.native
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
