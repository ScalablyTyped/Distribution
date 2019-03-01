package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemHighlight extends js.Object {
  var border: js.UndefOr[StockChartNavigatorSeriesItemHighlightBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var line: js.UndefOr[StockChartNavigatorSeriesItemHighlightLine] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object StockChartNavigatorSeriesItemHighlight {
  @scala.inline
  def apply(
    border: StockChartNavigatorSeriesItemHighlightBorder = null,
    color: java.lang.String = null,
    line: StockChartNavigatorSeriesItemHighlightLine = null,
    opacity: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
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

