package typings
package i18nDashJsLib.i18nDashJsMod.I18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToHumanSizeOptions extends ToNumberOptions {
  var format: js.UndefOr[java.lang.String] = js.undefined
}

object ToHumanSizeOptions {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    format: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    separator: java.lang.String = null,
    strip_insignificant_zeros: js.UndefOr[scala.Boolean] = js.undefined
  ): ToHumanSizeOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (format != null) __obj.updateDynamic("format")(format)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(strip_insignificant_zeros)) __obj.updateDynamic("strip_insignificant_zeros")(strip_insignificant_zeros)
    __obj.asInstanceOf[ToHumanSizeOptions]
  }
}

