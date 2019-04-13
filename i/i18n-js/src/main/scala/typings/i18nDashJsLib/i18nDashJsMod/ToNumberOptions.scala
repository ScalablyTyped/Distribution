package typings
package i18nDashJsLib.i18nDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToNumberOptions extends js.Object {
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var strip_insignificant_zeros: js.UndefOr[scala.Boolean] = js.undefined
}

object ToNumberOptions {
  @scala.inline
  def apply(
    delimiter: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    separator: java.lang.String = null,
    strip_insignificant_zeros: js.UndefOr[scala.Boolean] = js.undefined
  ): ToNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(strip_insignificant_zeros)) __obj.updateDynamic("strip_insignificant_zeros")(strip_insignificant_zeros)
    __obj.asInstanceOf[ToNumberOptions]
  }
}

