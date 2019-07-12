package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraExecutionErrorType extends js.Object

@JSImport("libra-core", "LibraExecutionErrorType")
@js.native
object LibraExecutionErrorType extends js.Object {
  @js.native
  sealed trait ARITHMETIC_ERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraExecutionErrorType
  
  @js.native
  sealed trait ASSERTION_FAILURE
    extends libraDashCoreLib.libraDashCoreMod.LibraExecutionErrorType
  
  @js.native
  sealed trait EXECUTIONSTATUS_NOT_SET
    extends libraDashCoreLib.libraDashCoreMod.LibraExecutionErrorType
  
  @js.native
  sealed trait REFERENCE_ERROR
    extends libraDashCoreLib.libraDashCoreMod.LibraExecutionErrorType
  
  @js.native
  sealed trait RUNTIME_STATUS
    extends libraDashCoreLib.libraDashCoreMod.LibraExecutionErrorType
  
  /* 3 */ val ARITHMETIC_ERROR: ARITHMETIC_ERROR with scala.Double = js.native
  /* 2 */ val ASSERTION_FAILURE: ASSERTION_FAILURE with scala.Double = js.native
  /* 0 */ val EXECUTIONSTATUS_NOT_SET: EXECUTIONSTATUS_NOT_SET with scala.Double = js.native
  /* 4 */ val REFERENCE_ERROR: REFERENCE_ERROR with scala.Double = js.native
  /* 1 */ val RUNTIME_STATUS: RUNTIME_STATUS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraExecutionErrorType with scala.Double] = js.native
}

