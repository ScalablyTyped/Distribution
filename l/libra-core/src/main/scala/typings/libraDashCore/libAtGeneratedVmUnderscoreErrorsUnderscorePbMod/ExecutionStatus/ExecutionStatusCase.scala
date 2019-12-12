package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus

import org.scalablytyped.runtime.TopLevel
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.ARITHMETIC_ERROR
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.ASSERTION_FAILURE
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.EXECUTIONSTATUS_NOT_SET
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.REFERENCE_ERROR
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.ExecutionStatusCase.RUNTIME_STATUS
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExecutionStatusCase with Double] = js.native
  /* 3 */ @js.native
  object ARITHMETIC_ERROR extends TopLevel[ARITHMETIC_ERROR with Double]
  
  /* 2 */ @js.native
  object ASSERTION_FAILURE extends TopLevel[ASSERTION_FAILURE with Double]
  
  /* 0 */ @js.native
  object EXECUTIONSTATUS_NOT_SET extends TopLevel[EXECUTIONSTATUS_NOT_SET with Double]
  
  /* 4 */ @js.native
  object REFERENCE_ERROR extends TopLevel[REFERENCE_ERROR with Double]
  
  /* 1 */ @js.native
  object RUNTIME_STATUS extends TopLevel[RUNTIME_STATUS with Double]
  
}

