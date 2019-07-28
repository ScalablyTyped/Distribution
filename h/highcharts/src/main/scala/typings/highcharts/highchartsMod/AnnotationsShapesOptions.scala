package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsShapesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The height of the shape.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
    * drawn at the final vertex of the path. Custom markers can be defined in
    * defs property.
    */
  var markerEnd: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
    * drawn at the first vertex of the path. Custom markers can be defined in
    * defs property.
    */
  var markerStart: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
    * which the shape will be connected. It can be either the point which
    * exists in the series - it is referenced by the point's id - or a new
    * point with defined x, y properties and optionally axes.
    */
  var point: js.UndefOr[String | AnnotationsShapesPointOptions | MockPointOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the
    * shape. This option is available for shapes which can use multiple points
    * such as path. A point can be either a point object or a point's id.
    */
  var points: js.UndefOr[AnnotationsShapesPointsOptions | (js.Array[String | MockPointOptionsObject])] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The radius of the shape.
    */
  var r: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Defines additional snapping area
    * around an annotation making this annotation to focus. Defined in pixels.
    */
  var snap: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's stroke.
    */
  var stroke: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
    * shape.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The type of the shape, e.g.
    * circle or rectangle.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the shape.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AnnotationsShapesOptions {
  @scala.inline
  def apply(
    fill: ColorString | GradientColorObject | PatternObject = null,
    height: Int | Double = null,
    markerEnd: String = null,
    markerStart: String = null,
    point: String | AnnotationsShapesPointOptions | MockPointOptionsObject = null,
    points: AnnotationsShapesPointsOptions | (js.Array[String | MockPointOptionsObject]) = null,
    r: Int | Double = null,
    snap: Int | Double = null,
    stroke: ColorString = null,
    strokeWidth: Int | Double = null,
    `type`: String = null,
    width: Int | Double = null
  ): AnnotationsShapesOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd)
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart)
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsShapesOptions]
  }
}

