package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import typings.highcharts.boostMod.highchartsAugmentingMod.Chart
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts", "Chart")
@js.native
class Chart_ protected () extends StObject {
  /**
    * The Chart class. The recommended constructor is Highcharts#chart.
    *
    * @param options
    *        The chart options structure.
    *
    * @param callback
    *        Function to run when the chart has loaded and and all external
    *        images are loaded. Defining a chart.events.load handler is
    *        equivalent.
    */
  def this(options: Options) = this()
  def this(options: Options, callback: ChartCallbackFunction) = this()
  /**
    * The Chart class. The recommended constructor is Highcharts#chart.
    *
    * @param renderTo
    *        The DOM element to render to, or its id.
    *
    * @param options
    *        The chart options structure.
    *
    * @param callback
    *        Function to run when the chart has loaded and and all external
    *        images are loaded. Defining a chart.events.load handler is
    *        equivalent.
    */
  def this(renderTo: String, options: Options) = this()
  def this(renderTo: HTMLDOMElement, options: Options) = this()
  def this(renderTo: String, options: Options, callback: ChartCallbackFunction) = this()
  def this(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction) = this()
  
  /**
    * Add an annotation to the chart after render time.
    *
    * @param options
    *        The annotation options for the new, detailed annotation.
    *
    * @return - The newly generated annotation.
    */
  def addAnnotation(options: AnnotationsOptions): Annotation = js.native
  def addAnnotation(options: AnnotationsOptions, redraw: Boolean): Annotation = js.native
  
  /**
    * Add an axis to the chart after render time. Note that this method should
    * never be used when adding data synchronously at chart render time, as it
    * adds expense to the calculations and rendering. When adding data at the
    * same time as the chart is initialized, add the axis as a configuration
    * option instead.
    *
    * @param options
    *        The axis options.
    *
    * @param isX
    *        Whether it is an X axis or a value axis.
    *
    * @param redraw
    *        Whether to redraw the chart after adding.
    *
    * @param animation
    *        Whether and how to apply animation in the redraw.
    *
    * @return The newly generated Axis object.
    */
  def addAxis(options: AxisOptions): Axis = js.native
  def addAxis(options: AxisOptions, isX: Boolean): Axis = js.native
  def addAxis(options: AxisOptions, isX: Boolean, redraw: Boolean): Axis = js.native
  def addAxis(options: AxisOptions, isX: Boolean, redraw: Boolean, animation: Boolean): Axis = js.native
  def addAxis(options: AxisOptions, isX: Boolean, redraw: Boolean, animation: PartialAnimationOptionsOb): Axis = js.native
  def addAxis(options: AxisOptions, isX: Boolean, redraw: Unit, animation: Boolean): Axis = js.native
  def addAxis(options: AxisOptions, isX: Boolean, redraw: Unit, animation: PartialAnimationOptionsOb): Axis = js.native
  def addAxis(options: AxisOptions, isX: Unit, redraw: Boolean): Axis = js.native
  def addAxis(options: AxisOptions, isX: Unit, redraw: Boolean, animation: Boolean): Axis = js.native
  def addAxis(options: AxisOptions, isX: Unit, redraw: Boolean, animation: PartialAnimationOptionsOb): Axis = js.native
  def addAxis(options: AxisOptions, isX: Unit, redraw: Unit, animation: Boolean): Axis = js.native
  def addAxis(options: AxisOptions, isX: Unit, redraw: Unit, animation: PartialAnimationOptionsOb): Axis = js.native
  
  /**
    * Add a color axis to the chart after render time. Note that this method
    * should never be used when adding data synchronously at chart render time,
    * as it adds expense to the calculations and rendering. When adding data at
    * the same time as the chart is initialized, add the axis as a
    * configuration option instead.
    *
    * @param options
    *        The axis options.
    *
    * @param redraw
    *        Whether to redraw the chart after adding.
    *
    * @param animation
    *        Whether and how to apply animation in the redraw.
    *
    * @return The newly generated Axis object.
    */
  def addColorAxis(options: ColorAxisOptions): ColorAxis = js.native
  def addColorAxis(options: ColorAxisOptions, redraw: Boolean): ColorAxis = js.native
  def addColorAxis(options: ColorAxisOptions, redraw: Boolean, animation: Boolean): ColorAxis = js.native
  def addColorAxis(options: ColorAxisOptions, redraw: Boolean, animation: PartialAnimationOptionsOb): ColorAxis = js.native
  def addColorAxis(options: ColorAxisOptions, redraw: Unit, animation: Boolean): ColorAxis = js.native
  def addColorAxis(options: ColorAxisOptions, redraw: Unit, animation: PartialAnimationOptionsOb): ColorAxis = js.native
  
  /**
    * Set a new credits label for the chart.
    *
    * @param credits
    *        A configuration object for the new credits.
    */
  def addCredits(): Unit = js.native
  def addCredits(credits: CreditsOptions): Unit = js.native
  
  /**
    * Add a series to the chart after render time. Note that this method should
    * never be used when adding data synchronously at chart render time, as it
    * adds expense to the calculations and rendering. When adding data at the
    * same time as the chart is initialized, add the series as a configuration
    * option instead. With multiple axes, the `offset` is dynamically adjusted.
    *
    * @param options
    *        The config options for the series.
    *
    * @param redraw
    *        Whether to redraw the chart after adding.
    *
    * @param animation
    *        Whether to apply animation, and optionally animation
    *        configuration.
    *
    * @return The newly created series object.
    *
    * @fires Highcharts.Chart#addSeries
    * @fires Highcharts.Chart#afterAddSeries
    */
  def addSeries(options: SeriesOptionsType): Series = js.native
  def addSeries(options: SeriesOptionsType, redraw: Boolean): Series = js.native
  def addSeries(options: SeriesOptionsType, redraw: Boolean, animation: Boolean): Series = js.native
  def addSeries(options: SeriesOptionsType, redraw: Boolean, animation: PartialAnimationOptionsOb): Series = js.native
  def addSeries(options: SeriesOptionsType, redraw: Unit, animation: Boolean): Series = js.native
  def addSeries(options: SeriesOptionsType, redraw: Unit, animation: PartialAnimationOptionsOb): Series = js.native
  
  /**
    * Add a series to the chart as drilldown from a specific point in the
    * parent series. This method is used for async drilldown, when clicking
    * a point in a series should result in loading and displaying a more
    * high-resolution series. When not async, the setup is simpler using
    * the drilldown.series options structure.
    *
    * @param point
    *        The point from which the drilldown will start.
    *
    * @param options
    *        The series options for the new, detailed series.
    */
  def addSeriesAsDrilldown(point: Point, options: SeriesOptionsType): Unit = js.native
  
  /**
    * All the axes in the chart.
    */
  var axes: js.Array[Axis] = js.native
  
  /**
    * Cancel current sonification and reset cursor.
    *
    * @param fadeOut
    *        Fade out as we pause to avoid clicks.
    */
  def cancelSonify(): Unit = js.native
  def cancelSonify(fadeOut: Boolean): Unit = js.native
  
  /**
    * The current pixel height of the chart.
    */
  var chartHeight: Double = js.native
  
  /**
    * The current pixel width of the chart.
    */
  var chartWidth: Double = js.native
  
  /**
    * These collections (arrays) implement update() methods with support for
    * one-to-one option.
    */
  var collectionsWithUpdate: js.Any = js.native
  
  /**
    * The containing HTML element of the chart. The container is dynamically
    * inserted into the element given as the `renderTo` parameter in the
    * Highcharts#chart constructor.
    */
  var container: HTMLDOMElement = js.native
  
  /**
    * The chart's credits label. The label has an `update` method that allows
    * setting new options as per the credits options set.
    */
  var credits: SVGElement = js.native
  
  /**
    * The data parser for this chart.
    */
  var data: js.UndefOr[typings.highcharts.dataMod.highchartsAugmentingMod.Data] = js.native
  
  /**
    * Remove the chart and purge memory. This method is called internally
    * before adding a second chart into the same container, as well as on
    * window unload to prevent leaks.
    *
    * @fires Highcharts.Chart#destroy
    */
  def destroy(): Unit = js.native
  
  /**
    * Dismiss popup content in chart, including export menu and tooltip.
    */
  def dismissPopupContent(): Unit = js.native
  
  /**
    * Generates a data URL of CSV for local download in the browser. This
    * is the default action for a click on the 'Download CSV' button.
    *
    * See Highcharts.Chart#getCSV to get the CSV data itself.
    */
  def downloadCSV(): Unit = js.native
  
  /**
    * Generates a data URL of an XLS document for local download in the
    * browser. This is the default action for a click on the 'Download XLS'
    * button.
    *
    * See Highcharts.Chart#getTable to get the table data itself.
    */
  def downloadXLS(): Unit = js.native
  
  /**
    * When the chart is drilled down to a child series, calling
    * `chart.drillUp()` will drill up to the parent series.
    */
  def drillUp(): Unit = js.native
  
  /**
    * Exporting module required. Submit an SVG version of the chart to a
    * server along with some parameters for conversion.
    *
    * @param exportingOptions
    *        Exporting options in addition to those defined in exporting.
    *
    * @param chartOptions
    *        Additional chart options for the exported chart. For example a
    *        different background color can be added here, or `dataLabels`
    *        for export only.
    */
  def exportChart(exportingOptions: ExportingOptions, chartOptions: Options): Unit = js.native
  
  /**
    * Exporting and offline-exporting modules required. Export a chart to
    * an image locally in the user's browser.
    *
    * @param exportingOptions
    *        Exporting options, the same as in
    *        Highcharts.Chart#exportChart.
    *
    * @param chartOptions
    *        Additional chart options for the exported chart. For example a
    *        different background color can be added here, or `dataLabels`
    *        for export only.
    */
  def exportChartLocal(): Unit = js.native
  def exportChartLocal(exportingOptions: Unit, chartOptions: Options): Unit = js.native
  def exportChartLocal(exportingOptions: ExportingOptions): Unit = js.native
  def exportChartLocal(exportingOptions: ExportingOptions, chartOptions: Options): Unit = js.native
  
  /**
    * Highmaps only. Get chart coordinates from latitude/longitude. Returns
    * an object with x and y values corresponding to the `xAxis` and
    * `yAxis`.
    *
    * @param latLon
    *        Coordinates.
    *
    * @return X and Y coordinates in terms of chart axis values.
    */
  def fromLatLonToPoint(latLon: typings.highcharts.mapMod.highchartsAugmentingMod.MapLatLonObject): typings.highcharts.mapMod.highchartsAugmentingMod.MapCoordinateObject = js.native
  
  /**
    * Highmaps only. Calculate latitude/longitude values for a point.
    * Returns an object with the numeric properties `lat` and `lon`.
    *
    * @param point
    *        A `Point` instance or anything containing `x` and `y`
    *        properties with numeric values.
    *
    * @return An object with `lat` and `lon` properties.
    */
  def fromPointToLatLon(point: typings.highcharts.mapMod.highchartsAugmentingMod.MapCoordinateObject): js.UndefOr[typings.highcharts.mapMod.highchartsAugmentingMod.MapLatLonObject] = js.native
  def fromPointToLatLon(point: typings.highcharts.mapMod.highchartsAugmentingMod.Point): js.UndefOr[typings.highcharts.mapMod.highchartsAugmentingMod.MapLatLonObject] = js.native
  
  var fullscreen: typings.highcharts.exportingMod.highchartsAugmentingMod.Fullscreen & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Fullscreen */ js.Any) = js.native
  
  /**
    * Get an axis, series or point object by `id` as given in the configuration
    * options. Returns `undefined` if no item is found.
    *
    * @param id
    *        The id as given in the configuration options.
    *
    * @return The retrieved item.
    */
  def get(id: String): js.UndefOr[Axis | Point | Series] = js.native
  
  /**
    * Export-data module required. Returns the current chart data as a CSV
    * string.
    *
    * @param useLocalDecimalPoint
    *        Whether to use the local decimal point as detected from the
    *        browser. This makes it easier to export data to Excel in the
    *        same locale as the user is.
    *
    * @return CSV representation of the data
    */
  def getCSV(): String = js.native
  def getCSV(useLocalDecimalPoint: Boolean): String = js.native
  
  /**
    * Return the unfiltered innerHTML of the chart container. Used as hook
    * for plugins. In styled mode, it also takes care of inlining CSS style
    * rules.
    *
    * @return The unfiltered SVG of the chart.
    */
  def getChartHTML(): String = js.native
  
  /**
    * Get a list of the points currently under cursor.
    *
    * @return The points currently under the cursor.
    */
  def getCurrentSonifyPoints(): js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.Point] = js.native
  
  /**
    * Export-data module required. Returns a two-dimensional array
    * containing the current chart data.
    *
    * @param multiLevelHeaders
    *        Use multilevel headers for the rows by default. Adds an extra
    *        row with top level headers. If a custom columnHeaderFormatter
    *        is defined, this can override the behavior.
    *
    * @return The current chart data
    *
    * @fires Highcharts.Chart#exportData
    */
  def getDataRows(): js.Array[js.Array[Double | String]] = js.native
  def getDataRows(multiLevelHeaders: Boolean): js.Array[js.Array[Double | String]] = js.native
  
  /**
    * Get the default file name used for exported charts. By default it
    * creates a file name based on the chart title.
    *
    * @return A file name without extension.
    */
  def getFilename(): String = js.native
  
  /**
    * Return an SVG representation of the chart.
    *
    * @param chartOptions
    *        Additional chart options for the generated SVG representation.
    *        For collections like `xAxis`, `yAxis` or `series`, the
    *        additional options is either merged in to the original item of
    *        the same `id`, or to the first item if a common id is not
    *        found.
    *
    * @return The SVG representation of the rendered chart.
    *
    * @fires Highcharts.Chart#getSVG
    */
  def getSVG(): String = js.native
  def getSVG(chartOptions: Options): String = js.native
  
  /**
    * Returns an array of all currently selected points in the chart. Points
    * can be selected by clicking or programmatically by the
    * Highcharts.Point#select function.
    *
    * @return The currently selected points.
    */
  def getSelectedPoints(): js.Array[Point] = js.native
  
  /**
    * Returns an array of all currently selected series in the chart. Series
    * can be selected either programmatically by the Highcharts.Series#select
    * function or by checking the checkbox next to the legend item if
    * series.showCheckBox is true.
    *
    * @return The currently selected series.
    */
  def getSelectedSeries(): js.Array[Series] = js.native
  
  /**
    * Export-data module required. Build a HTML table with the chart's
    * current data.
    *
    * @param useLocalDecimalPoint
    *        Whether to use the local decimal point as detected from the
    *        browser. This makes it easier to export data to Excel in the
    *        same locale as the user is.
    *
    * @return HTML representation of the data.
    *
    * @fires Highcharts.Chart#afterGetTable
    */
  def getTable(): String = js.native
  def getTable(useLocalDecimalPoint: Boolean): String = js.native
  
  /**
    * Flag used in parallel coordinates plot to check if chart has
    * ||-coords (parallel coords).
    */
  var hasParallelCoordinates: Boolean = js.native
  
  /**
    * Export-data module required. Hide the data table when visible.
    */
  def hideData(): Unit = js.native
  
  /**
    * Hide the loading layer.
    */
  def hideLoading(): Unit = js.native
  
  /**
    * Contains the original hovered point.
    */
  var hoverPoint: Point | Null = js.native
  
  /**
    * Contains all hovered points.
    */
  var hoverPoints: js.Array[Point] | Null = js.native
  
  /**
    * Contains the original hovered series.
    */
  var hoverSeries: Series | Null = js.native
  
  /**
    * Index position of the chart in the Highcharts#charts property.
    */
  val index: Double = js.native
  
  /**
    * Overridable function that initializes the chart. The constructor's
    * arguments are passed on directly.
    *
    * @param userOptions
    *        Custom options.
    *
    * @param callback
    *        Function to run when the chart has loaded and and all external
    *        images are loaded.
    *
    * @fires Highcharts.Chart#init
    * @fires Highcharts.Chart#afterInit
    */
  def init(userOptions: Options): Unit = js.native
  def init(userOptions: Options, callback: js.Function): Unit = js.native
  
  /**
    * The flag is set to `true` if a series of the chart is inverted.
    */
  var inverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns true if the chart is in series boost mode.
    *
    * @param chart
    *        the chart to check
    *
    * @return true if the chart is in series boost mode
    */
  def isChartSeriesBoosting(chart: Chart): Boolean = js.native
  
  /**
    * Check whether a given point is within the plot area.
    *
    * @param plotX
    *        Pixel x relative to the plot area.
    *
    * @param plotY
    *        Pixel y relative to the plot area.
    *
    * @param inverted
    *        Whether the chart is inverted.
    *
    * @return Returns true if the given point is inside the plot area.
    */
  def isInsidePlot(plotX: Double, plotY: Double): Boolean = js.native
  def isInsidePlot(plotX: Double, plotY: Double, inverted: Boolean): Boolean = js.native
  
  /**
    * Apply context to a format string from lang options of the chart.
    *
    * @param langKey
    *        Key (using dot notation) into lang option structure.
    *
    * @param context
    *        Context to apply to the format string.
    *
    * @return The formatted string.
    */
  def langFormat(langKey: String, context: Dictionary[js.Any]): String = js.native
  
  /**
    * The overview of the chart's series.
    */
  var legend: Legend = js.native
  
  /**
    * Highmaps only. Zoom in or out of the map. See also Point#zoomTo. See
    * Chart#fromLatLonToPoint for how to get the `centerX` and `centerY`
    * parameters for a geographic location.
    *
    * @param howMuch
    *        How much to zoom the map. Values less than 1 zooms in. 0.5
    *        zooms in to half the current view. 2 zooms to twice the
    *        current view. If omitted, the zoom is reset.
    *
    * @param centerX
    *        The X axis position to center around if available space.
    *
    * @param centerY
    *        The Y axis position to center around if available space.
    *
    * @param mouseX
    *        Fix the zoom to this position if possible. This is used for
    *        example in mousewheel events, where the area under the mouse
    *        should be fixed as we zoom in.
    *
    * @param mouseY
    *        Fix the zoom to this position if possible.
    */
  def mapZoom(): Unit = js.native
  def mapZoom(howMuch: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Double, mouseX: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Double, mouseX: Double, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Double, mouseX: Unit, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Unit, mouseX: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Unit, mouseX: Double, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Double, centerY: Unit, mouseX: Unit, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Unit, centerY: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Unit, centerY: Double, mouseX: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Unit, centerY: Double, mouseX: Double, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Unit, centerY: Double, mouseX: Unit, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Unit, centerY: Unit, mouseX: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Unit, centerY: Unit, mouseX: Double, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Double, centerX: Unit, centerY: Unit, mouseX: Unit, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Double, centerY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Double, centerY: Double, mouseX: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Double, centerY: Double, mouseX: Double, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Double, centerY: Double, mouseX: Unit, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Double, centerY: Unit, mouseX: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Double, centerY: Unit, mouseX: Double, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Double, centerY: Unit, mouseX: Unit, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Unit, centerY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Unit, centerY: Double, mouseX: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Unit, centerY: Double, mouseX: Double, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Unit, centerY: Double, mouseX: Unit, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Unit, centerY: Unit, mouseX: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Unit, centerY: Unit, mouseX: Double, mouseY: Double): Unit = js.native
  def mapZoom(howMuch: Unit, centerX: Unit, centerY: Unit, mouseX: Unit, mouseY: Double): Unit = js.native
  
  /**
    * Callback function to override the default function that formats all the
    * numbers in the chart. Returns a string with the formatted number.
    */
  def numberFormatter(number: Double, decimals: Double): String = js.native
  def numberFormatter(number: Double, decimals: Double, decimalPoint: String): String = js.native
  def numberFormatter(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
  def numberFormatter(number: Double, decimals: Double, decimalPoint: Unit, thousandsSep: String): String = js.native
  /**
    * Callback function to override the default function that formats all the
    * numbers in the chart. Returns a string with the formatted number.
    */
  @JSName("numberFormatter")
  var numberFormatter_Original: NumberFormatterCallbackFunction = js.native
  
  /**
    * The options structure for the chart after merging #defaultOptions and
    * #userOptions. It contains members for the sub elements like series,
    * legend, tooltip etc.
    */
  var options: Options = js.native
  
  /**
    * Pause the running sonification.
    *
    * @param fadeOut
    *        Fade out as we pause to avoid clicks.
    */
  def pauseSonify(): Unit = js.native
  def pauseSonify(fadeOut: Boolean): Unit = js.native
  
  /**
    * The current height of the plot area in pixels.
    */
  var plotHeight: Double = js.native
  
  /**
    * The current left position of the plot area in pixels.
    */
  var plotLeft: Double = js.native
  
  /**
    * The current top position of the plot area in pixels.
    */
  var plotTop: Double = js.native
  
  /**
    * The current width of the plot area in pixels.
    */
  var plotWidth: Double = js.native
  
  /**
    * The Pointer that keeps track of mouse and touch interaction.
    */
  var pointer: Pointer = js.native
  
  /**
    * Exporting module required. Clears away other elements in the page and
    * prints the chart as it is displayed. By default, when the exporting
    * module is enabled, a context button with a drop down menu in the
    * upper right corner accesses this function.
    *
    * @fires Highcharts.Chart#beforePrint
    * @fires Highcharts.Chart#afterPrint
    */
  def print(): Unit = js.native
  
  /**
    * These properties cause isDirtyBox to be set to true when updating. Can be
    * extended from plugins.
    */
  var propsRequireDirtyBox: js.Any = js.native
  
  /**
    * These properties require a full reflow of chart elements, best
    * implemented through running `Chart.setSize` internally (#8190).
    */
  var propsRequireReflow: js.Array[js.Any] = js.native
  
  /**
    * These properties cause all series to be updated when updating. Can be
    * extended from plugins.
    */
  var propsRequireUpdateSeries: js.Any = js.native
  
  /**
    * Redraw the chart after changes have been done to the data, axis extremes
    * chart size or chart elements. All methods for updating axes, series or
    * points have a parameter for redrawing the chart. This is `true` by
    * default. But in many cases you want to do more than one operation on the
    * chart before redrawing, for example add a number of points. In those
    * cases it is a waste of resources to redraw the chart for each new point
    * added. So you add the points and call `chart.redraw()` after.
    *
    * @param animation
    *        If or how to apply animation to the redraw.
    *
    * @fires Highcharts.Chart#afterSetExtremes
    * @fires Highcharts.Chart#beforeRedraw
    * @fires Highcharts.Chart#predraw
    * @fires Highcharts.Chart#redraw
    * @fires Highcharts.Chart#render
    * @fires Highcharts.Chart#updatedData
    */
  def redraw(): Unit = js.native
  def redraw(animation: Boolean): Unit = js.native
  def redraw(animation: PartialAnimationOptionsOb): Unit = js.native
  
  /**
    * Reflows the chart to its container. By default, the chart reflows
    * automatically to its container following a `window.resize` event, as per
    * the chart.reflow option. However, there are no reliable events for div
    * resize, so if the container is resized without a window resize event,
    * this must be called explicitly.
    *
    * @param e
    *        Event arguments. Used primarily when the function is called
    *        internally as a response to window resize.
    */
  def reflow(): Unit = js.native
  def reflow(e: Event): Unit = js.native
  
  def removeAnnotation(idOrAnnotation: String): Unit = js.native
  /**
    * Remove an annotation from the chart.
    *
    * @param idOrAnnotation
    *        The annotation's id or direct annotation object.
    */
  def removeAnnotation(idOrAnnotation: Double): Unit = js.native
  def removeAnnotation(idOrAnnotation: Annotation): Unit = js.native
  
  /**
    * The renderer instance of the chart. Each chart instance has only one
    * associated renderer.
    */
  var renderer: SVGRenderer = js.native
  
  /**
    * Reset cursor to start. Requires series.sonify or chart.sonify to have
    * been played at some point earlier.
    */
  def resetSonifyCursor(): Unit = js.native
  
  /**
    * Reset cursor to end. Requires series.sonify or chart.sonify to have
    * been played at some point earlier.
    */
  def resetSonifyCursorEnd(): Unit = js.native
  
  /**
    * Resume the currently running sonification. Requires series.sonify or
    * chart.sonify to have been played at some point earlier.
    *
    * @param onEnd
    *        Callback to call when play finished.
    */
  def resumeSonify(onEnd: js.Function): Unit = js.native
  
  /**
    * Play backwards from cursor. Requires series.sonify or chart.sonify to
    * have been played at some point earlier.
    *
    * @param onEnd
    *        Callback to call when play finished.
    */
  def rewindSonify(onEnd: js.Function): Unit = js.native
  
  /**
    * All the current series in the chart.
    */
  var series: js.Array[Series] = js.native
  
  /**
    * Set the caption options. This can also be done from Chart#update.
    *
    * @param options
    *        New caption options. The caption text itself is set by the
    *        `options.text` property.
    */
  def setCaption(options: CaptionOptions): Unit = js.native
  
  /**
    * Set the chart container's class name, in addition to
    * `highcharts-container`.
    *
    * @param className
    *        The additional class name.
    */
  def setClassName(): Unit = js.native
  def setClassName(className: String): Unit = js.native
  
  /**
    * Resize the chart to a given width and height. In order to set the width
    * only, the height argument may be skipped. To set the height only, pass
    * `undefined` for the width.
    *
    * @param width
    *        The new pixel width of the chart. Since v4.2.6, the argument can
    *        be `undefined` in order to preserve the current value (when
    *        setting height only), or `null` to adapt to the width of the
    *        containing element.
    *
    * @param height
    *        The new pixel height of the chart. Since v4.2.6, the argument can
    *        be `undefined` in order to preserve the current value, or `null`
    *        in order to adapt to the height of the containing element.
    *
    * @param animation
    *        Whether and how to apply animation.
    *
    * @fires Highcharts.Chart#endResize
    * @fires Highcharts.Chart#resize
    */
  def setSize(): Unit = js.native
  def setSize(width: Double): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setSize(width: Double, height: Double, animation: Boolean): Unit = js.native
  def setSize(width: Double, height: Double, animation: PartialAnimationOptionsOb): Unit = js.native
  def setSize(width: Double, height: Null, animation: Boolean): Unit = js.native
  def setSize(width: Double, height: Null, animation: PartialAnimationOptionsOb): Unit = js.native
  def setSize(width: Double, height: Unit, animation: Boolean): Unit = js.native
  def setSize(width: Double, height: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def setSize(width: Null, height: Double): Unit = js.native
  def setSize(width: Null, height: Double, animation: Boolean): Unit = js.native
  def setSize(width: Null, height: Double, animation: PartialAnimationOptionsOb): Unit = js.native
  def setSize(width: Null, height: Null, animation: Boolean): Unit = js.native
  def setSize(width: Null, height: Null, animation: PartialAnimationOptionsOb): Unit = js.native
  def setSize(width: Null, height: Unit, animation: Boolean): Unit = js.native
  def setSize(width: Null, height: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def setSize(width: Unit, height: Double): Unit = js.native
  def setSize(width: Unit, height: Double, animation: Boolean): Unit = js.native
  def setSize(width: Unit, height: Double, animation: PartialAnimationOptionsOb): Unit = js.native
  def setSize(width: Unit, height: Null, animation: Boolean): Unit = js.native
  def setSize(width: Unit, height: Null, animation: PartialAnimationOptionsOb): Unit = js.native
  def setSize(width: Unit, height: Unit, animation: Boolean): Unit = js.native
  def setSize(width: Unit, height: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  
  def setSonifyCursor(points: js.Array[typings.highcharts.sonificationMod.highchartsAugmentingMod.Point]): Unit = js.native
  /**
    * Set the cursor to a point or set of points in different series.
    *
    * @param points
    *        The point or points to set the cursor to. If setting multiple
    *        points under the cursor, the points have to be in different
    *        series that are being played simultaneously.
    */
  def setSonifyCursor(points: typings.highcharts.sonificationMod.highchartsAugmentingMod.Point): Unit = js.native
  
  /**
    * Shortcut to set the subtitle options. This can also be done from
    * Chart#update or Chart#setTitle.
    *
    * @param options
    *        New subtitle options. The subtitle text itself is set by the
    *        `options.text` property.
    */
  def setSubtitle(options: SubtitleOptions): Unit = js.native
  
  /**
    * Set a new title or subtitle for the chart.
    *
    * @param titleOptions
    *        New title options. The title text itself is set by the
    *        `titleOptions.text` property.
    *
    * @param subtitleOptions
    *        New subtitle options. The subtitle text itself is set by the
    *        `subtitleOptions.text` property.
    *
    * @param redraw
    *        Whether to redraw the chart or wait for a later call to
    *        `chart.redraw()`.
    */
  def setTitle(): Unit = js.native
  def setTitle(titleOptions: Unit, subtitleOptions: Unit, redraw: Boolean): Unit = js.native
  def setTitle(titleOptions: Unit, subtitleOptions: SubtitleOptions): Unit = js.native
  def setTitle(titleOptions: Unit, subtitleOptions: SubtitleOptions, redraw: Boolean): Unit = js.native
  def setTitle(titleOptions: TitleOptions): Unit = js.native
  def setTitle(titleOptions: TitleOptions, subtitleOptions: Unit, redraw: Boolean): Unit = js.native
  def setTitle(titleOptions: TitleOptions, subtitleOptions: SubtitleOptions): Unit = js.native
  def setTitle(titleOptions: TitleOptions, subtitleOptions: SubtitleOptions, redraw: Boolean): Unit = js.native
  
  /**
    * Dim the chart and show a loading text or symbol. Options for the loading
    * screen are defined in the loading options.
    *
    * @param str
    *        An optional text to show in the loading label instead of the
    *        default one. The default text is set in lang.loading.
    */
  def showLoading(): Unit = js.native
  def showLoading(str: String): Unit = js.native
  
  /**
    * Display the zoom button, so users can reset zoom to the default view
    * settings.
    *
    * @fires Highcharts.Chart#afterShowResetZoom
    * @fires Highcharts.Chart#beforeShowResetZoom
    */
  def showResetZoom(): Unit = js.native
  
  /**
    * Sonify a chart.
    *
    * @param options
    *        The options for sonifying this chart. If not provided, uses
    *        options set on chart and series.
    */
  def sonify(): Unit = js.native
  def sonify(options: typings.highcharts.sonificationMod.highchartsAugmentingMod.SonificationOptions): Unit = js.native
  
  /**
    * Whether the chart is in styled mode, meaning all presentatinoal
    * attributes are avoided.
    */
  var styledMode: Boolean = js.native
  
  /**
    * The chart subtitle. The subtitle has an `update` method that allows
    * modifying the options directly or indirectly via `chart.update`.
    */
  var subtitle: SubtitleObject = js.native
  
  /**
    * The `Time` object associated with the chart. Since v6.0.5, time settings
    * can be applied individually for each chart. If no individual settings
    * apply, the `Time` object is shared by all instances.
    */
  var time: Time_ = js.native
  
  /**
    * The chart title. The title has an `update` method that allows modifying
    * the options directly or indirectly via `chart.update`.
    */
  var title: TitleObject = js.native
  
  /**
    * Tooltip object for points of series.
    */
  var tooltip: Tooltip = js.native
  
  /**
    * Highmaps only. Get point from latitude and longitude using specified
    * transform definition.
    *
    * @param latLon
    *        A latitude/longitude object.
    *
    * @param transform
    *        The transform definition to use as explained in the
    *        documentation.
    *
    * @return An object with `x` and `y` properties.
    */
  def transformFromLatLon(latLon: typings.highcharts.mapMod.highchartsAugmentingMod.MapLatLonObject, transform: js.Any): typings.highcharts.mapMod.highchartsAugmentingMod.MapCoordinateObject = js.native
  
  /**
    * Highmaps only. Get latLon from point using specified transform
    * definition. The method returns an object with the numeric properties
    * `lat` and `lon`.
    *
    * @param point
    *        A `Point` instance, or any object containing the properties
    *        `x` and `y` with numeric values.
    *
    * @param transform
    *        The transform definition to use as explained in the
    *        documentation.
    *
    * @return An object with `lat` and `lon` properties.
    */
  def transformToLatLon(point: typings.highcharts.mapMod.highchartsAugmentingMod.MapCoordinateObject, transform: js.Any): js.UndefOr[typings.highcharts.mapMod.highchartsAugmentingMod.MapLatLonObject] = js.native
  def transformToLatLon(point: typings.highcharts.mapMod.highchartsAugmentingMod.Point, transform: js.Any): js.UndefOr[typings.highcharts.mapMod.highchartsAugmentingMod.MapLatLonObject] = js.native
  
  /**
    * A generic function to update any element of the chart. Elements can be
    * enabled and disabled, moved, re-styled, re-formatted etc.
    *
    * A special case is configuration objects that take arrays, for example
    * xAxis, yAxis or series. For these collections, an `id` option is used to
    * map the new option set to an existing object. If an existing object of
    * the same id is not found, the corresponding item is updated. So for
    * example, running `chart.update` with a series item without an id, will
    * cause the existing chart's series with the same index in the series array
    * to be updated. When the `oneToOne` parameter is true, `chart.update` will
    * also take care of adding and removing items from the collection. Read
    * more under the parameter description below.
    *
    * Note that when changing series data, `chart.update` may mutate the passed
    * data options.
    *
    * See also the responsive option set. Switching between `responsive.rules`
    * basically runs `chart.update` under the hood.
    *
    * @param options
    *        A configuration object for the new chart options.
    *
    * @param redraw
    *        Whether to redraw the chart.
    *
    * @param oneToOne
    *        When `true`, the `series`, `xAxis`, `yAxis` and `annotations`
    *        collections will be updated one to one, and items will be either
    *        added or removed to match the new updated options. For example, if
    *        the chart has two series and we call `chart.update` with a
    *        configuration containing three series, one will be added. If we
    *        call `chart.update` with one series, one will be removed. Setting
    *        an empty `series` array will remove all series, but leaving out
    *        the`series` property will leave all series untouched. If the
    *        series have id's, the new series options will be matched by id,
    *        and the remaining ones removed.
    *
    * @param animation
    *        Whether to apply animation, and optionally animation
    *        configuration.
    *
    * @fires Highcharts.Chart#update
    * @fires Highcharts.Chart#afterUpdate
    */
  def update(options: Options): Unit = js.native
  def update(options: Options, redraw: Boolean): Unit = js.native
  def update(options: Options, redraw: Boolean, oneToOne: Boolean): Unit = js.native
  def update(options: Options, redraw: Boolean, oneToOne: Boolean, animation: Boolean): Unit = js.native
  def update(options: Options, redraw: Boolean, oneToOne: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def update(options: Options, redraw: Boolean, oneToOne: Unit, animation: Boolean): Unit = js.native
  def update(options: Options, redraw: Boolean, oneToOne: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  def update(options: Options, redraw: Unit, oneToOne: Boolean): Unit = js.native
  def update(options: Options, redraw: Unit, oneToOne: Boolean, animation: Boolean): Unit = js.native
  def update(options: Options, redraw: Unit, oneToOne: Boolean, animation: PartialAnimationOptionsOb): Unit = js.native
  def update(options: Options, redraw: Unit, oneToOne: Unit, animation: Boolean): Unit = js.native
  def update(options: Options, redraw: Unit, oneToOne: Unit, animation: PartialAnimationOptionsOb): Unit = js.native
  
  /**
    * The original options given to the constructor or a chart factory like
    * Highcharts.chart and Highcharts.stockChart.
    */
  var userOptions: Options = js.native
  
  /**
    * Export-data module required. View the data in a table below the
    * chart.
    *
    * @fires Highcharts.Chart#afterViewData
    */
  def viewData(): Unit = js.native
  
  /**
    * A collection of the X axes in the chart.
    */
  var xAxis: js.Array[Axis] = js.native
  
  /**
    * A collection of the Y axes in the chart.
    */
  var yAxis: js.Array[Axis] = js.native
  
  /**
    * Zoom the chart out after a user has zoomed in. See also Axis.setExtremes.
    *
    * @fires Highcharts.Chart#selection
    */
  def zoomOut(): Unit = js.native
}
