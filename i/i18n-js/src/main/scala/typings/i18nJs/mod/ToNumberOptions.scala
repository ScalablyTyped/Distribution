package typings.i18nJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToNumberOptions extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var strip_insignificant_zeros: js.UndefOr[Boolean] = js.undefined
}

object ToNumberOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    precision: Int | Double = null,
    separator: String = null,
    strip_insignificant_zeros: js.UndefOr[Boolean] = js.undefined
  ): ToNumberOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(strip_insignificant_zeros)) __obj.updateDynamic("strip_insignificant_zeros")(strip_insignificant_zeros.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToNumberOptions]
  }
}

