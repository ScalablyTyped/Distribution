package typings
package intlDashTelDashInputLib.intlTelInputUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait numberType extends js.Object

@JSGlobal("intlTelInputUtils.numberType")
@js.native
object numberType extends js.Object {
  @js.native
  sealed trait FIXED_LINE
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait FIXED_LINE_OR_MOBILE
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait MOBILE
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait PAGER
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait PERSONAL_NUMBER
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait PREMIUM_RATE
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait SHARED_COST
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait TOLL_FREE
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait UAN
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait UNKNOWN
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait VOICEMAIL
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  @js.native
  sealed trait VOIP
    extends intlDashTelDashInputLib.intlTelInputUtilsNs.numberType
  
  /* 0 */ val FIXED_LINE: FIXED_LINE with scala.Double = js.native
  /* 2 */ val FIXED_LINE_OR_MOBILE: FIXED_LINE_OR_MOBILE with scala.Double = js.native
  /* 1 */ val MOBILE: MOBILE with scala.Double = js.native
  /* 8 */ val PAGER: PAGER with scala.Double = js.native
  /* 7 */ val PERSONAL_NUMBER: PERSONAL_NUMBER with scala.Double = js.native
  /* 4 */ val PREMIUM_RATE: PREMIUM_RATE with scala.Double = js.native
  /* 5 */ val SHARED_COST: SHARED_COST with scala.Double = js.native
  /* 3 */ val TOLL_FREE: TOLL_FREE with scala.Double = js.native
  /* 9 */ val UAN: UAN with scala.Double = js.native
  /* -1 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  /* 10 */ val VOICEMAIL: VOICEMAIL with scala.Double = js.native
  /* 6 */ val VOIP: VOIP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[intlDashTelDashInputLib.intlTelInputUtilsNs.numberType with scala.Double] = js.native
}

