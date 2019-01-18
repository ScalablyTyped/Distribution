package typings
package intlDashTelDashInputLib.intlDashTelDashInputMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("intlTelInputUtils")
@js.native
object intlTelInputUtilsNs extends js.Object {
  @js.native
  sealed trait numberFormat extends js.Object
  
  @js.native
  sealed trait numberType extends js.Object
  
  @js.native
  sealed trait validationError extends js.Object
  
  @js.native
  object numberFormat extends js.Object {
    @js.native
    sealed trait E164
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat
    
    @js.native
    sealed trait INTERNATIONAL
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat
    
    @js.native
    sealed trait NATIONAL
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat
    
    @js.native
    sealed trait RFC3966
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat
    
    /* 0 */ val E164: E164 with scala.Double = js.native
    /* 1 */ val INTERNATIONAL: INTERNATIONAL with scala.Double = js.native
    /* 2 */ val NATIONAL: NATIONAL with scala.Double = js.native
    /* 3 */ val RFC3966: RFC3966 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat with scala.Double
      ] = js.native
  }
  
  @js.native
  object numberType extends js.Object {
    @js.native
    sealed trait FIXED_LINE
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait FIXED_LINE_OR_MOBILE
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait MOBILE
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait PAGER
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait PERSONAL_NUMBER
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait PREMIUM_RATE
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait SHARED_COST
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait TOLL_FREE
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait UAN
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait UNKNOWN
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait VOICEMAIL
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
    @js.native
    sealed trait VOIP
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
    
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
    def apply(value: scala.Double): js.UndefOr[
        intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType with scala.Double
      ] = js.native
  }
  
  @js.native
  object validationError extends js.Object {
    @js.native
    sealed trait INVALID_COUNTRY_CODE
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError
    
    @js.native
    sealed trait IS_POSSIBLE
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError
    
    @js.native
    sealed trait NOT_A_NUMBER
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError
    
    @js.native
    sealed trait TOO_LONG
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError
    
    @js.native
    sealed trait TOO_SHORT
      extends intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError
    
    /* 1 */ val INVALID_COUNTRY_CODE: INVALID_COUNTRY_CODE with scala.Double = js.native
    /* 0 */ val IS_POSSIBLE: IS_POSSIBLE with scala.Double = js.native
    /* 4 */ val NOT_A_NUMBER: NOT_A_NUMBER with scala.Double = js.native
    /* 3 */ val TOO_LONG: TOO_LONG with scala.Double = js.native
    /* 2 */ val TOO_SHORT: TOO_SHORT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        intlDashTelDashInputLib.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError with scala.Double
      ] = js.native
  }
  
}

