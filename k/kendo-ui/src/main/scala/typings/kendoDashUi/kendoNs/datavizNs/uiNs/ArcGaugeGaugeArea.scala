package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGaugeGaugeArea extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ArcGaugeGaugeAreaBorder] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[ArcGaugeGaugeAreaMargin] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ArcGaugeGaugeArea {
  @scala.inline
  def apply(
    background: String = null,
    border: ArcGaugeGaugeAreaBorder = null,
    height: Int | Double = null,
    margin: ArcGaugeGaugeAreaMargin = null,
    width: Int | Double = null
  ): ArcGaugeGaugeArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGaugeGaugeArea]
  }
}

