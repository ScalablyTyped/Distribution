package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsLabelOptions extends js.Object {
  /**
    * The alignment of the annotation's label. If right, the right side of the label should be touching the point.
    * @default "center"
    * @since 6.0.0
    */
  var align: js.UndefOr[
    highchartsLib.highchartsLibStrings.left | highchartsLib.highchartsLibStrings.center | highchartsLib.highchartsLibStrings.right
  ] = js.undefined
  /**
    * The alignment of the annotation's label. If right, the right side of the label should be touching the point.
    * @default false
    * @since 6.0.0
    */
  var allowOverlap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The background color or gradient for the annotation's label.
    * @default rgba(0, 0, 0, 0.75)
    * @since 6.0.0
    */
  var backgroundColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The border color for the annotation's label.
    * @default "black"
    * @since 6.0.0
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The border radius in pixels for the annotation's label.
    * @default 1
    * @since 6.0.0
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The border width in pixels for the annotation's label.
    * @default 1
    * @since 6.0.0
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to hide the annotation's label that is outside the plot area.
    * @default false
    * @since 6.0.0
    */
  var crop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The label's pixel distance from the point.
    * @default undefined
    * @since 6.0.0
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
    * A format string for the data label.
    * @default undefined
    * @since 6.0.0
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback JavaScript function to format the annotation's label.
    * Note that if a format or text are defined, the format or text take precedence and the formatter is ignored.
    * This refers to a point object.
    * @default function () { return defined(this.y) ? this.y : 'Annotation label'; }
    * @since 6.0.0
    */
  var formatter: js.UndefOr[js.Function] = js.undefined
  /**
    * How to handle the annotation's label that flow outside the plot area.
    * The justify option aligns the label inside the plot area.
    * @default "justify
    * @since 6.0.0
    */
  var overflow: js.UndefOr[
    highchartsLib.highchartsLibStrings.justify | highchartsLib.highchartsLibStrings.none
  ] = js.undefined
  /**
    * When either the borderWidth or the backgroundColor is set, this is the padding within the box.
    * @default 5
    * @since 6.0.0
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The shadow of the box. The shadow can be an object configuration containing color, offsetX, offsetY, opacity and width.
    * @default false
    * @since 6.0.0
    */
  var shadow: js.UndefOr[scala.Boolean | highchartsLib.Anon_Color] = js.undefined
  /**
    * The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer object.
    * @default "callout"
    * @since 6.0.0
    */
  var shape: js.UndefOr[
    highchartsLib.highchartsLibStrings.connector | highchartsLib.highchartsLibStrings.rect | highchartsLib.highchartsLibStrings.circle | highchartsLib.highchartsLibStrings.diamond | highchartsLib.highchartsLibStrings.triangle
  ] = js.undefined
  /**
    * Styles for the annotation's label.
    * @default "callout"
    * @since 6.0.0
    */
  var style: js.UndefOr[highchartsLib.Anon_ColorFontFamily] = js.undefined
  /**
    * Alias for the format option.
    * @default undefined
    * @since 6.0.0
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to use HTML to render the annotation's label.
    * @default false
    * @since 6.0.0
    */
  var useHTML: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The vertical alignment of the annotation's label.
    * @default "bottom"
    * @since 6.0.0
    */
  var verticalAlign: js.UndefOr[
    highchartsLib.highchartsLibStrings.bottom | highchartsLib.highchartsLibStrings.middle | highchartsLib.highchartsLibStrings.top
  ] = js.undefined
  /**
    * The x position offset of the label relative to the point.
    * Note that if a distance is defined, the distance takes precedence over x and y options.
    * @default 0
    * @since 6.0.0
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y position offset of the label relative to the point.
    * Note that if a distance is defined, the distance takes precedence over x and y options.
    * @default -16
    * @since 6.0.0
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object AnnotationsLabelOptions {
  @scala.inline
  def apply(
    align: highchartsLib.highchartsLibStrings.left | highchartsLib.highchartsLibStrings.center | highchartsLib.highchartsLibStrings.right = null,
    allowOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String | Gradient = null,
    borderColor: java.lang.String | Gradient = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    crop: js.UndefOr[scala.Boolean] = js.undefined,
    distance: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    formatter: js.Function = null,
    overflow: highchartsLib.highchartsLibStrings.justify | highchartsLib.highchartsLibStrings.none = null,
    padding: scala.Int | scala.Double = null,
    shadow: scala.Boolean | highchartsLib.Anon_Color = null,
    shape: highchartsLib.highchartsLibStrings.connector | highchartsLib.highchartsLibStrings.rect | highchartsLib.highchartsLibStrings.circle | highchartsLib.highchartsLibStrings.diamond | highchartsLib.highchartsLibStrings.triangle = null,
    style: highchartsLib.Anon_ColorFontFamily = null,
    text: java.lang.String = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: highchartsLib.highchartsLibStrings.bottom | highchartsLib.highchartsLibStrings.middle | highchartsLib.highchartsLibStrings.top = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): AnnotationsLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsLabelOptions]
  }
}

