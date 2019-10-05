package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPlotArea extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartPlotAreaBorder] = js.undefined
  var margin: js.UndefOr[ChartPlotAreaMargin] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[ChartPlotAreaPadding] = js.undefined
}

object ChartPlotArea {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartPlotAreaBorder = null,
    margin: ChartPlotAreaMargin = null,
    opacity: Int | Double = null,
    padding: ChartPlotAreaPadding = null
  ): ChartPlotArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[ChartPlotArea]
  }
}

