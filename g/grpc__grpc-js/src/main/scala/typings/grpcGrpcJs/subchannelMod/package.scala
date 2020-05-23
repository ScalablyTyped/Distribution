package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subchannelMod {
  type ConnectivityStateListener = js.Function3[
    /* subchannel */ typings.grpcGrpcJs.subchannelMod.Subchannel, 
    /* previousState */ typings.grpcGrpcJs.channelMod.ConnectivityState, 
    /* newState */ typings.grpcGrpcJs.channelMod.ConnectivityState, 
    scala.Unit
  ]
}
