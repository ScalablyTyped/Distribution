package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsShapesOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Name of the dash style to use
    * for the shape's stroke.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
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
  var point: js.UndefOr[String | AnnotationMockPointOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the
    * shape. This option is available for shapes which can use multiple points
    * such as path. A point can be either a point object or a point's id.
    */
  var points: js.UndefOr[js.Array[String | AnnotationMockPointOptionsObject]] = js.undefined
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
    * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
    * the annotation shape. Note, type has to be set to `'image'`.
    */
  var src: js.UndefOr[String] = js.undefined
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
    dashStyle: DashStyleValue = null,
    fill: ColorString | GradientColorObject | PatternObject = null,
    height: js.UndefOr[Double] = js.undefined,
    markerEnd: String = null,
    markerStart: String = null,
    point: String | AnnotationMockPointOptionsObject = null,
    points: js.Array[String | AnnotationMockPointOptionsObject] = null,
    r: js.UndefOr[Double] = js.undefined,
    snap: js.UndefOr[Double] = js.undefined,
    src: String = null,
    stroke: ColorString = null,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): AnnotationsShapesOptions = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.get.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsShapesOptions]
  }
}

