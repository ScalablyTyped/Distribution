package typings.grpcGrpcJs.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogVerbosity extends js.Object
@JSImport("@grpc/grpc-js/build/src/constants", "LogVerbosity")
@js.native
object LogVerbosity extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogVerbosity with Double] = js.native
  
  @js.native
  sealed trait DEBUG extends LogVerbosity
  /* 0 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  @js.native
  sealed trait ERROR extends LogVerbosity
  /* 2 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait INFO extends LogVerbosity
  /* 1 */ @js.native
  object INFO extends TopLevel[INFO with Double]
}
