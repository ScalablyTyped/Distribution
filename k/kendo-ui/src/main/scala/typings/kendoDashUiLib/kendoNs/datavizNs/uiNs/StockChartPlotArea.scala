package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartPlotArea extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[StockChartPlotAreaBorder] = js.undefined
  var margin: js.UndefOr[scala.Double | js.Any] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object StockChartPlotArea {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: StockChartPlotAreaBorder = null,
    margin: scala.Double | js.Any = null,
    opacity: scala.Int | scala.Double = null
  ): StockChartPlotArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartPlotArea]
  }
}

