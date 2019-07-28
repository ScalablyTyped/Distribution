package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugePointerItem extends js.Object {
  var cap: js.UndefOr[RadialGaugePointerItemCap] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object RadialGaugePointerItem {
  @scala.inline
  def apply(
    cap: RadialGaugePointerItemCap = null,
    color: String = null,
    length: Int | Double = null,
    value: Int | Double = null
  ): RadialGaugePointerItem = {
    val __obj = js.Dynamic.literal()
    if (cap != null) __obj.updateDynamic("cap")(cap)
    if (color != null) __obj.updateDynamic("color")(color)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugePointerItem]
  }
}

