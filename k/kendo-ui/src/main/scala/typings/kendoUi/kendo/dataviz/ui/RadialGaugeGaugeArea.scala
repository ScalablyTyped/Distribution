package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugeGaugeArea extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[RadialGaugeGaugeAreaBorder] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double | RadialGaugeGaugeAreaMargin] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object RadialGaugeGaugeArea {
  @scala.inline
  def apply(
    background: String = null,
    border: RadialGaugeGaugeAreaBorder = null,
    height: js.UndefOr[Double] = js.undefined,
    margin: Double | RadialGaugeGaugeAreaMargin = null,
    width: js.UndefOr[Double] = js.undefined
  ): RadialGaugeGaugeArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugeGaugeArea]
  }
}

