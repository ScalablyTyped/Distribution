package typings.grpc.grpcMod

import org.scalablytyped.runtime.TopLevel
import typings.grpc.grpcMod.logVerbosity.DEBUG
import typings.grpc.grpcMod.logVerbosity.ERROR
import typings.grpc.grpcMod.logVerbosity.INFO
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[logVerbosity with Double] = js.native
  /* 0 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  /* 2 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 1 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
}

