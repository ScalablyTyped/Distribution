package typings.highcharts.highchartsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesBoxplotDataOptions
  extends /* key */ StringDictionary[js.Any] {
  var accessibility: js.UndefOr[SeriesBoxplotDataAccessibilityOptions] = js.undefined
  /**
    * (Highcharts, Gantt) An additional, individual class name for the data
    * point's graphic representation.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual color for the point. By default
    * the color is pulled from the global `colors` array.
    *
    * In styled mode, the `color` option doesn't take effect. Instead, use
    * `colorIndex`.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Gantt) A specific color index to use for the point, so its
    * graphic representations are given the class name `highcharts-color-{n}`.
    * In styled mode this will change the color of the graphic. In non-styled
    * mode, the color by is set by the `fill` attribute, so the change in class
    * name won't have a visual effect by default.
    */
  var colorIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual data label for each point. The
    * options are the same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]] = js.undefined
  /**
    * (Highcharts) A description of the point to add to the screen reader
    * information about the point. Requires the Accessibility module.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Point specific options for the draggable-points module.
    * Overrides options on `series.dragDrop`.
    *
    * Requires the `draggable-points` module.
    */
  var dragDrop: js.UndefOr[SeriesBoxplotDataDragDropOptions] = js.undefined
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual point events
    */
  var events: js.UndefOr[SeriesBoxplotDataEventsOptions] = js.undefined
  /**
    * (Highcharts) The `high` value for each data point, signifying the highest
    * value in the sample set. The top whisker is drawn here.
    */
  var high: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The rank for this point's data label in case of collision.
    * If two data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The `low` value for each data point, signifying the lowest
    * value in the sample set. The bottom whisker is drawn here.
    */
  var low: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The median for each data point. This is drawn as a line
    * through the middle area of the box.
    */
  var median: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The name of the point as shown in the legend, tooltip,
    * dataLabels etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) The lower quartile for each data point. This is the bottom
    * of the box.
    */
  var q1: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The higher quartile for each data point. This is the top of
    * the box.
    */
  var q3: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The x value of the point. For datetime axes, the
    * X value is the timestamp in milliseconds since 1970.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The y value of the point.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
}

object SeriesBoxplotDataOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    accessibility: SeriesBoxplotDataAccessibilityOptions = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: Int | Double = null,
    dataLabels: DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject] = null,
    description: String = null,
    dragDrop: SeriesBoxplotDataDragDropOptions = null,
    drilldown: String = null,
    events: SeriesBoxplotDataEventsOptions = null,
    high: Int | Double = null,
    id: String = null,
    labelrank: Int | Double = null,
    low: Int | Double = null,
    median: Int | Double = null,
    name: String = null,
    q1: Int | Double = null,
    q3: Int | Double = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): SeriesBoxplotDataOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop)
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown)
    if (events != null) __obj.updateDynamic("events")(events)
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelrank != null) __obj.updateDynamic("labelrank")(labelrank.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (q1 != null) __obj.updateDynamic("q1")(q1.asInstanceOf[js.Any])
    if (q3 != null) __obj.updateDynamic("q3")(q3.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesBoxplotDataOptions]
  }
}

