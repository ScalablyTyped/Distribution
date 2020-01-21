package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesXrangeDataOptions extends js.Object {
  var accessibility: js.UndefOr[SeriesXrangeDataAccessibilityOptions] = js.undefined
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
    * (Gantt) Connect to a point. This option can be either a string, referring
    * to the ID of another point, or an object, or an array of either. If the
    * option is an array, each element defines a connection.
    */
  var connect: js.UndefOr[
    String | SeriesXrangeDataConnectOptions | (js.Array[String | SeriesXrangeDataConnectOptions])
  ] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual data label for each point. The
    * options are the same as the ones for plotOptions.series.dataLabels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A description of the point to add to the
    * screen reader information about the point.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Point specific options for the
    * draggable-points module. Overrides options on `series.dragDrop`.
    */
  var dragDrop: js.UndefOr[SeriesXrangeDataDragDropOptions] = js.undefined
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Individual point events
    */
  var events: js.UndefOr[SeriesXrangeDataEventsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) An id for the point. This can be used
    * after render time to get a pointer to the point object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The rank for this point's data label in
    * case of collision. If two data labels are about to overlap, only the one
    * with the highest `labelrank` will be drawn.
    */
  var labelrank: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) Options for the point markers of line-like
    * series. Properties like `fillColor`, `lineColor` and `lineWidth` define
    * the visual appearance of the markers. Other series types, like column
    * series, don't have markers, but have visual options on the series level
    * instead.
    *
    * In styled mode, the markers can be styled with the `.highcharts-point`,
    * `.highcharts-point-hover` and `.highcharts-point-select` class names.
    */
  var marker: js.UndefOr[SeriesXrangeDataMarkerOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The name of the point as shown in the
    * legend, tooltip, dataLabels etc.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A partial fill for each point, typically
    * used to visualize how much of a task is performed. The partial fill
    * object can be set either on series or point level.
    */
  var partialFill: js.UndefOr[SeriesXrangeDataPartialFillOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether the data point is selected
    * initially.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The starting X value of the range point.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The ending X value of the range point.
    */
  var x2: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The Y value of the range point.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SeriesXrangeDataOptions {
  @scala.inline
  def apply(
    accessibility: SeriesXrangeDataAccessibilityOptions = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorIndex: Int | Double = null,
    connect: String | SeriesXrangeDataConnectOptions | (js.Array[String | SeriesXrangeDataConnectOptions]) = null,
    dataLabels: DataLabelsOptionsObject | js.Array[DataLabelsOptionsObject] = null,
    description: String = null,
    dragDrop: SeriesXrangeDataDragDropOptions = null,
    drilldown: String = null,
    events: SeriesXrangeDataEventsOptions = null,
    id: String = null,
    labelrank: Int | Double = null,
    marker: SeriesXrangeDataMarkerOptions = null,
    name: String = null,
    partialFill: SeriesXrangeDataPartialFillOptions = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    x2: Int | Double = null,
    y: Int | Double = null
  ): SeriesXrangeDataOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelrank != null) __obj.updateDynamic("labelrank")(labelrank.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (partialFill != null) __obj.updateDynamic("partialFill")(partialFill.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesXrangeDataOptions]
  }
}

