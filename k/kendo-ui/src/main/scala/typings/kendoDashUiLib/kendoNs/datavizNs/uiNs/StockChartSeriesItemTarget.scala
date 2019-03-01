package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItemTarget extends js.Object {
  var border: js.UndefOr[js.Function | StockChartSeriesItemTargetBorder] = js.undefined
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var line: js.UndefOr[StockChartSeriesItemTargetLine] = js.undefined
}

object StockChartSeriesItemTarget {
  @scala.inline
  def apply(
    border: js.Function | StockChartSeriesItemTargetBorder = null,
    color: java.lang.String | js.Function = null,
    line: StockChartSeriesItemTargetLine = null
  ): StockChartSeriesItemTarget = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[StockChartSeriesItemTarget]
  }
}

