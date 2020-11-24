package typings.libraCore.vmErrorsPbMod.VMStatus

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorTypeCase extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.ErrorTypeCase")
@js.native
object ErrorTypeCase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorTypeCase with Double] = js.native
  
  @js.native
  sealed trait DESERIALIZATION extends ErrorTypeCase
  /* 4 */ @js.native
  object DESERIALIZATION extends TopLevel[DESERIALIZATION with Double]
  
  @js.native
  sealed trait ERRORTYPE_NOT_SET extends ErrorTypeCase
  /* 0 */ @js.native
  object ERRORTYPE_NOT_SET extends TopLevel[ERRORTYPE_NOT_SET with Double]
  
  @js.native
  sealed trait EXECUTION extends ErrorTypeCase
  /* 5 */ @js.native
  object EXECUTION extends TopLevel[EXECUTION with Double]
  
  @js.native
  sealed trait INVARIANT_VIOLATION extends ErrorTypeCase
  /* 3 */ @js.native
  object INVARIANT_VIOLATION extends TopLevel[INVARIANT_VIOLATION with Double]
  
  @js.native
  sealed trait VALIDATION extends ErrorTypeCase
  /* 1 */ @js.native
  object VALIDATION extends TopLevel[VALIDATION with Double]
  
  @js.native
  sealed trait VERIFICATION extends ErrorTypeCase
  /* 2 */ @js.native
  object VERIFICATION extends TopLevel[VERIFICATION with Double]
}
