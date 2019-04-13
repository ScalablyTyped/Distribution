package typings
package i18nDashJsLib.i18nDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToCurrencyOptions extends ToNumberOptions {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var sign_first: js.UndefOr[scala.Boolean] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object ToCurrencyOptions {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    format: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    separator: java.lang.String = null,
    sign_first: js.UndefOr[scala.Boolean] = js.undefined,
    strip_insignificant_zeros: js.UndefOr[scala.Boolean] = js.undefined,
    unit: java.lang.String = null
  ): ToCurrencyOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (format != null) __obj.updateDynamic("format")(format)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(sign_first)) __obj.updateDynamic("sign_first")(sign_first)
    if (!js.isUndefined(strip_insignificant_zeros)) __obj.updateDynamic("strip_insignificant_zeros")(strip_insignificant_zeros)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[ToCurrencyOptions]
  }
}

