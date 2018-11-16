package typings
package intlDashTelDashInputLib.intlTelInputUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait validationError extends js.Object

@JSGlobal("intlTelInputUtils.validationError")
@js.native
object validationError extends js.Object {
  @js.native
  sealed trait INVALID_COUNTRY_CODE
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.validationError
  
  @js.native
  sealed trait IS_POSSIBLE
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.validationError
  
  @js.native
  sealed trait NOT_A_NUMBER
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.validationError
  
  @js.native
  sealed trait TOO_LONG
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.validationError
  
  @js.native
  sealed trait TOO_SHORT
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.validationError
  
  /* 1 */ val INVALID_COUNTRY_CODE: INVALID_COUNTRY_CODE with scala.Double = js.native
  /* 0 */ val IS_POSSIBLE: IS_POSSIBLE with scala.Double = js.native
  /* 4 */ val NOT_A_NUMBER: NOT_A_NUMBER with scala.Double = js.native
  /* 3 */ val TOO_LONG: TOO_LONG with scala.Double = js.native
  /* 2 */ val TOO_SHORT: TOO_SHORT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[intlDashTelDashInputLib.intlTelInputUtilsNs.validationError with scala.Double] = js.native
}

