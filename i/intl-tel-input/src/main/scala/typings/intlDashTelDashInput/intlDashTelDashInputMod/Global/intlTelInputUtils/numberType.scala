package typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait numberType extends js.Object

@JSGlobal("intlTelInputUtils.numberType")
@js.native
object numberType extends js.Object {
  @js.native
  sealed trait FIXED_LINE extends numberType
  
  @js.native
  sealed trait FIXED_LINE_OR_MOBILE extends numberType
  
  @js.native
  sealed trait MOBILE extends numberType
  
  @js.native
  sealed trait PAGER extends numberType
  
  @js.native
  sealed trait PERSONAL_NUMBER extends numberType
  
  @js.native
  sealed trait PREMIUM_RATE extends numberType
  
  @js.native
  sealed trait SHARED_COST extends numberType
  
  @js.native
  sealed trait TOLL_FREE extends numberType
  
  @js.native
  sealed trait UAN extends numberType
  
  @js.native
  sealed trait UNKNOWN extends numberType
  
  @js.native
  sealed trait VOICEMAIL extends numberType
  
  @js.native
  sealed trait VOIP extends numberType
  
  /* 0 */ val FIXED_LINE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.FIXED_LINE with Double = js.native
  /* 2 */ val FIXED_LINE_OR_MOBILE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.FIXED_LINE_OR_MOBILE with Double = js.native
  /* 1 */ val MOBILE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.MOBILE with Double = js.native
  /* 8 */ val PAGER: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.PAGER with Double = js.native
  /* 7 */ val PERSONAL_NUMBER: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.PERSONAL_NUMBER with Double = js.native
  /* 4 */ val PREMIUM_RATE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.PREMIUM_RATE with Double = js.native
  /* 5 */ val SHARED_COST: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.SHARED_COST with Double = js.native
  /* 3 */ val TOLL_FREE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.TOLL_FREE with Double = js.native
  /* 9 */ val UAN: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.UAN with Double = js.native
  /* -1 */ val UNKNOWN: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.UNKNOWN with Double = js.native
  /* 10 */ val VOICEMAIL: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.VOICEMAIL with Double = js.native
  /* 6 */ val VOIP: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtils.numberType.VOIP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[numberType with Double] = js.native
}

