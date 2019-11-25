package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItemHighlight extends js.Object {
  var border: js.UndefOr[StockChartSeriesItemHighlightBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[StockChartSeriesItemHighlightLine] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object StockChartSeriesItemHighlight {
  @scala.inline
  def apply(
    border: StockChartSeriesItemHighlightBorder = null,
    color: String = null,
    line: StockChartSeriesItemHighlightLine = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StockChartSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartSeriesItemHighlight]
  }
}

