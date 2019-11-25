package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesGanttDataOptions extends js.Object {
  var accessibility: js.UndefOr[SeriesGanttDataAccessibilityOptions] = js.undefined
  /**
    * (Gantt) Whether the grid node belonging to this point should start as
    * collapsed. Used in axes of type treegrid.
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) Progress indicator, how much of the task completed. If it is a
    * number, the `fill` will be applied automatically.
    */
  var completed: js.UndefOr[Double | SeriesGanttDataCompletedOptions] = js.undefined
  /**
    * (Gantt) The ID of the point (task) that this point depends on in Gantt
    * charts. Aliases connect. Can also be an object, specifying further
    * connecting options between the points. Multiple connections can be
    * specified by providing an array.
    */
  var dependency: js.UndefOr[
    String | SeriesGanttDataDependencyOptions | (js.Array[String | SeriesGanttDataDependencyOptions])
  ] = js.undefined
  /**
    * (Gantt) A description of the point to add to the screen reader
    * information about the point.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) Point specific options for the draggable-points module. Overrides
    * options on `series.dragDrop`.
    */
  var dragDrop: js.UndefOr[SeriesGanttDataDragDropOptions] = js.undefined
  /**
    * (Highcharts) The `id` of a series in the drilldown.series array to use
    * for a drilldown for this point.
    */
  var drilldown: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) The end time of a task.
    */
  var end: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) The rank for this point's data label in case of collision. If two
    * data labels are about to overlap, only the one with the highest
    * `labelrank` will be drawn.
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
  var marker: js.UndefOr[SeriesGanttDataMarkerOptions] = js.undefined
  /**
    * (Gantt) Whether this point is a milestone. If so, only the `start` option
    * is handled, while `end` is ignored.
    */
  var milestone: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) The name of a task. If a `treegrid` y-axis is used (default in
    * Gantt charts), this will be picked up automatically, and used to
    * calculate the y-value.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) The ID of the parent point (task) of this point in Gantt charts.
    */
  var parent: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) The start time of a task.
    */
  var start: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) The Y value of a task.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SeriesGanttDataOptions {
  @scala.inline
  def apply(
    accessibility: SeriesGanttDataAccessibilityOptions = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    completed: Double | SeriesGanttDataCompletedOptions = null,
    dependency: String | SeriesGanttDataDependencyOptions | (js.Array[String | SeriesGanttDataDependencyOptions]) = null,
    description: String = null,
    dragDrop: SeriesGanttDataDragDropOptions = null,
    drilldown: String = null,
    end: Int | Double = null,
    labelrank: Int | Double = null,
    marker: SeriesGanttDataMarkerOptions = null,
    milestone: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    parent: String = null,
    start: Int | Double = null,
    y: Int | Double = null
  ): SeriesGanttDataOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (dependency != null) __obj.updateDynamic("dependency")(dependency.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dragDrop != null) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (labelrank != null) __obj.updateDynamic("labelrank")(labelrank.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(milestone)) __obj.updateDynamic("milestone")(milestone.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesGanttDataOptions]
  }
}

