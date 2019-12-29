package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorTypeCase extends js.Object

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus.ErrorTypeCase")
@js.native
object ErrorTypeCase extends js.Object {
  @js.native
  sealed trait DESERIALIZATION extends ErrorTypeCase
  
  @js.native
  sealed trait ERRORTYPE_NOT_SET extends ErrorTypeCase
  
  @js.native
  sealed trait EXECUTION extends ErrorTypeCase
  
  @js.native
  sealed trait INVARIANT_VIOLATION extends ErrorTypeCase
  
  @js.native
  sealed trait VALIDATION extends ErrorTypeCase
  
  @js.native
  sealed trait VERIFICATION extends ErrorTypeCase
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorTypeCase with Double] = js.native
  /* 4 */ @js.native
  object DESERIALIZATION extends TopLevel[DESERIALIZATION with Double]
  
  /* 0 */ @js.native
  object ERRORTYPE_NOT_SET extends TopLevel[ERRORTYPE_NOT_SET with Double]
  
  /* 5 */ @js.native
  object EXECUTION extends TopLevel[EXECUTION with Double]
  
  /* 3 */ @js.native
  object INVARIANT_VIOLATION extends TopLevel[INVARIANT_VIOLATION with Double]
  
  /* 1 */ @js.native
  object VALIDATION extends TopLevel[VALIDATION with Double]
  
  /* 2 */ @js.native
  object VERIFICATION extends TopLevel[VERIFICATION with Double]
  
}

