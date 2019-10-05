package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxisCrosshair extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[StockChartNavigatorCategoryAxisCrosshairTooltip] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StockChartNavigatorCategoryAxisCrosshair {
  @scala.inline
  def apply(
    color: String = null,
    opacity: Int | Double = null,
    tooltip: StockChartNavigatorCategoryAxisCrosshairTooltip = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): StockChartNavigatorCategoryAxisCrosshair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisCrosshair]
  }
}

