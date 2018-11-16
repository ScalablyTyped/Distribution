package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The chart object is the JavaScript object representing a single chart in the web page.The pointer to your chart
     * object is returned when a chart is created using the Highcharts.Chart() constructor:
     * var chart1 = new Highcharts.Chart(options);
     */
@js.native
trait ChartObject extends js.Object {
  var chartHeight: js.UndefOr[scala.Double] = js.native
  var chartWidth: js.UndefOr[scala.Double] = js.native
  /**
           * A reference to the containing HTML element, dynamically inserted into the element given in chart.renderTo.
           * @since 1.2.5
           */
  var container: stdLib.HTMLElement = js.native
  /**
           * The chart's credits label. The label has an update method that allows setting new options as per the credits option set.
           *
           */
  var credits: CreditsObject = js.native
  var legend: LegendObject = js.native
  /**
           * The options structure for the chart.
           * @since 1.2.0
           */
  var options: Options = js.native
  var plotLeft: js.UndefOr[scala.Double] = js.native
  var plotSizeX: js.UndefOr[scala.Double] = js.native
  var plotSizeY: js.UndefOr[scala.Double] = js.native
  var plotTop: js.UndefOr[scala.Double] = js.native
  var renderer: RendererObject = js.native
  /**
           * An array of all the chart's series.
           * @since 1.2.0
           */
  var series: js.Array[SeriesObject] = js.native
  /**
           * The chart subtitle. The subtitle has an update method that allows modifying the options.
           * @since 5.0.0
           */
  var subtitle: TitleObject = js.native
  /**
           * The chart title. The title has an update method that points back to Chart.setTitle.
           * @since 5.0.0
           */
  var title: TitleObject = js.native
  /**
           * An array of the chart's x axes. If only one x axis, it is referenced by chart.xAxis[0].
           * @since 1.2.0
           */
  var xAxis: js.Array[AxisObject] = js.native
  /**
           * An array of the chart's y axes. If only one y axis, it is referenced by chart.yAxis[0].
           * @since 1.2.0
           */
  var yAxis: js.Array[AxisObject] = js.native
  /**
           * Add an axis to the chart after render time. Note that this method should never be used when adding data
           * synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the
           * same time as the chart is initiated, add the axis as a configuration option instead.
           * @param  options The Axis options, as documented under xAxis and yAxis.
           * @param  [boolean] isX Whether it is an X axis or Y axis
           * @param  [boolean] redraw Defaults to true. Whether to redraw the chart after the series is added. See the redraw() method.
           * @param  [boolean | Animation] animation Defaults to true. When true, the series' updating will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 3.0
           */
  def addAxis(options: AxisOptions): AxisObject = js.native
  /**
           * Add an axis to the chart after render time. Note that this method should never be used when adding data
           * synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the
           * same time as the chart is initiated, add the axis as a configuration option instead.
           * @param  options The Axis options, as documented under xAxis and yAxis.
           * @param  [boolean] isX Whether it is an X axis or Y axis
           * @param  [boolean] redraw Defaults to true. Whether to redraw the chart after the series is added. See the redraw() method.
           * @param  [boolean | Animation] animation Defaults to true. When true, the series' updating will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 3.0
           */
  def addAxis(options: AxisOptions, isX: scala.Boolean): AxisObject = js.native
  /**
           * Add an axis to the chart after render time. Note that this method should never be used when adding data
           * synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the
           * same time as the chart is initiated, add the axis as a configuration option instead.
           * @param  options The Axis options, as documented under xAxis and yAxis.
           * @param  [boolean] isX Whether it is an X axis or Y axis
           * @param  [boolean] redraw Defaults to true. Whether to redraw the chart after the series is added. See the redraw() method.
           * @param  [boolean | Animation] animation Defaults to true. When true, the series' updating will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 3.0
           */
  def addAxis(options: AxisOptions, isX: scala.Boolean, redraw: scala.Boolean): AxisObject = js.native
  /**
           * Add an axis to the chart after render time. Note that this method should never be used when adding data
           * synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the
           * same time as the chart is initiated, add the axis as a configuration option instead.
           * @param  options The Axis options, as documented under xAxis and yAxis.
           * @param  [boolean] isX Whether it is an X axis or Y axis
           * @param  [boolean] redraw Defaults to true. Whether to redraw the chart after the series is added. See the redraw() method.
           * @param  [boolean | Animation] animation Defaults to true. When true, the series' updating will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 3.0
           */
  def addAxis(options: AxisOptions, isX: scala.Boolean, redraw: scala.Boolean, animation: Animation): AxisObject = js.native
  /**
           * Add an axis to the chart after render time. Note that this method should never be used when adding data
           * synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the
           * same time as the chart is initiated, add the axis as a configuration option instead.
           * @param  options The Axis options, as documented under xAxis and yAxis.
           * @param  [boolean] isX Whether it is an X axis or Y axis
           * @param  [boolean] redraw Defaults to true. Whether to redraw the chart after the series is added. See the redraw() method.
           * @param  [boolean | Animation] animation Defaults to true. When true, the series' updating will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 3.0
           */
  def addAxis(options: AxisOptions, isX: scala.Boolean, redraw: scala.Boolean, animation: scala.Boolean): AxisObject = js.native
  /**
           * Set a new credits label for the chart.
           * @param A configuration object for the credits as defined at credits.
           * @since 5.0.0
           */
  def addCredits(options: CreditsOptions): scala.Unit = js.native
  /**
           * Add a series to the chart after render time. Note that this method should never be used when adding data
           * synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the
           * same time as the chart is initiated, add the series as a configuration option instead.
           * @param options The series options, as documented under plotOptions.series and under the plotOptions for each series type.
           * @param [boolean] redraw
           * @since 1.2.0
           */
  def addSeries[T /* <: IndividualSeriesOptions */](options: T): SeriesObject = js.native
  /**
           * Add a series to the chart after render time. Note that this method should never be used when adding data
           * synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the
           * same time as the chart is initiated, add the series as a configuration option instead.
           * @param options The series options, as documented under plotOptions.series and under the plotOptions for each series type.
           * @param [boolean] redraw
           * @since 1.2.0
           */
  def addSeries[T /* <: IndividualSeriesOptions */](options: T, redraw: scala.Boolean): SeriesObject = js.native
  /**
           * Add a series to the chart after render time. Note that this method should never be used when adding data
           * synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the
           * same time as the chart is initiated, add the series as a configuration option instead.
           * @param options The series options, as documented under plotOptions.series and under the plotOptions for each series type.
           * @param [boolean] redraw
           * @since 1.2.0
           */
  def addSeries[T /* <: IndividualSeriesOptions */](options: T, redraw: scala.Boolean, animation: Animation): SeriesObject = js.native
  /**
           * Add a series to the chart after render time. Note that this method should never be used when adding data
           * synchronously at chart render time, as it adds expense to the calculations and rendering. When adding data at the
           * same time as the chart is initiated, add the series as a configuration option instead.
           * @param options The series options, as documented under plotOptions.series and under the plotOptions for each series type.
           * @param [boolean] redraw
           * @since 1.2.0
           */
  def addSeries[T /* <: IndividualSeriesOptions */](options: T, redraw: scala.Boolean, animation: scala.Boolean): SeriesObject = js.native
  /**
           * Add a series to the chart as drilldown from a specific point in the parent series. This method is used for async
           * drilldown, when clicking a point in a series should result in loading and displaying a more high-resolution
           * series. When not async, the setup is simpler using the drilldown.series options structure.
           * @param point The existing Point object from which the drilldown will start.
           * @param seriesOptions The series options, as documented under plotOptions.series and under the plotOptions for each series type.
           * @since 3.0.8
           */
  def addSeriesAsDrilldown(point: PointObject, seriesOptions: IndividualSeriesOptions): scala.Unit = js.native
  /**
           * Removes the chart and purges memory. This method should be called before writing a new chart into the same
           * container. It is called internally on window unload to prevent leaks.
           * @since 1.2.2
           */
  def destroy(): scala.Unit = js.native
  /**
           * When the chart is drilled down to a child series, calling chart.drillUp() will drill up to the parent series.
           * @since 3.0.8
           */
  def drillUp(): scala.Unit = js.native
  /**
           * Exporting module required. Submit an SVG version of the chart to a server along with some parameters for
           * conversion.
           * @since 2.0
           */
  def exportChart(): scala.Unit = js.native
  /**
           * Exporting module required. Submit an SVG version of the chart to a server along with some parameters for
           * conversion.
           * @param options Exporting options. Out of the exporting options, the following options can be given as parameters to the exportChart method.
           * All options default to the values given in the exporting config options. filename: the filename for the export without extension,
           * url: the URL for the server module to do the conversion, width: the width of the PNG or JPEG image generated on the server,
           * type: the MIME type of the converted image, sourceWidth: the width of the source (in-page) chart, sourceHeight: the height of the source chart.
           * @since 2.0
           */
  def exportChart(options: ExportingOptions): scala.Unit = js.native
  /**
           * Exporting module required. Submit an SVG version of the chart to a server along with some parameters for
           * conversion.
           * @param options Exporting options. Out of the exporting options, the following options can be given as parameters to the exportChart method.
           * All options default to the values given in the exporting config options. filename: the filename for the export without extension,
           * url: the URL for the server module to do the conversion, width: the width of the PNG or JPEG image generated on the server,
           * type: the MIME type of the converted image, sourceWidth: the width of the source (in-page) chart, sourceHeight: the height of the source chart.
           * @param chartOptions Additional chart options for the exported chart. For example a different background color can be added here.
           * @since 2.0
           */
  def exportChart(options: ExportingOptions, chartOptions: Options): scala.Unit = js.native
  /**
           * Export the chart to a PNG or SVG without sending it to a server. Requires
           * modules/exporting.js and modules/offline-exporting.js.
           * @since 2.0
           */
  def exportChartLocal(): scala.Unit = js.native
  /**
           * Export the chart to a PNG or SVG without sending it to a server. Requires
           * modules/exporting.js and modules/offline-exporting.js.
           * @param options Exporting options. Same as
           * the exportChart params.
           * @since 2.0
           */
  def exportChartLocal(options: ExportingOptions): scala.Unit = js.native
  /**
           * Export the chart to a PNG or SVG without sending it to a server.
           * Requires modules/exporting.js and modules/offline-exporting.js.
           * @param options Exporting options. Same as
           * the exportChart params.
           * @param chartOptions Additional chart options for the
           * exported chart. Same as the exportChart params.
           * @since 2.0
           */
  def exportChartLocal(options: ExportingOptions, chartOptions: Options): scala.Unit = js.native
  /**
           * Get an axis, series or point by its id as given in the configuration options.
           * @param  id The id of the axis, series or point to get.
           * @since 1.2.0
           */
  def get(id: java.lang.String): AxisObject | SeriesObject | PointObject = js.native
  /**
           * Exporting module required. Get an SVG string representing the chart.
           * @param  additionalOptions Chart options to add to the exported chart in addition to the options given for the original chart.
           * For example if series.lineWidth should be greater in the exported chart than in the original, or the chart should have a different background color, this is added here.
           * @since 2.0
           */
  def getSVG(): java.lang.String = js.native
  /**
           * Exporting module required. Get an SVG string representing the chart.
           * @param  additionalOptions Chart options to add to the exported chart in addition to the options given for the original chart.
           * For example if series.lineWidth should be greater in the exported chart than in the original, or the chart should have a different background color, this is added here.
           * @since 2.0
           */
  def getSVG(additionalOptions: Options): java.lang.String = js.native
  /**
           * Returns an array of all currently selected points in the chart. Points can be selected either programmatically by
           * the point.select() method or by clicking.
           * @return An array of the selected points.
           * @since 1.2.0
           */
  def getSelectedPoints(): js.Array[PointObject] = js.native
  /**
           * Returns an array of all currently selected series in the chart. Series can be selected either programmatically by
           * the series.select() method or by checking the checkbox next to the legend item if series.showCheckBox is true.
           * @return An array of the selected Series items.
           * @since 1.2.0
           */
  def getSelectedSeries(): js.Array[SeriesObject] = js.native
  /**
           * Returns true if there are data points within the plot area now
           * @return If chart has any data.
           * @since 3.0.8
           */
  def hasData(): scala.Boolean = js.native
  /**
           * Hide the loading screen. Options for the loading screen are defined at options.loading.
           * @since 1.2.0
           */
  def hideLoading(): scala.Unit = js.native
  /**
           * Hide the 'No data to display' message added by the no-data-to-display plugin.
           * @since 3.0.8
           */
  def hideNoData(): scala.Unit = js.native
  /**
           * Exporting module required. Clears away other elements in the page and prints the chart as it is displayed. By
           * default, when the exporting module is enabled, a button at the upper left calls this method.
           * @since 2.0
           */
  def print(): scala.Unit = js.native
  /**
           * Redraw the chart after changes have been done to the data or axis extremes. All methods for updating axes, series
           * or points have a parameter for redrawing the chart. This is true by default. But in many cases you want to do
           * more than one operation on the chart before redrawing, for example add a number of points. In those cases it is a
           * waste of resources to redraw the chart for each new point added. So you add the points and call chart.redraw()
           * after.
           * @param [boolean | Animation] animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def redraw(): scala.Unit = js.native
  /**
           * Redraw the chart after changes have been done to the data or axis extremes. All methods for updating axes, series
           * or points have a parameter for redrawing the chart. This is true by default. But in many cases you want to do
           * more than one operation on the chart before redrawing, for example add a number of points. In those cases it is a
           * waste of resources to redraw the chart for each new point added. So you add the points and call chart.redraw()
           * after.
           * @param [boolean | Animation] animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def redraw(animation: Animation): scala.Unit = js.native
  /**
           * Redraw the chart after changes have been done to the data or axis extremes. All methods for updating axes, series
           * or points have a parameter for redrawing the chart. This is true by default. But in many cases you want to do
           * more than one operation on the chart before redrawing, for example add a number of points. In those cases it is a
           * waste of resources to redraw the chart for each new point added. So you add the points and call chart.redraw()
           * after.
           * @param [boolean | Animation] animation Defaults to true. When true, the update will be animated with default animation options.
           * The animation can also be a configuration object with properties duration and easing.
           * @since 1.2.0
           */
  def redraw(animation: scala.Boolean): scala.Unit = js.native
  /**
           * Reflows the chart to its container. By default, the chart reflows automatically to its container following a
           * window.resize event, as per the chart.reflow option. However, there are no reliable events for div resize, so if
           * the container is resized without a window resize event, this must be called explicitly.
           */
  def reflow(): scala.Unit = js.native
  /**
           * Resize the chart to a given width and height.
           * @param width The new pixel width of the chart.
           * @param height The new pixel height of the chart.
           * @param animation Defaults to true. When true, the resize will be animated with default animation options.
           *  The animation can also be a configuration object with properties duration and easing.
           */
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
           * Resize the chart to a given width and height.
           * @param width The new pixel width of the chart.
           * @param height The new pixel height of the chart.
           * @param animation Defaults to true. When true, the resize will be animated with default animation options.
           *  The animation can also be a configuration object with properties duration and easing.
           */
  def setSize(width: scala.Double, height: scala.Double, animation: Animation): scala.Unit = js.native
  /**
           * Resize the chart to a given width and height.
           * @param width The new pixel width of the chart.
           * @param height The new pixel height of the chart.
           * @param animation Defaults to true. When true, the resize will be animated with default animation options.
           *  The animation can also be a configuration object with properties duration and easing.
           */
  def setSize(width: scala.Double, height: scala.Double, animation: scala.Boolean): scala.Unit = js.native
  /**
           * Set a new title or subtitle for the chart
           * @param title A configuration object for the new title as defined at #title.
           * @param [SubtitleOptions] subtitle A configuration object for the new subtitle as defined at #subtitle.
           * @param [boolean] redraw Whether to redraw the chart. Defaults to true.
           * @since 2.1.0
           */
  def setTitle(title: TitleOptions): scala.Unit = js.native
  /**
           * Set a new title or subtitle for the chart
           * @param title A configuration object for the new title as defined at #title.
           * @param [SubtitleOptions] subtitle A configuration object for the new subtitle as defined at #subtitle.
           * @param [boolean] redraw Whether to redraw the chart. Defaults to true.
           * @since 2.1.0
           */
  def setTitle(title: TitleOptions, subtitle: SubtitleOptions): scala.Unit = js.native
  /**
           * Set a new title or subtitle for the chart
           * @param title A configuration object for the new title as defined at #title.
           * @param [SubtitleOptions] subtitle A configuration object for the new subtitle as defined at #subtitle.
           * @param [boolean] redraw Whether to redraw the chart. Defaults to true.
           * @since 2.1.0
           */
  def setTitle(title: TitleOptions, subtitle: SubtitleOptions, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * Dim the chart's plot area and show a loading label text. Options for the loading screen are defined at
           * options.loading. A custom text can be given as a parameter for loading.
           * @since 2.0.5
           */
  def showLoading(): scala.Unit = js.native
  /**
           * Dim the chart's plot area and show a loading label text. Options for the loading screen are defined at
           * options.loading. A custom text can be given as a parameter for loading.
           * @since 2.0.5
           */
  def showLoading(str: java.lang.String): scala.Unit = js.native
  /**
           * Display a no-data message.
           * @param message An optional message to show in place of the default one
           * @since 3.0.8
           */
  def showNoData(): scala.Unit = js.native
  /**
           * Display a no-data message.
           * @param message An optional message to show in place of the default one
           * @since 3.0.8
           */
  def showNoData(message: java.lang.String): scala.Unit = js.native
  /**
           * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled,
           * re-formatted etc.
           * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections,
           * an id option is used to map the new option set to an existing object. If an existing object of the same id is not
           * found, the first item is updated. So for example, running chart.update with a series item without an id, will cause
           * the existing chart's first series to be updated.
           * See also the responsive option set. Switching between responsive.rules basically runs chart.update under the hood.
           * @param option A configuration object for the new chart options as defined in the options section of the API.
           * @param [boolean] redraw Whether to redraw the chart. Defaults to true.
           * @param [boolean] oneToOne When true, the series, xAxis and yAxis collections will be updated one to one, and
           * items will be either added or removed to match the new updated options. Defaults to false.
           * @param [(boolean | AnimationOptions)] animation Whether to apply animation, and optionally animation configuration.
           * @since 5.0.0
           */
  def update(options: Options): scala.Unit = js.native
  /**
           * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled,
           * re-formatted etc.
           * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections,
           * an id option is used to map the new option set to an existing object. If an existing object of the same id is not
           * found, the first item is updated. So for example, running chart.update with a series item without an id, will cause
           * the existing chart's first series to be updated.
           * See also the responsive option set. Switching between responsive.rules basically runs chart.update under the hood.
           * @param option A configuration object for the new chart options as defined in the options section of the API.
           * @param [boolean] redraw Whether to redraw the chart. Defaults to true.
           * @param [boolean] oneToOne When true, the series, xAxis and yAxis collections will be updated one to one, and
           * items will be either added or removed to match the new updated options. Defaults to false.
           * @param [(boolean | AnimationOptions)] animation Whether to apply animation, and optionally animation configuration.
           * @since 5.0.0
           */
  def update(options: Options, redraw: scala.Boolean): scala.Unit = js.native
  /**
           * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled,
           * re-formatted etc.
           * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections,
           * an id option is used to map the new option set to an existing object. If an existing object of the same id is not
           * found, the first item is updated. So for example, running chart.update with a series item without an id, will cause
           * the existing chart's first series to be updated.
           * See also the responsive option set. Switching between responsive.rules basically runs chart.update under the hood.
           * @param option A configuration object for the new chart options as defined in the options section of the API.
           * @param [boolean] redraw Whether to redraw the chart. Defaults to true.
           * @param [boolean] oneToOne When true, the series, xAxis and yAxis collections will be updated one to one, and
           * items will be either added or removed to match the new updated options. Defaults to false.
           * @param [(boolean | AnimationOptions)] animation Whether to apply animation, and optionally animation configuration.
           * @since 5.0.0
           */
  def update(options: Options, redraw: scala.Boolean, oneToOne: scala.Boolean): scala.Unit = js.native
  /**
           * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled,
           * re-formatted etc.
           * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections,
           * an id option is used to map the new option set to an existing object. If an existing object of the same id is not
           * found, the first item is updated. So for example, running chart.update with a series item without an id, will cause
           * the existing chart's first series to be updated.
           * See also the responsive option set. Switching between responsive.rules basically runs chart.update under the hood.
           * @param option A configuration object for the new chart options as defined in the options section of the API.
           * @param [boolean] redraw Whether to redraw the chart. Defaults to true.
           * @param [boolean] oneToOne When true, the series, xAxis and yAxis collections will be updated one to one, and
           * items will be either added or removed to match the new updated options. Defaults to false.
           * @param [(boolean | AnimationOptions)] animation Whether to apply animation, and optionally animation configuration.
           * @since 5.0.0
           */
  def update(options: Options, redraw: scala.Boolean, oneToOne: scala.Boolean, animation: AnimationOptions): scala.Unit = js.native
  /**
           * A generic function to update any element of the chart. Elements can be enabled and disabled, moved, re-styled,
           * re-formatted etc.
           * A special case is configuration objects that take arrays, for example xAxis, yAxis or series. For these collections,
           * an id option is used to map the new option set to an existing object. If an existing object of the same id is not
           * found, the first item is updated. So for example, running chart.update with a series item without an id, will cause
           * the existing chart's first series to be updated.
           * See also the responsive option set. Switching between responsive.rules basically runs chart.update under the hood.
           * @param option A configuration object for the new chart options as defined in the options section of the API.
           * @param [boolean] redraw Whether to redraw the chart. Defaults to true.
           * @param [boolean] oneToOne When true, the series, xAxis and yAxis collections will be updated one to one, and
           * items will be either added or removed to match the new updated options. Defaults to false.
           * @param [(boolean | AnimationOptions)] animation Whether to apply animation, and optionally animation configuration.
           * @since 5.0.0
           */
  def update(options: Options, redraw: scala.Boolean, oneToOne: scala.Boolean, animation: scala.Boolean): scala.Unit = js.native
  /**
           * This method is deprecated as of 2.0.1. Updating the chart position after a move operation is no longer necessary.
           * @since 1.2.5
           * @deprecated
           */
  def updatePosition(): scala.Unit = js.native
}

