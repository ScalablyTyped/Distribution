package typings.grpc.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait connectivityState extends js.Object

@JSImport("grpc", "connectivityState")
@js.native
object connectivityState extends js.Object {
  @js.native
  sealed trait CONNECTING extends connectivityState
  
  @js.native
  sealed trait IDLE extends connectivityState
  
  @js.native
  sealed trait READY extends connectivityState
  
  @js.native
  sealed trait SHUTDOWN extends connectivityState
  
  @js.native
  sealed trait TRANSIENT_FAILURE extends connectivityState
  
  /* 1 */ val CONNECTING: typings.grpc.grpcMod.connectivityState.CONNECTING with Double = js.native
  /* 0 */ val IDLE: typings.grpc.grpcMod.connectivityState.IDLE with Double = js.native
  /* 2 */ val READY: typings.grpc.grpcMod.connectivityState.READY with Double = js.native
  /* 4 */ val SHUTDOWN: typings.grpc.grpcMod.connectivityState.SHUTDOWN with Double = js.native
  /* 3 */ val TRANSIENT_FAILURE: typings.grpc.grpcMod.connectivityState.TRANSIENT_FAILURE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[connectivityState with Double] = js.native
}

