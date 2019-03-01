package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItemHighlight extends js.Object {
  var border: js.UndefOr[StockChartSeriesItemHighlightBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var line: js.UndefOr[StockChartSeriesItemHighlightLine] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object StockChartSeriesItemHighlight {
  @scala.inline
  def apply(
    border: StockChartSeriesItemHighlightBorder = null,
    color: java.lang.String = null,
    line: StockChartSeriesItemHighlightLine = null,
    opacity: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): StockChartSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (line != null) __obj.updateDynamic("line")(line)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartSeriesItemHighlight]
  }
}

