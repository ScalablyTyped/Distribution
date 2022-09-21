package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelConnectivityStateMod {
  
  @js.native
  sealed trait grpcChannelzV1ChannelConnectivityStateState extends StObject
  @JSImport("@grpc/grpc-js/build/src/generated/grpc/channelz/v1/ChannelConnectivityState", "_grpc_channelz_v1_ChannelConnectivityState_State")
  @js.native
  object grpcChannelzV1ChannelConnectivityStateState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[grpcChannelzV1ChannelConnectivityStateState & Double] = js.native
    
    @js.native
    sealed trait CONNECTING
      extends StObject
         with grpcChannelzV1ChannelConnectivityStateState
    /* 2 */ val CONNECTING: typings.grpcGrpcJs.channelConnectivityStateMod.grpcChannelzV1ChannelConnectivityStateState.CONNECTING & Double = js.native
    
    @js.native
    sealed trait IDLE
      extends StObject
         with grpcChannelzV1ChannelConnectivityStateState
    /* 1 */ val IDLE: typings.grpcGrpcJs.channelConnectivityStateMod.grpcChannelzV1ChannelConnectivityStateState.IDLE & Double = js.native
    
    @js.native
    sealed trait READY
      extends StObject
         with grpcChannelzV1ChannelConnectivityStateState
    /* 3 */ val READY: typings.grpcGrpcJs.channelConnectivityStateMod.grpcChannelzV1ChannelConnectivityStateState.READY & Double = js.native
    
    @js.native
    sealed trait SHUTDOWN
      extends StObject
         with grpcChannelzV1ChannelConnectivityStateState
    /* 5 */ val SHUTDOWN: typings.grpcGrpcJs.channelConnectivityStateMod.grpcChannelzV1ChannelConnectivityStateState.SHUTDOWN & Double = js.native
    
    @js.native
    sealed trait TRANSIENT_FAILURE
      extends StObject
         with grpcChannelzV1ChannelConnectivityStateState
    /* 4 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.channelConnectivityStateMod.grpcChannelzV1ChannelConnectivityStateState.TRANSIENT_FAILURE & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with grpcChannelzV1ChannelConnectivityStateState
    /* 0 */ val UNKNOWN: typings.grpcGrpcJs.channelConnectivityStateMod.grpcChannelzV1ChannelConnectivityStateState.UNKNOWN & Double = js.native
  }
  
  trait ChannelConnectivityState extends StObject {
    
    var state: js.UndefOr[
        grpcChannelzV1ChannelConnectivityStateState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelConnectivityState_State * / any */ String)
      ] = js.undefined
  }
  object ChannelConnectivityState {
    
    inline def apply(): ChannelConnectivityState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelConnectivityState]
    }
    
    extension [Self <: ChannelConnectivityState](x: Self) {
      
      inline def setState(
        value: grpcChannelzV1ChannelConnectivityStateState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelConnectivityState_State * / any */ String)
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait ChannelConnectivityStateOutput extends StObject {
    
    var state: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelConnectivityState_State * / any */ String
  }
  object ChannelConnectivityStateOutput {
    
    inline def apply(
      state: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelConnectivityState_State * / any */ String
    ): ChannelConnectivityStateOutput = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelConnectivityStateOutput]
    }
    
    extension [Self <: ChannelConnectivityStateOutput](x: Self) {
      
      inline def setState(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _grpc_channelz_v1_ChannelConnectivityState_State * / any */ String
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
