package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugePointerItemCap extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object RadialGaugePointerItemCap {
  @scala.inline
  def apply(color: String = null, size: Int | Double = null): RadialGaugePointerItemCap = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugePointerItemCap]
  }
}

