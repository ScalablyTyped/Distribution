package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait connectivityState extends js.Object

@JSImport("grpc", "connectivityState")
@js.native
object connectivityState extends js.Object {
  @js.native
  sealed trait CONNECTING
    extends grpcLib.grpcMod.connectivityState
  
  @js.native
  sealed trait IDLE
    extends grpcLib.grpcMod.connectivityState
  
  @js.native
  sealed trait READY
    extends grpcLib.grpcMod.connectivityState
  
  @js.native
  sealed trait SHUTDOWN
    extends grpcLib.grpcMod.connectivityState
  
  @js.native
  sealed trait TRANSIENT_FAILURE
    extends grpcLib.grpcMod.connectivityState
  
  /* 1 */ val CONNECTING: CONNECTING with scala.Double = js.native
  /* 0 */ val IDLE: IDLE with scala.Double = js.native
  /* 2 */ val READY: READY with scala.Double = js.native
  /* 4 */ val SHUTDOWN: SHUTDOWN with scala.Double = js.native
  /* 3 */ val TRANSIENT_FAILURE: TRANSIENT_FAILURE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[grpcLib.grpcMod.connectivityState with scala.Double] = js.native
}

