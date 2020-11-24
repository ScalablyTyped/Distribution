package typings.libraCore.vmErrorsPbMod.DynamicReferenceError

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DynamicReferenceErrorType extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError.DynamicReferenceErrorType")
@js.native
object DynamicReferenceErrorType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DynamicReferenceErrorType with Double] = js.native
  
  @js.native
  sealed trait GLOBALALREADYBORROWED extends DynamicReferenceErrorType
  /* 4 */ @js.native
  object GLOBALALREADYBORROWED extends TopLevel[GLOBALALREADYBORROWED with Double]
  
  @js.native
  sealed trait GLOBALREFALREADYRELEASED extends DynamicReferenceErrorType
  /* 2 */ @js.native
  object GLOBALREFALREADYRELEASED extends TopLevel[GLOBALREFALREADYRELEASED with Double]
  
  @js.native
  sealed trait MISSINGRELEASEREF extends DynamicReferenceErrorType
  /* 3 */ @js.native
  object MISSINGRELEASEREF extends TopLevel[MISSINGRELEASEREF with Double]
  
  @js.native
  sealed trait MOVEOFBORROWEDRESOURCE extends DynamicReferenceErrorType
  /* 1 */ @js.native
  object MOVEOFBORROWEDRESOURCE extends TopLevel[MOVEOFBORROWEDRESOURCE with Double]
  
  @js.native
  sealed trait UNKNOWNDYNAMICREFERENCEERROR extends DynamicReferenceErrorType
  /* 0 */ @js.native
  object UNKNOWNDYNAMICREFERENCEERROR extends TopLevel[UNKNOWNDYNAMICREFERENCEERROR with Double]
}
