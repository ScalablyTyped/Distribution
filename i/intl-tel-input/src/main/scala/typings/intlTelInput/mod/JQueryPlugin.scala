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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryPlugin extends StObject {
  
  /**
    * initialise the plugin with optional options.
    * @param options options that can be provided during initialization.
    */
  def apply(): js.Any = js.native
  def apply(method: String, numberFormat: numberFormat): String = js.native
  /**
    * Remove the plugin from the input, and unbind any event listeners.
    */
  def apply(method: destroy): Unit = js.native
  /**
    * Get the extension from the current number.
    * Requires the utilsScript option.
    * e.g. if the input value was "(702) 555-5555 ext. 1234", this would
    * return "1234".
    */
  def apply(method: getExtension): String = js.native
  /**
    * Get the current number in the given format (defaults to E.164 standard).
    * The different formats are available in the enum
    * intlTelInputUtils.numberFormat - taken from here.
    * Requires the utilsScript option.
    * Note that even if nationalMode is enabled, this can still return a full
    * international number.
    * @param numberFormat the format in which the number will be returned.
    */
  def apply(method: getNumber): String = js.native
  /**
    * Get the type (fixed-line/mobile/toll-free etc) of the current number.
    * Requires the utilsScript option.
    * Returns an integer, which you can match against the various options in the
    * global enum intlTelInputUtils.numberType.
    * Note that in the US there's no way to differentiate between fixed-line and
    * mobile numbers, so instead it will return FIXED_LINE_OR_MOBILE.
    */
  def apply(method: getNumberType): numberType = js.native
  def apply(method: getNumber, numberFormat: numberFormat): String = js.native
  /**
    * Get the country data for the currently selected flag.
    */
  def apply(method: getSelectedCountryData): CountryData = js.native
  /**
    * Get more information about a validation error.
    * Requires the utilsScript option.
    * Returns an integer, which you can match against the various options in the
    * global enum ValidationError
    */
  def apply(method: getValidationError): validationError = js.native
  /**
    * Validate the current number. Expects an internationally formatted number
    * (unless nationalMode is enabled). If validation fails, you can use
    * getValidationError to get more information.
    * Requires the utilsScript option.
    * Also see getNumberType if you want to make sure the user enters a certain
    * type of number e.g. a mobile number.
    */
  def apply(method: isValidNumber): Boolean = js.native
  /**
    * Change the country selection (e.g. when the user is entering their address).
    * @param countryCode country code of the country to be set.
    */
  def apply(method: setCountry, countryCode: String): Unit = js.native
  /**
    * Insert a number, and update the selected flag accordingly.
    * Note that by default, if nationalMode is enabled it will try to use
    * national formatting.
    * @param aNumber number to be set.
    */
  def apply(method: setNumber, aNumber: String): Unit = js.native
  /**
    * Set the type of the placeholder number
    * @param type Placeholder number type to be set
    */
  def apply(method: setPlaceholderNumberType, `type`: placeholderNumberType): Unit = js.native
  def apply(options: Options): js.Any = js.native
}
