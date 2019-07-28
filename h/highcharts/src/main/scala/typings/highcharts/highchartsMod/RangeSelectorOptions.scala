package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorOptions extends js.Object {
  /**
    * (Highstock, Gantt) Whether to enable all buttons from the start. By
    * default buttons are only enabled if the corresponding time range exists
    * on the X axis, but enabling all buttons allows for dynamically loading
    * different time ranges.
    */
  var allButtonsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) Positioning for the button row.
    */
  var buttonPosition: js.UndefOr[RangeSelectorButtonPositionOptions] = js.undefined
  /**
    * (Highstock, Gantt) The space in pixels between the buttons in the range
    * selector.
    */
  var buttonSpacing: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) A collection of attributes for the buttons. The object
    * takes SVG attributes like `fill`, `stroke`, `stroke-width`, as well as
    * `style`, a collection of CSS properties for the text.
    *
    * The object can also be extended with states, so you can set
    * presentational options for `hover`, `select` or `disabled` button states.
    *
    * CSS styles for the text label.
    *
    * In styled mode, the buttons are styled by the
    * `.highcharts-range-selector-buttons .highcharts-button` rule with its
    * different states.
    */
  var buttonTheme: js.UndefOr[SVGAttributes] = js.undefined
  /**
    * (Highstock, Gantt) An array of configuration objects for the buttons.
    *
    * Defaults to
    *
    * (see online documentation for example)
    */
  var buttons: js.UndefOr[js.Array[RangeSelectorButtonsOptions]] = js.undefined
  /**
    * (Highstock, Gantt) Enable or disable the range selector.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) When the rangeselector is floating, the plot area does
    * not reserve space for it. This opens for positioning anywhere on the
    * chart.
    */
  var floating: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) Deprecated. The height of the range selector.
    * Currently it is calculated dynamically.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The border color of the date input boxes.
    */
  var inputBoxBorderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock, Gantt) The pixel height of the date input boxes.
    */
  var inputBoxHeight: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) CSS for the container DIV holding the input boxes.
    * Deprecated as of 1.2.5\. Use inputPosition instead.
    */
  var inputBoxStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highstock, Gantt) The pixel width of the date input boxes.
    */
  var inputBoxWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The date format in the input boxes when not selected
    * for editing. Defaults to `%b %e, %Y`.
    */
  var inputDateFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) A custom callback function to parse values entered in
    * the input boxes and return a valid JavaScript time as milliseconds since
    * 1970.
    */
  var inputDateParser: js.UndefOr[RangeSelectorParseCallbackFunction] = js.undefined
  /**
    * (Highstock, Gantt) The date format in the input boxes when they are
    * selected for editing. This must be a format that is recognized by
    * JavaScript Date.parse.
    */
  var inputEditDateFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) Enable or disable the date input boxes. Defaults to
    * enabled when there is enough space, disabled if not (typically mobile).
    */
  var inputEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) Positioning for the input boxes. Allowed properties
    * are `align`, `x` and `y`.
    */
  var inputPosition: js.UndefOr[RangeSelectorInputPositionOptions] = js.undefined
  /**
    * (Highstock, Gantt) CSS for the HTML inputs in the range selector.
    *
    * In styled mode, the inputs are styled by the `.highcharts-range-input
    * text` rule in SVG mode, and `input.highcharts-range-selector` when
    * active.
    */
  var inputStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highstock, Gantt) CSS styles for the labels - the Zoom, From and To
    * texts.
    *
    * In styled mode, the labels are styled by the `.highcharts-range-label`
    * class.
    */
  var labelStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highstock, Gantt) The index of the button to appear pre-selected.
    */
  var selected: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The vertical alignment of the rangeselector box.
    * Allowed properties are `top`, `middle`, `bottom`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highstock, Gantt) The x offset of the range selector relative to its
    * horizontal alignment within `chart.spacingLeft` and `chart.spacingRight`.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The y offset of the range selector relative to its
    * horizontal alignment within `chart.spacingLeft` and `chart.spacingRight`.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object RangeSelectorOptions {
  @scala.inline
  def apply(
    allButtonsEnabled: js.UndefOr[Boolean] = js.undefined,
    buttonPosition: RangeSelectorButtonPositionOptions = null,
    buttonSpacing: Int | Double = null,
    buttonTheme: SVGAttributes = null,
    buttons: js.Array[RangeSelectorButtonsOptions] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    floating: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    inputBoxBorderColor: ColorString = null,
    inputBoxHeight: Int | Double = null,
    inputBoxStyle: CSSObject = null,
    inputBoxWidth: Int | Double = null,
    inputDateFormat: String = null,
    inputDateParser: RangeSelectorParseCallbackFunction = null,
    inputEditDateFormat: String = null,
    inputEnabled: js.UndefOr[Boolean] = js.undefined,
    inputPosition: RangeSelectorInputPositionOptions = null,
    inputStyle: CSSObject = null,
    labelStyle: CSSObject = null,
    selected: Int | Double = null,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): RangeSelectorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allButtonsEnabled)) __obj.updateDynamic("allButtonsEnabled")(allButtonsEnabled)
    if (buttonPosition != null) __obj.updateDynamic("buttonPosition")(buttonPosition)
    if (buttonSpacing != null) __obj.updateDynamic("buttonSpacing")(buttonSpacing.asInstanceOf[js.Any])
    if (buttonTheme != null) __obj.updateDynamic("buttonTheme")(buttonTheme)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputBoxBorderColor != null) __obj.updateDynamic("inputBoxBorderColor")(inputBoxBorderColor)
    if (inputBoxHeight != null) __obj.updateDynamic("inputBoxHeight")(inputBoxHeight.asInstanceOf[js.Any])
    if (inputBoxStyle != null) __obj.updateDynamic("inputBoxStyle")(inputBoxStyle)
    if (inputBoxWidth != null) __obj.updateDynamic("inputBoxWidth")(inputBoxWidth.asInstanceOf[js.Any])
    if (inputDateFormat != null) __obj.updateDynamic("inputDateFormat")(inputDateFormat)
    if (inputDateParser != null) __obj.updateDynamic("inputDateParser")(inputDateParser)
    if (inputEditDateFormat != null) __obj.updateDynamic("inputEditDateFormat")(inputEditDateFormat)
    if (!js.isUndefined(inputEnabled)) __obj.updateDynamic("inputEnabled")(inputEnabled)
    if (inputPosition != null) __obj.updateDynamic("inputPosition")(inputPosition)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorOptions]
  }
}

