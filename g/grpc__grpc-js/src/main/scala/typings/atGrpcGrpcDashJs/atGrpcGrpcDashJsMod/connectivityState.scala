package typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod

import typings.atGrpcGrpcDashJs.buildSrcChannelMod.ConnectivityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "connectivityState")
@js.native
object connectivityState extends js.Object {
  /* 0 */ val CONNECTING: typings.atGrpcGrpcDashJs.buildSrcChannelMod.ConnectivityState.CONNECTING with Double = js.native
  /* 3 */ val IDLE: typings.atGrpcGrpcDashJs.buildSrcChannelMod.ConnectivityState.IDLE with Double = js.native
  /* 1 */ val READY: typings.atGrpcGrpcDashJs.buildSrcChannelMod.ConnectivityState.READY with Double = js.native
  /* 4 */ val SHUTDOWN: typings.atGrpcGrpcDashJs.buildSrcChannelMod.ConnectivityState.SHUTDOWN with Double = js.native
  /* 2 */ val TRANSIENT_FAILURE: typings.atGrpcGrpcDashJs.buildSrcChannelMod.ConnectivityState.TRANSIENT_FAILURE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectivityState with Double] = js.native
}

