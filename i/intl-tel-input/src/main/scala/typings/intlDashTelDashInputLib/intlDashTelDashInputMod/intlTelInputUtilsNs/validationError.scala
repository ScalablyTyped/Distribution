package typings
package intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait validationError extends js.Object

@JSImport("intl-tel-input/intlTelInputUtils", "validationError")
@js.native
object validationError extends js.Object {
  @js.native
  sealed trait INVALID_COUNTRY_CODE
    extends intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.validationError
  
  @js.native
  sealed trait IS_POSSIBLE
    extends intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.validationError
  
  @js.native
  sealed trait NOT_A_NUMBER
    extends intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.validationError
  
  @js.native
  sealed trait TOO_LONG
    extends intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.validationError
  
  @js.native
  sealed trait TOO_SHORT
    extends intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.validationError
  
}

