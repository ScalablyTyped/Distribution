package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsShape extends AnnotationsShapeOptions {
  /**
    * Id of the marker which will be drawn at the final vertex of the path. Custom markers can be defined in defs property.
    * @default undefined
    * @since 6.0.0
    */
  var markerEnd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Id of the marker which will be drawn at the final vertex of the path. Custom markers can be defined in defs property.
    * @default undefined
    * @since 6.0.0
    */
  var markerStart: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This option defines the point to which the shape will be connected.
    * It can be either the point which exists in the series - it is referenced by the point's id
    * - or a new point with defined x, y properties and optionally axes.
    * @since 6.0.0
    */
  var point: js.UndefOr[java.lang.String | AnnotationsPoint] = js.undefined
  /**
    * An array of points for the shape. This option is available for shapes which can use multiple points such as path.
    * A point can be either a point object or a point's id.
    * @default undefined
    * @since 6.0.0
    */
  var points: js.UndefOr[js.Array[java.lang.String | AnnotationsPoint]] = js.undefined
}

object AnnotationsShape {
  @scala.inline
  def apply(
    fill: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    markerEnd: java.lang.String = null,
    markerStart: java.lang.String = null,
    point: java.lang.String | AnnotationsPoint = null,
    points: js.Array[java.lang.String | AnnotationsPoint] = null,
    r: scala.Int | scala.Double = null,
    stroke: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null,
    `type`: highchartsLib.highchartsLibStrings.circle | highchartsLib.highchartsLibStrings.path | highchartsLib.highchartsLibStrings.rect = null,
    width: scala.Int | scala.Double = null
  ): AnnotationsShape = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd)
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart)
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points)
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsShape]
  }
}

