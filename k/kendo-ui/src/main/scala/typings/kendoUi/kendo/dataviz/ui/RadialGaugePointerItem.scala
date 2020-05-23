package typings.kendoUi.kendo.dataviz.ui

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
    length: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): RadialGaugePointerItem = {
    val __obj = js.Dynamic.literal()
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugePointerItem]
  }
}

