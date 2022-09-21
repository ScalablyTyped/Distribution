package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import typings.highcharts.highchartsStrings.auto
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts", "Axis")
@js.native
open class Axis protected () extends StObject {
  /**
    * Create a new axis object. Called internally when instanciating a new
    * chart or adding axes by Highcharts.Chart#addAxis.
    *
    * A chart can have from 0 axes (pie chart) to multiples. In a normal,
    * single series cartesian chart, there is one X axis and one Y axis.
    *
    * The X axis or axes are referenced by Highcharts.Chart.xAxis, which is an
    * array of Axis objects. If there is only one axis, it can be referenced
    * through `chart.xAxis[0]`, and multiple axes have increasing indices. The
    * same pattern goes for Y axes.
    *
    * If you need to get the axes from a series object, use the `series.xAxis`
    * and `series.yAxis` properties. These are not arrays, as one series can
    * only be associated to one X and one Y axis.
    *
    * A third way to reference the axis programmatically is by `id`. Add an
    * `id` in the axis configuration options, and get the axis by
    * Highcharts.Chart#get.
    *
    * Configuration options for the axes are given in options.xAxis and
    * options.yAxis.
    *
    * @param chart
    *        The Chart instance to apply the axis on.
    *
    * @param userOptions
    *        Axis options.
    */
  def this(chart: Chart_, userOptions: AxisOptions) = this()
  
  /**
    * Add a plot band after render time.
    *
    * @param options
    *        A configuration object for the plot band, as defined in
    *        xAxis.plotBands.
    *
    * @return The added plot band.
    */
  def addPlotBand(options: AxisPlotBandsOptions): js.UndefOr[PlotLineOrBand] = js.native
  
  /**
    * Add a plot line after render time.
    *
    * @param options
    *        A configuration object for the plot line, as defined in
    *        xAxis.plotLines.
    *
    * @return The added plot line.
    */
  def addPlotLine(options: AxisPlotLinesOptions): js.UndefOr[PlotLineOrBand] = js.native
  
  /**
    * Adds the title defined in axis.options.title.
    *
    * @param display
    *        Whether or not to display the title.
    */
  def addTitle(): Unit = js.native
  def addTitle(display: Boolean): Unit = js.native
  
  /**
    * (Highstock) Check the groupPixelWidth and apply the grouping if
    * needed. Fired only after processing the data.
    */
  def applyGrouping(): Unit = js.native
  
  /**
    * If categories are present for the axis, names are used instead of numbers
    * for that axis.
    *
    * Since Highcharts 3.0, categories can also be extracted by giving each
    * point a name and setting axis type to `category`. However, if you have
    * multiple series, best practice remains defining the `categories` array.
    */
  val categories: js.Array[String] = js.native
  
  /**
    * The Chart that the axis belongs to.
    */
  var chart: Chart_ = js.native
  
  /**
    * The collection where the axis belongs, for example `xAxis`, `yAxis` or
    * `colorAxis`. Corresponds to properties on Chart, for example Chart.xAxis.
    */
  var coll: String = js.native
  
  /**
    * The processed crosshair options.
    */
  var crosshair: Boolean | AxisCrosshairOptions = js.native
  
  /**
    * The default label formatter. The context is a special config object for
    * the label. In apps, use the labels.formatter instead, except when a
    * modification is needed.
    *
    * @param this
    *        Formatter context of axis label.
    *
    * @param ctx
    *        Formatter context of axis label.
    *
    * @return The formatted label content.
    */
  def defaultLabelFormatter(): String = js.native
  def defaultLabelFormatter(ctx: AxisLabelsFormatterContextObject): String = js.native
  
  /**
    * Internal function to draw a crosshair.
    *
    * @param e
    *        The event arguments from the modified pointer event, extended with
    *        `chartX` and `chartY`
    *
    * @param point
    *        The Point object if the crosshair snaps to points.
    *
    * @fires Highcharts.Axis#afterDrawCrosshair
    * @fires Highcharts.Axis#drawCrosshair
    */
  def drawCrosshair(): Unit = js.native
  def drawCrosshair(e: Unit, point: Point): Unit = js.native
  def drawCrosshair(e: PointerEventObject): Unit = js.native
  def drawCrosshair(e: PointerEventObject, point: Point): Unit = js.native
  
  /**
    * Drill down to a given category. This is the same as clicking on an
    * axis label. If multiple series with drilldown are present, all will
    * drill down to the given category.
    *
    * See also `Point.doDrilldown` for drilling down on a single point
    * instance.
    *
    * @param x
    *        The index of the category
    *
    * @param originalEvent
    *        The original event, used internally.
    */
  def drilldownCategory(x: Double): Unit = js.native
  def drilldownCategory(x: Double, originalEvent: MouseEvent): Unit = js.native
  
  /**
    * Get the current extremes for the axis.
    *
    * @return An object containing extremes information.
    */
  def getExtremes(): ExtremesObject = js.native
  
  /**
    * Internal function to get the path for the axis line. Extended for polar
    * charts.
    *
    * @param lineWidth
    *        The line width in pixels.
    *
    * @return The SVG path definition in array form.
    */
  def getLinePath(lineWidth: Double): SVGPathArray = js.native
  
  /**
    * Internal function to get the tick positions of a linear axis to round
    * values like whole tens or every five.
    *
    * @param tickInterval
    *        The normalized tick interval.
    *
    * @param min
    *        Axis minimum.
    *
    * @param max
    *        Axis maximum.
    *
    * @return An array of axis values where ticks should be placed.
    */
  def getLinearTickPositions(tickInterval: Double, min: Double, max: Double): js.Array[Double] = js.native
  
  /**
    * Resolve the new minorTicks/minorTickInterval options into the legacy
    * loosely typed minorTickInterval option.
    *
    * @return Legacy option
    */
  def getMinorTickInterval(): auto | Double | Null = js.native
  
  /**
    * Internal function to return the minor tick positions. For logarithmic
    * axes, the same logic as for major ticks is reused.
    *
    * @return An array of axis values where ticks should be placed.
    */
  def getMinorTickPositions(): js.Array[Double] = js.native
  
  /**
    * Internal function to create the SVG path definition for a plot band.
    *
    * @param from
    *        The axis value to start from.
    *
    * @param to
    *        The axis value to end on.
    *
    * @param options
    *        The plotBand or plotLine configuration object.
    *
    * @return The SVG path definition in array form.
    */
  def getPlotBandPath(from: Double, to: Double, options: AxisPlotBandsOptions): SVGPathArray = js.native
  def getPlotBandPath(from: Double, to: Double, options: AxisPlotLinesOptions): SVGPathArray = js.native
  
  /**
    * Create the path for a plot line that goes from the given value on this
    * axis, across the plot to the opposite side. Also used internally for grid
    * lines and crosshairs.
    *
    * @param options
    *        Options for the path.
    *
    * @return The SVG path definition for the plot line.
    */
  def getPlotLinePath(options: AxisPlotLinePathOptionsObject): SVGPathArray | Null = js.native
  
  /**
    * Get the zero plane either based on zero or on the min or max value. Used
    * in bar and area plots.
    *
    * @param threshold
    *        The threshold in axis values.
    *
    * @return The translated threshold position in terms of pixels, and
    *         corrected to stay within the axis bounds.
    */
  def getThreshold(threshold: Double): Double = js.native
  
  /**
    * Return true if the axis has associated data.
    *
    * @return True if the axis has associated visible series and those series
    *         have either valid data points or explicit `min` and `max`
    *         settings.
    */
  def hasData(): Boolean = js.native
  
  /**
    * Hide the crosshair if visible.
    */
  def hideCrosshair(): Unit = js.native
  
  /**
    * Whether the axis is horizontal.
    */
  var horiz: js.UndefOr[Boolean] = js.native
  
  /**
    * Overrideable function to initialize the axis.
    *
    * @param chart
    *        The Chart instance to apply the axis on.
    *
    * @param userOptions
    *        Axis options.
    *
    * @fires Highcharts.Axis#afterInit
    * @fires Highcharts.Axis#init
    */
  def init(chart: Chart_, userOptions: AxisOptions): Unit = js.native
  
  /**
    * Whether the axis is the x-axis.
    */
  var isXAxis: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum value of the axis. In a logarithmic axis, this is the
    * logarithm of the real value, and the real value can be obtained from
    * Axis#getExtremes.
    */
  var max: Double | Null = js.native
  
  /**
    * The minimum value of the axis. In a logarithmic axis, this is the
    * logarithm of the real value, and the real value can be obtained from
    * Axis#getExtremes.
    */
  var min: Double | Null = js.native
  
  /**
    * List of minor ticks mapped by position on the axis.
    */
  var minorTicks: Dictionary[Tick] = js.native
  
  /**
    * Current options for the axis after merge of defaults and user's options.
    */
  var options: AxisOptions = js.native
  
  /**
    * Remove the axis from the chart.
    *
    * @param redraw
    *        Whether to redraw the chart following the remove.
    */
  def remove(): Unit = js.native
  def remove(redraw: Boolean): Unit = js.native
  
  /**
    * Remove a plot band by its id.
    *
    * @param id
    *        The plot band's `id` as given in the original configuration object
    *        or in the `addPlotBand` option.
    */
  def removePlotBand(id: String): Unit = js.native
  
  /**
    * Remove a plot line by its id.
    *
    * @param id
    *        The plot line's `id` as given in the original configuration object
    *        or in the `addPlotLine` option.
    */
  def removePlotLine(id: String): Unit = js.native
  
  /**
    * Render the axis line. Called internally when rendering and redrawing the
    * axis.
    */
  def renderLine(): Unit = js.native
  
  /**
    * Render a minor tick into the given position. If a minor tick already
    * exists in this position, move it.
    *
    * @param pos
    *        The position in axis values.
    *
    * @param slideIn
    *        Whether the tick should animate in from last computed position
    */
  def renderMinorTick(pos: Double, slideIn: Boolean): Unit = js.native
  
  /**
    * Render a major tick into the given position. If a tick already exists in
    * this position, move it.
    *
    * @param pos
    *        The position in axis values.
    *
    * @param i
    *        The tick index.
    *
    * @param slideIn
    *        Whether the tick should animate in from last computed position
    */
  def renderTick(pos: Double, i: Double, slideIn: Boolean): Unit = js.native
  
  /**
    * Whether the axis is reversed. Based on the `axis.reversed`, option, but
    * inverted charts have reversed xAxis by default.
    */
  var reversed: Boolean = js.native
  
  /**
    * All series associated to the axis.
    */
  var series: js.Array[Series] = js.native
  
  /**
    * Set new axis categories and optionally redraw.
    *
    * @param categories
    *        The new categories.
    *
    * @param redraw
    *        Whether to redraw the chart.
    */
  def setCategories(categories: js.Array[String]): Unit = js.native
  def setCategories(categories: js.Array[String], redraw: Boolean): Unit = js.native
  
  /**
    * Highcharts Stock only. Set the compare mode on all series belonging
    * to a Y axis.
    *
    * @param compare
    *        The compare mode. Can be one of `undefined` (default), `null`,
    *        `"value"` or `"percent"`.
    *
    * @param redraw
    *        Whether to redraw the chart or to wait for a later call to
    *        Chart#redraw.
    */
  def setCompare(): Unit = js.native
  def setCompare(compare: String): Unit = js.native
  def setCompare(compare: String, redraw: Boolean): Unit = js.native
  def setCompare(compare: Null, redraw: Boolean): Unit = js.native
  def setCompare(compare: Unit, redraw: Boolean): Unit = js.native
  
  /**
    * Highcharts Stock only. Set the cumulative mode on all series
    * belonging to a Y axis.
    *
    * @param cumulative
    *        Whether to disable or enable the cumulative mode. Can be one
    *        of `undefined` (default, treated as `false`), `false` or
    *        `true`.
    *
    * @param redraw
    *        Whether to redraw the chart or to wait for a later call to
    *        Chart#redraw.
    */
  def setCumulative(): Unit = js.native
  def setCumulative(cumulative: Boolean): Unit = js.native
  def setCumulative(cumulative: Boolean, redraw: Boolean): Unit = js.native
  def setCumulative(cumulative: Unit, redraw: Boolean): Unit = js.native
  
  /**
    * (Highstock) Highcharts Stock only. Force data grouping on all the
    * axis' series.
    *
    * @param dataGrouping
    *        A `dataGrouping` configuration. Use `false` to disable data
    *        grouping dynamically.
    *
    * @param redraw
    *        Whether to redraw the chart or wait for a later call to
    *        Chart#redraw.
    */
  def setDataGrouping(): Unit = js.native
  def setDataGrouping(dataGrouping: Boolean): Unit = js.native
  def setDataGrouping(dataGrouping: Boolean, redraw: Boolean): Unit = js.native
  def setDataGrouping(dataGrouping: Unit, redraw: Boolean): Unit = js.native
  def setDataGrouping(dataGrouping: DataGroupingOptionsObject): Unit = js.native
  def setDataGrouping(dataGrouping: DataGroupingOptionsObject, redraw: Boolean): Unit = js.native
  
  /**
    * Set the minimum and maximum of the axes after render time. If the
    * `startOnTick` and `endOnTick` options are true, the minimum and maximum
    * values are rounded off to the nearest tick. To prevent this, these
    * options can be set to false before calling setExtremes. Also, setExtremes
    * will not allow a range lower than the `minRange` option, which by default
    * is the range of five points.
    *
    * @param newMin
    *        The new minimum value.
    *
    * @param newMax
    *        The new maximum value.
    *
    * @param redraw
    *        Whether to redraw the chart or wait for an explicit call to
    *        Highcharts.Chart#redraw
    *
    * @param animation
    *        Enable or modify animations.
    *
    * @param eventArguments
    *        Arguments to be accessed in event handler.
    *
    * @fires Highcharts.Axis#setExtremes
    */
  def setExtremes(): Unit = js.native
  def setExtremes(newMin: Double): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double, redraw: Boolean): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double, redraw: Boolean, animation: Boolean): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double, redraw: Boolean, animation: Boolean, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double, redraw: Boolean, animation: Unit, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def setExtremes(
    newMin: Double,
    newMax: Double,
    redraw: Boolean,
    animation: PartialAnimationOptionsOb,
    eventArguments: Any
  ): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double, redraw: Unit, animation: Boolean): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double, redraw: Unit, animation: Boolean, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double, redraw: Unit, animation: Unit, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Double, newMax: Double, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def setExtremes(
    newMin: Double,
    newMax: Double,
    redraw: Unit,
    animation: PartialAnimationOptionsOb,
    eventArguments: Any
  ): Unit = js.native
  def setExtremes(newMin: Double, newMax: Unit, redraw: Boolean): Unit = js.native
  def setExtremes(newMin: Double, newMax: Unit, redraw: Boolean, animation: Boolean): Unit = js.native
  def setExtremes(newMin: Double, newMax: Unit, redraw: Boolean, animation: Boolean, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Double, newMax: Unit, redraw: Boolean, animation: Unit, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Double, newMax: Unit, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def setExtremes(
    newMin: Double,
    newMax: Unit,
    redraw: Boolean,
    animation: PartialAnimationOptionsOb,
    eventArguments: Any
  ): Unit = js.native
  def setExtremes(newMin: Double, newMax: Unit, redraw: Unit, animation: Boolean): Unit = js.native
  def setExtremes(newMin: Double, newMax: Unit, redraw: Unit, animation: Boolean, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Double, newMax: Unit, redraw: Unit, animation: Unit, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Double, newMax: Unit, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def setExtremes(
    newMin: Double,
    newMax: Unit,
    redraw: Unit,
    animation: PartialAnimationOptionsOb,
    eventArguments: Any
  ): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double, redraw: Boolean): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double, redraw: Boolean, animation: Boolean): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double, redraw: Boolean, animation: Boolean, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double, redraw: Boolean, animation: Unit, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def setExtremes(
    newMin: Unit,
    newMax: Double,
    redraw: Boolean,
    animation: PartialAnimationOptionsOb,
    eventArguments: Any
  ): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double, redraw: Unit, animation: Boolean): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double, redraw: Unit, animation: Boolean, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double, redraw: Unit, animation: Unit, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Double, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def setExtremes(
    newMin: Unit,
    newMax: Double,
    redraw: Unit,
    animation: PartialAnimationOptionsOb,
    eventArguments: Any
  ): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Unit, redraw: Boolean): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Unit, redraw: Boolean, animation: Boolean): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Unit, redraw: Boolean, animation: Boolean, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Unit, redraw: Boolean, animation: Unit, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Unit, redraw: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def setExtremes(
    newMin: Unit,
    newMax: Unit,
    redraw: Boolean,
    animation: PartialAnimationOptionsOb,
    eventArguments: Any
  ): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Unit, redraw: Unit, animation: Boolean): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Unit, redraw: Unit, animation: Boolean, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Unit, redraw: Unit, animation: Unit, eventArguments: Any): Unit = js.native
  def setExtremes(newMin: Unit, newMax: Unit, redraw: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def setExtremes(
    newMin: Unit,
    newMax: Unit,
    redraw: Unit,
    animation: PartialAnimationOptionsOb,
    eventArguments: Any
  ): Unit = js.native
  
  /**
    * Update the axis title by options after render time.
    *
    * @param titleOptions
    *        The additional title options.
    *
    * @param redraw
    *        Whether to redraw the chart after setting the title.
    */
  def setTitle(titleOptions: AxisTitleOptions): Unit = js.native
  def setTitle(titleOptions: AxisTitleOptions, redraw: Boolean): Unit = js.native
  
  /**
    * The side on which the axis is rendered. 0 is top, 1 is right, 2 is bottom
    * and 3 is left.
    */
  var side: Double = js.native
  
  /**
    * Contains the current positions that are laid out on the axis. The
    * positions are numbers in terms of axis values. In a category axis they
    * are integers, in a datetime axis they are also integers, but designating
    * milliseconds.
    *
    * This property is read only - for modifying the tick positions, use the
    * `tickPositioner` callback or [axis.tickPositions(
    * https://api.highcharts.com/highcharts/xAxis.tickPositions) option
    * instead.
    */
  var tickPositions: js.UndefOr[AxisTickPositionsArray] = js.native
  
  /**
    * List of major ticks mapped by postition on axis.
    */
  var ticks: Dictionary[Tick] = js.native
  
  /**
    * Translate a value in terms of axis units into pixels within the chart.
    *
    * @param value
    *        A value in terms of axis units.
    *
    * @param paneCoordinates
    *        Whether to return the pixel coordinate relative to the chart or
    *        just the axis/pane itself.
    *
    * @return Pixel position of the value on the chart or axis.
    */
  def toPixels(value: Double, paneCoordinates: Boolean): Double = js.native
  
  /**
    * Translate a pixel position along the axis to a value in terms of axis
    * units.
    *
    * @param pixel
    *        The pixel value coordinate.
    *
    * @param paneCoordinates
    *        Whether the input pixel is relative to the chart or just the
    *        axis/pane itself.
    *
    * @return The axis value.
    */
  def toValue(pixel: Double): Double = js.native
  def toValue(pixel: Double, paneCoordinates: Boolean): Double = js.native
  
  /**
    * Update an axis object with a new set of options. The options are merged
    * with the existing options, so only new or altered options need to be
    * specified.
    *
    * @param options
    *        The new options that will be merged in with existing options on
    *        the axis.
    *
    * @param redraw
    *        Whether to redraw the chart after the axis is altered. If doing
    *        more operations on the chart, it is a good idea to set redraw to
    *        false and call Chart#redraw after.
    */
  def update(options: AxisOptions): Unit = js.native
  def update(options: AxisOptions, redraw: Boolean): Unit = js.native
  
  /**
    * User's options for this axis without defaults.
    */
  var userOptions: AxisOptions = js.native
}
