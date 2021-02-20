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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object intlTelInputUtils {
    
    @js.native
    sealed trait numberFormat extends StObject
    @JSGlobal("intlTelInputUtils.numberFormat")
    @js.native
    object numberFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[numberFormat with Double] = js.native
      
      @js.native
      sealed trait E164 extends numberFormat
      /* 0 */ val E164: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.E164 with Double = js.native
      
      @js.native
      sealed trait INTERNATIONAL extends numberFormat
      /* 1 */ val INTERNATIONAL: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.INTERNATIONAL with Double = js.native
      
      @js.native
      sealed trait NATIONAL extends numberFormat
      /* 2 */ val NATIONAL: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.NATIONAL with Double = js.native
      
      @js.native
      sealed trait RFC3966 extends numberFormat
      /* 3 */ val RFC3966: typings.intlTelInput.mod.global.intlTelInputUtils.numberFormat.RFC3966 with Double = js.native
    }
    
    @js.native
    sealed trait numberType extends StObject
    @JSGlobal("intlTelInputUtils.numberType")
    @js.native
    object numberType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[numberType with Double] = js.native
      
      @js.native
      sealed trait FIXED_LINE extends numberType
      /* 0 */ val FIXED_LINE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.FIXED_LINE with Double = js.native
      
      @js.native
      sealed trait FIXED_LINE_OR_MOBILE extends numberType
      /* 2 */ val FIXED_LINE_OR_MOBILE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.FIXED_LINE_OR_MOBILE with Double = js.native
      
      @js.native
      sealed trait MOBILE extends numberType
      /* 1 */ val MOBILE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.MOBILE with Double = js.native
      
      @js.native
      sealed trait PAGER extends numberType
      /* 8 */ val PAGER: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.PAGER with Double = js.native
      
      @js.native
      sealed trait PERSONAL_NUMBER extends numberType
      /* 7 */ val PERSONAL_NUMBER: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.PERSONAL_NUMBER with Double = js.native
      
      @js.native
      sealed trait PREMIUM_RATE extends numberType
      /* 4 */ val PREMIUM_RATE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.PREMIUM_RATE with Double = js.native
      
      @js.native
      sealed trait SHARED_COST extends numberType
      /* 5 */ val SHARED_COST: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.SHARED_COST with Double = js.native
      
      @js.native
      sealed trait TOLL_FREE extends numberType
      /* 3 */ val TOLL_FREE: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.TOLL_FREE with Double = js.native
      
      @js.native
      sealed trait UAN extends numberType
      /* 9 */ val UAN: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.UAN with Double = js.native
      
      @js.native
      sealed trait UNKNOWN extends numberType
      /* -1 */ val UNKNOWN: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.UNKNOWN with Double = js.native
      
      @js.native
      sealed trait VOICEMAIL extends numberType
      /* 10 */ val VOICEMAIL: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.VOICEMAIL with Double = js.native
      
      @js.native
      sealed trait VOIP extends numberType
      /* 6 */ val VOIP: typings.intlTelInput.mod.global.intlTelInputUtils.numberType.VOIP with Double = js.native
    }
    
    @js.native
    sealed trait validationError extends StObject
    @JSGlobal("intlTelInputUtils.validationError")
    @js.native
    object validationError extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[validationError with Double] = js.native
      
      @js.native
      sealed trait INVALID_COUNTRY_CODE extends validationError
      /* 1 */ val INVALID_COUNTRY_CODE: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.INVALID_COUNTRY_CODE with Double = js.native
      
      @js.native
      sealed trait IS_POSSIBLE extends validationError
      /* 0 */ val IS_POSSIBLE: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.IS_POSSIBLE with Double = js.native
      
      @js.native
      sealed trait NOT_A_NUMBER extends validationError
      /* 4 */ val NOT_A_NUMBER: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.NOT_A_NUMBER with Double = js.native
      
      @js.native
      sealed trait TOO_LONG extends validationError
      /* 3 */ val TOO_LONG: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.TOO_LONG with Double = js.native
      
      @js.native
      sealed trait TOO_SHORT extends validationError
      /* 2 */ val TOO_SHORT: typings.intlTelInput.mod.global.intlTelInputUtils.validationError.TOO_SHORT with Double = js.native
    }
  }
  
  @js.native
  trait JQuery extends StObject {
    
    /**
      * initialise the plugin with optional options.
      * @param options options that can be provided during initialization.
      */
    def intlTelInput(): js.Any = js.native
    def intlTelInput(method: String, numberFormat: numberFormat): String = js.native
    def intlTelInput(options: Options): js.Any = js.native
    @JSName("intlTelInput")
    var intlTelInput_Original: JQueryPlugin = js.native
    /**
      * Remove the plugin from the input, and unbind any event listeners.
      */
    @JSName("intlTelInput")
    def intlTelInput_destroy(method: destroy): Unit = js.native
    /**
      * Get the extension from the current number.
      * Requires the utilsScript option.
      * e.g. if the input value was "(702) 555-5555 ext. 1234", this would
      * return "1234".
      */
    @JSName("intlTelInput")
    def intlTelInput_getExtension(method: getExtension): String = js.native
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
    def intlTelInput_getNumber(method: getNumber): String = js.native
    @JSName("intlTelInput")
    def intlTelInput_getNumber(method: getNumber, numberFormat: numberFormat): String = js.native
    /**
      * Get the type (fixed-line/mobile/toll-free etc) of the current number.
      * Requires the utilsScript option.
      * Returns an integer, which you can match against the various options in the
      * global enum intlTelInputUtils.numberType.
      * Note that in the US there's no way to differentiate between fixed-line and
      * mobile numbers, so instead it will return FIXED_LINE_OR_MOBILE.
      */
    @JSName("intlTelInput")
    def intlTelInput_getNumberType(method: getNumberType): numberType = js.native
    /**
      * Get the country data for the currently selected flag.
      */
    @JSName("intlTelInput")
    def intlTelInput_getSelectedCountryData(method: getSelectedCountryData): CountryData = js.native
    /**
      * Get more information about a validation error.
      * Requires the utilsScript option.
      * Returns an integer, which you can match against the various options in the
      * global enum ValidationError
      */
    @JSName("intlTelInput")
    def intlTelInput_getValidationError(method: getValidationError): validationError = js.native
    /**
      * Validate the current number. Expects an internationally formatted number
      * (unless nationalMode is enabled). If validation fails, you can use
      * getValidationError to get more information.
      * Requires the utilsScript option.
      * Also see getNumberType if you want to make sure the user enters a certain
      * type of number e.g. a mobile number.
      */
    @JSName("intlTelInput")
    def intlTelInput_isValidNumber(method: isValidNumber): Boolean = js.native
    /**
      * Change the country selection (e.g. when the user is entering their address).
      * @param countryCode country code of the country to be set.
      */
    @JSName("intlTelInput")
    def intlTelInput_setCountry(method: setCountry, countryCode: String): Unit = js.native
    /**
      * Insert a number, and update the selected flag accordingly.
      * Note that by default, if nationalMode is enabled it will try to use
      * national formatting.
      * @param aNumber number to be set.
      */
    @JSName("intlTelInput")
    def intlTelInput_setNumber(method: setNumber, aNumber: String): Unit = js.native
    /**
      * Set the type of the placeholder number
      * @param type Placeholder number type to be set
      */
    @JSName("intlTelInput")
    def intlTelInput_setPlaceholderNumberType(method: setPlaceholderNumberType, `type`: placeholderNumberType): Unit = js.native
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
