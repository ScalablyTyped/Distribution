package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.channelMod.ConnectivityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "connectivityState")
@js.native
object connectivityState extends js.Object {
  /* 0 */ val CONNECTING: typings.grpcGrpcJs.channelMod.ConnectivityState.CONNECTING with Double = js.native
  /* 3 */ val IDLE: typings.grpcGrpcJs.channelMod.ConnectivityState.IDLE with Double = js.native
  /* 1 */ val READY: typings.grpcGrpcJs.channelMod.ConnectivityState.READY with Double = js.native
  /* 4 */ val SHUTDOWN: typings.grpcGrpcJs.channelMod.ConnectivityState.SHUTDOWN with Double = js.native
  /* 2 */ val TRANSIENT_FAILURE: typings.grpcGrpcJs.channelMod.ConnectivityState.TRANSIENT_FAILURE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectivityState with Double] = js.native
}

