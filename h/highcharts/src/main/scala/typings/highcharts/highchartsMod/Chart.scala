package typings.highcharts.highchartsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "Chart")
@js.native
class Chart protected () extends js.Object {
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
    * All the axes in the chart.
    */
  var axes: js.Array[Axis] = js.native
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
  var index: Double = js.native
  /**
    * The flag is set to `true` if a series of the chart is inverted.
    */
  var inverted: js.UndefOr[Boolean] = js.native
  /**
    * The overview of the chart's series.
    */
  var legend: Legend = js.native
  /**
    * The options structure for the chart after merging #defaultOptions and
    * #userOptions. It contains members for the sub elements like series,
    * legend, tooltip etc.
    */
  var options: Options = js.native
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
    * These properties cause isDirtyBox to be set to true when updating. Can be
    * extended from plugins.
    */
  var propsRequireDirtyBox: js.Any = js.native
  /**
    * These properties require a full reflow of chart elements, best
    * implemented through running `Chart.setSize` internally (#8190).
    */
  var propsRequireReflow: js.Array[_] = js.native
  /**
    * These properties cause all series to be updated when updating. Can be
    * extended from plugins.
    */
  var propsRequireUpdateSeries: js.Any = js.native
  /**
    * The renderer instance of the chart. Each chart instance has only one
    * associated renderer.
    */
  var renderer: SVGRenderer = js.native
  /**
    * All the current series in the chart.
    */
  var series: js.Array[Series] = js.native
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
  var time: Time = js.native
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
    * The original options given to the constructor or a chart factory like
    * Highcharts.chart and Highcharts.stockChart.
    */
  var userOptions: Options = js.native
  /**
    * A collection of the X axes in the chart.
    */
  var xAxis: js.Array[Axis] = js.native
  /**
    * A collection of the Y axes in the chart.
    */
  var yAxis: js.Array[Axis] = js.native
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
  def addAxis(options: AxisOptions, isX: Boolean, redraw: Boolean, animation: AnimationOptionsObject): Axis = js.native
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
  def addColorAxis(options: ColorAxisOptions, redraw: Boolean, animation: AnimationOptionsObject): ColorAxis = js.native
  /**
    * Set a new credits label for the chart.
    *
    * @param credits
    *        A configuration object for the new credits.
    */
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
  def addSeries(options: SeriesOptionsType, redraw: Boolean, animation: AnimationOptionsObject): Series = js.native
  /**
    * Remove the chart and purge memory. This method is called internally
    * before adding a second chart into the same container, as well as on
    * window unload to prevent leaks.
    *
    * @fires Highcharts.Chart#destroy
    */
  def destroy(): Unit = js.native
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
    * Hide the loading layer.
    */
  def hideLoading(): Unit = js.native
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
  def redraw(animation: AnimationOptionsObject): Unit = js.native
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
  def setSize(width: Double, height: Double, animation: AnimationOptionsObject): Unit = js.native
  def setSize(width: Double, height: Null, animation: Boolean): Unit = js.native
  def setSize(width: Double, height: Null, animation: AnimationOptionsObject): Unit = js.native
  def setSize(width: Null, height: Double): Unit = js.native
  def setSize(width: Null, height: Double, animation: Boolean): Unit = js.native
  def setSize(width: Null, height: Double, animation: AnimationOptionsObject): Unit = js.native
  def setSize(width: Null, height: Null, animation: Boolean): Unit = js.native
  def setSize(width: Null, height: Null, animation: AnimationOptionsObject): Unit = js.native
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
  def setTitle(titleOptions: TitleOptions): Unit = js.native
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
  def update(options: Options, redraw: Boolean, oneToOne: Boolean, animation: AnimationOptionsObject): Unit = js.native
  /**
    * Zoom the chart out after a user has zoomed in. See also Axis.setExtremes.
    *
    * @fires Highcharts.Chart#selection
    */
  def zoomOut(): Unit = js.native
}

