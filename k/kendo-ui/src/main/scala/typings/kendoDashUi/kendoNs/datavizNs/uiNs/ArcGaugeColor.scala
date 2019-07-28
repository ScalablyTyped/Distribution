package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGaugeColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
}

object ArcGaugeColor {
  @scala.inline
  def apply(color: String = null, from: Int | Double = null, to: Int | Double = null): ArcGaugeColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGaugeColor]
  }
}

