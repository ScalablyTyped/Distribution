package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOptionsObject extends js.Object {
  /**
    * An additional, individual class name for the data point's graphic
    * representation.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Individual color for the point. By default the color is pulled from the
    * global colors array. In styled mode, the color option doesn't take
    * effect. Instead, use colorIndex.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * A specific color index to use for the point, so its graphic
    * representations are given the class name highcharts-color-{n}. In styled
    * mode this will change the color of the graphic. In non-styled mode, the
    * color by is set by the fill attribute, so the change in class name won't
    * have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * A name for the dash style to use for the column or bar. Overrides
    * dashStyle on the series. In styled mode, the stroke dash-array can be set
    * with the same classes as listed under
    * Highcharts.PointOptionsObject#color.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * Individual data labels for each point.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]] = js.undefined
  /**
    * The id of a series in the drilldown.series array to use for a drilldown
    * for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * The id of a series in the drilldown.series array to use for a drilldown
    * for this point.
    */
  var events: PointEventsOptionsObject
  /**
    * An id for the point. This can be used after render time to get a pointer
    * to the point object through `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The rank for this point's data label in case of collision. If two data
    * labels are about to overlap, only the one with the highest labelrank will
    * be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * The sequential index of the data point in the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.undefined
  /**
    * Options for the point markers of line-like series.
    */
  var marker: PointMarkerOptionsObject
  /**
    * The name of the point as shown in the legend, tooltip, dataLabels etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A pixel value specifying a fixed width for the column or bar. Overrides
    * pointWidth on the series.
    */
  var pointWidth: js.UndefOr[Double] = js.undefined
  /**
    * Whether the data point is selected initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * Pie series only. Whether to display a slice offset from the center.
    */
  var sliced: js.UndefOr[Boolean] = js.undefined
  /**
    * The x value of the point. For datetime axes, the X value is the timestamp
    * in milliseconds since 1970.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y value of the point.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
}

object PointOptionsObject {
  @scala.inline
  def apply(
    events: PointEventsOptionsObject,
    marker: PointMarkerOptionsObject,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: Int | Double = null,
    dashStyle: DashStyleValue = null,
    dataLabels: DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject] = null,
    drilldown: String = null,
    id: String = null,
    labelrank: Int | Double = null,
    legendIndex: Int | Double = null,
    name: String = null,
    pointWidth: Int | Double = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    sliced: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): PointOptionsObject = {
    val __obj = js.Dynamic.literal(events = events, marker = marker)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelrank != null) __obj.updateDynamic("labelrank")(labelrank.asInstanceOf[js.Any])
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pointWidth != null) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(sliced)) __obj.updateDynamic("sliced")(sliced)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOptionsObject]
  }
}

