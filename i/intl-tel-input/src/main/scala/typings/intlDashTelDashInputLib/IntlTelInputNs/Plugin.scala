package typings
package intlDashTelDashInputLib.IntlTelInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  /**
       * initialise the plugin with optional options.
       * @param options options that can be provided during initialization.
       */
  def apply(): jqueryLib.JQueryDeferred[_] = js.native
  /**
       * Remove the plugin from the input, and unbind any event listeners.
       */
  def apply(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.destroy): scala.Unit = js.native
  /**
       * Get the extension from the current number.
       * Requires the utilsScript option.
       * e.g. if the input value was "(702) 555-5555 ext. 1234", this would
       * return "1234".
       */
  def apply(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getExtension): java.lang.String = js.native
  /**
       * Get the current number in the given format (defaults to E.164 standard).
       * The different formats are available in the enum
       * intlTelInputUtils.numberFormat - taken from here.
       * Requires the utilsScript option.
       * Note that even if nationalMode is enabled, this can still return a full
       * international number.
       */
  def apply(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getNumber): java.lang.String = js.native
  /**
       * Get the type (fixed-line/mobile/toll-free etc) of the current number.
       * Requires the utilsScript option.
       * Returns an integer, which you can match against the various options in the
       * global enum intlTelInputUtils.numberType.
       * Note that in the US there's no way to differentiate between fixed-line and
       * mobile numbers, so instead it will return FIXED_LINE_OR_MOBILE.
       */
  def apply(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getNumberType): intlDashTelDashInputLib.intlTelInputUtilsNs.numberType = js.native
  /**
       * Get the current number in the given format (defaults to E.164 standard).
       * The different formats are available in the enum
       * intlTelInputUtils.numberFormat - taken from here.
       * Requires the utilsScript option.
       * Note that even if nationalMode is enabled, this can still return a full
       * international number.
       * @param numberFormat the format in which the number will be returned.
       */
  def apply(
    method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getNumber,
    numberFormat: intlDashTelDashInputLib.intlTelInputUtilsNs.numberFormat
  ): java.lang.String = js.native
  /**
       * Get the country data for the currently selected flag.
       */
  def apply(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getSelectedCountryData): CountryData = js.native
  /**
       * Get more information about a validation error.
       * Requires the utilsScript option.
       * Returns an integer, which you can match against the various options in the
       * global enum intlTelInputUtils.validationError
       */
  def apply(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.getValidationError): intlDashTelDashInputLib.intlTelInputUtilsNs.validationError = js.native
  /**
       * Validate the current number. Expects an internationally formatted number
       * (unless nationalMode is enabled). If validation fails, you can use
       * getValidationError to get more information.
       * Requires the utilsScript option.
       * Also see getNumberType if you want to make sure the user enters a certain
       * type of number e.g. a mobile number.
       */
  def apply(method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.isValidNumber): scala.Boolean = js.native
  /**
       * Change the country selection (e.g. when the user is entering their address).
       * @param countryCode country code of the country to be set.
       */
  def apply(
    method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.setCountry,
    countryCode: java.lang.String
  ): scala.Unit = js.native
  /**
       * Insert a number, and update the selected flag accordingly.
       * Note that by default, if nationalMode is enabled it will try to use
       * national formatting.
       * @param aNumber number to be set.
       */
  def apply(
    method: intlDashTelDashInputLib.intlDashTelDashInputLibStrings.setNumber,
    aNumber: java.lang.String
  ): scala.Unit = js.native
  def apply(method: java.lang.String): scala.Unit = js.native
  def apply(method: java.lang.String, numberFormat: intlDashTelDashInputLib.intlTelInputUtilsNs.numberFormat): java.lang.String = js.native
  def apply(method: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       * initialise the plugin with optional options.
       * @param options options that can be provided during initialization.
       */
  def apply(options: Options): jqueryLib.JQueryDeferred[_] = js.native
  /**
       * Get all of the plugin's country data - either to re-use elsewhere
       * e.g. to populate a country dropdown.
       */
  def getCountryData(): js.Array[CountryData] = js.native
  /**
       * Load the utils.js script (included in the lib directory) to enable
       * formatting/validation etc.
       */
  def loadUtils(path: java.lang.String): scala.Unit = js.native
  /**
       * Load the utils.js script (included in the lib directory) to enable
       * formatting/validation etc.
       */
  def loadUtils(path: java.lang.String, utilsScriptDeferred: scala.Boolean): scala.Unit = js.native
}

