package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugeGaugeArea extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[RadialGaugeGaugeAreaBorder] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[RadialGaugeGaugeAreaMargin] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object RadialGaugeGaugeArea {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: RadialGaugeGaugeAreaBorder = null,
    height: scala.Int | scala.Double = null,
    margin: RadialGaugeGaugeAreaMargin = null,
    width: scala.Int | scala.Double = null
  ): RadialGaugeGaugeArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugeGaugeArea]
  }
}

