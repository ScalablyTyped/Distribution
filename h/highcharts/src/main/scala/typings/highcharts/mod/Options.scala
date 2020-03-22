package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring
    * accessibility for the chart. Requires the accessibility module to be
    * loaded. For a description of the module and information on its features,
    * see Highcharts Accessibility.
    */
  var accessibility: js.UndefOr[AccessibilityOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A basic type of an annotation.
    * It allows to add custom labels or shapes. The items can be tied to
    * points, axis coordinates or chart pixel coordinates.
    */
  var annotations: js.UndefOr[js.Array[AnnotationsOptions]] = js.undefined
  var boost: js.UndefOr[BoostOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The chart's caption, which will
    * render below the chart and will be part of exported charts. The caption
    * can be updated after chart initialization through the `Chart.update` or
    * `Chart.caption.update` methods.
    */
  var caption: js.UndefOr[CaptionOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) General options for the chart.
    */
  var chart: js.UndefOr[ChartOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) A color axis for series. Visually, the
    * color axis will appear as a gradient or as separate items inside the
    * legend, depending on whether the axis is scalar or based on data classes.
    *
    * For supported color formats, see the docs article about colors.
    *
    * A scalar color axis is represented by a gradient. The colors either range
    * between the minColor and the maxColor, or for more fine grained control
    * the colors can be defined in stops. Often times, the color axis needs to
    * be adjusted to get the right color spread for the data. In addition to
    * stops, consider using a logarithmic axis type, or setting min and max to
    * avoid the colors being determined by outliers.
    *
    * When dataClasses are used, the ranges are subdivided into separate
    * classes like categories based on their values. This can be used for
    * ranges between two values, but also for a true category. However, when
    * your data is categorized, it may be as convenient to add each category to
    * a separate series.
    *
    * Color axis does not work with: `sankey`, `sunburst`, `dependencywheel`,
    * `networkgraph`, `wordcloud`, `venn`, `gauge` and `solidgauge` series
    * types.
    *
    * Since v7.2.0 `colorAxis` can also be an array of options objects.
    *
    * See the Axis object for programmatic access to the axis.
    */
  var colorAxis: js.UndefOr[ColorAxisOptions | js.Array[ColorAxisOptions]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array containing the default
    * colors for the chart's series. When all colors are used, new colors are
    * pulled from the start again.
    *
    * Default colors can also be set on a series or series.type basis, see
    * column.colors, pie.colors.
    *
    * In styled mode, the colors option doesn't exist. Instead, colors are
    * defined in CSS and applied either through series or point class names, or
    * through the chart.colorCount option.
    *
    * ### Legacy
    *
    * In Highcharts 3.x, the default colors were: (see online documentation for
    * example)
    *
    * In Highcharts 2.x, the default colors were: (see online documentation for
    * example)
    */
  var colors: js.UndefOr[js.Array[ColorString]] = js.undefined
  /**
    * (Gantt) The Pathfinder module allows you to define connections between
    * any two points, represented as lines - optionally with markers for the
    * start and/or end points. Multiple algorithms are available for
    * calculating how the connecting lines are drawn.
    *
    * Connector functionality requires Highcharts Gantt to be loaded. In Gantt
    * charts, the connectors are used to draw dependencies between tasks.
    */
  var connectors: js.UndefOr[ConnectorsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Highchart by default puts a
    * credits label in the lower right corner of the chart. This can be changed
    * using these options.
    */
  var credits: js.UndefOr[CreditsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Data module provides a
    * simplified interface for adding data to a chart from sources like CVS,
    * HTML tables or grid views. See also the tutorial article on the Data
    * module.
    *
    * It requires the `modules/data.js` file to be loaded.
    *
    * Please note that the default way of adding data in Highcharts, without
    * the need of a module, is through the series._type_.data option.
    */
  var data: js.UndefOr[DataOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Styled mode only. Configuration
    * object for adding SVG definitions for reusable elements. See gradients,
    * shadows and patterns for more information and code examples.
    */
  var defs: js.UndefOr[DefsOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) Options for drill down, the concept of inspecting
    * increasingly high resolution data through clicking on chart items like
    * columns or pie slices.
    *
    * The drilldown feature requires the drilldown.js file to be loaded, found
    * in the modules directory of the download package, or online at
    * code.highcharts.com/modules/drilldown.js.
    */
  var drilldown: js.UndefOr[DrilldownOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the exporting
    * module. For an overview on the matter, see the docs.
    */
  var exporting: js.UndefOr[ExportingOptions] = js.undefined
  var global: js.UndefOr[GlobalOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Language object. The language
    * object is global and it can't be set on each chart initialization.
    * Instead, use `Highcharts.setOptions` to set it before any chart is
    * initialized. (see online documentation for example)
    */
  var lang: js.UndefOr[LangOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The legend is a box containing a
    * symbol and name for each series item or point item in the chart. Each
    * series (or points in case of pie charts) is represented by a symbol and
    * its name in the legend.
    *
    * It is possible to override the symbol creator function and create custom
    * legend symbols.
    */
  var legend: js.UndefOr[LegendOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The loading options control the
    * appearance of the loading screen that covers the plot area on chart
    * operations. This screen only appears after an explicit call to
    * `chart.showLoading()`. It is a utility for developers to communicate to
    * the end user that something is going on, for example while retrieving new
    * data via an XHR connection. The "Loading..." text itself is not part of
    * this configuration object, but part of the `lang` object.
    */
  var loading: js.UndefOr[LoadingOptions] = js.undefined
  var mapNavigation: js.UndefOr[MapNavigationOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
    * buttons and menus appearing in the exporting module.
    */
  var navigation: js.UndefOr[NavigationOptions] = js.undefined
  /**
    * (Highstock, Gantt) The navigator is a small series below the main series,
    * displaying a view of the entire data set. It provides tools to zoom in
    * and out on parts of the data as well as panning across the dataset.
    */
  var navigator: js.UndefOr[NavigatorOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Options for displaying a message like "No
    * data to display". This feature requires the file no-data-to-display.js to
    * be loaded in the page. The actual text to display is set in the
    * lang.noData option.
    */
  var noData: js.UndefOr[NoDataOptions] = js.undefined
  /**
    * (Highcharts) The pane serves as a container for axes and backgrounds for
    * circular gauges and polar charts.
    */
  var pane: js.UndefOr[PaneOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The plotOptions is a wrapper
    * object for config objects for each series type. The config objects for
    * each series can also be overridden for each series item as given in the
    * series array.
    *
    * Configuration options for the series are given in three levels. Options
    * for all series in a chart are given in the plotOptions.series object.
    * Then options for all series of a specific type are given in the
    * plotOptions of that type, for example `plotOptions.line`. Next, options
    * for one single series are given in the series array.
    */
  var plotOptions: js.UndefOr[PlotOptions] = js.undefined
  /**
    * (Highstock, Gantt) The range selector is a tool for selecting ranges to
    * display within the chart. It provides buttons to select preconfigured
    * ranges in the chart, like 1 day, 1 week, 1 month etc. It also provides
    * input boxes where min and max dates can be manually input.
    */
  var rangeSelector: js.UndefOr[RangeSelectorOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Allows setting a set of rules to
    * apply for different screen or chart sizes. Each rule specifies additional
    * chart options.
    */
  var responsive: js.UndefOr[ResponsiveOptions] = js.undefined
  /**
    * (Highstock, Gantt) The scrollbar is a means of panning over the X axis of
    * a stock chart. Scrollbars can also be applied to other types of axes.
    *
    * Another approach to scrollable charts is the chart.scrollablePlotArea
    * option that is especially suitable for simpler cartesian charts on
    * mobile.
    *
    * In styled mode, all the presentational options for the scrollbar are
    * replaced by the classes `.highcharts-scrollbar-thumb`,
    * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`,
    * `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`.
    */
  var scrollbar: js.UndefOr[ScrollbarOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Series options for specific data
    * and the data itself. In TypeScript you have to cast the series options to
    * specific series types, to get all possible options for a series.
    */
  var series: js.UndefOr[js.Array[SeriesOptionsType]] = js.undefined
  /**
    * (Highstock) Configure the stockTools gui strings in the chart. Requires
    * the [stockTools module]() to be loaded. For a description of the module
    * and information on its features, see [Highcharts StockTools]().
    */
  var stockTools: js.UndefOr[StockToolsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The chart's subtitle. This can
    * be used both to display a subtitle below the main title, and to display
    * random text anywhere in the chart. The subtitle can be updated after
    * chart initialization through the `Chart.setTitle` method.
    */
  var subtitle: js.UndefOr[SubtitleOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Time options that can apply
    * globally or to individual charts. These settings affect how `datetime`
    * axes are laid out, how tooltips are formatted, how series
    * pointIntervalUnit works and how the Highstock range selector handles
    * time.
    *
    * The common use case is that all charts in the same Highcharts object
    * share the same time settings, in which case the global settings are set
    * using `setOptions`. (see online documentation for example)
    *
    * Since v6.0.5, the time options were moved from the `global` obect to the
    * `time` object, and time options can be set on each individual chart.
    */
  var time: js.UndefOr[TimeOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The chart's main title.
    */
  var title: js.UndefOr[TitleOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the tooltip that
    * appears when the user hovers over a series or point.
    */
  var tooltip: js.UndefOr[TooltipOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The X axis or category axis.
    * Normally this is the horizontal axis, though if the chart is inverted
    * this is the vertical axis. In case of multiple axes, the xAxis node is an
    * array of configuration objects.
    *
    * See the Axis class for programmatic access to the axis.
    */
  var xAxis: js.UndefOr[XAxisOptions | js.Array[XAxisOptions]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The Y axis or value axis.
    * Normally this is the vertical axis, though if the chart is inverted this
    * is the horizontal axis. In case of multiple axes, the yAxis node is an
    * array of configuration objects.
    *
    * See the Axis object for programmatic access to the axis.
    */
  var yAxis: js.UndefOr[YAxisOptions | js.Array[YAxisOptions]] = js.undefined
  /**
    * (Highcharts) The Z axis or depth axis for 3D plots.
    *
    * See the Axis class for programmatic access to the axis.
    */
  var zAxis: js.UndefOr[ZAxisOptions | js.Array[ZAxisOptions]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    accessibility: AccessibilityOptions = null,
    annotations: js.Array[AnnotationsOptions] = null,
    boost: BoostOptions = null,
    caption: CaptionOptions = null,
    chart: ChartOptions = null,
    colorAxis: ColorAxisOptions | js.Array[ColorAxisOptions] = null,
    colors: js.Array[ColorString] = null,
    connectors: ConnectorsOptions = null,
    credits: CreditsOptions = null,
    data: DataOptions = null,
    defs: DefsOptions = null,
    drilldown: DrilldownOptions = null,
    exporting: ExportingOptions = null,
    global: GlobalOptions = null,
    lang: LangOptions = null,
    legend: LegendOptions = null,
    loading: LoadingOptions = null,
    mapNavigation: MapNavigationOptions = null,
    navigation: NavigationOptions = null,
    navigator: NavigatorOptions = null,
    noData: NoDataOptions = null,
    pane: PaneOptions = null,
    plotOptions: PlotOptions = null,
    rangeSelector: RangeSelectorOptions = null,
    responsive: ResponsiveOptions = null,
    scrollbar: ScrollbarOptions = null,
    series: js.Array[SeriesOptionsType] = null,
    stockTools: StockToolsOptions = null,
    subtitle: SubtitleOptions = null,
    time: TimeOptions = null,
    title: TitleOptions = null,
    tooltip: TooltipOptions = null,
    xAxis: XAxisOptions | js.Array[XAxisOptions] = null,
    yAxis: YAxisOptions | js.Array[YAxisOptions] = null,
    zAxis: ZAxisOptions | js.Array[ZAxisOptions] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (boost != null) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (credits != null) __obj.updateDynamic("credits")(credits.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (exporting != null) __obj.updateDynamic("exporting")(exporting.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (mapNavigation != null) __obj.updateDynamic("mapNavigation")(mapNavigation.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (navigator != null) __obj.updateDynamic("navigator")(navigator.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (plotOptions != null) __obj.updateDynamic("plotOptions")(plotOptions.asInstanceOf[js.Any])
    if (rangeSelector != null) __obj.updateDynamic("rangeSelector")(rangeSelector.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (stockTools != null) __obj.updateDynamic("stockTools")(stockTools.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zAxis != null) __obj.updateDynamic("zAxis")(zAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

