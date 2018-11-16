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
  
  val DEBUG: DEBUG with java.lang.String = js.native
  val ERROR: ERROR with java.lang.String = js.native
  val INFO: INFO with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[grpcLib.grpcMod.logVerbosity with java.lang.String] = js.native
}

