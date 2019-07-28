package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraExecutionErrorType extends js.Object

@JSImport("libra-core", "LibraExecutionErrorType")
@js.native
object LibraExecutionErrorType extends js.Object {
  @js.native
  sealed trait ARITHMETIC_ERROR extends LibraExecutionErrorType
  
  @js.native
  sealed trait ASSERTION_FAILURE extends LibraExecutionErrorType
  
  @js.native
  sealed trait EXECUTIONSTATUS_NOT_SET extends LibraExecutionErrorType
  
  @js.native
  sealed trait REFERENCE_ERROR extends LibraExecutionErrorType
  
  @js.native
  sealed trait RUNTIME_STATUS extends LibraExecutionErrorType
  
  /* 3 */ val ARITHMETIC_ERROR: typings.libraDashCore.libraDashCoreMod.LibraExecutionErrorType.ARITHMETIC_ERROR with Double = js.native
  /* 2 */ val ASSERTION_FAILURE: typings.libraDashCore.libraDashCoreMod.LibraExecutionErrorType.ASSERTION_FAILURE with Double = js.native
  /* 0 */ val EXECUTIONSTATUS_NOT_SET: typings.libraDashCore.libraDashCoreMod.LibraExecutionErrorType.EXECUTIONSTATUS_NOT_SET with Double = js.native
  /* 4 */ val REFERENCE_ERROR: typings.libraDashCore.libraDashCoreMod.LibraExecutionErrorType.REFERENCE_ERROR with Double = js.native
  /* 1 */ val RUNTIME_STATUS: typings.libraDashCore.libraDashCoreMod.LibraExecutionErrorType.RUNTIME_STATUS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraExecutionErrorType with Double] = js.native
}

