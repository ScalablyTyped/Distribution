package typings.libraCore.vmErrorsPbMod.ExecutionStatus

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExecutionStatusCase extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ExecutionStatus.ExecutionStatusCase")
@js.native
object ExecutionStatusCase extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExecutionStatusCase with Double] = js.native
  
  @js.native
  sealed trait ARITHMETIC_ERROR extends ExecutionStatusCase
  /* 3 */ @js.native
  object ARITHMETIC_ERROR extends TopLevel[ARITHMETIC_ERROR with Double]
  
  @js.native
  sealed trait ASSERTION_FAILURE extends ExecutionStatusCase
  /* 2 */ @js.native
  object ASSERTION_FAILURE extends TopLevel[ASSERTION_FAILURE with Double]
  
  @js.native
  sealed trait EXECUTIONSTATUS_NOT_SET extends ExecutionStatusCase
  /* 0 */ @js.native
  object EXECUTIONSTATUS_NOT_SET extends TopLevel[EXECUTIONSTATUS_NOT_SET with Double]
  
  @js.native
  sealed trait REFERENCE_ERROR extends ExecutionStatusCase
  /* 4 */ @js.native
  object REFERENCE_ERROR extends TopLevel[REFERENCE_ERROR with Double]
  
  @js.native
  sealed trait RUNTIME_STATUS extends ExecutionStatusCase
  /* 1 */ @js.native
  object RUNTIME_STATUS extends TopLevel[RUNTIME_STATUS with Double]
}
