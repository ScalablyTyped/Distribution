package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGaugeGaugeArea extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[LinearGaugeGaugeAreaBorder] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double | LinearGaugeGaugeAreaMargin] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object LinearGaugeGaugeArea {
  @scala.inline
  def apply(
    background: String = null,
    border: LinearGaugeGaugeAreaBorder = null,
    height: js.UndefOr[Double] = js.undefined,
    margin: Double | LinearGaugeGaugeAreaMargin = null,
    width: js.UndefOr[Double] = js.undefined
  ): LinearGaugeGaugeArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGaugeGaugeArea]
  }
}

