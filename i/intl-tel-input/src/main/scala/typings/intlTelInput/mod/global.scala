package typings.intlTelInput.mod

import typings.intlTelInput.intlTelInputStrings.destroy
import typings.intlTelInput.intlTelInputStrings.getExtension
import typings.intlTelInput.intlTelInputStrings.getNumber
import typings.intlTelInput.intlTelInputStrings.getNumberType
import typings.intlTelInput.intlTelInputStrings.getSelectedCountryData
import typings.intlTelInput.intlTelInputStrings.getValidationError
import typings.intlTelInput.intlTelInputStrings.isValidNumber
import typings.intlTelInput.intlTelInputStrings.setCountry
import typings.intlTelInput.intlTelInputStrings.setNumber
import typings.intlTelInput.intlTelInputStrings.setPlaceholderNumberType
import typings.intlTelInput.mod.intlTelInputUtils.CountryData
import typings.intlTelInput.mod.intlTelInputUtils.numberFormat
import typings.intlTelInput.mod.intlTelInputUtils.numberType
import typings.intlTelInput.mod.intlTelInputUtils.placeholderNumberType
import typings.intlTelInput.mod.intlTelInputUtils.validationError
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object intlTelInputUtils {
    
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
  
  trait JQuery extends StObject {
    
    /**
      * initialise the plugin with optional options.
      * @param options options that can be provided during initialization.
      */
    def intlTelInput(): js.Any
    def intlTelInput(method: String, numberFormat: numberFormat): String
    def intlTelInput(options: Options): js.Any
    @JSName("intlTelInput")
    var intlTelInput_Original: JQueryPlugin
    /**
      * Remove the plugin from the input, and unbind any event listeners.
      */
    @JSName("intlTelInput")
    def intlTelInput_destroy(method: destroy): Unit
    /**
      * Get the extension from the current number.
      * Requires the utilsScript option.
      * e.g. if the input value was "(702) 555-5555 ext. 1234", this would
      * return "1234".
      */
    @JSName("intlTelInput")
    def intlTelInput_getExtension(method: getExtension): String
    /**
      * Get the current number in the given format (defaults to E.164 standard).
      * The different formats are available in the enum
      * intlTelInputUtils.numberFormat - taken from here.
      * Requires the utilsScript option.
      * Note that even if nationalMode is enabled, this can still return a full
      * international number.
      * @param numberFormat the format in which the number will be returned.
      */
    @JSName("intlTelInput")
    def intlTelInput_getNumber(method: getNumber): String
    @JSName("intlTelInput")
    def intlTelInput_getNumber(method: getNumber, numberFormat: numberFormat): String
    /**
      * Get the type (fixed-line/mobile/toll-free etc) of the current number.
      * Requires the utilsScript option.
      * Returns an integer, which you can match against the various options in the
      * global enum intlTelInputUtils.numberType.
      * Note that in the US there's no way to differentiate between fixed-line and
      * mobile numbers, so instead it will return FIXED_LINE_OR_MOBILE.
      */
    @JSName("intlTelInput")
    def intlTelInput_getNumberType(method: getNumberType): numberType
    /**
      * Get the country data for the currently selected flag.
      */
    @JSName("intlTelInput")
    def intlTelInput_getSelectedCountryData(method: getSelectedCountryData): CountryData
    /**
      * Get more information about a validation error.
      * Requires the utilsScript option.
      * Returns an integer, which you can match against the various options in the
      * global enum ValidationError
      */
    @JSName("intlTelInput")
    def intlTelInput_getValidationError(method: getValidationError): validationError
    /**
      * Validate the current number. Expects an internationally formatted number
      * (unless nationalMode is enabled). If validation fails, you can use
      * getValidationError to get more information.
      * Requires the utilsScript option.
      * Also see getNumberType if you want to make sure the user enters a certain
      * type of number e.g. a mobile number.
      */
    @JSName("intlTelInput")
    def intlTelInput_isValidNumber(method: isValidNumber): Boolean
    /**
      * Change the country selection (e.g. when the user is entering their address).
      * @param countryCode country code of the country to be set.
      */
    @JSName("intlTelInput")
    def intlTelInput_setCountry(method: setCountry, countryCode: String): Unit
    /**
      * Insert a number, and update the selected flag accordingly.
      * Note that by default, if nationalMode is enabled it will try to use
      * national formatting.
      * @param aNumber number to be set.
      */
    @JSName("intlTelInput")
    def intlTelInput_setNumber(method: setNumber, aNumber: String): Unit
    /**
      * Set the type of the placeholder number
      * @param type Placeholder number type to be set
      */
    @JSName("intlTelInput")
    def intlTelInput_setPlaceholderNumberType(method: setPlaceholderNumberType, `type`: placeholderNumberType): Unit
  }
  object JQuery {
    
    @scala.inline
    def apply(intlTelInput: JQueryPlugin): JQuery = {
      val __obj = js.Dynamic.literal(intlTelInput = intlTelInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[JQuery]
    }
    
    @scala.inline
    implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntlTelInput(value: JQueryPlugin): Self = StObject.set(x, "intlTelInput", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Window extends StObject {
    
    /**
      * initialise the plugin with optional options.
      * @param options options that can be provided during initialization.
      */
    def intlTelInput(node: Element): Plugin = js.native
    def intlTelInput(node: Element, options: Options): Plugin = js.native
    
    var intlTelInputGlobals: Static = js.native
  }
}
