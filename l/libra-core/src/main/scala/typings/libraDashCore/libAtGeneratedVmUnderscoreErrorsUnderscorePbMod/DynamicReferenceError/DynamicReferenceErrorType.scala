package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DynamicReferenceErrorType with Double] = js.native
  /* 4 */ @js.native
  object GLOBALALREADYBORROWED extends TopLevel[GLOBALALREADYBORROWED with Double]
  
  /* 2 */ @js.native
  object GLOBALREFALREADYRELEASED extends TopLevel[GLOBALREFALREADYRELEASED with Double]
  
  /* 3 */ @js.native
  object MISSINGRELEASEREF extends TopLevel[MISSINGRELEASEREF with Double]
  
  /* 1 */ @js.native
  object MOVEOFBORROWEDRESOURCE extends TopLevel[MOVEOFBORROWEDRESOURCE with Double]
  
  /* 0 */ @js.native
  object UNKNOWNDYNAMICREFERENCEERROR extends TopLevel[UNKNOWNDYNAMICREFERENCEERROR with Double]
  
}

