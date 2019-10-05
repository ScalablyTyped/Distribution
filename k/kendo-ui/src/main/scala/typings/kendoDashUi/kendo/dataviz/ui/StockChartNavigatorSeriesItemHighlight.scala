package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemHighlight extends js.Object {
  var border: js.UndefOr[StockChartNavigatorSeriesItemHighlightBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[StockChartNavigatorSeriesItemHighlightLine] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object StockChartNavigatorSeriesItemHighlight {
  @scala.inline
  def apply(
    border: StockChartNavigatorSeriesItemHighlightBorder = null,
    color: String = null,
    line: StockChartNavigatorSeriesItemHighlightLine = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StockChartNavigatorSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (line != null) __obj.updateDynamic("line")(line)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartNavigatorSeriesItemHighlight]
  }
}

