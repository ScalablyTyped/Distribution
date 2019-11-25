package typings.i18nDashJs.i18nDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToHumanSizeOptions extends ToNumberOptions {
  var format: js.UndefOr[String] = js.undefined
}

object ToHumanSizeOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    format: String = null,
    precision: Int | Double = null,
    separator: String = null,
    strip_insignificant_zeros: js.UndefOr[Boolean] = js.undefined
  ): ToHumanSizeOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(strip_insignificant_zeros)) __obj.updateDynamic("strip_insignificant_zeros")(strip_insignificant_zeros.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToHumanSizeOptions]
  }
}

