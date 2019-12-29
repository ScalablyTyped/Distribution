package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArithmeticErrorType extends js.Object

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "ArithmeticError.ArithmeticErrorType")
@js.native
object ArithmeticErrorType extends js.Object {
  @js.native
  sealed trait DIVISIONBYZERO extends ArithmeticErrorType
  
  @js.native
  sealed trait OVERFLOW extends ArithmeticErrorType
  
  @js.native
  sealed trait UNDERFLOW extends ArithmeticErrorType
  
  @js.native
  sealed trait UNKNOWNARITHMETICERROR extends ArithmeticErrorType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArithmeticErrorType with Double] = js.native
  /* 3 */ @js.native
  object DIVISIONBYZERO extends TopLevel[DIVISIONBYZERO with Double]
  
  /* 2 */ @js.native
  object OVERFLOW extends TopLevel[OVERFLOW with Double]
  
  /* 1 */ @js.native
  object UNDERFLOW extends TopLevel[UNDERFLOW with Double]
  
  /* 0 */ @js.native
  object UNKNOWNARITHMETICERROR extends TopLevel[UNKNOWNARITHMETICERROR with Double]
  
}

