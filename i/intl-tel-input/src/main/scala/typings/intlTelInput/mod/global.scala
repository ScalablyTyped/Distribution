package typings.intlTelInput.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object intlTelInputUtils {
    
    @JSGlobal("intlTelInputUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def formatNumber(number: String, countryCode: String, format: numberFormat): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getExampleNumber(countryCode: String, isNational: Boolean, numberType: numberType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExampleNumber")(countryCode.asInstanceOf[js.Any], isNational.asInstanceOf[js.Any], numberType.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getNumberType(number: String, countryCode: String): numberType = (^.asInstanceOf[js.Dynamic].applyDynamic("getNumberType")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[numberType]
    
    inline def getValidationError(number: String, countryCode: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def isValidNumber(number: String, countryCode: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(number.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @js.native
    sealed trait numberFormat extends StObject
    @JSGlobal("intlTelInputUtils.numberFormat")
    @js.native
    object numberFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[numberFormat & Double] = js.native
      
      @js.native
      sealed trait E164
        extends StObject
           with numberFormat
      /* 0 */ val E164: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.E164 & Double = js.native
      
      @js.native
      sealed trait INTERNATIONAL
        extends StObject
           with numberFormat
      /* 1 */ val INTERNATIONAL: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.INTERNATIONAL & Double = js.native
      
      @js.native
      sealed trait NATIONAL
        extends StObject
           with numberFormat
      /* 2 */ val NATIONAL: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.NATIONAL & Double = js.native
      
      @js.native
      sealed trait RFC3966
        extends StObject
           with numberFormat
      /* 3 */ val RFC3966: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.RFC3966 & Double = js.native
    }
    
    @js.native
    sealed trait numberType extends StObject
    @JSGlobal("intlTelInputUtils.numberType")
    @js.native
    object numberType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[numberType & Double] = js.native
      
      @js.native
      sealed trait FIXED_LINE
        extends StObject
           with numberType
      /* 0 */ val FIXED_LINE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.FIXED_LINE & Double = js.native
      
      @js.native
      sealed trait FIXED_LINE_OR_MOBILE
        extends StObject
           with numberType
      /* 2 */ val FIXED_LINE_OR_MOBILE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.FIXED_LINE_OR_MOBILE & Double = js.native
      
      @js.native
      sealed trait MOBILE
        extends StObject
           with numberType
      /* 1 */ val MOBILE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.MOBILE & Double = js.native
      
      @js.native
      sealed trait PAGER
        extends StObject
           with numberType
      /* 8 */ val PAGER: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.PAGER & Double = js.native
      
      @js.native
      sealed trait PERSONAL_NUMBER
        extends StObject
           with numberType
      /* 7 */ val PERSONAL_NUMBER: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.PERSONAL_NUMBER & Double = js.native
      
      @js.native
      sealed trait PREMIUM_RATE
        extends StObject
           with numberType
      /* 4 */ val PREMIUM_RATE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.PREMIUM_RATE & Double = js.native
      
      @js.native
      sealed trait SHARED_COST
        extends StObject
           with numberType
      /* 5 */ val SHARED_COST: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.SHARED_COST & Double = js.native
      
      @js.native
      sealed trait TOLL_FREE
        extends StObject
           with numberType
      /* 3 */ val TOLL_FREE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.TOLL_FREE & Double = js.native
      
      @js.native
      sealed trait UAN
        extends StObject
           with numberType
      /* 9 */ val UAN: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.UAN & Double = js.native
      
      @js.native
      sealed trait UNKNOWN
        extends StObject
           with numberType
      /* -1 */ val UNKNOWN: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.UNKNOWN & Double = js.native
      
      @js.native
      sealed trait VOICEMAIL
        extends StObject
           with numberType
      /* 10 */ val VOICEMAIL: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.VOICEMAIL & Double = js.native
      
      @js.native
      sealed trait VOIP
        extends StObject
           with numberType
      /* 6 */ val VOIP: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.VOIP & Double = js.native
    }
    
    @js.native
    sealed trait validationError extends StObject
    @JSGlobal("intlTelInputUtils.validationError")
    @js.native
    object validationError extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[validationError & Double] = js.native
      
      @js.native
      sealed trait INVALID_COUNTRY_CODE
        extends StObject
           with validationError
      /* 1 */ val INVALID_COUNTRY_CODE: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.INVALID_COUNTRY_CODE & Double = js.native
      
      @js.native
      sealed trait IS_POSSIBLE
        extends StObject
           with validationError
      /* 0 */ val IS_POSSIBLE: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.IS_POSSIBLE & Double = js.native
      
      @js.native
      sealed trait NOT_A_NUMBER
        extends StObject
           with validationError
      /* 4 */ val NOT_A_NUMBER: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.NOT_A_NUMBER & Double = js.native
      
      @js.native
      sealed trait TOO_LONG
        extends StObject
           with validationError
      /* 3 */ val TOO_LONG: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.TOO_LONG & Double = js.native
      
      @js.native
      sealed trait TOO_SHORT
        extends StObject
           with validationError
      /* 2 */ val TOO_SHORT: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.TOO_SHORT & Double = js.native
    }
  }
  
  @js.native
  trait Window extends StObject {
    
    /**
      * initialise the plugin with optional options.
      * @param options options that can be provided during initialization.
      */
    def intlTelInput(node: Element): typings.std.Plugin = js.native
    def intlTelInput(node: Element, options: Options): typings.std.Plugin = js.native
    
    var intlTelInputGlobals: IntlTelInputGlobals = js.native
  }
}
