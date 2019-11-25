package typings.highcharts.highchartsMod

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
    buttonSpacing: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    symbolFill: ColorString | GradientColorObject | PatternObject = null,
    symbolSize: Int | Double = null,
    symbolStroke: ColorString = null,
    symbolStrokeWidth: Int | Double = null,
    symbolX: Int | Double = null,
    symbolY: Int | Double = null,
    text: String = null,
    theme: NavigationButtonThemeOptions = null,
    verticalAlign: VerticalAlignValue = null,
    width: Int | Double = null,
    y: Int | Double = null
  ): NavigationButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (buttonSpacing != null) __obj.updateDynamic("buttonSpacing")(buttonSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (symbolFill != null) __obj.updateDynamic("symbolFill")(symbolFill.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (symbolStroke != null) __obj.updateDynamic("symbolStroke")(symbolStroke.asInstanceOf[js.Any])
    if (symbolStrokeWidth != null) __obj.updateDynamic("symbolStrokeWidth")(symbolStrokeWidth.asInstanceOf[js.Any])
    if (symbolX != null) __obj.updateDynamic("symbolX")(symbolX.asInstanceOf[js.Any])
    if (symbolY != null) __obj.updateDynamic("symbolY")(symbolY.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationButtonOptions]
  }
}

