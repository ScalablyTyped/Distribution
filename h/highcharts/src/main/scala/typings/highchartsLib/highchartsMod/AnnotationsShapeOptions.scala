package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsShapeOptions extends js.Object {
  /**
    * The color of the shape's fill.
    * @default rgba(0, 0, 0, 0.75)
    * @since 6.0.0
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the shape.
    * @default undefined
    * @since 6.0.0
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The radius of the shape.
    * @default 0
    * @since 6.0.0
    */
  var r: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color of the shape's stroke.
    * @default rgba(0, 0, 0, 0.75)
    * @since 6.0.0
    */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pixel stroke width of the shape.
    * @default 1
    * @since 6.0.0
    */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The type of the shape, e.g. circle or rectangle.
    * @default "rect"
    * @since 6.0.0
    */
  var `type`: js.UndefOr[
    highchartsLib.highchartsLibStrings.circle | highchartsLib.highchartsLibStrings.path | highchartsLib.highchartsLibStrings.rect
  ] = js.undefined
  /**
    * The width of the shape.
    * @default undefined
    * @since 6.0.0
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object AnnotationsShapeOptions {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    r: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null,
    `type`: highchartsLib.highchartsLibStrings.circle | highchartsLib.highchartsLibStrings.path | highchartsLib.highchartsLibStrings.rect = null,
    width: scala.Int | scala.Double = null
  ): AnnotationsShapeOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsShapeOptions]
  }
}

