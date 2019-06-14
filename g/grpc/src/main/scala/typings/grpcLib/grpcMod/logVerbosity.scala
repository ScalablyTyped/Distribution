package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait logVerbosity extends js.Object

@JSImport("grpc", "logVerbosity")
@js.native
object logVerbosity extends js.Object {
  @js.native
  sealed trait DEBUG
    extends grpcLib.grpcMod.logVerbosity
  
  @js.native
  sealed trait ERROR
    extends grpcLib.grpcMod.logVerbosity
  
  @js.native
  sealed trait INFO
    extends grpcLib.grpcMod.logVerbosity
  
  /* 0 */ val DEBUG: DEBUG with scala.Double = js.native
  /* 2 */ val ERROR: ERROR with scala.Double = js.native
  /* 1 */ val INFO: INFO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[grpcLib.grpcMod.logVerbosity with scala.Double] = js.native
}

