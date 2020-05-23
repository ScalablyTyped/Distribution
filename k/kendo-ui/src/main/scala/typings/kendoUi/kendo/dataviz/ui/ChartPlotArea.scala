package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPlotArea extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartPlotAreaBorder] = js.undefined
  var margin: js.UndefOr[Double | ChartPlotAreaMargin] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double | ChartPlotAreaPadding] = js.undefined
}

object ChartPlotArea {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartPlotAreaBorder = null,
    margin: Double | ChartPlotAreaMargin = null,
    opacity: js.UndefOr[Double] = js.undefined,
    padding: Double | ChartPlotAreaPadding = null
  ): ChartPlotArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPlotArea]
  }
}

