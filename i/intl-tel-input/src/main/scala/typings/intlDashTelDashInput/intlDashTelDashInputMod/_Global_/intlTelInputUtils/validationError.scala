package typings.intlDashTelDashInput.intlDashTelDashInputMod._Global_.intlTelInputUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait validationError extends js.Object

@JSGlobal("intlTelInputUtils.validationError")
@js.native
object validationError extends js.Object {
  @js.native
  sealed trait INVALID_COUNTRY_CODE extends validationError
  
  @js.native
  sealed trait IS_POSSIBLE extends validationError
  
  @js.native
  sealed trait NOT_A_NUMBER extends validationError
  
  @js.native
  sealed trait TOO_LONG extends validationError
  
  @js.native
  sealed trait TOO_SHORT extends validationError
  
  /* 1 */ val INVALID_COUNTRY_CODE: typings.intlDashTelDashInput.intlDashTelDashInputMod._Global_.intlTelInputUtils.validationError.INVALID_COUNTRY_CODE with Double = js.native
  /* 0 */ val IS_POSSIBLE: typings.intlDashTelDashInput.intlDashTelDashInputMod._Global_.intlTelInputUtils.validationError.IS_POSSIBLE with Double = js.native
  /* 4 */ val NOT_A_NUMBER: typings.intlDashTelDashInput.intlDashTelDashInputMod._Global_.intlTelInputUtils.validationError.NOT_A_NUMBER with Double = js.native
  /* 3 */ val TOO_LONG: typings.intlDashTelDashInput.intlDashTelDashInputMod._Global_.intlTelInputUtils.validationError.TOO_LONG with Double = js.native
  /* 2 */ val TOO_SHORT: typings.intlDashTelDashInput.intlDashTelDashInputMod._Global_.intlTelInputUtils.validationError.TOO_SHORT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[validationError with Double] = js.native
}

