package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisStackLabelsOptions extends js.Object {
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
    * (Highcharts) The background color or gradient for the stack label.
    */
  var backgroundColor: js.UndefOr[ColorType] = js.undefined
  /**
    * (Highcharts) The border color for the stack label. Defaults to
    * `undefined`.
    */
  var borderColor: js.UndefOr[ColorType] = js.undefined
  /**
    * (Highcharts) The border radius in pixels for the stack label.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The border width in pixels for the stack label.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Whether to hide stack labels that are outside the plot area.
    * By default, the stack label is moved inside the plot area according to
    * the overflow option.
    */
  var crop: js.UndefOr[Boolean] = js.undefined
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
    * (Highcharts) How to handle stack total labels that flow outside the plot
    * area. The default is set to `"justify"`, which aligns them inside the
    * plot area. For columns and bars, this means it will be moved inside the
    * bar. To display stack labels outside the plot area, set `crop` to `false`
    * and `overflow` to `"allow"`.
    */
  var overflow: js.UndefOr[DataLabelsOverflowValue] = js.undefined
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

object YAxisStackLabelsOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: ColorType = null,
    borderColor: ColorType = null,
    borderRadius: js.UndefOr[Double] = js.undefined,
    borderWidth: js.UndefOr[Double] = js.undefined,
    crop: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    formatter: FormatterCallbackFunction[StackItemObject] = null,
    overflow: DataLabelsOverflowValue = null,
    rotation: js.UndefOr[Double] = js.undefined,
    style: CSSObject = null,
    textAlign: AlignValue = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): YAxisStackLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderRadius)) __obj.updateDynamic("borderRadius")(borderRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.get.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisStackLabelsOptions]
  }
}

