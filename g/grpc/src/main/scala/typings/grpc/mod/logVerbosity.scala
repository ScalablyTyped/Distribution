package typings.grpc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait logVerbosity extends js.Object
@JSImport("grpc", "logVerbosity")
@js.native
object logVerbosity extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[logVerbosity with Double] = js.native
  
  @js.native
  sealed trait DEBUG extends logVerbosity
  /* 0 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  @js.native
  sealed trait ERROR extends logVerbosity
  /* 2 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait INFO extends logVerbosity
  /* 1 */ @js.native
  object INFO extends TopLevel[INFO with Double]
}
