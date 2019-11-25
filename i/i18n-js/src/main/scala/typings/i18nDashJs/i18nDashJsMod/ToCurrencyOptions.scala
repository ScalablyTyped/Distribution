package typings.i18nDashJs.i18nDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToCurrencyOptions extends ToNumberOptions {
  var format: js.UndefOr[String] = js.undefined
  var sign_first: js.UndefOr[Boolean] = js.undefined
  var unit: js.UndefOr[String] = js.undefined
}

object ToCurrencyOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    format: String = null,
    precision: Int | Double = null,
    separator: String = null,
    sign_first: js.UndefOr[Boolean] = js.undefined,
    strip_insignificant_zeros: js.UndefOr[Boolean] = js.undefined,
    unit: String = null
  ): ToCurrencyOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(sign_first)) __obj.updateDynamic("sign_first")(sign_first.asInstanceOf[js.Any])
    if (!js.isUndefined(strip_insignificant_zeros)) __obj.updateDynamic("strip_insignificant_zeros")(strip_insignificant_zeros.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToCurrencyOptions]
  }
}

