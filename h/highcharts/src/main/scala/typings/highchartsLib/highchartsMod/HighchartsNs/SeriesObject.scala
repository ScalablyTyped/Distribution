package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Series object is the JavaScript representation of each line, area series, pie etc.
     *
     * The object can be accessed in a number of ways. All series and point event handlers give a reference to the series
     * object. The chart object has a series property that is a collection of all the chart's series. The point objects also
     * have the same reference.
     *
     * Another way to reference the series programmatically is by id. Add an id in the series configuration options, and get
     * the series object by chart.get(id).
     *
     * Configuration options for the series are given in three levels. Options for all series in a chart are given in the
     * plotOptions.series object. Then options for all series of a specific type are given in the plotOptions of that type,
     * for example plotOptions.line. Next, options for one single series are given in the series array.
     */
@js.native
trait SeriesObject extends js.Object {
  /**
           * Read only. The chart that the series belongs to.
           * @since 1.2.0
           */
  var chart: ChartObject = js.native
  /**
           * Read only. An array with the series' data point objects.
           * @since 1.2.0
           */
  var data: js.Array[PointObject] = js.native
  /**
           * The series' name as given in the options.
           * @since 1.2.0
           */
  var name: java.lang.String = js.native
  /**
           * Read only. The series' options.
           * @since 1.2.0
           */
  var options: IndividualSeriesOptions = js.native
  /**
           * Read only. The series' selected state as set by series.select().
           * @since 1.2.0
           */
  var selected: scala.Boolean = js.native
  /**
           * Read only. The series' type, like 'line', 'area' etc.
           * @since 1.2.0
           */
  var `type`: java.lang.String = js.native
  /**
           * Read only. The series' visibility state as set by series.show(), series.hide(), or the initial configuration.
           * @since 1.2.0
           */
  var visible: scala.Boolean = js.native
  /**
           * Read only. The unique xAxis object associated with the series.
           * @since 1.2.0
           */
  var xAxis: AxisObject = js.native
  /**
           * Read only. The unique yAxis object associated with the series.
           * @since 1.2.0
           */
  var yAxis: AxisObject = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: DataPoint): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: DataPoint, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: DataPoint, redraw: scala.Boolean, shift: scala.Boolean): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: DataPoint, redraw: scala.Boolean, shift: scala.Boolean, animation: Animation): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: DataPoint, redraw: scala.Boolean, shift: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: js.Tuple2[scala.Double, scala.Double], redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: js.Tuple2[scala.Double, scala.Double], redraw: scala.Boolean, shift: scala.Boolean): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(
    options: js.Tuple2[scala.Double, scala.Double],
    redraw: scala.Boolean,
    shift: scala.Boolean,
    animation: Animation
  ): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(
    options: js.Tuple2[scala.Double, scala.Double],
    redraw: scala.Boolean,
    shift: scala.Boolean,
    animation: scala.Boolean
  ): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: scala.Double): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: scala.Double, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: scala.Double, redraw: scala.Boolean, shift: scala.Boolean): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: scala.Double, redraw: scala.Boolean, shift: scala.Boolean, animation: Animation): scala.Unit = js.native
  /**
           * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to
           * the start or in the middle of the series.
           * @param The point options. If options is a single number, a point with that y value is appended to the series.
           * If it is an array, it will be interpreted as x and y values respectively. If it is an object, advanced options as outlined under series.data are applied.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean=false] shift - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @param [(boolean|Animation)=false] animation - When shift is true, one point is shifted off the start of the series as one is appended to the end.
           * Use this option for live charts monitoring a value over time.
           * @since 1.2.0
           */
  def addPoint(options: scala.Double, redraw: scala.Boolean, shift: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  /**
           * Hides the series if visible. If the chart.ignoreHiddenSeries option is true,the chart is redrawn without this
           * series.
           * @since 1.2.0
           */
  def hide(): scala.Unit = js.native
  /**
           * Remove the series from the chart.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is removed.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @since 1.2.0
           */
  def remove(): scala.Unit = js.native
  /**
           * Remove the series from the chart.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is removed.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @since 1.2.0
           */
  def remove(redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Remove a point from the series. Unlike the Point.remove method, this can also be done on a point that is not
           * instanciated because it is outside the view or subject to data grouping.
           * @param index - The index of the point in the data array.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean|Animation=true] animation - When true, the graph will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 4.1.0
           */
  def removePoint(index: scala.Double): scala.Unit = js.native
  /**
           * Remove a point from the series. Unlike the Point.remove method, this can also be done on a point that is not
           * instanciated because it is outside the view or subject to data grouping.
           * @param index - The index of the point in the data array.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean|Animation=true] animation - When true, the graph will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 4.1.0
           */
  def removePoint(index: scala.Double, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Remove a point from the series. Unlike the Point.remove method, this can also be done on a point that is not
           * instanciated because it is outside the view or subject to data grouping.
           * @param index - The index of the point in the data array.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean|Animation=true] animation - When true, the graph will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 4.1.0
           */
  def removePoint(index: scala.Double, redraw: scala.Boolean, animation: Animation): scala.Unit = js.native
  /**
           * Remove a point from the series. Unlike the Point.remove method, this can also be done on a point that is not
           * instanciated because it is outside the view or subject to data grouping.
           * @param index - The index of the point in the data array.
           * @param [boolean=true] redraw - Whether to redraw the chart after the point is added. When adding more than one point,
           * it is highly recommended that the redraw option be set to false, and instead chart.redraw() is explicitly called after the adding of points is finished.
           * @param [boolean|Animation=true] animation - When true, the graph will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 4.1.0
           */
  def removePoint(index: scala.Double, redraw: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  /**
           * Select or unselect the series. This means its selected property is set,the checkbox in the legend is toggled and
           * when selected, the series is returned in the chart.getSelectedSeries() method.
           * @param [boolean] selected - When true, the series is selected. When false it is unselected. When null or undefined, the series' selection state is toggled.
           * @since 1.2.0
           */
  def select(): scala.Unit = js.native
  /**
           * Select or unselect the series. This means its selected property is set,the checkbox in the legend is toggled and
           * when selected, the series is returned in the chart.getSelectedSeries() method.
           * @param [boolean] selected - When true, the series is selected. When false it is unselected. When null or undefined, the series' selection state is toggled.
           * @since 1.2.0
           */
  def select(selected: scala.Boolean): scala.Unit = js.native
  /**
           * Apply a new set of data to the series and optionally redraw it. Note that this method throws away all points and
           * creates new ones. For updating the values of existing points, use Point.update() instead.
           * @param data - Takes an array of data in the same format as described under series<type>data for the given series type.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is altered.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation - When the updated data is the same length as the existing data, points will be updated by default,
           * and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
           * @param [boolean] updatePoints - When the updated data is the same length as the existing data, points will be updated instead of replace.
           * This option prevents this, and makes setData behave like it did prior to Highcharts 3.0.10.
           * @since 1.2.0
           */
  def setData(data: js.Array[DataPoint | scala.Double | js.Array[scala.Double]]): scala.Unit = js.native
  /**
           * Apply a new set of data to the series and optionally redraw it. Note that this method throws away all points and
           * creates new ones. For updating the values of existing points, use Point.update() instead.
           * @param data - Takes an array of data in the same format as described under series<type>data for the given series type.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is altered.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation - When the updated data is the same length as the existing data, points will be updated by default,
           * and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
           * @param [boolean] updatePoints - When the updated data is the same length as the existing data, points will be updated instead of replace.
           * This option prevents this, and makes setData behave like it did prior to Highcharts 3.0.10.
           * @since 1.2.0
           */
  def setData(data: js.Array[DataPoint | scala.Double | js.Array[scala.Double]], redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Apply a new set of data to the series and optionally redraw it. Note that this method throws away all points and
           * creates new ones. For updating the values of existing points, use Point.update() instead.
           * @param data - Takes an array of data in the same format as described under series<type>data for the given series type.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is altered.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation - When the updated data is the same length as the existing data, points will be updated by default,
           * and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
           * @param [boolean] updatePoints - When the updated data is the same length as the existing data, points will be updated instead of replace.
           * This option prevents this, and makes setData behave like it did prior to Highcharts 3.0.10.
           * @since 1.2.0
           */
  def setData(
    data: js.Array[DataPoint | scala.Double | js.Array[scala.Double]],
    redraw: scala.Boolean,
    animation: Animation
  ): scala.Unit = js.native
  /**
           * Apply a new set of data to the series and optionally redraw it. Note that this method throws away all points and
           * creates new ones. For updating the values of existing points, use Point.update() instead.
           * @param data - Takes an array of data in the same format as described under series<type>data for the given series type.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is altered.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation - When the updated data is the same length as the existing data, points will be updated by default,
           * and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
           * @param [boolean] updatePoints - When the updated data is the same length as the existing data, points will be updated instead of replace.
           * This option prevents this, and makes setData behave like it did prior to Highcharts 3.0.10.
           * @since 1.2.0
           */
  def setData(
    data: js.Array[DataPoint | scala.Double | js.Array[scala.Double]],
    redraw: scala.Boolean,
    animation: Animation,
    updatePoints: scala.Boolean
  ): scala.Unit = js.native
  /**
           * Apply a new set of data to the series and optionally redraw it. Note that this method throws away all points and
           * creates new ones. For updating the values of existing points, use Point.update() instead.
           * @param data - Takes an array of data in the same format as described under series<type>data for the given series type.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is altered.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation - When the updated data is the same length as the existing data, points will be updated by default,
           * and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
           * @param [boolean] updatePoints - When the updated data is the same length as the existing data, points will be updated instead of replace.
           * This option prevents this, and makes setData behave like it did prior to Highcharts 3.0.10.
           * @since 1.2.0
           */
  def setData(
    data: js.Array[DataPoint | scala.Double | js.Array[scala.Double]],
    redraw: scala.Boolean,
    animation: scala.Boolean
  ): scala.Unit = js.native
  /**
           * Apply a new set of data to the series and optionally redraw it. Note that this method throws away all points and
           * creates new ones. For updating the values of existing points, use Point.update() instead.
           * @param data - Takes an array of data in the same format as described under series<type>data for the given series type.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is altered.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @param [boolean|Animation] animation - When the updated data is the same length as the existing data, points will be updated by default,
           * and animation visualizes how the points are changed. Set false to disable animation, or a configuration object to set duration or easing.
           * @param [boolean] updatePoints - When the updated data is the same length as the existing data, points will be updated instead of replace.
           * This option prevents this, and makes setData behave like it did prior to Highcharts 3.0.10.
           * @since 1.2.0
           */
  def setData(
    data: js.Array[DataPoint | scala.Double | js.Array[scala.Double]],
    redraw: scala.Boolean,
    animation: scala.Boolean,
    updatePoints: scala.Boolean
  ): scala.Unit = js.native
  /**
           * A utility function to show or hide the series with an optional redraw.
           * @param [boolean] visible - Whether to show or hide the series. If undefined, the visibility is toggled.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is altered.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @since 1.2.0
           */
  def setVisible(): scala.Unit = js.native
  /**
           * A utility function to show or hide the series with an optional redraw.
           * @param [boolean] visible - Whether to show or hide the series. If undefined, the visibility is toggled.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is altered.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @since 1.2.0
           */
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  /**
           * A utility function to show or hide the series with an optional redraw.
           * @param [boolean] visible - Whether to show or hide the series. If undefined, the visibility is toggled.
           * @param [boolean=true] redraw - Whether to redraw the chart after the series is altered.If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @since 1.2.0
           */
  def setVisible(visible: scala.Boolean, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Shows the series if hidden.
           * @since 1.2.0
           */
  def show(): scala.Unit = js.native
  /**
           * Update the series with a new set of options. For a clean and precise handling of new options, all methods and
           * elements from the series is removed, and it is initiated from scratch. Therefore, this method is more performance
           * expensive than some other utility methods like setData or setVisible.
           * @param options New options that will be merged into the series' existing options.
           * @param [boolean] redraw - Whether to redraw the chart after the series is altered. If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @since 1.2.0
           */
  def update(options: IndividualSeriesOptions): scala.Unit = js.native
  /**
           * Update the series with a new set of options. For a clean and precise handling of new options, all methods and
           * elements from the series is removed, and it is initiated from scratch. Therefore, this method is more performance
           * expensive than some other utility methods like setData or setVisible.
           * @param options New options that will be merged into the series' existing options.
           * @param [boolean] redraw - Whether to redraw the chart after the series is altered. If doing more operations on the chart,
           * it is a good idea to set redraw to false and call chart.redraw() after.
           * @since 1.2.0
           */
  def update(options: IndividualSeriesOptions, redraw: scala.Boolean): scala.Unit = js.native
}

