package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraErrorType extends js.Object

@JSImport("libra-core", "LibraErrorType")
@js.native
object LibraErrorType extends js.Object {
  @js.native
  sealed trait DESERIALIZATION
    extends libraDashCoreLib.libraDashCoreMod.LibraErrorType
  
  @js.native
  sealed trait ERRORTYPE_NOT_SET
    extends libraDashCoreLib.libraDashCoreMod.LibraErrorType
  
  @js.native
  sealed trait EXECUTION
    extends libraDashCoreLib.libraDashCoreMod.LibraErrorType
  
  @js.native
  sealed trait INVARIANT_VIOLATION
    extends libraDashCoreLib.libraDashCoreMod.LibraErrorType
  
  @js.native
  sealed trait VALIDATION
    extends libraDashCoreLib.libraDashCoreMod.LibraErrorType
  
  @js.native
  sealed trait VERIFICATION
    extends libraDashCoreLib.libraDashCoreMod.LibraErrorType
  
  /* 4 */ val DESERIALIZATION: DESERIALIZATION with scala.Double = js.native
  /* 0 */ val ERRORTYPE_NOT_SET: ERRORTYPE_NOT_SET with scala.Double = js.native
  /* 5 */ val EXECUTION: EXECUTION with scala.Double = js.native
  /* 3 */ val INVARIANT_VIOLATION: INVARIANT_VIOLATION with scala.Double = js.native
  /* 1 */ val VALIDATION: VALIDATION with scala.Double = js.native
  /* 2 */ val VERIFICATION: VERIFICATION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[libraDashCoreLib.libraDashCoreMod.LibraErrorType with scala.Double] = js.native
}

