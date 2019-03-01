package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxisCrosshairTooltip extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[StockChartNavigatorCategoryAxisCrosshairTooltipBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[StockChartNavigatorCategoryAxisCrosshairTooltipPadding] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object StockChartNavigatorCategoryAxisCrosshairTooltip {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: StockChartNavigatorCategoryAxisCrosshairTooltipBorder = null,
    color: java.lang.String = null,
    font: java.lang.String = null,
    format: java.lang.String = null,
    padding: StockChartNavigatorCategoryAxisCrosshairTooltipPadding = null,
    template: java.lang.String | js.Function = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
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

