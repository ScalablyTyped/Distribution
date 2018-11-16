package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Point object is the JavaScript representation of each data point
     *
     * The object can be accessed in a number of ways. In all point event handlers the point object is this. In the series
     * object all the points are accessed by the series.data array.
     *
     * Another way to reference the point programmatically is by id. Add an id in the point configuration options, and get
     * the point object by chart.get(id).
     */
@js.native
trait PointObject extends js.Object {
  /**
           * For categorized axes this property holds the category name for the point. For other axis it holds the x value.
           * @since 1.2.0
           */
  var category: java.lang.String | scala.Double = js.native
  var index: scala.Double = js.native
  var name: java.lang.String = js.native
  /**
           * The percentage for points in a stacked series or pies.
           * @since 1.2.0
           */
  var percentage: scala.Double = js.native
  /**
           * Whether the point is selected or not.
           * @since 1.2.0
           */
  var selected: scala.Boolean = js.native
  /**
           * The series object associated with the point.
           * @since 1.2.0
           */
  var series: SeriesObject = js.native
  /**
           * The total of a stack for stacked series, or pie in pie charts.
           */
  var total: scala.Double = js.native
  /**
           * The x value for the point.
           * @since 1.2.0
           */
  var x: scala.Double = js.native
  /**
           * The y value for the point.
           * @since 1.2.0
           */
  var y: scala.Double = js.native
  /**
           * Remove the point from the series.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is removed.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation Defaults to true. When true, the graph's updating will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def remove(): scala.Unit = js.native
  /**
           * Remove the point from the series.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is removed.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation Defaults to true. When true, the graph's updating will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def remove(redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Remove the point from the series.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is removed.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation Defaults to true. When true, the graph's updating will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def remove(redraw: scala.Boolean, animation: Animation): scala.Unit = js.native
  /**
           * Remove the point from the series.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is removed.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation Defaults to true. When true, the graph's updating will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def remove(redraw: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  /**
           * Select or unselect the point.
           * @param [boolean] select When true, the point is selected. When false, the point is unselected. When null or undefined, the selection state is toggled.
           * @param [boolean] accumulate When true, the selection is added to other selected points. When false, other selected points are deselected.
           * Internally in Highcharts,selected points are accumulated on Control, Shift or Cmd clicking the point.
           * @since 1.2.0
           */
  def select(): scala.Unit = js.native
  /**
           * Select or unselect the point.
           * @param [boolean] select When true, the point is selected. When false, the point is unselected. When null or undefined, the selection state is toggled.
           * @param [boolean] accumulate When true, the selection is added to other selected points. When false, other selected points are deselected.
           * Internally in Highcharts,selected points are accumulated on Control, Shift or Cmd clicking the point.
           * @since 1.2.0
           */
  def select(select: scala.Boolean): scala.Unit = js.native
  /**
           * Select or unselect the point.
           * @param [boolean] select When true, the point is selected. When false, the point is unselected. When null or undefined, the selection state is toggled.
           * @param [boolean] accumulate When true, the selection is added to other selected points. When false, other selected points are deselected.
           * Internally in Highcharts,selected points are accumulated on Control, Shift or Cmd clicking the point.
           * @since 1.2.0
           */
  def select(select: scala.Boolean, accumulate: scala.Boolean): scala.Unit = js.native
  /**
           * Slice out or set back in a pie chart slice. This is the default way of Highcharts to visualize that a pie point
           * is selected.
           * @param [boolean] sliced When true, the point is sliced out. When false, the point is set in. When null or undefined, the sliced state is toggled.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is altered.
           * @param [boolean|Animation] animation Defaults to true. When true, the move will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def slice(): scala.Unit = js.native
  /**
           * Slice out or set back in a pie chart slice. This is the default way of Highcharts to visualize that a pie point
           * is selected.
           * @param [boolean] sliced When true, the point is sliced out. When false, the point is set in. When null or undefined, the sliced state is toggled.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is altered.
           * @param [boolean|Animation] animation Defaults to true. When true, the move will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def slice(sliced: scala.Boolean): scala.Unit = js.native
  /**
           * Slice out or set back in a pie chart slice. This is the default way of Highcharts to visualize that a pie point
           * is selected.
           * @param [boolean] sliced When true, the point is sliced out. When false, the point is set in. When null or undefined, the sliced state is toggled.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is altered.
           * @param [boolean|Animation] animation Defaults to true. When true, the move will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def slice(sliced: scala.Boolean, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Slice out or set back in a pie chart slice. This is the default way of Highcharts to visualize that a pie point
           * is selected.
           * @param [boolean] sliced When true, the point is sliced out. When false, the point is set in. When null or undefined, the sliced state is toggled.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is altered.
           * @param [boolean|Animation] animation Defaults to true. When true, the move will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def slice(sliced: scala.Boolean, redraw: scala.Boolean, animation: Animation): scala.Unit = js.native
  /**
           * Slice out or set back in a pie chart slice. This is the default way of Highcharts to visualize that a pie point
           * is selected.
           * @param [boolean] sliced When true, the point is sliced out. When false, the point is set in. When null or undefined, the sliced state is toggled.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is altered.
           * @param [boolean|Animation] animation Defaults to true. When true, the move will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def slice(sliced: scala.Boolean, redraw: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: DataPoint): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: DataPoint, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: DataPoint, redraw: scala.Boolean, animation: Animation): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: DataPoint, redraw: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: js.Tuple2[scala.Double, scala.Double], redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: js.Tuple2[scala.Double, scala.Double], redraw: scala.Boolean, animation: Animation): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: js.Tuple2[scala.Double, scala.Double], redraw: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: scala.Double): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: scala.Double, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: scala.Double, redraw: scala.Boolean, animation: Animation): scala.Unit = js.native
  /**
           * Update the point with new values.
           * @param options The point options. Point options are handled as described under the series<type>.data item for each series type.
           * For example for a line series, if options is a single number, the point will be given that number as the main y value. If it is an array,
           * it will be interpreted as x and y values respectively. If it is an object, advanced options are applied.
           * @param [boolean] redraw Defaults to true. Whether to redraw the chart after the point is updated.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def update(options: scala.Double, redraw: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
}

