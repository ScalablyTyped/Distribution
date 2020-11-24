package typings.libraCore.vmErrorsPbMod.ArithmeticError

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArithmeticErrorType extends js.Object
@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.ArithmeticErrorType")
@js.native
object ArithmeticErrorType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArithmeticErrorType with Double] = js.native
  
  @js.native
  sealed trait DIVISIONBYZERO extends ArithmeticErrorType
  /* 3 */ @js.native
  object DIVISIONBYZERO extends TopLevel[DIVISIONBYZERO with Double]
  
  @js.native
  sealed trait OVERFLOW extends ArithmeticErrorType
  /* 2 */ @js.native
  object OVERFLOW extends TopLevel[OVERFLOW with Double]
  
  @js.native
  sealed trait UNDERFLOW extends ArithmeticErrorType
  /* 1 */ @js.native
  object UNDERFLOW extends TopLevel[UNDERFLOW with Double]
  
  @js.native
  sealed trait UNKNOWNARITHMETICERROR extends ArithmeticErrorType
  /* 0 */ @js.native
  object UNKNOWNARITHMETICERROR extends TopLevel[UNKNOWNARITHMETICERROR with Double]
}
