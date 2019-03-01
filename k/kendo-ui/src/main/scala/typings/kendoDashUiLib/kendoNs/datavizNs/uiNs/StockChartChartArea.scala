package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartChartArea extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[StockChartChartAreaBorder] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[scala.Double | js.Any] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object StockChartChartArea {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: StockChartChartAreaBorder = null,
    height: scala.Int | scala.Double = null,
    margin: scala.Double | js.Any = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): StockChartChartArea = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartChartArea]
  }
}

