package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.buildSrcCallCredentialsMod.CallCredentials
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.Call
import typings.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcChannelzMod.ChannelRef
import typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState
import typings.grpcGrpcJs.buildSrcDeadlineMod.Deadline
import typings.grpcGrpcJs.buildSrcLoadBalancingCallMod.LoadBalancingCall
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import typings.grpcGrpcJs.buildSrcPickerMod.PickResult
import typings.grpcGrpcJs.buildSrcResolverMod.CallConfig
import typings.grpcGrpcJs.buildSrcResolvingCallMod.ResolvingCall
import typings.grpcGrpcJs.buildSrcServerCallMod.ServerSurfaceCall
import typings.grpcGrpcJs.grpcGrpcJsStrings.ERROR
import typings.grpcGrpcJs.grpcGrpcJsStrings.NONE
import typings.grpcGrpcJs.grpcGrpcJsStrings.SUCCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInternalChannelMod {
  
  @JSImport("@grpc/grpc-js/build/src/internal-channel", "InternalChannel")
  @js.native
  open class InternalChannel protected () extends StObject {
    def this(target: String, credentials: ChannelCredentials, options: ChannelOptions) = this()
    
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
    
    def close(): Unit = js.native
    
    /**
      * Calls queued up to get a call config. Should only be populated before the
      * first time the resolver returns a result, which includes the ConfigSelector.
      */
    /* private */ var configSelectionQueue: Any = js.native
    
    /* private */ var configSelector: Any = js.native
    
    /* private */ var connectivityState: Any = js.native
    
    /* private */ var connectivityStateWatchers: Any = js.native
    
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
    
    def createInnerCall(
      callConfig: CallConfig,
      method: String,
      host: String,
      credentials: CallCredentials,
      deadline: Deadline
    ): Call = js.native
    
    def createLoadBalancingCall(
      callConfig: CallConfig,
      method: String,
      host: String,
      credentials: CallCredentials,
      deadline: Deadline
    ): LoadBalancingCall = js.native
    
    def createResolvingCall(method: String, deadline: Deadline): ResolvingCall = js.native
    def createResolvingCall(method: String, deadline: Deadline, host: String): ResolvingCall = js.native
    def createResolvingCall(method: String, deadline: Deadline, host: String, parentCall: Null, propagateFlags: Double): ResolvingCall = js.native
    def createResolvingCall(method: String, deadline: Deadline, host: String, parentCall: ServerSurfaceCall): ResolvingCall = js.native
    def createResolvingCall(
      method: String,
      deadline: Deadline,
      host: String,
      parentCall: ServerSurfaceCall,
      propagateFlags: Double
    ): ResolvingCall = js.native
    def createResolvingCall(method: String, deadline: Deadline, host: Null, parentCall: Null, propagateFlags: Double): ResolvingCall = js.native
    def createResolvingCall(method: String, deadline: Deadline, host: Null, parentCall: ServerSurfaceCall): ResolvingCall = js.native
    def createResolvingCall(
      method: String,
      deadline: Deadline,
      host: Null,
      parentCall: ServerSurfaceCall,
      propagateFlags: Double
    ): ResolvingCall = js.native
    def createResolvingCall(method: String, deadline: Deadline, host: Unit, parentCall: Null, propagateFlags: Double): ResolvingCall = js.native
    def createResolvingCall(method: String, deadline: Deadline, host: Unit, parentCall: ServerSurfaceCall): ResolvingCall = js.native
    def createResolvingCall(
      method: String,
      deadline: Deadline,
      host: Unit,
      parentCall: ServerSurfaceCall,
      propagateFlags: Double
    ): ResolvingCall = js.native
    
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
    
    def doPick(metadata: Metadata, extraPickInfo: StringDictionary[String]): PickResult = js.native
    
    /* private */ var filterStackFactory: Any = js.native
    
    /* private */ var getChannelzInfo: Any = js.native
    
    /**
      * Get the channelz reference object for this channel. The returned value is
      * garbage if channelz is disabled for this channel.
      * @returns
      */
    def getChannelzRef(): ChannelRef = js.native
    
    def getConfig(method: String, metadata: Metadata): GetConfigResult = js.native
    
    def getConnectivityState(tryToConnect: Boolean): ConnectivityState = js.native
    
    def getTarget(): String = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ var originalTarget: Any = js.native
    
    /* private */ var pickQueue: Any = js.native
    
    def queueCallForConfig(call: ResolvingCall): Unit = js.native
    
    def queueCallForPick(call: LoadBalancingCall): Unit = js.native
    
    /* private */ var removeConnectivityStateWatcher: Any = js.native
    
    /* private */ var resolvingLoadBalancer: Any = js.native
    
    /* private */ var subchannelPool: Any = js.native
    
    /* private */ var target: Any = js.native
    
    /* private */ var trace: Any = js.native
    
    /* private */ var updateState: Any = js.native
    
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
  
  trait ErrorConfigResult
    extends StObject
       with GetConfigResult {
    
    var error: StatusObject
    
    var `type`: ERROR
  }
  object ErrorConfigResult {
    
    inline def apply(error: StatusObject): ErrorConfigResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ERROR")
      __obj.asInstanceOf[ErrorConfigResult]
    }
    
    extension [Self <: ErrorConfigResult](x: Self) {
      
      inline def setError(value: StatusObject): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setType(value: ERROR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.grpcGrpcJs.buildSrcInternalChannelMod.NoneConfigResult
    - typings.grpcGrpcJs.buildSrcInternalChannelMod.SuccessConfigResult
    - typings.grpcGrpcJs.buildSrcInternalChannelMod.ErrorConfigResult
  */
  trait GetConfigResult extends StObject
  object GetConfigResult {
    
    inline def ErrorConfigResult(error: StatusObject): typings.grpcGrpcJs.buildSrcInternalChannelMod.ErrorConfigResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ERROR")
      __obj.asInstanceOf[typings.grpcGrpcJs.buildSrcInternalChannelMod.ErrorConfigResult]
    }
    
    inline def NoneConfigResult(): typings.grpcGrpcJs.buildSrcInternalChannelMod.NoneConfigResult = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("NONE")
      __obj.asInstanceOf[typings.grpcGrpcJs.buildSrcInternalChannelMod.NoneConfigResult]
    }
    
    inline def SuccessConfigResult(config: CallConfig): typings.grpcGrpcJs.buildSrcInternalChannelMod.SuccessConfigResult = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SUCCESS")
      __obj.asInstanceOf[typings.grpcGrpcJs.buildSrcInternalChannelMod.SuccessConfigResult]
    }
  }
  
  trait NoneConfigResult
    extends StObject
       with GetConfigResult {
    
    var `type`: NONE
  }
  object NoneConfigResult {
    
    inline def apply(): NoneConfigResult = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("NONE")
      __obj.asInstanceOf[NoneConfigResult]
    }
    
    extension [Self <: NoneConfigResult](x: Self) {
      
      inline def setType(value: NONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SuccessConfigResult
    extends StObject
       with GetConfigResult {
    
    var config: CallConfig
    
    var `type`: SUCCESS
  }
  object SuccessConfigResult {
    
    inline def apply(config: CallConfig): SuccessConfigResult = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SUCCESS")
      __obj.asInstanceOf[SuccessConfigResult]
    }
    
    extension [Self <: SuccessConfigResult](x: Self) {
      
      inline def setConfig(value: CallConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setType(value: SUCCESS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
