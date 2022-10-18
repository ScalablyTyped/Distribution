package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcConnectivityStateMod {
  
  @js.native
  sealed trait ConnectivityState extends StObject
  @JSImport("@grpc/grpc-js/build/src/connectivity-state", "ConnectivityState")
  @js.native
  object ConnectivityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConnectivityState & Double] = js.native
    
    @js.native
    sealed trait CONNECTING
      extends StObject
         with ConnectivityState
    /* 1 */ val CONNECTING: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.CONNECTING & Double = js.native
    
    @js.native
    sealed trait IDLE
      extends StObject
         with ConnectivityState
    /* 0 */ val IDLE: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.IDLE & Double = js.native
    
    @js.native
    sealed trait READY
      extends StObject
         with ConnectivityState
    /* 2 */ val READY: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.READY & Double = js.native
    
    @js.native
    sealed trait SHUTDOWN
      extends StObject
         with ConnectivityState
    /* 4 */ val SHUTDOWN: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.SHUTDOWN & Double = js.native
    
    @js.native
    sealed trait TRANSIENT_FAILURE
      extends StObject
         with ConnectivityState
    /* 3 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.buildSrcConnectivityStateMod.ConnectivityState.TRANSIENT_FAILURE & Double = js.native
  }
}
