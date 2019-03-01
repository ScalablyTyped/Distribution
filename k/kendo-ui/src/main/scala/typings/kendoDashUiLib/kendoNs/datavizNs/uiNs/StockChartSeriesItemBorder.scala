package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItemBorder extends js.Object {
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var dashType: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var opacity: js.UndefOr[scala.Double | js.Function] = js.undefined
  var width: js.UndefOr[scala.Double | js.Function] = js.undefined
}

object StockChartSeriesItemBorder {
  @scala.inline
  def apply(
    color: java.lang.String | js.Function = null,
    dashType: java.lang.String | js.Function = null,
    opacity: scala.Double | js.Function = null,
    width: scala.Double | js.Function = null
  ): StockChartSeriesItemBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartSeriesItemBorder]
  }
}

