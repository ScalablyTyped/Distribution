package typings.grpc.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait logVerbosity extends js.Object

@JSImport("grpc", "logVerbosity")
@js.native
object logVerbosity extends js.Object {
  @js.native
  sealed trait DEBUG extends logVerbosity
  
  @js.native
  sealed trait ERROR extends logVerbosity
  
  @js.native
  sealed trait INFO extends logVerbosity
  
  /* 0 */ val DEBUG: typings.grpc.grpcMod.logVerbosity.DEBUG with Double = js.native
  /* 2 */ val ERROR: typings.grpc.grpcMod.logVerbosity.ERROR with Double = js.native
  /* 1 */ val INFO: typings.grpc.grpcMod.logVerbosity.INFO with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[logVerbosity with Double] = js.native
}

