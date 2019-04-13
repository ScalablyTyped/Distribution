package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsLabel extends AnnotationsLabelOptions {
  /**
    * This option defines the point to which the label will be connected.
    * It can be either the point which exists in the series - it is referenced by the point's id
    * - or a new point with defined x, y properties and optionally axes.
    * @since 6.0.0
    */
  var point: js.UndefOr[java.lang.String | AnnotationsPoint] = js.undefined
}

object AnnotationsLabel {
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
    point: java.lang.String | AnnotationsPoint = null,
    shadow: scala.Boolean | highchartsLib.Anon_Color = null,
    shape: highchartsLib.highchartsLibStrings.connector | highchartsLib.highchartsLibStrings.rect | highchartsLib.highchartsLibStrings.circle | highchartsLib.highchartsLibStrings.diamond | highchartsLib.highchartsLibStrings.triangle = null,
    style: highchartsLib.Anon_ColorFontFamily = null,
    text: java.lang.String = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: highchartsLib.highchartsLibStrings.bottom | highchartsLib.highchartsLibStrings.middle | highchartsLib.highchartsLibStrings.top = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): AnnotationsLabel = {
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
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsLabel]
  }
}

