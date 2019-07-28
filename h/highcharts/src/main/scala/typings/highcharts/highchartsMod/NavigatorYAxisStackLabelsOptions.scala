package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisStackLabelsOptions extends js.Object {
  /**
    * (Highcharts) Defines the horizontal alignment of the stack total label.
    * Can be one of `"left"`, `"center"` or `"right"`. The default value is
    * calculated at runtime and depends on orientation and whether the stack is
    * positive or negative.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts) Allow the stack labels to overlap.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Enable or disable the stack total labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) A format string for the data label. Available
    * variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Callback JavaScript function to format the label. The value
    * is given by `this.total`.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[StackItemObject]] = js.undefined
  /**
    * (Highcharts) Rotation of the labels in degrees.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) CSS styles for the label.
    *
    * In styled mode, the styles are set in the `.highcharts-stack-label`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts) The text alignment for the label. While `align` determines
    * where the texts anchor point is placed with regards to the stack,
    * `textAlign` determines how the text is aligned against its anchor point.
    * Possible values are `"left"`, `"center"` and `"right"`. The default value
    * is calculated at runtime and depends on orientation and whether the stack
    * is positive or negative.
    */
  var textAlign: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highstock) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Defines the vertical alignment of the stack total label. Can
    * be one of `"top"`, `"middle"` or `"bottom"`. The default value is
    * calculated at runtime and depends on orientation and whether the stack is
    * positive or negative.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highcharts) The x position offset of the label relative to the left of
    * the stacked bar. The default value is calculated at runtime and depends
    * on orientation and whether the stack is positive or negative.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The y position offset of the label relative to the tick
    * position on the axis. The default value is calculated at runtime and
    * depends on orientation and whether the stack is positive or negative.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NavigatorYAxisStackLabelsOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    formatter: FormatterCallbackFunction[StackItemObject] = null,
    rotation: Int | Double = null,
    style: CSSObject = null,
    textAlign: AlignValue = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): NavigatorYAxisStackLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorYAxisStackLabelsOptions]
  }
}

