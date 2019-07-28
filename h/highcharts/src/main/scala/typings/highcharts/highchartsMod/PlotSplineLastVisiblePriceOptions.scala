package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSplineLastVisiblePriceOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the indicator.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[PlotSplineLastVisiblePriceLabelOptions] = js.undefined
}

object PlotSplineLastVisiblePriceOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: PlotSplineLastVisiblePriceLabelOptions = null): PlotSplineLastVisiblePriceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[PlotSplineLastVisiblePriceOptions]
  }
}

