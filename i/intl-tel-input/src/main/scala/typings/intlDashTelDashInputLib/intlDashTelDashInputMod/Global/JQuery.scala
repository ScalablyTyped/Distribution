package typings
package intlDashTelDashInputLib.intlDashTelDashInputMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("intlTelInput")
  var intlTelInput_Original: intlDashTelDashInputLib.intlDashTelDashInputMod.JQueryPlugin = js.native
  /**
    * initialise the plugin with optional options.
    * @param options options that can be provided during initialization.
    */
  def intlTelInput(): js.Any = js.native
  def intlTelInput(
    method: java.lang.String,
    numberFormat: intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.numberFormat
  ): java.lang.String = js.native
  def intlTelInput(options: intlDashTelDashInputLib.intlDashTelDashInputMod.Options): js.Any = js.native
  /**
    * Remove the plugin from the input, and unbind any event listeners.
    */
  @JSName("intlTelInput")
  def intlTelInput_destroy(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.destroy): scala.Unit = js.native
  /**
    * Get the extension from the current number.
    * Requires the utilsScript option.
    * e.g. if the input value was "(702) 555-5555 ext. 1234", this would
    * return "1234".
    */
  @JSName("intlTelInput")
  def intlTelInput_getExtension(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getExtension): java.lang.String = js.native
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
  def intlTelInput_getNumber(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getNumber): java.lang.String = js.native
  @JSName("intlTelInput")
  def intlTelInput_getNumber(
    method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getNumber,
    numberFormat: intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.numberFormat
  ): java.lang.String = js.native
  /**
    * Get the type (fixed-line/mobile/toll-free etc) of the current number.
    * Requires the utilsScript option.
    * Returns an integer, which you can match against the various options in the
    * global enum intlTelInputUtils.numberType.
    * Note that in the US there's no way to differentiate between fixed-line and
    * mobile numbers, so instead it will return FIXED_LINE_OR_MOBILE.
    */
  @JSName("intlTelInput")
  def intlTelInput_getNumberType(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getNumberType): intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.numberType = js.native
  /**
    * Get the country data for the currently selected flag.
    */
  @JSName("intlTelInput")
  def intlTelInput_getSelectedCountryData(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getSelectedCountryData): intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.CountryData = js.native
  /**
    * Get more information about a validation error.
    * Requires the utilsScript option.
    * Returns an integer, which you can match against the various options in the
    * global enum ValidationError
    */
  @JSName("intlTelInput")
  def intlTelInput_getValidationError(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getValidationError): intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.validationError = js.native
  /**
    * Validate the current number. Expects an internationally formatted number
    * (unless nationalMode is enabled). If validation fails, you can use
    * getValidationError to get more information.
    * Requires the utilsScript option.
    * Also see getNumberType if you want to make sure the user enters a certain
    * type of number e.g. a mobile number.
    */
  @JSName("intlTelInput")
  def intlTelInput_isValidNumber(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.isValidNumber): scala.Boolean = js.native
  /**
    * Change the country selection (e.g. when the user is entering their address).
    * @param countryCode country code of the country to be set.
    */
  @JSName("intlTelInput")
  def intlTelInput_setCountry(
    method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.setCountry,
    countryCode: java.lang.String
  ): scala.Unit = js.native
  /**
    * Insert a number, and update the selected flag accordingly.
    * Note that by default, if nationalMode is enabled it will try to use
    * national formatting.
    * @param aNumber number to be set.
    */
  @JSName("intlTelInput")
  def intlTelInput_setNumber(
    method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.setNumber,
    aNumber: java.lang.String
  ): scala.Unit = js.native
  /**
    * Set the type of the placeholder number
    * @param type Placeholder number type to be set
    */
  @JSName("intlTelInput")
  def intlTelInput_setPlaceholderNumberType(
    method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.setPlaceholderNumberType,
    `type`: intlDashTelDashInputLib.intlDashTelDashInputMod.intlTelInputUtilsNs.placeholderNumberType
  ): scala.Unit = js.native
}

