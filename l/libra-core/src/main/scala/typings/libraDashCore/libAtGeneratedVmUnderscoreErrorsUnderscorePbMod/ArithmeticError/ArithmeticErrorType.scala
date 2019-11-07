package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError

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
  
  /* 3 */ val DIVISIONBYZERO: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError.ArithmeticErrorType.DIVISIONBYZERO with Double = js.native
  /* 2 */ val OVERFLOW: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError.ArithmeticErrorType.OVERFLOW with Double = js.native
  /* 1 */ val UNDERFLOW: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError.ArithmeticErrorType.UNDERFLOW with Double = js.native
  /* 0 */ val UNKNOWNARITHMETICERROR: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError.ArithmeticErrorType.UNKNOWNARITHMETICERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArithmeticErrorType with Double] = js.native
}

