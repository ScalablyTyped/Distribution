package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExecutionStatusCase extends js.Object

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ExecutionStatus.ExecutionStatusCase")
@js.native
object ExecutionStatusCase extends js.Object {
  @js.native
  sealed trait ARITHMETIC_ERROR extends ExecutionStatusCase
  
  @js.native
  sealed trait ASSERTION_FAILURE extends ExecutionStatusCase
  
  @js.native
  sealed trait EXECUTIONSTATUS_NOT_SET extends ExecutionStatusCase
  
  @js.native
  sealed trait REFERENCE_ERROR extends ExecutionStatusCase
  
  @js.native
  sealed trait RUNTIME_STATUS extends ExecutionStatusCase
  
  /* 3 */ val ARITHMETIC_ERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.ARITHMETIC_ERROR with Double = js.native
  /* 2 */ val ASSERTION_FAILURE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.ASSERTION_FAILURE with Double = js.native
  /* 0 */ val EXECUTIONSTATUS_NOT_SET: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.EXECUTIONSTATUS_NOT_SET with Double = js.native
  /* 4 */ val REFERENCE_ERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.REFERENCE_ERROR with Double = js.native
  /* 1 */ val RUNTIME_STATUS: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.RUNTIME_STATUS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExecutionStatusCase with Double] = js.native
}

