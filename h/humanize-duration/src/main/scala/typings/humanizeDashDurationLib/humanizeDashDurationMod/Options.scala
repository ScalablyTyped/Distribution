package typings
package humanizeDashDurationLib.humanizeDashDurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * String to include before the final unit. You can also set serialComma to false to eliminate the final comma.
    */
  var conjunction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String to substitute for the decimal point in a decimal fraction.
    */
  var decimal: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String to display between the previous unit and the next value.
    */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fallback languages if the provided language cannot be found (accepts an ISO 639-1 code from one of the supported languages). It works from left to right.
    */
  var fallbacks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Language for unit display (accepts an ISO 639-1 code from one of the supported languages).
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number representing the maximum number of units to display for the duration.
    */
  var largest: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number that defines a maximal decimal points for float values.
    */
  var maxDecimalPoints: js.UndefOr[scala.Double] = js.undefined
  /**
    * Boolean value. Use true to round the smallest unit displayed (can be combined with largest and units).
    */
  var round: js.UndefOr[scala.Boolean] = js.undefined
  var serialComma: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * String to display between each value and unit.
    */
  var spacer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Customize the value used to calculate each unit of time.
    */
  var unitMeasures: js.UndefOr[UnitMeasuresOptions] = js.undefined
  /**
    * Array of strings to define which units are used to display the duration (if needed).
    */
  var units: js.UndefOr[js.Array[Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    conjunction: java.lang.String = null,
    decimal: java.lang.String = null,
    delimiter: java.lang.String = null,
    fallbacks: js.Array[java.lang.String] = null,
    language: java.lang.String = null,
    largest: scala.Int | scala.Double = null,
    maxDecimalPoints: scala.Int | scala.Double = null,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    serialComma: js.UndefOr[scala.Boolean] = js.undefined,
    spacer: java.lang.String = null,
    unitMeasures: UnitMeasuresOptions = null,
    units: js.Array[Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction)
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (fallbacks != null) __obj.updateDynamic("fallbacks")(fallbacks)
    if (language != null) __obj.updateDynamic("language")(language)
    if (largest != null) __obj.updateDynamic("largest")(largest.asInstanceOf[js.Any])
    if (maxDecimalPoints != null) __obj.updateDynamic("maxDecimalPoints")(maxDecimalPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (!js.isUndefined(serialComma)) __obj.updateDynamic("serialComma")(serialComma)
    if (spacer != null) __obj.updateDynamic("spacer")(spacer)
    if (unitMeasures != null) __obj.updateDynamic("unitMeasures")(unitMeasures)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[Options]
  }
}

