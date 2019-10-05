package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxisCrosshairTooltip extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[StockChartNavigatorCategoryAxisCrosshairTooltipBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[StockChartNavigatorCategoryAxisCrosshairTooltipPadding] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object StockChartNavigatorCategoryAxisCrosshairTooltip {
  @scala.inline
  def apply(
    background: String = null,
    border: StockChartNavigatorCategoryAxisCrosshairTooltipBorder = null,
    color: String = null,
    font: String = null,
    format: String = null,
    padding: StockChartNavigatorCategoryAxisCrosshairTooltipPadding = null,
    template: String | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StockChartNavigatorCategoryAxisCrosshairTooltip = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (format != null) __obj.updateDynamic("format")(format)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisCrosshairTooltip]
  }
}

