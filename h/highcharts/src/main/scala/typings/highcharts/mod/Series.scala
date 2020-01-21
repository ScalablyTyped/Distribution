package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "Series")
@js.native
class Series protected () extends js.Object {
  /**
    * This is the base series prototype that all other series types inherit
    * from. A new series is initialized either through the series option
    * structure, or after the chart is initialized, through
    * Highcharts.Chart#addSeries.
    *
    * The object can be accessed in a number of ways. All series and point
    * event handlers give a reference to the `series` object. The chart object
    * has a series property that is a collection of all the chart's series. The
    * point objects and axis objects also have the same reference.
    *
    * Another way to reference the series programmatically is by `id`. Add an
    * id in the series configuration options, and get the series object by
    * Highcharts.Chart#get.
    *
    * Configuration options for the series are given in three levels. Options
    * for all series in a chart are given in the plotOptions.series object.
    * Then options for all series of a specific type are given in the
    * plotOptions of that type, for example `plotOptions.line`. Next, options
    * for one single series are given in the series array, or as arguments to
    * `chart.addSeries`.
    *
    * The data in the series is stored in various arrays.
    *
    * - First, `series.options.data` contains all the original config options
    * for each point whether added by options or methods like
    * `series.addPoint`.
    *
    * - Next, `series.data` contains those values converted to points, but in
    * case the series data length exceeds the `cropThreshold`, or if the data
    * is grouped, `series.data` doesn't contain all the points. It only
    * contains the points that have been created on demand.
    *
    * - Then there's `series.points` that contains all currently visible point
    * objects. In case of cropping, the cropped-away points are not part of
    * this array. The `series.points` array starts at `series.cropStart`
    * compared to `series.data` and `series.options.data`. If however the
    * series data is grouped, these can't be correlated one to one.
    *
    * - `series.xData` and `series.processedXData` contain clean x values,
    * equivalent to `series.data` and `series.points`.
    *
    * - `series.yData` and `series.processedYData` contain clean y values,
    * equivalent to `series.data` and `series.points`.
    *
    * @param chart
    *        The chart instance.
    *
    * @param options
    *        The series options.
    */
  def this(chart: Chart_, options: js.Object) = this()
  def this(chart: Chart_, options: SeriesOptionsType) = this()
  /**
    * SVG element of area-based charts. Can be used for styling purposes. If
    * zones are configured, this element will be hidden and replaced by
    * multiple zone areas, accessible via `series['zone-area-x']` (where x is a
    * number, starting with 0).
    */
  var area: js.UndefOr[SVGElement] = js.native
  /**
    * Read only. The chart that the series belongs to.
    */
  var chart: Chart_ = js.native
  /**
    * Read only. An array containing those values converted to points. In case
    * the series data length exceeds the `cropThreshold`, or if the data is
    * grouped, `series.data` doesn't contain all the points. Also, in case a
    * series is hidden, the `data` array may be empty. To access raw values,
    * `series.options.data` will always be up to date. `Series.data` only
    * contains the points that have been created on demand. To modify the data,
    * use Highcharts.Series#setData or Highcharts.Point#update.
    */
  var data: js.Array[Point] = js.native
  /**
    * SVG element of line-based charts. Can be used for styling purposes. If
    * zones are configured, this element will be hidden and replaced by
    * multiple zone lines, accessible via `series['zone-graph-x']` (where x is
    * a number, starting with 0).
    */
  var graph: js.UndefOr[SVGElement] = js.native
  /**
    * The series name as given in the options. Defaults to "Series {n}".
    */
  var name: String = js.native
  /**
    * Read only. The series' current options. To update, use Series#update.
    */
  var options: SeriesOptionsType = js.native
  /**
    * An array containing all currently visible point objects. In case of
    * cropping, the cropped-away points are not part of this array. The
    * `series.points` array starts at `series.cropStart` compared to
    * `series.data` and `series.options.data`. If however the series data is
    * grouped, these can't be correlated one to one. To modify the data, use
    * Highcharts.Series#setData or Highcharts.Point#update.
    */
  var points: js.Array[Point] = js.native
  /**
    * Read only. The series' selected state as set by Highcharts.Series#select.
    */
  var selected: Boolean = js.native
  /**
    * Read only. The series' type, like "line", "area", "column" etc. The type
    * in the series options anc can be altered using Series#update.
    */
  var `type`: String = js.native
  /**
    * Read only. The series' visibility state as set by Series#show,
    * Series#hide, or in the initial configuration.
    */
  var visible: Boolean = js.native
  /**
    * Read only. The unique xAxis object associated with the series.
    */
  var xAxis: Axis = js.native
  /**
    * Read only. The unique yAxis object associated with the series.
    */
  var yAxis: Axis = js.native
  /**
    * Add a point to the series after render time. The point can be added at
    * the end, or by giving it an X value, to the start or in the middle of the
    * series.
    *
    * @param options
    *        The point options. If options is a single number, a point with
    *        that y value is appended to the series. If it is an array, it will
    *        be interpreted as x and y values respectively. If it is an object,
    *        advanced options as outlined under `series.data` are applied.
    *
    * @param redraw
    *        Whether to redraw the chart after the point is added. When adding
    *        more than one point, it is highly recommended that the redraw
    *        option be set to false, and instead Chart#redraw is explicitly
    *        called after the adding of points is finished. Otherwise, the
    *        chart will redraw after adding each point.
    *
    * @param shift
    *        If true, a point is shifted off the start of the series as one is
    *        appended to the end.
    *
    * @param animation
    *        Whether to apply animation, and optionally animation
    *        configuration.
    *
    * @param withEvent
    *        Used internally, whether to fire the series `addPoint` event.
    *
    * @fires Highcharts.Series#addPoint
    */
  def addPoint(options: PointOptionsType): Unit = js.native
  def addPoint(options: PointOptionsType, redraw: Boolean): Unit = js.native
  def addPoint(options: PointOptionsType, redraw: Boolean, shift: Boolean): Unit = js.native
  def addPoint(options: PointOptionsType, redraw: Boolean, shift: Boolean, animation: Boolean): Unit = js.native
  def addPoint(options: PointOptionsType, redraw: Boolean, shift: Boolean, animation: Boolean, withEvent: Boolean): Unit = js.native
  def addPoint(options: PointOptionsType, redraw: Boolean, shift: Boolean, animation: AnimationOptionsObject): Unit = js.native
  def addPoint(
    options: PointOptionsType,
    redraw: Boolean,
    shift: Boolean,
    animation: AnimationOptionsObject,
    withEvent: Boolean
  ): Unit = js.native
  /**
    * Animate in the series. Called internally twice. First with the `init`
    * parameter set to true, which sets up the initial state of the animation.
    * Then when ready, it is called with the `init` parameter undefined, in
    * order to perform the actual animation. After the second run, the function
    * is removed.
    *
    * @param init
    *        Initialize the animation.
    */
  def animate(): Unit = js.native
  def animate(init: Boolean): Unit = js.native
  /**
    * If implemented in the core, parts of this can probably be shared with
    * other similar methods in Highcharts.
    */
  def destroyGraphics(): Unit = js.native
  /**
    * Draw the graph. Called internally when rendering line-like series types.
    * The first time it generates the `series.graph` item and optionally other
    * series-wide items like `series.area` for area charts. On subsequent calls
    * these items are updated with new positions and attributes.
    */
  def drawGraph(): Unit = js.native
  /**
    * Draw the markers for line-like series types, and columns or other
    * graphical representation for Point objects for other series types. The
    * resulting element is typically stored as Point.graphic, and is created on
    * the first call and updated and moved on subsequent calls.
    */
  def drawPoints(): Unit = js.native
  /**
    * Enter boost mode and apply boost-specific properties.
    */
  def enterBoost(): Unit = js.native
  /**
    * Exit from boost mode and restore non-boost properties.
    */
  def exitBoost(): Unit = js.native
  /**
    * Return series name in "Series {Number}" format or the one defined by a
    * user. This method can be simply overridden as series name format can vary
    * (e.g. technical indicators).
    *
    * @return The series name.
    */
  def getName(): String = js.native
  /**
    * Get the translation and scale for the plot area of this series.
    */
  def getPlotBox(): SeriesPlotBoxObject = js.native
  /**
    * Return a full Point object based on the index. The boost module uses
    * stripped point objects for performance reasons.
    *
    * @param boostPoint
    *        A stripped-down point object
    *
    * @return A Point object as per
    *         http://api.highcharts.com/highcharts#Point
    */
  def getPoint(boostPoint: js.Object): Point = js.native
  def getPoint(boostPoint: Point): Point = js.native
  /**
    * Return the series points with null points filtered out.
    *
    * @param points
    *        The points to inspect, defaults to Series.points.
    *
    * @param insideOnly
    *        Whether to inspect only the points that are inside the visible
    *        view.
    *
    * @param allowNull
    *        Whether to allow null points to pass as valid points.
    *
    * @return The valid points.
    */
  def getValidPoints(): js.Array[Point] = js.native
  def getValidPoints(points: js.Array[Point]): js.Array[Point] = js.native
  def getValidPoints(points: js.Array[Point], insideOnly: Boolean): js.Array[Point] = js.native
  def getValidPoints(points: js.Array[Point], insideOnly: Boolean, allowNull: Boolean): js.Array[Point] = js.native
  /**
    * Hide the series if visible. If the chart.ignoreHiddenSeries option is
    * true, the chart is redrawn without this series.
    *
    * @fires Highcharts.Series#hide
    */
  def hide(): Unit = js.native
  /**
    * Get non-presentational attributes for a point. Used internally for both
    * styled mode and classic. Can be overridden for different series types.
    *
    * @param point
    *        The Point to inspect.
    *
    * @param state
    *        The state, can be either `hover`, `select` or undefined.
    *
    * @return A hash containing those attributes that are not settable from
    *         CSS.
    */
  def markerAttribs(point: Point): SVGAttributes = js.native
  def markerAttribs(point: Point, state: String): SVGAttributes = js.native
  /**
    * Runs on mouse out of the series graphical items.
    *
    * @fires Highcharts.Series#mouseOut
    */
  def onMouseOut(): Unit = js.native
  /**
    * Runs on mouse over the series graphical items.
    *
    * @fires Highcharts.Series#mouseOver
    */
  def onMouseOver(): Unit = js.native
  /**
    * Remove a series and optionally redraw the chart.
    *
    * @param redraw
    *        Whether to redraw the chart or wait for an explicit call to
    *        Highcharts.Chart#redraw.
    *
    * @param animation
    *        Whether to apply animation, and optionally animation
    *        configuration.
    *
    * @param withEvent
    *        Used internally, whether to fire the series `remove` event.
    *
    * @fires Highcharts.Series#remove
    */
  def remove(): Unit = js.native
  def remove(redraw: Boolean): Unit = js.native
  def remove(redraw: Boolean, animation: Boolean): Unit = js.native
  def remove(redraw: Boolean, animation: Boolean, withEvent: Boolean): Unit = js.native
  def remove(redraw: Boolean, animation: AnimationOptionsObject): Unit = js.native
  def remove(redraw: Boolean, animation: AnimationOptionsObject, withEvent: Boolean): Unit = js.native
  /**
    * Remove a point from the series. Unlike the Highcharts.Point#remove
    * method, this can also be done on a point that is not instanciated because
    * it is outside the view or subject to Highstock data grouping.
    *
    * @param i
    *        The index of the point in the data array.
    *
    * @param redraw
    *        Whether to redraw the chart after the point is added. When
    *        removing more than one point, it is highly recommended that the
    *        `redraw` option be set to `false`, and instead
    *        Highcharts.Chart#redraw is explicitly called after the adding of
    *        points is finished.
    *
    * @param animation
    *        Whether and optionally how the series should be animated.
    *
    * @fires Highcharts.Point#remove
    */
  def removePoint(i: Double): Unit = js.native
  def removePoint(i: Double, redraw: Boolean): Unit = js.native
  def removePoint(i: Double, redraw: Boolean, animation: Boolean): Unit = js.native
  def removePoint(i: Double, redraw: Boolean, animation: AnimationOptionsObject): Unit = js.native
  /**
    * Render the graph and markers. Called internally when first rendering and
    * later when redrawing the chart. This function can be extended in plugins,
    * but normally shouldn't be called directly.
    *
    * @fires Highcharts.Series#afterRender
    */
  def render(): Unit = js.native
  /**
    * Select or unselect the series. This means its selected property is set,
    * the checkbox in the legend is toggled and when selected, the series is
    * returned by the Highcharts.Chart#getSelectedSeries function.
    *
    * @param selected
    *        True to select the series, false to unselect. If undefined, the
    *        selection state is toggled.
    *
    * @fires Highcharts.Series#select
    * @fires Highcharts.Series#unselect
    */
  def select(): Unit = js.native
  def select(selected: Boolean): Unit = js.native
  /**
    * Highstock only. Set the compare mode of the series after render time.
    * In most cases it is more useful running Axis#setCompare on the X axis
    * to update all its series.
    *
    * @param compare
    *        Can be one of `null` (default), `"percent"` or `"value"`.
    */
  def setCompare(): Unit = js.native
  def setCompare(compare: String): Unit = js.native
  /**
    * Apply a new set of data to the series and optionally redraw it. The new
    * data array is passed by reference (except in case of `updatePoints`), and
    * may later be mutated when updating the chart data.
    *
    * Note the difference in behaviour when setting the same amount of points,
    * or a different amount of points, as handled by the `updatePoints`
    * parameter.
    *
    * @param data
    *        Takes an array of data in the same format as described under
    *        `series.{type}.data` for the given series type, for example a line
    *        series would take data in the form described under
    *        series.line.data.
    *
    * @param redraw
    *        Whether to redraw the chart after the series is altered. If doing
    *        more operations on the chart, it is a good idea to set redraw to
    *        false and call Chart#redraw after.
    *
    * @param animation
    *        When the updated data is the same length as the existing data,
    *        points will be updated by default, and animation visualizes how
    *        the points are changed. Set false to disable animation, or a
    *        configuration object to set duration or easing.
    *
    * @param updatePoints
    *        When this is true, points will be updated instead of replaced
    *        whenever possible. This occurs a) when the updated data is the
    *        same length as the existing data, b) when points are matched by
    *        their id's, or c) when points can be matched by X values. This
    *        allows updating with animation and performs better. In this case,
    *        the original array is not passed by reference. Set `false` to
    *        prevent.
    */
  def setData(data: js.Array[PointOptionsType]): Unit = js.native
  def setData(data: js.Array[PointOptionsType], redraw: Boolean): Unit = js.native
  def setData(data: js.Array[PointOptionsType], redraw: Boolean, animation: Boolean): Unit = js.native
  def setData(data: js.Array[PointOptionsType], redraw: Boolean, animation: Boolean, updatePoints: Boolean): Unit = js.native
  def setData(data: js.Array[PointOptionsType], redraw: Boolean, animation: AnimationOptionsObject): Unit = js.native
  def setData(
    data: js.Array[PointOptionsType],
    redraw: Boolean,
    animation: AnimationOptionsObject,
    updatePoints: Boolean
  ): Unit = js.native
  /**
    * Set the state of the series. Called internally on mouse interaction
    * operations, but it can also be called directly to visually highlight a
    * series.
    *
    * @param state
    *        Can be either `hover` or undefined to set to normal state.
    *
    * @param inherit
    *        Determines if state should be inherited by points too.
    */
  def setState(): Unit = js.native
  def setState(state: String): Unit = js.native
  def setState(state: String, inherit: Boolean): Unit = js.native
  /**
    * Show or hide the series.
    *
    * @param visible
    *        True to show the series, false to hide. If undefined, the
    *        visibility is toggled.
    *
    * @param redraw
    *        Whether to redraw the chart after the series is altered. If doing
    *        more operations on the chart, it is a good idea to set redraw to
    *        false and call chart.redraw() after.
    *
    * @fires Highcharts.Series#hide
    * @fires Highcharts.Series#show
    */
  def setVisible(): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setVisible(visible: Boolean, redraw: Boolean): Unit = js.native
  /**
    * Show the series if hidden.
    *
    * @fires Highcharts.Series#show
    */
  def show(): Unit = js.native
  /**
    * Sonify a series.
    *
    * @param options
    *        The options for sonifying this series.
    */
  def sonify(options: typings.highcharts.sonificationMod.highchartsAugmentingMod.SonifySeriesOptionsObject): Unit = js.native
  /**
    * Translate data points from raw data values to chart specific positioning
    * data needed later in the `drawPoints` and `drawGraph` functions. This
    * function can be overridden in plugins and custom series type
    * implementations.
    *
    * @fires Highcharts.Series#events:translate
    */
  def translate(): Unit = js.native
  /**
    * Update the series with a new set of options. For a clean and precise
    * handling of new options, all methods and elements from the series are
    * removed, and it is initialized from scratch. Therefore, this method is
    * more performance expensive than some other utility methods like
    * Series#setData or Series#setVisible.
    *
    * Note that `Series.update` may mutate the passed `data` options.
    *
    * @param options
    *        New options that will be merged with the series' existing options.
    *
    * @param redraw
    *        Whether to redraw the chart after the series is altered. If doing
    *        more operations on the chart, it is a good idea to set redraw to
    *        false and call Chart#redraw after.
    *
    * @fires Highcharts.Series#update
    * @fires Highcharts.Series#afterUpdate
    */
  def update(options: SeriesOptionsType): Unit = js.native
  def update(options: SeriesOptionsType, redraw: Boolean): Unit = js.native
}

