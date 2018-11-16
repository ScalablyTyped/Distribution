package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * Options for configuring accessibility for the chart. Requires the accessibility module to be loaded.
           * For a description of the module and information on its features, see Highcharts Accessibility.
           * @since 5.0.0
           */
  var accessibility: js.UndefOr[AccessibilityOptions] = js.undefined
  /**
           * Options for configuring annotations, for example labels, arrows or shapes.
           */
  var annotations: js.UndefOr[js.Array[AnnotationsOptions]] = js.undefined
  /**
           * Options regarding the chart area and plot area as well as general chart options.
           */
  var chart: js.UndefOr[ChartOptions] = js.undefined
  var colorAxis: js.UndefOr[ColorAxisOptions | js.Array[ColorAxisOptions]] = js.undefined
  /**
           * An array containing the default colors for the chart's series. When all colors are used, new colors are pulled
           * from the start again.
           *
           * Default colors can also be set on a series or series.type basis, see column.colors, pie.colors.
           *
           * @default ['#7cb5ec', '#434348', '#90ed7d', '#f7a35c', '#8085e9', '#f15c80', '#e4d354', '#2b908f', '#f45b5b', '#91e8e1']
           */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  /**
           * Highchart by default puts a credits label in the lower right corner of the chart. This can be changed using these options.
           */
  var credits: js.UndefOr[CreditsOptions] = js.undefined
  /**
           * The Data module provides a simplified interface for adding data to a chart from sources like CVS, HTML tables or
           * grid views. See also the tutorial article on the Data module.
           *
           * It requires the modules/data.js file to be loaded.
           *
           * Please note that the default way of adding data in Highcharts, without the need of a module, is through the
           * series.data option.
           */
  var data: js.UndefOr[DataOptions] = js.undefined
  /**
           * Styled mode only. Configuration object for adding SVG definitions for reusable elements.
           * See gradients, shadows and patterns for more information and code examples.
           */
  var defs: js.UndefOr[js.Any] = js.undefined
   // TODO: Unknown API interface, see also http://api.highcharts.com/highcharts/defs
  /**
           * Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart
           * items like columns or pie slices.
           *
           * The drilldown feature requires the drilldown.js file to be loaded, found in the modules directory of the download
           * package, or online at code.highcharts.com/modules/drilldown.js.
           */
  var drilldown: js.UndefOr[DrilldownOptions] = js.undefined
  /**
           * Options for the exporting module.
           */
  var exporting: js.UndefOr[ExportingOptions] = js.undefined
  /**
           * HTML labels that can be positioned anywhere in the chart area.
           */
  var labels: js.UndefOr[LabelsOptions] = js.undefined
  var lang: js.UndefOr[LangObject] = js.undefined
  /**
           * The legend is a box containing a symbol and name for each series item or point item in the chart.
           */
  var legend: js.UndefOr[LegendOptions] = js.undefined
  /**
           * The loading options control the appearance of the loading screen that covers the plot area on chart operations.
           * This screen only appears after an explicit call to chart.showLoading(). It is a utility for developers to
           * communicate to the end user that something is going on, for example while retrieving new data via an XHR
           * connection. The 'Loading...' text itself is not part of this configuration object, but part of the lang object.
           */
  var loading: js.UndefOr[LoadingOptions] = js.undefined
  /**
           * A collection of options for buttons and menus appearing in the exporting module.
           */
  var navigation: js.UndefOr[NavigationOptions] = js.undefined
  /**
           * Options for displaying a message like 'No data to display'. This feature requires the file no-data-to-display.js
           * to be loaded in the page. The actual text to display is set in the lang.noData option.
           */
  var noData: js.UndefOr[NoDataOptions] = js.undefined
  /**
           * Applies only to polar charts and angular gauges. This configuration object holds general options for the combined
           * X and Y axes set. Each xAxis or yAxis can reference the pane by index.
           */
  var pane: js.UndefOr[PaneOptions] = js.undefined
  /**
           * The plotOptions is a wrapper object for config objects for each series type. The config objects for each series
           * can also be overridden for each series item as given in the series array.
           *
           * Configuration options for the series are given in three levels. Options for all series in a chart are given in
           * the plotOptions.series object. Then options for all series of a specific type are given in the plotOptions of
           * that type, for example plotOptions.line. Next, options for one single series are given in the series array.
           */
  var plotOptions: js.UndefOr[PlotOptions] = js.undefined
  /**
           * Allows setting a set of rules to apply for different screen or chart sizes. Each rule specifies additional chart options.
           * @since 5.0.0
           */
  var responsive: js.UndefOr[ResponsiveOptions] = js.undefined
  /**
           * The actual series to append to the chart. In addition to the members listed below, any member of the plotOptions
           * for that specific type of plot can be added to a series individually. For example, even though a general
           * lineWidth is specified in plotOptions.series, an individual lineWidth can be specified for each series.
           */
  var series: js.UndefOr[js.Array[IndividualSeriesOptions]] = js.undefined
  /**
           * The chart's subtitle
           */
  var subtitle: js.UndefOr[SubtitleOptions] = js.undefined
  /**
           * The chart's time options
           */
  var time: js.UndefOr[TimeOptions] = js.undefined
  /**
           * The chart's main title.
           */
  var title: js.UndefOr[TitleOptions] = js.undefined
  /**
           * Options for the tooltip that appears when the user hovers over a series or point.
           */
  var tooltip: js.UndefOr[TooltipOptions] = js.undefined
  /**
           * The X axis or category axis. Normally this is the horizontal axis, though if the chart is inverted this is the
           * vertical axis. In case of multiple axes, the xAxis node is an array of configuration objects.
           */
  var xAxis: js.UndefOr[js.Array[AxisOptions] | AxisOptions] = js.undefined
  /**
           * The Y axis or value axis. Normally this is the vertical axis, though if the chart is inverted this is the
           * horizontal axis. In case of multiple axes, the yAxis node is an array of configuration objects.
           */
  var yAxis: js.UndefOr[js.Array[AxisOptions] | AxisOptions] = js.undefined
}

