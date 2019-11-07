package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus

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
  
  /* 4 */ val DESERIALIZATION: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus.ErrorTypeCase.DESERIALIZATION with Double = js.native
  /* 0 */ val ERRORTYPE_NOT_SET: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus.ErrorTypeCase.ERRORTYPE_NOT_SET with Double = js.native
  /* 5 */ val EXECUTION: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus.ErrorTypeCase.EXECUTION with Double = js.native
  /* 3 */ val INVARIANT_VIOLATION: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus.ErrorTypeCase.INVARIANT_VIOLATION with Double = js.native
  /* 1 */ val VALIDATION: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus.ErrorTypeCase.VALIDATION with Double = js.native
  /* 2 */ val VERIFICATION: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus.ErrorTypeCase.VERIFICATION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorTypeCase with Double] = js.native
}

