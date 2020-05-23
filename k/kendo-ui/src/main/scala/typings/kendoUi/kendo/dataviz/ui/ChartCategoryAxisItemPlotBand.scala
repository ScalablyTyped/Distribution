package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemPlotBand extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
}

object ChartCategoryAxisItemPlotBand {
  @scala.inline
  def apply(
    color: String = null,
    from: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined
  ): ChartCategoryAxisItemPlotBand = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCategoryAxisItemPlotBand]
  }
}

