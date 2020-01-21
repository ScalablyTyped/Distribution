package typings.grpcGrpcJs.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogVerbosity extends js.Object

@JSImport("@grpc/grpc-js/build/src/constants", "LogVerbosity")
@js.native
object LogVerbosity extends js.Object {
  @js.native
  sealed trait DEBUG extends LogVerbosity
  
  @js.native
  sealed trait ERROR extends LogVerbosity
  
  @js.native
  sealed trait INFO extends LogVerbosity
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogVerbosity with Double] = js.native
  /* 0 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  /* 2 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 1 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
}

