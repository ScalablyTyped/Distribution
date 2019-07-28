package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgFinancialChart
  extends /**
	 * Option for igFinancialChart
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * A FinancialChartRangeSelectorOptionCollection containing the available range selector options on the toolbar.
  	 * This will be the intersection of the user-defined range selector options, if any, and the range selector options which are automatically determined based on the range of data.
  	 */
  var actualRangeSelectorOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets a value indicating whether grid and tick lines are aligned to device pixels.
  	 */
  var alignsGridLinesToPixels: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the series animations should be allowed when a range change has been detected on an axis.
  	 */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event raised by the chart when custom indicator data is needed from the application.
  	 * During series rendering, event will be raised once for each value in the CustomIndicatorNames collection.
  	 */
  var applyCustomIndicators: js.UndefOr[ApplyCustomIndicatorsEvent] = js.undefined
  /**
  	 * Gets or sets the bottom margin around the chart content.
  	 */
  var bottomMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the palette of brushes to use for coloring the chart series.
  	 * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var brushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Occurs when the style of a callout is updated.
  	 */
  var calloutStyleUpdating: js.UndefOr[CalloutStyleUpdatingEvent] = js.undefined
  /**
  	 * Gets or sets if event annotations should be displayed.
  	 */
  var calloutStyleUpdatingEventEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the member path of the content data for the callouts.
  	 */
  var calloutsContentMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the collection of callout data to be annotated.
  	 */
  var calloutsItemsSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the member path of the label data for the callouts.
  	 */
  var calloutsLabelMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets if callouts should be displayed.
  	 */
  var calloutsVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the member path of the X data for the callouts.
  	 */
  var calloutsXMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the member path of the Y data for the callouts.
  	 */
  var calloutsYMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * The type of price series to display in the main chart.
  	 *
  	 * Valid values:
  	 * "auto" Automatically determine the price series type to display in the main chart.
  	 * "bar" Display financial bar series in the main chart.
  	 * "candle" Display candlestick series in the main chart.
  	 * "column" Display column series in the main chart.
  	 * "line" Display line series in the main chart.
  	 */
  var chartType: js.UndefOr[String] = js.undefined
  var chartTypePickerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets a function for creating wrapped tooltip
  	 */
  var createWrappedTooltip: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets whether annotations are shown along the axis for crosshair values
  	 */
  var crosshairsAnnotationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the crosshairs to be displayed.
  	 *
  	 * Valid values:
  	 * "default" Display default number of crosshair lines in the chart.
  	 * "none" Display no crosshair lines in the chart.
  	 * "horizontal" Display horizontal line of crosshairs in the chart.
  	 * "vertical" Display vertical line of crosshairs in the chart.
  	 * "both" Display both horizontal and vertical lines of crosshairs in the chart.
  	 */
  var crosshairsDisplayMode: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets whether crosshairs will snap to the nearest data point.
  	 */
  var crosshairsSnapToData: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The names of custom indicators to add to the chart.
  	 * When CustomIndicatorNames is set, the ApplyCustomIndicators event will be raised for each custom indicator name.
  	 */
  var customIndicatorNames: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event which is raised before data binding.
  	 * Return false in order to cancel data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  /**
  	 * Event which is raised after data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.data to obtain reference to array actual data which is displayed by chart.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.undefined
  /**
  	 * Gets sets a valid data source.
  	 * That can be instance of array or primitives, array of objects, instance of $.ig.DataSource, or any other data accepted by $.ig.DataSource.
  	 * Note: if it is set to string and "dataSourceType" option is not set, then $.ig.JSONPDataSource is used.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets sets data source type (such as "json", "xml", etc). Please refer to the documentation of $.ig.DataSource and its type property
  	 */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets sets url which is used for sending JSON on request for remote data.
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets a set of property paths that should be excluded from consideration by the category chart.
  	 */
  var excludedProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets whether annotations for the final value of each series is displayed on the axis.
  	 */
  var finalValueAnnotationsVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets a legend displayed between toolbar and chart's plot area
  	 */
  var financialChartLegend: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The height of the chart.
  	 */
  var height: js.UndefOr[Double] = js.undefined
  /**
  	 * Event which is raised before tooltip is hidden.
  	 * Return false in order to cancel hiding and keep tooltip visible.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.item to obtain reference to item.
  	 * Use ui.element to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
  	 */
  var hideTooltip: js.UndefOr[HideTooltipEvent] = js.undefined
  /**
  	 * Gets or sets a set of property paths that should be included for consideration by the category chart, leaving the remainder excluded. If null, all properties will be considered.
  	 */
  var includedProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Brushes to use for financial indicators.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var indicatorBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The display types of financial indicators.
  	 */
  var indicatorDisplayTypes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The long period of financial indicators, where applicable.
  	 */
  var indicatorLongPeriod: js.UndefOr[Double] = js.undefined
  var indicatorMenuTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The multiplier of financial indicators, where applicable.
  	 */
  var indicatorMultiplier: js.UndefOr[Double] = js.undefined
  /**
  	 * Brushes to use for negative elements in financial indicators.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var indicatorNegativeBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The period of financial indicators, where applicable.
  	 */
  var indicatorPeriod: js.UndefOr[Double] = js.undefined
  /**
  	 * The short period of financial indicators, where applicable.
  	 */
  var indicatorShortPeriod: js.UndefOr[Double] = js.undefined
  /**
  	 * The signal period of financial indicators, where applicable.
  	 */
  var indicatorSignalPeriod: js.UndefOr[Double] = js.undefined
  /**
  	 * The smoothing period of financial indicators, where applicable.
  	 */
  var indicatorSmoothingPeriod: js.UndefOr[Double] = js.undefined
  /**
  	 * The outline or stroke thickness of financial indicators.
  	 */
  var indicatorThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * A collection indicating what financial indicator types to display on the Financial Chart.
  	 */
  var indicatorTypes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets whether the chart can be horizontally zoomed through user interactions.
  	 */
  var isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets weather or not a legend is visible between toolbar and chart's plot area
  	 */
  var isLegendVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the chart can highlight series through user interactions.
  	 * This property applies to Category Chart and Financial Chart controls.
  	 */
  var isSeriesHighlightingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A boolean property controlling the visibility of the toolbar.
  	 */
  var isToolbarVisible: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the chart can be vertically zoomed through user interactions.
  	 */
  var isVerticalZoomEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A boolean indicating whether the chart should automatically zoom in vertically on the currently visible range of data.
  	 * When this property is set to true, panning and zooming along the X-axis will result in a corresponding zoom on the Y-axis, so that the visible range of data fills the zoom window as fully as possible.
  	 */
  var isWindowSyncedToVisibleRange: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets a collection of data items used to generate the chart.
  	 * The ItemsSource of this chart can be a list of objects containing one or more numeric properties.
  	 * Additionally, if the objects in the list implement the IEnumerable interface,
  	 * the Chart will attempt to delve into the sub-collections when reading through the data source.
  	 * Databinding can be further configured by attributing the data item classes
  	 * with the DataSeriesMemberIntentAttribute.
  	 */
  var itemsSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the left margin of the chart content.
  	 */
  var leftMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the legend to connect this chart to.
  	 * When the legend property is set, the chart will use it to display information about its series.  Legends can be shared by multiple chart controls.
  	 */
  var legend: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the palette of brushes used for rendering fill area of data point markers.
  	 * This property applies only to these chart types: point, line, spline, bubble, and polygon
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var markerBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the maximum number of markers displyed in the plot area of the chart.
  	 */
  var markerMaxCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the palette of brushes used for rendering outlines of data point markers.
  	 * This property applies only to these chart types: point, line, spline, bubble, and polygon
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var markerOutlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the marker shapes used for indicating location of data points in this chart.
  	 * This property applies only to these chart types: point, line, spline, bubble, and polygon
  	 */
  var markerTypes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets sets maximum number of displayed records in chart.
  	 */
  var maxRecCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the palette used for coloring negative items of Waterfall chart type.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var negativeBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Brushes to use for drawing negative elements, when using a chart type with contextual coloring, such as Waterfall.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var negativeOutlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the palette of brushes to use for outlines on the chart series.
  	 * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Brushes to use for filling financial overlays.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var overlayBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Brushes to use for outlining financial overlays.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var overlayOutlines: js.UndefOr[js.Any] = js.undefined
  var overlayPickerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The outline thickness of financial overlays.
  	 */
  var overlayThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * A collection indicating what financial overlay types to display on the Financial Chart.
  	 */
  var overlayTypes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Event raised when a property value is changed on this chart
  	 */
  var propertyChanged: js.UndefOr[PropertyChangedEvent] = js.undefined
  /**
  	 * A FinancialChartRangeSelectorOptionCollection containing the available range selector options on the toolbar.
  	 */
  var rangeSelectorOptions: js.UndefOr[js.Any] = js.undefined
  var rangeSelectorTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the rendering resolution for all series in this chart.
  	 * Where n = Resolution, for every n horizontal pixels, combine all items into a single datapoint.  When Resolution = 0, all datapoints will be rendered as graphical objects.  Charts with a higher resolution will have faster performance.
  	 */
  var resolution: js.UndefOr[Double] = js.undefined
  /**
  	 * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
  	 * See $.ig.DataSource. property in the response specifying the total number of records on the server.
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the right margin of the chart content.
  	 */
  var rightMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Event raised when a series is initialized and added to this chart.
  	 */
  var seriesAdded: js.UndefOr[SeriesAddedEvent] = js.undefined
  /**
  	 * Occurs when the pointer is pressed down over a Series.
  	 */
  var seriesPointerDown: js.UndefOr[SeriesPointerDownEvent] = js.undefined
  /**
  	 * Occurs when the pointer enters a Series.
  	 */
  var seriesPointerEnter: js.UndefOr[SeriesPointerEnterEvent] = js.undefined
  /**
  	 * Occurs when the pointer leaves a Series.
  	 */
  var seriesPointerLeave: js.UndefOr[SeriesPointerLeaveEvent] = js.undefined
  /**
  	 * Occurs when the pointer moves over a Series.
  	 */
  var seriesPointerMove: js.UndefOr[SeriesPointerMoveEvent] = js.undefined
  /**
  	 * Occurs when the pointer is released over a Series.
  	 */
  var seriesPointerUp: js.UndefOr[SeriesPointerUpEvent] = js.undefined
  /**
  	 * Event raised when a series is removed from this chart.
  	 */
  var seriesRemoved: js.UndefOr[SeriesRemovedEvent] = js.undefined
  /**
  	 * Gets or sets text to display below the Title, above the plot area.
  	 */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets horizontal alignment which determines the subtitle position, relative to the left and right edges of the control.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var subtitleAlignment: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the bottom margin of chart subtitle
  	 */
  var subtitleBottomMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the left margin of chart subtitle
  	 */
  var subtitleLeftMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the right margin of chart subtitle
  	 */
  var subtitleRightMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets color of chart subtitle
  	 */
  var subtitleTextColor: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets CSS font property for the chart subtitle
  	 */
  var subtitleTextStyle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the top margin of chart subtitle
  	 */
  var subtitleTopMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the thickness for all series in this chart. Depending on the ChartType, this can be the main brush used, or just the outline.
  	 */
  var thickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets text to display above the plot area.
  	 */
  var title: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets horizontal alignment which determines the title position, relative to the left and right edges of the control.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var titleAlignment: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the bottom margin of chart title
  	 */
  var titleBottomMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the left margin of chart title
  	 */
  var titleLeftMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the right margin of chart title
  	 */
  var titleRightMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets color of chart title
  	 */
  var titleTextColor: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets CSS font property for the chart title
  	 */
  var titleTextStyle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the top margin of chart title
  	 */
  var titleTopMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the style of tooltip to be displayed.
  	 *
  	 * Valid values:
  	 * "default" Display default tooltip for each series in the chart.
  	 * "item" Display individual tooltips for all series in the chart.
  	 * "category" Display combined tooltip for all series in the chart.
  	 * "none" Display no tooltips in the chart.
  	 */
  var toolTipType: js.UndefOr[String] = js.undefined
  var toolbarHeight: js.UndefOr[Double] = js.undefined
  var toolbarTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the id of a template element to use for tooltips, or markup representing the tooltip template.
  	 */
  var tooltipTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the names of tooltip templates
  	 */
  var tooltipTemplates: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the top margin of the chart content.
  	 */
  var topMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the duration used for animating series plots when the data is changing
  	 */
  var transitionDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the easing function used for animating series plots when the data is changing.
  	 * This can be set to one of the known values "linear" or "cubic," or it can be set to an easing function which takes a single numeric parameter and returns a number.
  	 */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the palette of brushes to used for coloring trend lines in this chart.
  	 * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var trendLineBrushes: js.UndefOr[js.Any] = js.undefined
  var trendLinePeriod: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the thickness of the trend lines in this chart.
  	 * This property applies only to these chart types: point, line, spline, and bubble
  	 */
  var trendLineThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the formula used for calculating trend lines in this chart.This property applies only to these chart types: point, line, spline, and bubble
  	 *
  	 *
  	 * Valid values:
  	 * "none" No trend line will be displayed.
  	 * "linearFit" Linear fit.
  	 * "quadraticFit" Quadratic polynomial fit.
  	 * "cubicFit" Cubic polynomial fit.
  	 * "quarticFit" Quartic polynomial fit.
  	 * "quinticFit" Quintic polynomial fit.
  	 * "logarithmicFit" Logarithmic fit.
  	 * "exponentialFit" Exponential fit.
  	 * "powerLawFit" Powerlaw fit.
  	 * "simpleAverage" Simple moving average.
  	 * "exponentialAverage" Exponential moving average.
  	 * "modifiedAverage" Modified moving average.
  	 * "cumulativeAverage" Cumulative moving average.
  	 * "weightedAverage" Weighted moving average.
  	 */
  var trendLineType: js.UndefOr[String] = js.undefined
  var trendLineTypePickerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the behavior that determines how unknown values will be plotted on the chart.Null and Double.NaN are two examples of unknown values.
  	 *
  	 *
  	 * Valid values:
  	 * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
  	 * "dontPlot" Do not plot the unknown value on the chart.
  	 */
  var unknownValuePlotting: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised before tooltip is updated.
  	 * Return false in order to cancel updating and hide tooltip.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.text to obtain html of tooltip. Value of that member can be modified. If modified value is null or empty string, then current content of tooltip keeps old value.
  	 * Use ui.item to obtain reference to item. Value of that member can be modified or replaced by custom item.
  	 * Use ui.x to obtain left position of tooltip in pixels relative to widget. Value of that member can be modified.
  	 * Use ui.y to obtain top position of tooltip in pixels relative to widget. Value of that member can be modified.
  	 * Use ui.element to obtain reference to jquery object which represents tooltip. Value of that member can be replaced by custom element.
  	 */
  var updateTooltip: js.UndefOr[UpdateTooltipEvent] = js.undefined
  /**
  	 * Brushes to use for filling volume series in the volume pane.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var volumeBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Brushes to use for outlining volume series in the volume pane.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var volumeOutlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The outline thickness of volume series in the volume pane.
  	 */
  var volumeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * The type of series to display in the volume pane.
  	 *
  	 * Valid values:
  	 * "none" Do not display the volume pane.
  	 * "column" Display column series in the volume pane.
  	 * "line" Display line series in the volume pane.
  	 * "area" Display area series in the volume pane.
  	 */
  var volumeType: js.UndefOr[String] = js.undefined
  var volumeTypePickerTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the widget of this control
  	 */
  var widget: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The width of the chart.
  	 */
  var width: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the rectangle representing the current scroll and zoom state of the chart.
  	 * WindowRect is expressed as a Rectangle with coordinates and sizes between 0 and 1.
  	 * The provided object should have numeric properties called left, top, width and height.
  	 */
  var windowRect: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the distance between the X-axis and the bottom of the chart.
  	 */
  var xAxisExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets function which takes an context object and returns a formatted label for the X-axis.
  	 */
  var xAxisFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets whether to invert the direction of the X-axis by placing the first data items on the right side of the chart.
  	 */
  var xAxisInverted: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the format for labels along the X-axis.
  	 */
  var xAxisLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the angle of rotation for labels along the X-axis.
  	 */
  var xAxisLabelAngle: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the bottom margin of labels on the X-axis
  	 */
  var xAxisLabelBottomMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets Horizontal alignment of X-axis labels.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var xAxisLabelHorizontalAlignment: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the left margin of labels on the X-axis
  	 */
  var xAxisLabelLeftMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the right margin of labels on the X-axis
  	 */
  var xAxisLabelRightMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets color of labels on the X-axis
  	 */
  var xAxisLabelTextColor: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets CSS font property for labels on X-axis
  	 */
  var xAxisLabelTextStyle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the top margin of labels on the X-axis
  	 */
  var xAxisLabelTopMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets Vertical alignment of X-axis labels.
  	 *
  	 * Valid values:
  	 * "top" Align the item to the top
  	 * "center" Center the item
  	 * "bottom" Align the item to the bottom
  	 * "stretch" Stretch the item to the full height
  	 */
  var xAxisLabelVerticalAlignment: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets Visibility of X-axis labels.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var xAxisLabelVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the color to apply to major gridlines along the X-axis.
  	 */
  var xAxisMajorStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to major gridlines along the X-axis.
  	 */
  var xAxisMajorStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets maximum value on x-axis
  	 */
  var xAxisMaximumValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets minimum value on x-axis
  	 */
  var xAxisMinimumValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the color to apply to minor gridlines along the X-axis.
  	 */
  var xAxisMinorStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to minor gridlines along the X-axis.
  	 */
  var xAxisMinorStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * The scaling mode of the X-axis.
  	 *
  	 * Valid values:
  	 * "ordinal" An ordinal scale with time labels.
  	 * "time" A time scale.
  	 */
  var xAxisMode: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the color to apply to stripes along the X-axis.
  	 */
  var xAxisStrip: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the color to apply to the X-axis line.
  	 */
  var xAxisStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to the X-axis line.
  	 */
  var xAxisStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the length of tickmarks along the X-axis.
  	 */
  var xAxisTickLength: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to tickmarks along the X-axis.
  	 */
  var xAxisTickStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to tickmarks along the X-axis.
  	 */
  var xAxisTickStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the Text to display below the X-axis.
  	 */
  var xAxisTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets Horizontal alignment of the X-axis title.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var xAxisTitleAlignment: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the angle of rotation for the X-axis title.
  	 */
  var xAxisTitleAngle: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the bottom margin of a title on the X-axis
  	 */
  var xAxisTitleBottomMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the left margin of a title on the X-axis
  	 */
  var xAxisTitleLeftMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the margin around a title on the X-axis
  	 */
  var xAxisTitleMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the right margin of a title on the X-axis
  	 */
  var xAxisTitleRightMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets color of title on the X-axis
  	 */
  var xAxisTitleTextColor: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets CSS font property for title on X-axis
  	 */
  var xAxisTitleTextStyle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the top margin of a title on the X-axis
  	 */
  var xAxisTitleTopMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets whether the large numbers on the Y-axis labels are abbreviated.
  	 */
  var yAxisAbbreviateLargeNumbers: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the distance between the Y-axis and the left edge of the chart.
  	 */
  var yAxisExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets function which takes a context object and returns a formatted label for the Y-axis.
  	 */
  var yAxisFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the distance between each label and grid line along the Y-axis.
  	 */
  var yAxisInterval: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets whether to invert the direction of the Y-axis by placing the minimum numeric value at the top of the chart.
  	 */
  var yAxisInverted: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the Y-axis should use a logarithmic scale instead of a linear one.
  	 * Since log(-1) is imaginary and log(0) is undefined, it is recommended to enable this property only when the Y-axis minimum is greater than zero.
  	 */
  var yAxisIsLogarithmic: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the property or string from which the labels are derived.
  	 */
  var yAxisLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the angle of rotation for labels along the Y-axis.
  	 */
  var yAxisLabelAngle: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the bottom margin of labels on the Y-axis
  	 */
  var yAxisLabelBottomMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets Horizontal alignment of Y-axis labels.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var yAxisLabelHorizontalAlignment: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the left margin of labels on the Y-axis
  	 */
  var yAxisLabelLeftMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * The location of Y-axis labels, relative to the plot area.
  	 *
  	 * Valid values:
  	 * "outsideTop" Places the axis labels at the top, outside of the plotting area.
  	 * "outsideBottom" Places the axis labels at the bottom, outside of the plotting area
  	 * "outsideLeft" Places the axis labels to the left, outside of the plotting area.
  	 * "outsideRight" Places the axis labels to the right, outside of the plotting area.
  	 * "insideTop" Places the axis labels inside the plotting area above the axis line.
  	 * "insideBottom" Places the axis labels inside the plotting area below the axis line.
  	 * "insideLeft" Places the axis labels inside the plotting area and to the left of the axis line.
  	 * "insideRight" Places the axis labels inside the plotting area and to the right of the axis line.
  	 */
  var yAxisLabelLocation: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the right margin of labels on the Y-axis
  	 */
  var yAxisLabelRightMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets color of labels on the Y-axis
  	 */
  var yAxisLabelTextColor: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets CSS font property for labels on Y-axis
  	 */
  var yAxisLabelTextStyle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the top margin of labels on the Y-axis
  	 */
  var yAxisLabelTopMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets Vertical alignment of Y-axis labels.
  	 *
  	 * Valid values:
  	 * "top" Align the item to the top
  	 * "center" Center the item
  	 * "bottom" Align the item to the bottom
  	 * "stretch" Stretch the item to the full height
  	 */
  var yAxisLabelVerticalAlignment: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets Visibility of Y-axis labels.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var yAxisLabelVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the base value to use in the log function when mapping the position of data items along the Y-axis.
  	 * This property is effective only when YAxisIsLogarithmic is true.
  	 */
  var yAxisLogarithmBase: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to major gridlines along the Y-axis.
  	 */
  var yAxisMajorStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to major gridlines along the Y-axis.
  	 */
  var yAxisMajorStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the data value corresponding to the maximum value of the Y-axis.
  	 */
  var yAxisMaximumValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the data value corresponding to the minimum value of the Y-axis.
  	 */
  var yAxisMinimumValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the frequency of displayed minor lines along the Y-axis.
  	 */
  var yAxisMinorInterval: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to minor gridlines along the Y-axis.
  	 */
  var yAxisMinorStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to minor gridlines along the Y-axis.
  	 */
  var yAxisMinorStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * The scaling mode of the Y-axis.
  	 *
  	 * Valid values:
  	 * "numeric" A linear or logarithmic numeric scale.
  	 * "percentChange" A numeric scale where all values are scaled proportionally to a reference value.
  	 */
  var yAxisMode: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the color to apply to stripes along the Y-axis.
  	 */
  var yAxisStrip: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the color to apply to the Y-axis line.
  	 */
  var yAxisStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to the Y-axis line.
  	 */
  var yAxisStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the length of tickmarks along the Y-axis.
  	 */
  var yAxisTickLength: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to tickmarks along the Y-axis.
  	 */
  var yAxisTickStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to tickmarks along the Y-axis.
  	 */
  var yAxisTickStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the Text to display to the left of the Y-axis.
  	 */
  var yAxisTitle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets Vertical alignment of the Y-axis title.
  	 *
  	 * Valid values:
  	 * "top" Align the item to the top
  	 * "center" Center the item
  	 * "bottom" Align the item to the bottom
  	 * "stretch" Stretch the item to the full height
  	 */
  var yAxisTitleAlignment: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the angle of rotation for the Y-axis title.
  	 */
  var yAxisTitleAngle: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the bottom margin of a title on the Y-axis
  	 */
  var yAxisTitleBottomMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the left margin of a title on the Y-axis
  	 */
  var yAxisTitleLeftMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the margin around a title on the Y-axis
  	 */
  var yAxisTitleMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the right margin of a title on the Y-axis
  	 */
  var yAxisTitleRightMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets color of title on the Y-axis
  	 */
  var yAxisTitleTextColor: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets CSS font property for title on Y-axis
  	 */
  var yAxisTitleTextStyle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the top margin of a title on the Y-axis
  	 */
  var yAxisTitleTopMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets type of series to display in the zoom slider pane.
  	 *
  	 * Valid values:
  	 * "none" Do not display the zoom slider pane.
  	 * "auto" In the zoom slider pane, match the series type in the price pane.
  	 * "bar" Display financial bar series in the zoom slider pane.
  	 * "candle" Display candle series in the zoom slider pane.
  	 * "column" Display column series in the zoom slider pane.
  	 * "line" Display line series in the zoom slider pane.
  	 * "area" Display an area series in the zoom slider pane.
  	 */
  var zoomSliderType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets stroke brush of major gridlines on x-axis of the zoom slider pane
  	 */
  var zoomSliderXAxisMajorStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets thickness of major gridlines on x-axis of the zoom slider pane
  	 */
  var zoomSliderXAxisMajorStrokeThickness: js.UndefOr[Double] = js.undefined
}

object IgFinancialChart {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igFinancialChart
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    actualRangeSelectorOptions: js.Any = null,
    alignsGridLinesToPixels: js.UndefOr[Boolean] = js.undefined,
    animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.undefined,
    applyCustomIndicators: ApplyCustomIndicatorsEvent = null,
    bottomMargin: Int | Double = null,
    brushes: js.Any = null,
    calloutStyleUpdating: CalloutStyleUpdatingEvent = null,
    calloutStyleUpdatingEventEnabled: js.UndefOr[Boolean] = js.undefined,
    calloutsContentMemberPath: String = null,
    calloutsItemsSource: js.Any = null,
    calloutsLabelMemberPath: String = null,
    calloutsVisible: js.UndefOr[Boolean] = js.undefined,
    calloutsXMemberPath: String = null,
    calloutsYMemberPath: String = null,
    chartType: String = null,
    chartTypePickerTemplate: js.Any = null,
    createWrappedTooltip: js.Any = null,
    crosshairsAnnotationEnabled: js.UndefOr[Boolean] = js.undefined,
    crosshairsDisplayMode: String = null,
    crosshairsSnapToData: js.UndefOr[Boolean] = js.undefined,
    customIndicatorNames: js.Any = null,
    dataBinding: DataBindingEvent = null,
    dataBound: DataBoundEvent = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    excludedProperties: js.Any = null,
    finalValueAnnotationsVisible: js.UndefOr[Boolean] = js.undefined,
    financialChartLegend: js.Any = null,
    height: Int | Double = null,
    hideTooltip: HideTooltipEvent = null,
    includedProperties: js.Any = null,
    indicatorBrushes: js.Any = null,
    indicatorDisplayTypes: js.Any = null,
    indicatorLongPeriod: Int | Double = null,
    indicatorMenuTemplate: js.Any = null,
    indicatorMultiplier: Int | Double = null,
    indicatorNegativeBrushes: js.Any = null,
    indicatorPeriod: Int | Double = null,
    indicatorShortPeriod: Int | Double = null,
    indicatorSignalPeriod: Int | Double = null,
    indicatorSmoothingPeriod: Int | Double = null,
    indicatorThickness: Int | Double = null,
    indicatorTypes: js.Any = null,
    isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    isLegendVisible: js.UndefOr[Boolean] = js.undefined,
    isSeriesHighlightingEnabled: js.UndefOr[Boolean] = js.undefined,
    isToolbarVisible: js.UndefOr[Boolean] = js.undefined,
    isVerticalZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    isWindowSyncedToVisibleRange: js.UndefOr[Boolean] = js.undefined,
    itemsSource: js.Any = null,
    leftMargin: Int | Double = null,
    legend: js.Any = null,
    markerBrushes: js.Any = null,
    markerMaxCount: Int | Double = null,
    markerOutlines: js.Any = null,
    markerTypes: js.Any = null,
    maxRecCount: Int | Double = null,
    negativeBrushes: js.Any = null,
    negativeOutlines: js.Any = null,
    outlines: js.Any = null,
    overlayBrushes: js.Any = null,
    overlayOutlines: js.Any = null,
    overlayPickerTemplate: js.Any = null,
    overlayThickness: Int | Double = null,
    overlayTypes: js.Any = null,
    pixelScalingRatio: Int | Double = null,
    propertyChanged: PropertyChangedEvent = null,
    rangeSelectorOptions: js.Any = null,
    rangeSelectorTemplate: js.Any = null,
    resolution: Int | Double = null,
    responseDataKey: String = null,
    responseTotalRecCountKey: String = null,
    rightMargin: Int | Double = null,
    seriesAdded: SeriesAddedEvent = null,
    seriesPointerDown: SeriesPointerDownEvent = null,
    seriesPointerEnter: SeriesPointerEnterEvent = null,
    seriesPointerLeave: SeriesPointerLeaveEvent = null,
    seriesPointerMove: SeriesPointerMoveEvent = null,
    seriesPointerUp: SeriesPointerUpEvent = null,
    seriesRemoved: SeriesRemovedEvent = null,
    subtitle: String = null,
    subtitleAlignment: String = null,
    subtitleBottomMargin: Int | Double = null,
    subtitleLeftMargin: Int | Double = null,
    subtitleRightMargin: Int | Double = null,
    subtitleTextColor: String = null,
    subtitleTextStyle: String = null,
    subtitleTopMargin: Int | Double = null,
    thickness: Int | Double = null,
    title: String = null,
    titleAlignment: String = null,
    titleBottomMargin: Int | Double = null,
    titleLeftMargin: Int | Double = null,
    titleRightMargin: Int | Double = null,
    titleTextColor: String = null,
    titleTextStyle: String = null,
    titleTopMargin: Int | Double = null,
    toolTipType: String = null,
    toolbarHeight: Int | Double = null,
    toolbarTemplate: js.Any = null,
    tooltipTemplate: js.Any = null,
    tooltipTemplates: js.Any = null,
    topMargin: Int | Double = null,
    transitionDuration: Int | Double = null,
    transitionEasingFunction: js.Any = null,
    trendLineBrushes: js.Any = null,
    trendLinePeriod: Int | Double = null,
    trendLineThickness: Int | Double = null,
    trendLineType: String = null,
    trendLineTypePickerTemplate: js.Any = null,
    unknownValuePlotting: String = null,
    updateTooltip: UpdateTooltipEvent = null,
    volumeBrushes: js.Any = null,
    volumeOutlines: js.Any = null,
    volumeThickness: Int | Double = null,
    volumeType: String = null,
    volumeTypePickerTemplate: js.Any = null,
    widget: js.Any = null,
    width: Int | Double = null,
    windowRect: js.Any = null,
    xAxisExtent: Int | Double = null,
    xAxisFormatLabel: js.Any = null,
    xAxisInverted: js.UndefOr[Boolean] = js.undefined,
    xAxisLabel: js.Any = null,
    xAxisLabelAngle: Int | Double = null,
    xAxisLabelBottomMargin: Int | Double = null,
    xAxisLabelHorizontalAlignment: String = null,
    xAxisLabelLeftMargin: Int | Double = null,
    xAxisLabelRightMargin: Int | Double = null,
    xAxisLabelTextColor: String = null,
    xAxisLabelTextStyle: String = null,
    xAxisLabelTopMargin: Int | Double = null,
    xAxisLabelVerticalAlignment: String = null,
    xAxisLabelVisibility: String = null,
    xAxisMajorStroke: String = null,
    xAxisMajorStrokeThickness: Int | Double = null,
    xAxisMaximumValue: js.Any = null,
    xAxisMinimumValue: js.Any = null,
    xAxisMinorStroke: String = null,
    xAxisMinorStrokeThickness: Int | Double = null,
    xAxisMode: String = null,
    xAxisStrip: String = null,
    xAxisStroke: String = null,
    xAxisStrokeThickness: Int | Double = null,
    xAxisTickLength: Int | Double = null,
    xAxisTickStroke: String = null,
    xAxisTickStrokeThickness: Int | Double = null,
    xAxisTitle: String = null,
    xAxisTitleAlignment: String = null,
    xAxisTitleAngle: Int | Double = null,
    xAxisTitleBottomMargin: Int | Double = null,
    xAxisTitleLeftMargin: Int | Double = null,
    xAxisTitleMargin: Int | Double = null,
    xAxisTitleRightMargin: Int | Double = null,
    xAxisTitleTextColor: String = null,
    xAxisTitleTextStyle: String = null,
    xAxisTitleTopMargin: Int | Double = null,
    yAxisAbbreviateLargeNumbers: js.UndefOr[Boolean] = js.undefined,
    yAxisExtent: Int | Double = null,
    yAxisFormatLabel: js.Any = null,
    yAxisInterval: Int | Double = null,
    yAxisInverted: js.UndefOr[Boolean] = js.undefined,
    yAxisIsLogarithmic: js.UndefOr[Boolean] = js.undefined,
    yAxisLabel: js.Any = null,
    yAxisLabelAngle: Int | Double = null,
    yAxisLabelBottomMargin: Int | Double = null,
    yAxisLabelHorizontalAlignment: String = null,
    yAxisLabelLeftMargin: Int | Double = null,
    yAxisLabelLocation: String = null,
    yAxisLabelRightMargin: Int | Double = null,
    yAxisLabelTextColor: String = null,
    yAxisLabelTextStyle: String = null,
    yAxisLabelTopMargin: Int | Double = null,
    yAxisLabelVerticalAlignment: String = null,
    yAxisLabelVisibility: String = null,
    yAxisLogarithmBase: Int | Double = null,
    yAxisMajorStroke: String = null,
    yAxisMajorStrokeThickness: Int | Double = null,
    yAxisMaximumValue: Int | Double = null,
    yAxisMinimumValue: Int | Double = null,
    yAxisMinorInterval: Int | Double = null,
    yAxisMinorStroke: String = null,
    yAxisMinorStrokeThickness: Int | Double = null,
    yAxisMode: String = null,
    yAxisStrip: String = null,
    yAxisStroke: String = null,
    yAxisStrokeThickness: Int | Double = null,
    yAxisTickLength: Int | Double = null,
    yAxisTickStroke: String = null,
    yAxisTickStrokeThickness: Int | Double = null,
    yAxisTitle: String = null,
    yAxisTitleAlignment: String = null,
    yAxisTitleAngle: Int | Double = null,
    yAxisTitleBottomMargin: Int | Double = null,
    yAxisTitleLeftMargin: Int | Double = null,
    yAxisTitleMargin: Int | Double = null,
    yAxisTitleRightMargin: Int | Double = null,
    yAxisTitleTextColor: String = null,
    yAxisTitleTextStyle: String = null,
    yAxisTitleTopMargin: Int | Double = null,
    zoomSliderType: String = null,
    zoomSliderXAxisMajorStroke: String = null,
    zoomSliderXAxisMajorStrokeThickness: Int | Double = null
  ): IgFinancialChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actualRangeSelectorOptions != null) __obj.updateDynamic("actualRangeSelectorOptions")(actualRangeSelectorOptions)
    if (!js.isUndefined(alignsGridLinesToPixels)) __obj.updateDynamic("alignsGridLinesToPixels")(alignsGridLinesToPixels)
    if (!js.isUndefined(animateSeriesWhenAxisRangeChanges)) __obj.updateDynamic("animateSeriesWhenAxisRangeChanges")(animateSeriesWhenAxisRangeChanges)
    if (applyCustomIndicators != null) __obj.updateDynamic("applyCustomIndicators")(applyCustomIndicators)
    if (bottomMargin != null) __obj.updateDynamic("bottomMargin")(bottomMargin.asInstanceOf[js.Any])
    if (brushes != null) __obj.updateDynamic("brushes")(brushes)
    if (calloutStyleUpdating != null) __obj.updateDynamic("calloutStyleUpdating")(calloutStyleUpdating)
    if (!js.isUndefined(calloutStyleUpdatingEventEnabled)) __obj.updateDynamic("calloutStyleUpdatingEventEnabled")(calloutStyleUpdatingEventEnabled)
    if (calloutsContentMemberPath != null) __obj.updateDynamic("calloutsContentMemberPath")(calloutsContentMemberPath)
    if (calloutsItemsSource != null) __obj.updateDynamic("calloutsItemsSource")(calloutsItemsSource)
    if (calloutsLabelMemberPath != null) __obj.updateDynamic("calloutsLabelMemberPath")(calloutsLabelMemberPath)
    if (!js.isUndefined(calloutsVisible)) __obj.updateDynamic("calloutsVisible")(calloutsVisible)
    if (calloutsXMemberPath != null) __obj.updateDynamic("calloutsXMemberPath")(calloutsXMemberPath)
    if (calloutsYMemberPath != null) __obj.updateDynamic("calloutsYMemberPath")(calloutsYMemberPath)
    if (chartType != null) __obj.updateDynamic("chartType")(chartType)
    if (chartTypePickerTemplate != null) __obj.updateDynamic("chartTypePickerTemplate")(chartTypePickerTemplate)
    if (createWrappedTooltip != null) __obj.updateDynamic("createWrappedTooltip")(createWrappedTooltip)
    if (!js.isUndefined(crosshairsAnnotationEnabled)) __obj.updateDynamic("crosshairsAnnotationEnabled")(crosshairsAnnotationEnabled)
    if (crosshairsDisplayMode != null) __obj.updateDynamic("crosshairsDisplayMode")(crosshairsDisplayMode)
    if (!js.isUndefined(crosshairsSnapToData)) __obj.updateDynamic("crosshairsSnapToData")(crosshairsSnapToData)
    if (customIndicatorNames != null) __obj.updateDynamic("customIndicatorNames")(customIndicatorNames)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (excludedProperties != null) __obj.updateDynamic("excludedProperties")(excludedProperties)
    if (!js.isUndefined(finalValueAnnotationsVisible)) __obj.updateDynamic("finalValueAnnotationsVisible")(finalValueAnnotationsVisible)
    if (financialChartLegend != null) __obj.updateDynamic("financialChartLegend")(financialChartLegend)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hideTooltip != null) __obj.updateDynamic("hideTooltip")(hideTooltip)
    if (includedProperties != null) __obj.updateDynamic("includedProperties")(includedProperties)
    if (indicatorBrushes != null) __obj.updateDynamic("indicatorBrushes")(indicatorBrushes)
    if (indicatorDisplayTypes != null) __obj.updateDynamic("indicatorDisplayTypes")(indicatorDisplayTypes)
    if (indicatorLongPeriod != null) __obj.updateDynamic("indicatorLongPeriod")(indicatorLongPeriod.asInstanceOf[js.Any])
    if (indicatorMenuTemplate != null) __obj.updateDynamic("indicatorMenuTemplate")(indicatorMenuTemplate)
    if (indicatorMultiplier != null) __obj.updateDynamic("indicatorMultiplier")(indicatorMultiplier.asInstanceOf[js.Any])
    if (indicatorNegativeBrushes != null) __obj.updateDynamic("indicatorNegativeBrushes")(indicatorNegativeBrushes)
    if (indicatorPeriod != null) __obj.updateDynamic("indicatorPeriod")(indicatorPeriod.asInstanceOf[js.Any])
    if (indicatorShortPeriod != null) __obj.updateDynamic("indicatorShortPeriod")(indicatorShortPeriod.asInstanceOf[js.Any])
    if (indicatorSignalPeriod != null) __obj.updateDynamic("indicatorSignalPeriod")(indicatorSignalPeriod.asInstanceOf[js.Any])
    if (indicatorSmoothingPeriod != null) __obj.updateDynamic("indicatorSmoothingPeriod")(indicatorSmoothingPeriod.asInstanceOf[js.Any])
    if (indicatorThickness != null) __obj.updateDynamic("indicatorThickness")(indicatorThickness.asInstanceOf[js.Any])
    if (indicatorTypes != null) __obj.updateDynamic("indicatorTypes")(indicatorTypes)
    if (!js.isUndefined(isHorizontalZoomEnabled)) __obj.updateDynamic("isHorizontalZoomEnabled")(isHorizontalZoomEnabled)
    if (!js.isUndefined(isLegendVisible)) __obj.updateDynamic("isLegendVisible")(isLegendVisible)
    if (!js.isUndefined(isSeriesHighlightingEnabled)) __obj.updateDynamic("isSeriesHighlightingEnabled")(isSeriesHighlightingEnabled)
    if (!js.isUndefined(isToolbarVisible)) __obj.updateDynamic("isToolbarVisible")(isToolbarVisible)
    if (!js.isUndefined(isVerticalZoomEnabled)) __obj.updateDynamic("isVerticalZoomEnabled")(isVerticalZoomEnabled)
    if (!js.isUndefined(isWindowSyncedToVisibleRange)) __obj.updateDynamic("isWindowSyncedToVisibleRange")(isWindowSyncedToVisibleRange)
    if (itemsSource != null) __obj.updateDynamic("itemsSource")(itemsSource)
    if (leftMargin != null) __obj.updateDynamic("leftMargin")(leftMargin.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (markerBrushes != null) __obj.updateDynamic("markerBrushes")(markerBrushes)
    if (markerMaxCount != null) __obj.updateDynamic("markerMaxCount")(markerMaxCount.asInstanceOf[js.Any])
    if (markerOutlines != null) __obj.updateDynamic("markerOutlines")(markerOutlines)
    if (markerTypes != null) __obj.updateDynamic("markerTypes")(markerTypes)
    if (maxRecCount != null) __obj.updateDynamic("maxRecCount")(maxRecCount.asInstanceOf[js.Any])
    if (negativeBrushes != null) __obj.updateDynamic("negativeBrushes")(negativeBrushes)
    if (negativeOutlines != null) __obj.updateDynamic("negativeOutlines")(negativeOutlines)
    if (outlines != null) __obj.updateDynamic("outlines")(outlines)
    if (overlayBrushes != null) __obj.updateDynamic("overlayBrushes")(overlayBrushes)
    if (overlayOutlines != null) __obj.updateDynamic("overlayOutlines")(overlayOutlines)
    if (overlayPickerTemplate != null) __obj.updateDynamic("overlayPickerTemplate")(overlayPickerTemplate)
    if (overlayThickness != null) __obj.updateDynamic("overlayThickness")(overlayThickness.asInstanceOf[js.Any])
    if (overlayTypes != null) __obj.updateDynamic("overlayTypes")(overlayTypes)
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (propertyChanged != null) __obj.updateDynamic("propertyChanged")(propertyChanged)
    if (rangeSelectorOptions != null) __obj.updateDynamic("rangeSelectorOptions")(rangeSelectorOptions)
    if (rangeSelectorTemplate != null) __obj.updateDynamic("rangeSelectorTemplate")(rangeSelectorTemplate)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (responseTotalRecCountKey != null) __obj.updateDynamic("responseTotalRecCountKey")(responseTotalRecCountKey)
    if (rightMargin != null) __obj.updateDynamic("rightMargin")(rightMargin.asInstanceOf[js.Any])
    if (seriesAdded != null) __obj.updateDynamic("seriesAdded")(seriesAdded)
    if (seriesPointerDown != null) __obj.updateDynamic("seriesPointerDown")(seriesPointerDown)
    if (seriesPointerEnter != null) __obj.updateDynamic("seriesPointerEnter")(seriesPointerEnter)
    if (seriesPointerLeave != null) __obj.updateDynamic("seriesPointerLeave")(seriesPointerLeave)
    if (seriesPointerMove != null) __obj.updateDynamic("seriesPointerMove")(seriesPointerMove)
    if (seriesPointerUp != null) __obj.updateDynamic("seriesPointerUp")(seriesPointerUp)
    if (seriesRemoved != null) __obj.updateDynamic("seriesRemoved")(seriesRemoved)
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle)
    if (subtitleAlignment != null) __obj.updateDynamic("subtitleAlignment")(subtitleAlignment)
    if (subtitleBottomMargin != null) __obj.updateDynamic("subtitleBottomMargin")(subtitleBottomMargin.asInstanceOf[js.Any])
    if (subtitleLeftMargin != null) __obj.updateDynamic("subtitleLeftMargin")(subtitleLeftMargin.asInstanceOf[js.Any])
    if (subtitleRightMargin != null) __obj.updateDynamic("subtitleRightMargin")(subtitleRightMargin.asInstanceOf[js.Any])
    if (subtitleTextColor != null) __obj.updateDynamic("subtitleTextColor")(subtitleTextColor)
    if (subtitleTextStyle != null) __obj.updateDynamic("subtitleTextStyle")(subtitleTextStyle)
    if (subtitleTopMargin != null) __obj.updateDynamic("subtitleTopMargin")(subtitleTopMargin.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleAlignment != null) __obj.updateDynamic("titleAlignment")(titleAlignment)
    if (titleBottomMargin != null) __obj.updateDynamic("titleBottomMargin")(titleBottomMargin.asInstanceOf[js.Any])
    if (titleLeftMargin != null) __obj.updateDynamic("titleLeftMargin")(titleLeftMargin.asInstanceOf[js.Any])
    if (titleRightMargin != null) __obj.updateDynamic("titleRightMargin")(titleRightMargin.asInstanceOf[js.Any])
    if (titleTextColor != null) __obj.updateDynamic("titleTextColor")(titleTextColor)
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle)
    if (titleTopMargin != null) __obj.updateDynamic("titleTopMargin")(titleTopMargin.asInstanceOf[js.Any])
    if (toolTipType != null) __obj.updateDynamic("toolTipType")(toolTipType)
    if (toolbarHeight != null) __obj.updateDynamic("toolbarHeight")(toolbarHeight.asInstanceOf[js.Any])
    if (toolbarTemplate != null) __obj.updateDynamic("toolbarTemplate")(toolbarTemplate)
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    if (tooltipTemplates != null) __obj.updateDynamic("tooltipTemplates")(tooltipTemplates)
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasingFunction != null) __obj.updateDynamic("transitionEasingFunction")(transitionEasingFunction)
    if (trendLineBrushes != null) __obj.updateDynamic("trendLineBrushes")(trendLineBrushes)
    if (trendLinePeriod != null) __obj.updateDynamic("trendLinePeriod")(trendLinePeriod.asInstanceOf[js.Any])
    if (trendLineThickness != null) __obj.updateDynamic("trendLineThickness")(trendLineThickness.asInstanceOf[js.Any])
    if (trendLineType != null) __obj.updateDynamic("trendLineType")(trendLineType)
    if (trendLineTypePickerTemplate != null) __obj.updateDynamic("trendLineTypePickerTemplate")(trendLineTypePickerTemplate)
    if (unknownValuePlotting != null) __obj.updateDynamic("unknownValuePlotting")(unknownValuePlotting)
    if (updateTooltip != null) __obj.updateDynamic("updateTooltip")(updateTooltip)
    if (volumeBrushes != null) __obj.updateDynamic("volumeBrushes")(volumeBrushes)
    if (volumeOutlines != null) __obj.updateDynamic("volumeOutlines")(volumeOutlines)
    if (volumeThickness != null) __obj.updateDynamic("volumeThickness")(volumeThickness.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType)
    if (volumeTypePickerTemplate != null) __obj.updateDynamic("volumeTypePickerTemplate")(volumeTypePickerTemplate)
    if (widget != null) __obj.updateDynamic("widget")(widget)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowRect != null) __obj.updateDynamic("windowRect")(windowRect)
    if (xAxisExtent != null) __obj.updateDynamic("xAxisExtent")(xAxisExtent.asInstanceOf[js.Any])
    if (xAxisFormatLabel != null) __obj.updateDynamic("xAxisFormatLabel")(xAxisFormatLabel)
    if (!js.isUndefined(xAxisInverted)) __obj.updateDynamic("xAxisInverted")(xAxisInverted)
    if (xAxisLabel != null) __obj.updateDynamic("xAxisLabel")(xAxisLabel)
    if (xAxisLabelAngle != null) __obj.updateDynamic("xAxisLabelAngle")(xAxisLabelAngle.asInstanceOf[js.Any])
    if (xAxisLabelBottomMargin != null) __obj.updateDynamic("xAxisLabelBottomMargin")(xAxisLabelBottomMargin.asInstanceOf[js.Any])
    if (xAxisLabelHorizontalAlignment != null) __obj.updateDynamic("xAxisLabelHorizontalAlignment")(xAxisLabelHorizontalAlignment)
    if (xAxisLabelLeftMargin != null) __obj.updateDynamic("xAxisLabelLeftMargin")(xAxisLabelLeftMargin.asInstanceOf[js.Any])
    if (xAxisLabelRightMargin != null) __obj.updateDynamic("xAxisLabelRightMargin")(xAxisLabelRightMargin.asInstanceOf[js.Any])
    if (xAxisLabelTextColor != null) __obj.updateDynamic("xAxisLabelTextColor")(xAxisLabelTextColor)
    if (xAxisLabelTextStyle != null) __obj.updateDynamic("xAxisLabelTextStyle")(xAxisLabelTextStyle)
    if (xAxisLabelTopMargin != null) __obj.updateDynamic("xAxisLabelTopMargin")(xAxisLabelTopMargin.asInstanceOf[js.Any])
    if (xAxisLabelVerticalAlignment != null) __obj.updateDynamic("xAxisLabelVerticalAlignment")(xAxisLabelVerticalAlignment)
    if (xAxisLabelVisibility != null) __obj.updateDynamic("xAxisLabelVisibility")(xAxisLabelVisibility)
    if (xAxisMajorStroke != null) __obj.updateDynamic("xAxisMajorStroke")(xAxisMajorStroke)
    if (xAxisMajorStrokeThickness != null) __obj.updateDynamic("xAxisMajorStrokeThickness")(xAxisMajorStrokeThickness.asInstanceOf[js.Any])
    if (xAxisMaximumValue != null) __obj.updateDynamic("xAxisMaximumValue")(xAxisMaximumValue)
    if (xAxisMinimumValue != null) __obj.updateDynamic("xAxisMinimumValue")(xAxisMinimumValue)
    if (xAxisMinorStroke != null) __obj.updateDynamic("xAxisMinorStroke")(xAxisMinorStroke)
    if (xAxisMinorStrokeThickness != null) __obj.updateDynamic("xAxisMinorStrokeThickness")(xAxisMinorStrokeThickness.asInstanceOf[js.Any])
    if (xAxisMode != null) __obj.updateDynamic("xAxisMode")(xAxisMode)
    if (xAxisStrip != null) __obj.updateDynamic("xAxisStrip")(xAxisStrip)
    if (xAxisStroke != null) __obj.updateDynamic("xAxisStroke")(xAxisStroke)
    if (xAxisStrokeThickness != null) __obj.updateDynamic("xAxisStrokeThickness")(xAxisStrokeThickness.asInstanceOf[js.Any])
    if (xAxisTickLength != null) __obj.updateDynamic("xAxisTickLength")(xAxisTickLength.asInstanceOf[js.Any])
    if (xAxisTickStroke != null) __obj.updateDynamic("xAxisTickStroke")(xAxisTickStroke)
    if (xAxisTickStrokeThickness != null) __obj.updateDynamic("xAxisTickStrokeThickness")(xAxisTickStrokeThickness.asInstanceOf[js.Any])
    if (xAxisTitle != null) __obj.updateDynamic("xAxisTitle")(xAxisTitle)
    if (xAxisTitleAlignment != null) __obj.updateDynamic("xAxisTitleAlignment")(xAxisTitleAlignment)
    if (xAxisTitleAngle != null) __obj.updateDynamic("xAxisTitleAngle")(xAxisTitleAngle.asInstanceOf[js.Any])
    if (xAxisTitleBottomMargin != null) __obj.updateDynamic("xAxisTitleBottomMargin")(xAxisTitleBottomMargin.asInstanceOf[js.Any])
    if (xAxisTitleLeftMargin != null) __obj.updateDynamic("xAxisTitleLeftMargin")(xAxisTitleLeftMargin.asInstanceOf[js.Any])
    if (xAxisTitleMargin != null) __obj.updateDynamic("xAxisTitleMargin")(xAxisTitleMargin.asInstanceOf[js.Any])
    if (xAxisTitleRightMargin != null) __obj.updateDynamic("xAxisTitleRightMargin")(xAxisTitleRightMargin.asInstanceOf[js.Any])
    if (xAxisTitleTextColor != null) __obj.updateDynamic("xAxisTitleTextColor")(xAxisTitleTextColor)
    if (xAxisTitleTextStyle != null) __obj.updateDynamic("xAxisTitleTextStyle")(xAxisTitleTextStyle)
    if (xAxisTitleTopMargin != null) __obj.updateDynamic("xAxisTitleTopMargin")(xAxisTitleTopMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisAbbreviateLargeNumbers)) __obj.updateDynamic("yAxisAbbreviateLargeNumbers")(yAxisAbbreviateLargeNumbers)
    if (yAxisExtent != null) __obj.updateDynamic("yAxisExtent")(yAxisExtent.asInstanceOf[js.Any])
    if (yAxisFormatLabel != null) __obj.updateDynamic("yAxisFormatLabel")(yAxisFormatLabel)
    if (yAxisInterval != null) __obj.updateDynamic("yAxisInterval")(yAxisInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisInverted)) __obj.updateDynamic("yAxisInverted")(yAxisInverted)
    if (!js.isUndefined(yAxisIsLogarithmic)) __obj.updateDynamic("yAxisIsLogarithmic")(yAxisIsLogarithmic)
    if (yAxisLabel != null) __obj.updateDynamic("yAxisLabel")(yAxisLabel)
    if (yAxisLabelAngle != null) __obj.updateDynamic("yAxisLabelAngle")(yAxisLabelAngle.asInstanceOf[js.Any])
    if (yAxisLabelBottomMargin != null) __obj.updateDynamic("yAxisLabelBottomMargin")(yAxisLabelBottomMargin.asInstanceOf[js.Any])
    if (yAxisLabelHorizontalAlignment != null) __obj.updateDynamic("yAxisLabelHorizontalAlignment")(yAxisLabelHorizontalAlignment)
    if (yAxisLabelLeftMargin != null) __obj.updateDynamic("yAxisLabelLeftMargin")(yAxisLabelLeftMargin.asInstanceOf[js.Any])
    if (yAxisLabelLocation != null) __obj.updateDynamic("yAxisLabelLocation")(yAxisLabelLocation)
    if (yAxisLabelRightMargin != null) __obj.updateDynamic("yAxisLabelRightMargin")(yAxisLabelRightMargin.asInstanceOf[js.Any])
    if (yAxisLabelTextColor != null) __obj.updateDynamic("yAxisLabelTextColor")(yAxisLabelTextColor)
    if (yAxisLabelTextStyle != null) __obj.updateDynamic("yAxisLabelTextStyle")(yAxisLabelTextStyle)
    if (yAxisLabelTopMargin != null) __obj.updateDynamic("yAxisLabelTopMargin")(yAxisLabelTopMargin.asInstanceOf[js.Any])
    if (yAxisLabelVerticalAlignment != null) __obj.updateDynamic("yAxisLabelVerticalAlignment")(yAxisLabelVerticalAlignment)
    if (yAxisLabelVisibility != null) __obj.updateDynamic("yAxisLabelVisibility")(yAxisLabelVisibility)
    if (yAxisLogarithmBase != null) __obj.updateDynamic("yAxisLogarithmBase")(yAxisLogarithmBase.asInstanceOf[js.Any])
    if (yAxisMajorStroke != null) __obj.updateDynamic("yAxisMajorStroke")(yAxisMajorStroke)
    if (yAxisMajorStrokeThickness != null) __obj.updateDynamic("yAxisMajorStrokeThickness")(yAxisMajorStrokeThickness.asInstanceOf[js.Any])
    if (yAxisMaximumValue != null) __obj.updateDynamic("yAxisMaximumValue")(yAxisMaximumValue.asInstanceOf[js.Any])
    if (yAxisMinimumValue != null) __obj.updateDynamic("yAxisMinimumValue")(yAxisMinimumValue.asInstanceOf[js.Any])
    if (yAxisMinorInterval != null) __obj.updateDynamic("yAxisMinorInterval")(yAxisMinorInterval.asInstanceOf[js.Any])
    if (yAxisMinorStroke != null) __obj.updateDynamic("yAxisMinorStroke")(yAxisMinorStroke)
    if (yAxisMinorStrokeThickness != null) __obj.updateDynamic("yAxisMinorStrokeThickness")(yAxisMinorStrokeThickness.asInstanceOf[js.Any])
    if (yAxisMode != null) __obj.updateDynamic("yAxisMode")(yAxisMode)
    if (yAxisStrip != null) __obj.updateDynamic("yAxisStrip")(yAxisStrip)
    if (yAxisStroke != null) __obj.updateDynamic("yAxisStroke")(yAxisStroke)
    if (yAxisStrokeThickness != null) __obj.updateDynamic("yAxisStrokeThickness")(yAxisStrokeThickness.asInstanceOf[js.Any])
    if (yAxisTickLength != null) __obj.updateDynamic("yAxisTickLength")(yAxisTickLength.asInstanceOf[js.Any])
    if (yAxisTickStroke != null) __obj.updateDynamic("yAxisTickStroke")(yAxisTickStroke)
    if (yAxisTickStrokeThickness != null) __obj.updateDynamic("yAxisTickStrokeThickness")(yAxisTickStrokeThickness.asInstanceOf[js.Any])
    if (yAxisTitle != null) __obj.updateDynamic("yAxisTitle")(yAxisTitle)
    if (yAxisTitleAlignment != null) __obj.updateDynamic("yAxisTitleAlignment")(yAxisTitleAlignment)
    if (yAxisTitleAngle != null) __obj.updateDynamic("yAxisTitleAngle")(yAxisTitleAngle.asInstanceOf[js.Any])
    if (yAxisTitleBottomMargin != null) __obj.updateDynamic("yAxisTitleBottomMargin")(yAxisTitleBottomMargin.asInstanceOf[js.Any])
    if (yAxisTitleLeftMargin != null) __obj.updateDynamic("yAxisTitleLeftMargin")(yAxisTitleLeftMargin.asInstanceOf[js.Any])
    if (yAxisTitleMargin != null) __obj.updateDynamic("yAxisTitleMargin")(yAxisTitleMargin.asInstanceOf[js.Any])
    if (yAxisTitleRightMargin != null) __obj.updateDynamic("yAxisTitleRightMargin")(yAxisTitleRightMargin.asInstanceOf[js.Any])
    if (yAxisTitleTextColor != null) __obj.updateDynamic("yAxisTitleTextColor")(yAxisTitleTextColor)
    if (yAxisTitleTextStyle != null) __obj.updateDynamic("yAxisTitleTextStyle")(yAxisTitleTextStyle)
    if (yAxisTitleTopMargin != null) __obj.updateDynamic("yAxisTitleTopMargin")(yAxisTitleTopMargin.asInstanceOf[js.Any])
    if (zoomSliderType != null) __obj.updateDynamic("zoomSliderType")(zoomSliderType)
    if (zoomSliderXAxisMajorStroke != null) __obj.updateDynamic("zoomSliderXAxisMajorStroke")(zoomSliderXAxisMajorStroke)
    if (zoomSliderXAxisMajorStrokeThickness != null) __obj.updateDynamic("zoomSliderXAxisMajorStrokeThickness")(zoomSliderXAxisMajorStrokeThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgFinancialChart]
  }
}

