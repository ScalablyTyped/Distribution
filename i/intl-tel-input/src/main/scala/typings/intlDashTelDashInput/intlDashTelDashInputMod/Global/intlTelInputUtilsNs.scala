package typings.intlDashTelDashInput.intlDashTelDashInputMod.Global

import typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat
import typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType
import typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError
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
    sealed trait E164 extends numberFormat
    
    @js.native
    sealed trait INTERNATIONAL extends numberFormat
    
    @js.native
    sealed trait NATIONAL extends numberFormat
    
    @js.native
    sealed trait RFC3966 extends numberFormat
    
    /* 0 */ val E164: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat.E164 with Double = js.native
    /* 1 */ val INTERNATIONAL: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat.INTERNATIONAL with Double = js.native
    /* 2 */ val NATIONAL: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat.NATIONAL with Double = js.native
    /* 3 */ val RFC3966: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberFormat.RFC3966 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[numberFormat with Double] = js.native
  }
  
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
    
    /* 0 */ val FIXED_LINE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.FIXED_LINE with Double = js.native
    /* 2 */ val FIXED_LINE_OR_MOBILE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.FIXED_LINE_OR_MOBILE with Double = js.native
    /* 1 */ val MOBILE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.MOBILE with Double = js.native
    /* 8 */ val PAGER: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.PAGER with Double = js.native
    /* 7 */ val PERSONAL_NUMBER: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.PERSONAL_NUMBER with Double = js.native
    /* 4 */ val PREMIUM_RATE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.PREMIUM_RATE with Double = js.native
    /* 5 */ val SHARED_COST: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.SHARED_COST with Double = js.native
    /* 3 */ val TOLL_FREE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.TOLL_FREE with Double = js.native
    /* 9 */ val UAN: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.UAN with Double = js.native
    /* -1 */ val UNKNOWN: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.UNKNOWN with Double = js.native
    /* 10 */ val VOICEMAIL: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.VOICEMAIL with Double = js.native
    /* 6 */ val VOIP: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.numberType.VOIP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[numberType with Double] = js.native
  }
  
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
    
    /* 1 */ val INVALID_COUNTRY_CODE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError.INVALID_COUNTRY_CODE with Double = js.native
    /* 0 */ val IS_POSSIBLE: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError.IS_POSSIBLE with Double = js.native
    /* 4 */ val NOT_A_NUMBER: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError.NOT_A_NUMBER with Double = js.native
    /* 3 */ val TOO_LONG: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError.TOO_LONG with Double = js.native
    /* 2 */ val TOO_SHORT: typings.intlDashTelDashInput.intlDashTelDashInputMod.Global.intlTelInputUtilsNs.validationError.TOO_SHORT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[validationError with Double] = js.native
  }
  
}

