package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DynamicReferenceErrorType extends js.Object

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.DynamicReferenceErrorType")
@js.native
object DynamicReferenceErrorType extends js.Object {
  @js.native
  sealed trait GLOBALALREADYBORROWED extends DynamicReferenceErrorType
  
  @js.native
  sealed trait GLOBALREFALREADYRELEASED extends DynamicReferenceErrorType
  
  @js.native
  sealed trait MISSINGRELEASEREF extends DynamicReferenceErrorType
  
  @js.native
  sealed trait MOVEOFBORROWEDRESOURCE extends DynamicReferenceErrorType
  
  @js.native
  sealed trait UNKNOWNDYNAMICREFERENCEERROR extends DynamicReferenceErrorType
  
  /* 4 */ val GLOBALALREADYBORROWED: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError.DynamicReferenceErrorType.GLOBALALREADYBORROWED with Double = js.native
  /* 2 */ val GLOBALREFALREADYRELEASED: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError.DynamicReferenceErrorType.GLOBALREFALREADYRELEASED with Double = js.native
  /* 3 */ val MISSINGRELEASEREF: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError.DynamicReferenceErrorType.MISSINGRELEASEREF with Double = js.native
  /* 1 */ val MOVEOFBORROWEDRESOURCE: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError.DynamicReferenceErrorType.MOVEOFBORROWEDRESOURCE with Double = js.native
  /* 0 */ val UNKNOWNDYNAMICREFERENCEERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError.DynamicReferenceErrorType.UNKNOWNDYNAMICREFERENCEERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DynamicReferenceErrorType with Double] = js.native
}

