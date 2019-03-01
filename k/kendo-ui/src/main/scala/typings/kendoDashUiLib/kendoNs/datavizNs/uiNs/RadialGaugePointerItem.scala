package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugePointerItem extends js.Object {
  var cap: js.UndefOr[RadialGaugePointerItemCap] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object RadialGaugePointerItem {
  @scala.inline
  def apply(
    cap: RadialGaugePointerItemCap = null,
    color: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): RadialGaugePointerItem = {
    val __obj = js.Dynamic.literal()
    if (cap != null) __obj.updateDynamic("cap")(cap)
    if (color != null) __obj.updateDynamic("color")(color)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugePointerItem]
  }
}

