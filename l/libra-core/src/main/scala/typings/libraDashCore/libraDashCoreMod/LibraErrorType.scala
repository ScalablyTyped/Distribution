package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LibraErrorType extends js.Object

@JSImport("libra-core", "LibraErrorType")
@js.native
object LibraErrorType extends js.Object {
  @js.native
  sealed trait DESERIALIZATION extends LibraErrorType
  
  @js.native
  sealed trait ERRORTYPE_NOT_SET extends LibraErrorType
  
  @js.native
  sealed trait EXECUTION extends LibraErrorType
  
  @js.native
  sealed trait INVARIANT_VIOLATION extends LibraErrorType
  
  @js.native
  sealed trait VALIDATION extends LibraErrorType
  
  @js.native
  sealed trait VERIFICATION extends LibraErrorType
  
  /* 4 */ val DESERIALIZATION: typings.libraDashCore.libraDashCoreMod.LibraErrorType.DESERIALIZATION with Double = js.native
  /* 0 */ val ERRORTYPE_NOT_SET: typings.libraDashCore.libraDashCoreMod.LibraErrorType.ERRORTYPE_NOT_SET with Double = js.native
  /* 5 */ val EXECUTION: typings.libraDashCore.libraDashCoreMod.LibraErrorType.EXECUTION with Double = js.native
  /* 3 */ val INVARIANT_VIOLATION: typings.libraDashCore.libraDashCoreMod.LibraErrorType.INVARIANT_VIOLATION with Double = js.native
  /* 1 */ val VALIDATION: typings.libraDashCore.libraDashCoreMod.LibraErrorType.VALIDATION with Double = js.native
  /* 2 */ val VERIFICATION: typings.libraDashCore.libraDashCoreMod.LibraErrorType.VERIFICATION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LibraErrorType with Double] = js.native
}

