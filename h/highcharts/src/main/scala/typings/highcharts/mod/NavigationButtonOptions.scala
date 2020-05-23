package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationButtonOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Alignment for the buttons.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel spacing between
    * buttons.
    */
  var buttonSpacing: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable buttons.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Pixel height of the buttons.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fill color for the symbol within
    * the button.
    */
  var symbolFill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the symbol on
    * the button.
    */
  var symbolSize: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the symbol's stroke
    * or line.
    */
  var symbolStroke: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
    * symbol on the button.
    */
  var symbolStrokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position of the center of
    * the symbol inside the button.
    */
  var symbolX: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position of the center of
    * the symbol inside the button.
    */
  var symbolY: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text string to add to the
    * individual button.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
    * button theme. The object accepts SVG properties like `stroke-width`,
    * `stroke` and `fill`. Tri-state button styles are supported by the
    * `states.hover` and `states.select` objects.
    */
  var theme: js.UndefOr[NavigationButtonThemeOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
    * buttons. Can be one of `"top"`, `"middle"` or `"bottom"`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the button.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
    * button's position relative to its `verticalAlign`.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NavigationButtonOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    buttonSpacing: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    symbolFill: ColorString | GradientColorObject | PatternObject = null,
    symbolSize: js.UndefOr[Double] = js.undefined,
    symbolStroke: ColorString = null,
    symbolStrokeWidth: js.UndefOr[Double] = js.undefined,
    symbolX: js.UndefOr[Double] = js.undefined,
    symbolY: js.UndefOr[Double] = js.undefined,
    text: String = null,
    theme: NavigationButtonThemeOptions = null,
    verticalAlign: VerticalAlignValue = null,
    width: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): NavigationButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonSpacing)) __obj.updateDynamic("buttonSpacing")(buttonSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (symbolFill != null) __obj.updateDynamic("symbolFill")(symbolFill.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolSize)) __obj.updateDynamic("symbolSize")(symbolSize.get.asInstanceOf[js.Any])
    if (symbolStroke != null) __obj.updateDynamic("symbolStroke")(symbolStroke.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolStrokeWidth)) __obj.updateDynamic("symbolStrokeWidth")(symbolStrokeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolX)) __obj.updateDynamic("symbolX")(symbolX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolY)) __obj.updateDynamic("symbolY")(symbolY.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationButtonOptions]
  }
}

