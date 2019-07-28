package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsPitchforkLabelOptions extends js.Object {
  /**
    * (Highstock) The alignment of the annotation's label. If right, the right
    * side of the label should be touching the point.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highstock) Whether to allow the annotation's labels to overlap. To make
    * the labels less sensitive for overlapping, the can be set to 0.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The background color or gradient for the annotation's label.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The border color for the annotation's label.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highstock) The border radius in pixels for the annotaiton's label.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The border width in pixels for the annotation's label
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) A class name for styling by CSS.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Whether to hide the annotation's label that is outside the
    * plot area.
    */
  var crop: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The label's pixel distance from the point.
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) A format string for the data label.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Callback JavaScript function to format the annotation's
    * label. Note that if a `format` or `text` are defined, the format or text
    * take precedence and the formatter is ignored. `This` refers to a point
    * object.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[Point]] = js.undefined
  /**
    * (Highstock) How to handle the annotation's label that flow outside the
    * plot area. The justify option aligns the label inside the plot area.
    */
  var overflow: js.UndefOr[OptionsOverflowValue] = js.undefined
  /**
    * (Highstock) When either the borderWidth or the backgroundColor is set,
    * this is the padding within the box.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The shadow of the box. The shadow can be an object
    * configuration containing `color`, `offsetX`, `offsetY`, `opacity` and
    * `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.undefined
  /**
    * (Highstock) The name of a symbol to use for the border around the label.
    * Symbols are predefined functions on the Renderer object.
    */
  var shape: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Styles for the annotation's label.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highstock) Alias for the format option.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Whether to use HTML to render the annotation's label.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) The vertical alignment of the annotation's label.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highstock) The x position offset of the label relative to the point.
    * Note that if a `distance` is defined, the distance takes precedence over
    * `x` and `y` options.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The y position offset of the label relative to the point.
    * Note that if a `distance` is defined, the distance takes precedence over
    * `x` and `y` options.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AnnotationsPitchforkLabelOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    className: String = null,
    crop: js.UndefOr[Boolean] = js.undefined,
    distance: Int | Double = null,
    format: String = null,
    formatter: FormatterCallbackFunction[Point] = null,
    overflow: OptionsOverflowValue = null,
    padding: Int | Double = null,
    shadow: Boolean | ShadowOptionsObject = null,
    shape: String = null,
    style: CSSObject = null,
    text: String = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnnotationsPitchforkLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsPitchforkLabelOptions]
  }
}

