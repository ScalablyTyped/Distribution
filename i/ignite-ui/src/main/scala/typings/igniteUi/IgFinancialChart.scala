package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgFinancialChart
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A FinancialChartRangeSelectorOptionCollection containing the available range selector options on the toolbar.
    * This will be the intersection of the user-defined range selector options, if any, and the range selector options which are automatically determined based on the range of data.
    */
  var actualRangeSelectorOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets a value indicating whether grid and tick lines are aligned to device pixels.
    */
  var alignsGridLinesToPixels: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the series animations should be allowed when a range change has been detected on an axis.
    */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * Event raised by the chart when custom indicator data is needed from the application.
    * During series rendering, event will be raised once for each value in the CustomIndicatorNames collection.
    */
  var applyCustomIndicators: js.UndefOr[ApplyCustomIndicatorsEvent] = js.native
  
  /**
    * Gets or sets the bottom margin around the chart content.
    */
  var bottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the palette of brushes to use for coloring the chart series.
    * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var brushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Occurs when the style of a callout is updated.
    */
  var calloutStyleUpdating: js.UndefOr[CalloutStyleUpdatingEvent] = js.native
  
  /**
    * Gets or sets if event annotations should be displayed.
    */
  var calloutStyleUpdatingEventEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the member path of the content data for the callouts.
    */
  var calloutsContentMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the collection of callout data to be annotated.
    */
  var calloutsItemsSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the member path of the label data for the callouts.
    */
  var calloutsLabelMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets if callouts should be displayed.
    */
  var calloutsVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the member path of the X data for the callouts.
    */
  var calloutsXMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the member path of the Y data for the callouts.
    */
  var calloutsYMemberPath: js.UndefOr[String] = js.native
  
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
  var chartType: js.UndefOr[String] = js.native
  
  var chartTypePickerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets a function for creating wrapped tooltip
    */
  var createWrappedTooltip: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets whether annotations are shown along the axis for crosshair values
    */
  var crosshairsAnnotationEnabled: js.UndefOr[Boolean] = js.native
  
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
  var crosshairsDisplayMode: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets whether crosshairs will snap to the nearest data point.
    */
  var crosshairsSnapToData: js.UndefOr[Boolean] = js.native
  
  /**
    * The names of custom indicators to add to the chart.
    * When CustomIndicatorNames is set, the ApplyCustomIndicators event will be raised for each custom indicator name.
    */
  var customIndicatorNames: js.UndefOr[js.Any] = js.native
  
  /**
    * Event which is raised before data binding.
    * Return false in order to cancel data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  
  /**
    * Event which is raised after data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.data to obtain reference to array actual data which is displayed by chart.
    * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  
  /**
    * Gets sets a valid data source.
    * That can be instance of array or primitives, array of objects, instance of $.ig.DataSource, or any other data accepted by $.ig.DataSource.
    * Note: if it is set to string and "dataSourceType" option is not set, then $.ig.JSONPDataSource is used.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets sets data source type (such as "json", "xml", etc). Please refer to the documentation of $.ig.DataSource and its type property
    */
  var dataSourceType: js.UndefOr[String] = js.native
  
  /**
    * Gets sets url which is used for sending JSON on request for remote data.
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets a set of property paths that should be excluded from consideration by the category chart.
    */
  var excludedProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets whether annotations for the final value of each series is displayed on the axis.
    */
  var finalValueAnnotationsVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets a legend displayed between toolbar and chart's plot area
    */
  var financialChartLegend: js.UndefOr[js.Any] = js.native
  
  /**
    * The height of the chart.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Event which is raised before tooltip is hidden.
    * Return false in order to cancel hiding and keep tooltip visible.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.item to obtain reference to item.
    * Use ui.element to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
    */
  var hideTooltip: js.UndefOr[HideTooltipEvent] = js.native
  
  /**
    * Gets or sets a set of property paths that should be included for consideration by the category chart, leaving the remainder excluded. If null, all properties will be considered.
    */
  var includedProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * Brushes to use for financial indicators.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var indicatorBrushes: js.UndefOr[js.Any] = js.native
  
  /**
    * The display types of financial indicators.
    */
  var indicatorDisplayTypes: js.UndefOr[js.Any] = js.native
  
  /**
    * The long period of financial indicators, where applicable.
    */
  var indicatorLongPeriod: js.UndefOr[Double] = js.native
  
  var indicatorMenuTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * The multiplier of financial indicators, where applicable.
    */
  var indicatorMultiplier: js.UndefOr[Double] = js.native
  
  /**
    * Brushes to use for negative elements in financial indicators.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var indicatorNegativeBrushes: js.UndefOr[js.Any] = js.native
  
  /**
    * The period of financial indicators, where applicable.
    */
  var indicatorPeriod: js.UndefOr[Double] = js.native
  
  /**
    * The short period of financial indicators, where applicable.
    */
  var indicatorShortPeriod: js.UndefOr[Double] = js.native
  
  /**
    * The signal period of financial indicators, where applicable.
    */
  var indicatorSignalPeriod: js.UndefOr[Double] = js.native
  
  /**
    * The smoothing period of financial indicators, where applicable.
    */
  var indicatorSmoothingPeriod: js.UndefOr[Double] = js.native
  
  /**
    * The outline or stroke thickness of financial indicators.
    */
  var indicatorThickness: js.UndefOr[Double] = js.native
  
  /**
    * A collection indicating what financial indicator types to display on the Financial Chart.
    */
  var indicatorTypes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets whether the chart can be horizontally zoomed through user interactions.
    */
  var isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets weather or not a legend is visible between toolbar and chart's plot area
    */
  var isLegendVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the chart can highlight series through user interactions.
    * This property applies to Category Chart and Financial Chart controls.
    */
  var isSeriesHighlightingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean property controlling the visibility of the toolbar.
    */
  var isToolbarVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the chart can be vertically zoomed through user interactions.
    */
  var isVerticalZoomEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean indicating whether the chart should automatically zoom in vertically on the currently visible range of data.
    * When this property is set to true, panning and zooming along the X-axis will result in a corresponding zoom on the Y-axis, so that the visible range of data fills the zoom window as fully as possible.
    */
  var isWindowSyncedToVisibleRange: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets a collection of data items used to generate the chart.
    * The ItemsSource of this chart can be a list of objects containing one or more numeric properties.
    * Additionally, if the objects in the list implement the IEnumerable interface,
    * the Chart will attempt to delve into the sub-collections when reading through the data source.
    * Databinding can be further configured by attributing the data item classes
    * with the DataSeriesMemberIntentAttribute.
    */
  var itemsSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the left margin of the chart content.
    */
  var leftMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the legend to connect this chart to.
    * When the legend property is set, the chart will use it to display information about its series.  Legends can be shared by multiple chart controls.
    */
  var legend: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the palette of brushes used for rendering fill area of data point markers.
    * This property applies only to these chart types: point, line, spline, bubble, and polygon
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var markerBrushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the maximum number of markers displyed in the plot area of the chart.
    */
  var markerMaxCount: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the palette of brushes used for rendering outlines of data point markers.
    * This property applies only to these chart types: point, line, spline, bubble, and polygon
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var markerOutlines: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the marker shapes used for indicating location of data points in this chart.
    * This property applies only to these chart types: point, line, spline, bubble, and polygon
    */
  var markerTypes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets sets maximum number of displayed records in chart.
    */
  var maxRecCount: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the palette used for coloring negative items of Waterfall chart type.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var negativeBrushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Brushes to use for drawing negative elements, when using a chart type with contextual coloring, such as Waterfall.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var negativeOutlines: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the palette of brushes to use for outlines on the chart series.
    * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var outlines: js.UndefOr[js.Any] = js.native
  
  /**
    * Brushes to use for filling financial overlays.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var overlayBrushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Brushes to use for outlining financial overlays.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var overlayOutlines: js.UndefOr[js.Any] = js.native
  
  var overlayPickerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * The outline thickness of financial overlays.
    */
  var overlayThickness: js.UndefOr[Double] = js.native
  
  /**
    * A collection indicating what financial overlay types to display on the Financial Chart.
    */
  var overlayTypes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the scaling value used to affect the pixel density of the control.
    * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
    * to appear blurry.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  
  /**
    * Event raised when a property value is changed on this chart
    */
  var propertyChanged: js.UndefOr[PropertyChangedEvent] = js.native
  
  /**
    * A FinancialChartRangeSelectorOptionCollection containing the available range selector options on the toolbar.
    */
  var rangeSelectorOptions: js.UndefOr[js.Any] = js.native
  
  var rangeSelectorTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the rendering resolution for all series in this chart.
    * Where n = Resolution, for every n horizontal pixels, combine all items into a single datapoint.  When Resolution = 0, all datapoints will be rendered as graphical objects.  Charts with a higher resolution will have faster performance.
    */
  var resolution: js.UndefOr[Double] = js.native
  
  /**
    * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.native
  
  /**
    * See $.ig.DataSource. property in the response specifying the total number of records on the server.
    */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the right margin of the chart content.
    */
  var rightMargin: js.UndefOr[Double] = js.native
  
  /**
    * Event raised when a series is initialized and added to this chart.
    */
  var seriesAdded: js.UndefOr[SeriesAddedEvent] = js.native
  
  /**
    * Occurs when the pointer is pressed down over a Series.
    */
  var seriesPointerDown: js.UndefOr[SeriesPointerDownEvent] = js.native
  
  /**
    * Occurs when the pointer enters a Series.
    */
  var seriesPointerEnter: js.UndefOr[SeriesPointerEnterEvent] = js.native
  
  /**
    * Occurs when the pointer leaves a Series.
    */
  var seriesPointerLeave: js.UndefOr[SeriesPointerLeaveEvent] = js.native
  
  /**
    * Occurs when the pointer moves over a Series.
    */
  var seriesPointerMove: js.UndefOr[SeriesPointerMoveEvent] = js.native
  
  /**
    * Occurs when the pointer is released over a Series.
    */
  var seriesPointerUp: js.UndefOr[SeriesPointerUpEvent] = js.native
  
  /**
    * Event raised when a series is removed from this chart.
    */
  var seriesRemoved: js.UndefOr[SeriesRemovedEvent] = js.native
  
  /**
    * Gets or sets text to display below the Title, above the plot area.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets horizontal alignment which determines the subtitle position, relative to the left and right edges of the control.
    *
    * Valid values:
    * "left" Align the item to the left
    * "center" Center the item
    * "right" Align the item to the right
    * "stretch" Stretch the item to the full width
    */
  var subtitleAlignment: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the bottom margin of chart subtitle
    */
  var subtitleBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the left margin of chart subtitle
    */
  var subtitleLeftMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the right margin of chart subtitle
    */
  var subtitleRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets color of chart subtitle
    */
  var subtitleTextColor: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets CSS font property for the chart subtitle
    */
  var subtitleTextStyle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the top margin of chart subtitle
    */
  var subtitleTopMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the thickness for all series in this chart. Depending on the ChartType, this can be the main brush used, or just the outline.
    */
  var thickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets text to display above the plot area.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets horizontal alignment which determines the title position, relative to the left and right edges of the control.
    *
    * Valid values:
    * "left" Align the item to the left
    * "center" Center the item
    * "right" Align the item to the right
    * "stretch" Stretch the item to the full width
    */
  var titleAlignment: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the bottom margin of chart title
    */
  var titleBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the left margin of chart title
    */
  var titleLeftMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the right margin of chart title
    */
  var titleRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets color of chart title
    */
  var titleTextColor: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets CSS font property for the chart title
    */
  var titleTextStyle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the top margin of chart title
    */
  var titleTopMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the style of tooltip to be displayed.
    *
    * Valid values:
    * "default" Display default tooltip for each series in the chart.
    * "item" Display individual tooltips for all series in the chart.
    * "category" Display combined tooltip for all series in the chart.
    * "none" Display no tooltips in the chart.
    */
  var toolTipType: js.UndefOr[String] = js.native
  
  var toolbarHeight: js.UndefOr[Double] = js.native
  
  var toolbarTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the id of a template element to use for tooltips, or markup representing the tooltip template.
    */
  var tooltipTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the names of tooltip templates
    */
  var tooltipTemplates: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the top margin of the chart content.
    */
  var topMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the duration used for animating series plots when the data is changing
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the easing function used for animating series plots when the data is changing.
    * This can be set to one of the known values "linear" or "cubic," or it can be set to an easing function which takes a single numeric parameter and returns a number.
    */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the palette of brushes to used for coloring trend lines in this chart.
    * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var trendLineBrushes: js.UndefOr[js.Any] = js.native
  
  var trendLinePeriod: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the thickness of the trend lines in this chart.
    * This property applies only to these chart types: point, line, spline, and bubble
    */
  var trendLineThickness: js.UndefOr[Double] = js.native
  
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
  var trendLineType: js.UndefOr[String] = js.native
  
  var trendLineTypePickerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the behavior that determines how unknown values will be plotted on the chart.Null and Double.NaN are two examples of unknown values.
    *
    *
    * Valid values:
    * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
    * "dontPlot" Do not plot the unknown value on the chart.
    */
  var unknownValuePlotting: js.UndefOr[String] = js.native
  
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
  var updateTooltip: js.UndefOr[UpdateTooltipEvent] = js.native
  
  /**
    * Brushes to use for filling volume series in the volume pane.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var volumeBrushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Brushes to use for outlining volume series in the volume pane.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var volumeOutlines: js.UndefOr[js.Any] = js.native
  
  /**
    * The outline thickness of volume series in the volume pane.
    */
  var volumeThickness: js.UndefOr[Double] = js.native
  
  /**
    * The type of series to display in the volume pane.
    *
    * Valid values:
    * "none" Do not display the volume pane.
    * "column" Display column series in the volume pane.
    * "line" Display line series in the volume pane.
    * "area" Display area series in the volume pane.
    */
  var volumeType: js.UndefOr[String] = js.native
  
  var volumeTypePickerTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the widget of this control
    */
  var widget: js.UndefOr[js.Any] = js.native
  
  /**
    * The width of the chart.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the rectangle representing the current scroll and zoom state of the chart.
    * WindowRect is expressed as a Rectangle with coordinates and sizes between 0 and 1.
    * The provided object should have numeric properties called left, top, width and height.
    */
  var windowRect: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the distance between the X-axis and the bottom of the chart.
    */
  var xAxisExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets function which takes an context object and returns a formatted label for the X-axis.
    */
  var xAxisFormatLabel: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets whether to invert the direction of the X-axis by placing the first data items on the right side of the chart.
    */
  var xAxisInverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the format for labels along the X-axis.
    */
  var xAxisLabel: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the angle of rotation for labels along the X-axis.
    */
  var xAxisLabelAngle: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the bottom margin of labels on the X-axis
    */
  var xAxisLabelBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets Horizontal alignment of X-axis labels.
    *
    * Valid values:
    * "left" Align the item to the left
    * "center" Center the item
    * "right" Align the item to the right
    * "stretch" Stretch the item to the full width
    */
  var xAxisLabelHorizontalAlignment: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the left margin of labels on the X-axis
    */
  var xAxisLabelLeftMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the right margin of labels on the X-axis
    */
  var xAxisLabelRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets color of labels on the X-axis
    */
  var xAxisLabelTextColor: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets CSS font property for labels on X-axis
    */
  var xAxisLabelTextStyle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the top margin of labels on the X-axis
    */
  var xAxisLabelTopMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets Vertical alignment of X-axis labels.
    *
    * Valid values:
    * "top" Align the item to the top
    * "center" Center the item
    * "bottom" Align the item to the bottom
    * "stretch" Stretch the item to the full height
    */
  var xAxisLabelVerticalAlignment: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets Visibility of X-axis labels.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var xAxisLabelVisibility: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the color to apply to major gridlines along the X-axis.
    */
  var xAxisMajorStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to major gridlines along the X-axis.
    */
  var xAxisMajorStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets maximum value on x-axis
    */
  var xAxisMaximumValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets minimum value on x-axis
    */
  var xAxisMinimumValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the color to apply to minor gridlines along the X-axis.
    */
  var xAxisMinorStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to minor gridlines along the X-axis.
    */
  var xAxisMinorStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * The scaling mode of the X-axis.
    *
    * Valid values:
    * "ordinal" An ordinal scale with time labels.
    * "time" A time scale.
    */
  var xAxisMode: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the color to apply to stripes along the X-axis.
    */
  var xAxisStrip: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the color to apply to the X-axis line.
    */
  var xAxisStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to the X-axis line.
    */
  var xAxisStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the length of tickmarks along the X-axis.
    */
  var xAxisTickLength: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the color to apply to tickmarks along the X-axis.
    */
  var xAxisTickStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to tickmarks along the X-axis.
    */
  var xAxisTickStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the Text to display below the X-axis.
    */
  var xAxisTitle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets Horizontal alignment of the X-axis title.
    *
    * Valid values:
    * "left" Align the item to the left
    * "center" Center the item
    * "right" Align the item to the right
    * "stretch" Stretch the item to the full width
    */
  var xAxisTitleAlignment: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the angle of rotation for the X-axis title.
    */
  var xAxisTitleAngle: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the bottom margin of a title on the X-axis
    */
  var xAxisTitleBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the left margin of a title on the X-axis
    */
  var xAxisTitleLeftMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the margin around a title on the X-axis
    */
  var xAxisTitleMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the right margin of a title on the X-axis
    */
  var xAxisTitleRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets color of title on the X-axis
    */
  var xAxisTitleTextColor: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets CSS font property for title on X-axis
    */
  var xAxisTitleTextStyle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the top margin of a title on the X-axis
    */
  var xAxisTitleTopMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets whether the large numbers on the Y-axis labels are abbreviated.
    */
  var yAxisAbbreviateLargeNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the distance between the Y-axis and the left edge of the chart.
    */
  var yAxisExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets function which takes a context object and returns a formatted label for the Y-axis.
    */
  var yAxisFormatLabel: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the distance between each label and grid line along the Y-axis.
    */
  var yAxisInterval: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets whether to invert the direction of the Y-axis by placing the minimum numeric value at the top of the chart.
    */
  var yAxisInverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the Y-axis should use a logarithmic scale instead of a linear one.
    * Since log(-1) is imaginary and log(0) is undefined, it is recommended to enable this property only when the Y-axis minimum is greater than zero.
    */
  var yAxisIsLogarithmic: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the property or string from which the labels are derived.
    */
  var yAxisLabel: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the angle of rotation for labels along the Y-axis.
    */
  var yAxisLabelAngle: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the bottom margin of labels on the Y-axis
    */
  var yAxisLabelBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets Horizontal alignment of Y-axis labels.
    *
    * Valid values:
    * "left" Align the item to the left
    * "center" Center the item
    * "right" Align the item to the right
    * "stretch" Stretch the item to the full width
    */
  var yAxisLabelHorizontalAlignment: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the left margin of labels on the Y-axis
    */
  var yAxisLabelLeftMargin: js.UndefOr[Double] = js.native
  
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
  var yAxisLabelLocation: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the right margin of labels on the Y-axis
    */
  var yAxisLabelRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets color of labels on the Y-axis
    */
  var yAxisLabelTextColor: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets CSS font property for labels on Y-axis
    */
  var yAxisLabelTextStyle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the top margin of labels on the Y-axis
    */
  var yAxisLabelTopMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets Vertical alignment of Y-axis labels.
    *
    * Valid values:
    * "top" Align the item to the top
    * "center" Center the item
    * "bottom" Align the item to the bottom
    * "stretch" Stretch the item to the full height
    */
  var yAxisLabelVerticalAlignment: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets Visibility of Y-axis labels.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var yAxisLabelVisibility: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the base value to use in the log function when mapping the position of data items along the Y-axis.
    * This property is effective only when YAxisIsLogarithmic is true.
    */
  var yAxisLogarithmBase: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the color to apply to major gridlines along the Y-axis.
    */
  var yAxisMajorStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to major gridlines along the Y-axis.
    */
  var yAxisMajorStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the data value corresponding to the maximum value of the Y-axis.
    */
  var yAxisMaximumValue: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the data value corresponding to the minimum value of the Y-axis.
    */
  var yAxisMinimumValue: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the frequency of displayed minor lines along the Y-axis.
    */
  var yAxisMinorInterval: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the color to apply to minor gridlines along the Y-axis.
    */
  var yAxisMinorStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to minor gridlines along the Y-axis.
    */
  var yAxisMinorStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * The scaling mode of the Y-axis.
    *
    * Valid values:
    * "numeric" A linear or logarithmic numeric scale.
    * "percentChange" A numeric scale where all values are scaled proportionally to a reference value.
    */
  var yAxisMode: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the color to apply to stripes along the Y-axis.
    */
  var yAxisStrip: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the color to apply to the Y-axis line.
    */
  var yAxisStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to the Y-axis line.
    */
  var yAxisStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the length of tickmarks along the Y-axis.
    */
  var yAxisTickLength: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the color to apply to tickmarks along the Y-axis.
    */
  var yAxisTickStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to tickmarks along the Y-axis.
    */
  var yAxisTickStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the Text to display to the left of the Y-axis.
    */
  var yAxisTitle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets Vertical alignment of the Y-axis title.
    *
    * Valid values:
    * "top" Align the item to the top
    * "center" Center the item
    * "bottom" Align the item to the bottom
    * "stretch" Stretch the item to the full height
    */
  var yAxisTitleAlignment: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the angle of rotation for the Y-axis title.
    */
  var yAxisTitleAngle: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the bottom margin of a title on the Y-axis
    */
  var yAxisTitleBottomMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the left margin of a title on the Y-axis
    */
  var yAxisTitleLeftMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the margin around a title on the Y-axis
    */
  var yAxisTitleMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the right margin of a title on the Y-axis
    */
  var yAxisTitleRightMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets color of title on the Y-axis
    */
  var yAxisTitleTextColor: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets CSS font property for title on Y-axis
    */
  var yAxisTitleTextStyle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the top margin of a title on the Y-axis
    */
  var yAxisTitleTopMargin: js.UndefOr[Double] = js.native
  
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
  var zoomSliderType: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets stroke brush of major gridlines on x-axis of the zoom slider pane
    */
  var zoomSliderXAxisMajorStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets thickness of major gridlines on x-axis of the zoom slider pane
    */
  var zoomSliderXAxisMajorStrokeThickness: js.UndefOr[Double] = js.native
}
object IgFinancialChart {
  
  @scala.inline
  def apply(): IgFinancialChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgFinancialChart]
  }
  
  @scala.inline
  implicit class IgFinancialChartOps[Self <: IgFinancialChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActualRangeSelectorOptions(value: js.Any): Self = this.set("actualRangeSelectorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualRangeSelectorOptions: Self = this.set("actualRangeSelectorOptions", js.undefined)
    
    @scala.inline
    def setAlignsGridLinesToPixels(value: Boolean): Self = this.set("alignsGridLinesToPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignsGridLinesToPixels: Self = this.set("alignsGridLinesToPixels", js.undefined)
    
    @scala.inline
    def setAnimateSeriesWhenAxisRangeChanges(value: Boolean): Self = this.set("animateSeriesWhenAxisRangeChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateSeriesWhenAxisRangeChanges: Self = this.set("animateSeriesWhenAxisRangeChanges", js.undefined)
    
    @scala.inline
    def setApplyCustomIndicators(value: (/* event */ Event, /* ui */ ApplyCustomIndicatorsEventUIParam) => Unit): Self = this.set("applyCustomIndicators", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteApplyCustomIndicators: Self = this.set("applyCustomIndicators", js.undefined)
    
    @scala.inline
    def setBottomMargin(value: Double): Self = this.set("bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomMargin: Self = this.set("bottomMargin", js.undefined)
    
    @scala.inline
    def setBrushes(value: js.Any): Self = this.set("brushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrushes: Self = this.set("brushes", js.undefined)
    
    @scala.inline
    def setCalloutStyleUpdating(value: (/* event */ Event, /* ui */ CalloutStyleUpdatingEventUIParam) => Unit): Self = this.set("calloutStyleUpdating", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCalloutStyleUpdating: Self = this.set("calloutStyleUpdating", js.undefined)
    
    @scala.inline
    def setCalloutStyleUpdatingEventEnabled(value: Boolean): Self = this.set("calloutStyleUpdatingEventEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutStyleUpdatingEventEnabled: Self = this.set("calloutStyleUpdatingEventEnabled", js.undefined)
    
    @scala.inline
    def setCalloutsContentMemberPath(value: String): Self = this.set("calloutsContentMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutsContentMemberPath: Self = this.set("calloutsContentMemberPath", js.undefined)
    
    @scala.inline
    def setCalloutsItemsSource(value: js.Any): Self = this.set("calloutsItemsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutsItemsSource: Self = this.set("calloutsItemsSource", js.undefined)
    
    @scala.inline
    def setCalloutsLabelMemberPath(value: String): Self = this.set("calloutsLabelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutsLabelMemberPath: Self = this.set("calloutsLabelMemberPath", js.undefined)
    
    @scala.inline
    def setCalloutsVisible(value: Boolean): Self = this.set("calloutsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutsVisible: Self = this.set("calloutsVisible", js.undefined)
    
    @scala.inline
    def setCalloutsXMemberPath(value: String): Self = this.set("calloutsXMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutsXMemberPath: Self = this.set("calloutsXMemberPath", js.undefined)
    
    @scala.inline
    def setCalloutsYMemberPath(value: String): Self = this.set("calloutsYMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutsYMemberPath: Self = this.set("calloutsYMemberPath", js.undefined)
    
    @scala.inline
    def setChartType(value: String): Self = this.set("chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartType: Self = this.set("chartType", js.undefined)
    
    @scala.inline
    def setChartTypePickerTemplate(value: js.Any): Self = this.set("chartTypePickerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartTypePickerTemplate: Self = this.set("chartTypePickerTemplate", js.undefined)
    
    @scala.inline
    def setCreateWrappedTooltip(value: js.Any): Self = this.set("createWrappedTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateWrappedTooltip: Self = this.set("createWrappedTooltip", js.undefined)
    
    @scala.inline
    def setCrosshairsAnnotationEnabled(value: Boolean): Self = this.set("crosshairsAnnotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairsAnnotationEnabled: Self = this.set("crosshairsAnnotationEnabled", js.undefined)
    
    @scala.inline
    def setCrosshairsDisplayMode(value: String): Self = this.set("crosshairsDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairsDisplayMode: Self = this.set("crosshairsDisplayMode", js.undefined)
    
    @scala.inline
    def setCrosshairsSnapToData(value: Boolean): Self = this.set("crosshairsSnapToData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairsSnapToData: Self = this.set("crosshairsSnapToData", js.undefined)
    
    @scala.inline
    def setCustomIndicatorNames(value: js.Any): Self = this.set("customIndicatorNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomIndicatorNames: Self = this.set("customIndicatorNames", js.undefined)
    
    @scala.inline
    def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = this.set("dataBinding", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = this.set("dataBound", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceType(value: String): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceUrl: Self = this.set("dataSourceUrl", js.undefined)
    
    @scala.inline
    def setExcludedProperties(value: js.Any): Self = this.set("excludedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedProperties: Self = this.set("excludedProperties", js.undefined)
    
    @scala.inline
    def setFinalValueAnnotationsVisible(value: Boolean): Self = this.set("finalValueAnnotationsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalValueAnnotationsVisible: Self = this.set("finalValueAnnotationsVisible", js.undefined)
    
    @scala.inline
    def setFinancialChartLegend(value: js.Any): Self = this.set("financialChartLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinancialChartLegend: Self = this.set("financialChartLegend", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHideTooltip(value: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit): Self = this.set("hideTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHideTooltip: Self = this.set("hideTooltip", js.undefined)
    
    @scala.inline
    def setIncludedProperties(value: js.Any): Self = this.set("includedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedProperties: Self = this.set("includedProperties", js.undefined)
    
    @scala.inline
    def setIndicatorBrushes(value: js.Any): Self = this.set("indicatorBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorBrushes: Self = this.set("indicatorBrushes", js.undefined)
    
    @scala.inline
    def setIndicatorDisplayTypes(value: js.Any): Self = this.set("indicatorDisplayTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorDisplayTypes: Self = this.set("indicatorDisplayTypes", js.undefined)
    
    @scala.inline
    def setIndicatorLongPeriod(value: Double): Self = this.set("indicatorLongPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorLongPeriod: Self = this.set("indicatorLongPeriod", js.undefined)
    
    @scala.inline
    def setIndicatorMenuTemplate(value: js.Any): Self = this.set("indicatorMenuTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorMenuTemplate: Self = this.set("indicatorMenuTemplate", js.undefined)
    
    @scala.inline
    def setIndicatorMultiplier(value: Double): Self = this.set("indicatorMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorMultiplier: Self = this.set("indicatorMultiplier", js.undefined)
    
    @scala.inline
    def setIndicatorNegativeBrushes(value: js.Any): Self = this.set("indicatorNegativeBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorNegativeBrushes: Self = this.set("indicatorNegativeBrushes", js.undefined)
    
    @scala.inline
    def setIndicatorPeriod(value: Double): Self = this.set("indicatorPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorPeriod: Self = this.set("indicatorPeriod", js.undefined)
    
    @scala.inline
    def setIndicatorShortPeriod(value: Double): Self = this.set("indicatorShortPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorShortPeriod: Self = this.set("indicatorShortPeriod", js.undefined)
    
    @scala.inline
    def setIndicatorSignalPeriod(value: Double): Self = this.set("indicatorSignalPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorSignalPeriod: Self = this.set("indicatorSignalPeriod", js.undefined)
    
    @scala.inline
    def setIndicatorSmoothingPeriod(value: Double): Self = this.set("indicatorSmoothingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorSmoothingPeriod: Self = this.set("indicatorSmoothingPeriod", js.undefined)
    
    @scala.inline
    def setIndicatorThickness(value: Double): Self = this.set("indicatorThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorThickness: Self = this.set("indicatorThickness", js.undefined)
    
    @scala.inline
    def setIndicatorTypes(value: js.Any): Self = this.set("indicatorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorTypes: Self = this.set("indicatorTypes", js.undefined)
    
    @scala.inline
    def setIsHorizontalZoomEnabled(value: Boolean): Self = this.set("isHorizontalZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHorizontalZoomEnabled: Self = this.set("isHorizontalZoomEnabled", js.undefined)
    
    @scala.inline
    def setIsLegendVisible(value: Boolean): Self = this.set("isLegendVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLegendVisible: Self = this.set("isLegendVisible", js.undefined)
    
    @scala.inline
    def setIsSeriesHighlightingEnabled(value: Boolean): Self = this.set("isSeriesHighlightingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSeriesHighlightingEnabled: Self = this.set("isSeriesHighlightingEnabled", js.undefined)
    
    @scala.inline
    def setIsToolbarVisible(value: Boolean): Self = this.set("isToolbarVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsToolbarVisible: Self = this.set("isToolbarVisible", js.undefined)
    
    @scala.inline
    def setIsVerticalZoomEnabled(value: Boolean): Self = this.set("isVerticalZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVerticalZoomEnabled: Self = this.set("isVerticalZoomEnabled", js.undefined)
    
    @scala.inline
    def setIsWindowSyncedToVisibleRange(value: Boolean): Self = this.set("isWindowSyncedToVisibleRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWindowSyncedToVisibleRange: Self = this.set("isWindowSyncedToVisibleRange", js.undefined)
    
    @scala.inline
    def setItemsSource(value: js.Any): Self = this.set("itemsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsSource: Self = this.set("itemsSource", js.undefined)
    
    @scala.inline
    def setLeftMargin(value: Double): Self = this.set("leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftMargin: Self = this.set("leftMargin", js.undefined)
    
    @scala.inline
    def setLegend(value: js.Any): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setMarkerBrushes(value: js.Any): Self = this.set("markerBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerBrushes: Self = this.set("markerBrushes", js.undefined)
    
    @scala.inline
    def setMarkerMaxCount(value: Double): Self = this.set("markerMaxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerMaxCount: Self = this.set("markerMaxCount", js.undefined)
    
    @scala.inline
    def setMarkerOutlines(value: js.Any): Self = this.set("markerOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerOutlines: Self = this.set("markerOutlines", js.undefined)
    
    @scala.inline
    def setMarkerTypes(value: js.Any): Self = this.set("markerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerTypes: Self = this.set("markerTypes", js.undefined)
    
    @scala.inline
    def setMaxRecCount(value: Double): Self = this.set("maxRecCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecCount: Self = this.set("maxRecCount", js.undefined)
    
    @scala.inline
    def setNegativeBrushes(value: js.Any): Self = this.set("negativeBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeBrushes: Self = this.set("negativeBrushes", js.undefined)
    
    @scala.inline
    def setNegativeOutlines(value: js.Any): Self = this.set("negativeOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeOutlines: Self = this.set("negativeOutlines", js.undefined)
    
    @scala.inline
    def setOutlines(value: js.Any): Self = this.set("outlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlines: Self = this.set("outlines", js.undefined)
    
    @scala.inline
    def setOverlayBrushes(value: js.Any): Self = this.set("overlayBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBrushes: Self = this.set("overlayBrushes", js.undefined)
    
    @scala.inline
    def setOverlayOutlines(value: js.Any): Self = this.set("overlayOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayOutlines: Self = this.set("overlayOutlines", js.undefined)
    
    @scala.inline
    def setOverlayPickerTemplate(value: js.Any): Self = this.set("overlayPickerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayPickerTemplate: Self = this.set("overlayPickerTemplate", js.undefined)
    
    @scala.inline
    def setOverlayThickness(value: Double): Self = this.set("overlayThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayThickness: Self = this.set("overlayThickness", js.undefined)
    
    @scala.inline
    def setOverlayTypes(value: js.Any): Self = this.set("overlayTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayTypes: Self = this.set("overlayTypes", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = this.set("pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelScalingRatio: Self = this.set("pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setPropertyChanged(value: (/* event */ Event, /* ui */ PropertyChangedEventUIParam) => Unit): Self = this.set("propertyChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePropertyChanged: Self = this.set("propertyChanged", js.undefined)
    
    @scala.inline
    def setRangeSelectorOptions(value: js.Any): Self = this.set("rangeSelectorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeSelectorOptions: Self = this.set("rangeSelectorOptions", js.undefined)
    
    @scala.inline
    def setRangeSelectorTemplate(value: js.Any): Self = this.set("rangeSelectorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeSelectorTemplate: Self = this.set("rangeSelectorTemplate", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    
    @scala.inline
    def setResponseTotalRecCountKey(value: String): Self = this.set("responseTotalRecCountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTotalRecCountKey: Self = this.set("responseTotalRecCountKey", js.undefined)
    
    @scala.inline
    def setRightMargin(value: Double): Self = this.set("rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightMargin: Self = this.set("rightMargin", js.undefined)
    
    @scala.inline
    def setSeriesAdded(value: (/* event */ Event, /* ui */ SeriesAddedEventUIParam) => Unit): Self = this.set("seriesAdded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSeriesAdded: Self = this.set("seriesAdded", js.undefined)
    
    @scala.inline
    def setSeriesPointerDown(value: (/* event */ Event, /* ui */ SeriesPointerDownEventUIParam) => Unit): Self = this.set("seriesPointerDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSeriesPointerDown: Self = this.set("seriesPointerDown", js.undefined)
    
    @scala.inline
    def setSeriesPointerEnter(value: (/* event */ Event, /* ui */ SeriesPointerEnterEventUIParam) => Unit): Self = this.set("seriesPointerEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSeriesPointerEnter: Self = this.set("seriesPointerEnter", js.undefined)
    
    @scala.inline
    def setSeriesPointerLeave(value: (/* event */ Event, /* ui */ SeriesPointerLeaveEventUIParam) => Unit): Self = this.set("seriesPointerLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSeriesPointerLeave: Self = this.set("seriesPointerLeave", js.undefined)
    
    @scala.inline
    def setSeriesPointerMove(value: (/* event */ Event, /* ui */ SeriesPointerMoveEventUIParam) => Unit): Self = this.set("seriesPointerMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSeriesPointerMove: Self = this.set("seriesPointerMove", js.undefined)
    
    @scala.inline
    def setSeriesPointerUp(value: (/* event */ Event, /* ui */ SeriesPointerUpEventUIParam) => Unit): Self = this.set("seriesPointerUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSeriesPointerUp: Self = this.set("seriesPointerUp", js.undefined)
    
    @scala.inline
    def setSeriesRemoved(value: (/* event */ Event, /* ui */ SeriesRemovedEventUIParam) => Unit): Self = this.set("seriesRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSeriesRemoved: Self = this.set("seriesRemoved", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setSubtitleAlignment(value: String): Self = this.set("subtitleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleAlignment: Self = this.set("subtitleAlignment", js.undefined)
    
    @scala.inline
    def setSubtitleBottomMargin(value: Double): Self = this.set("subtitleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleBottomMargin: Self = this.set("subtitleBottomMargin", js.undefined)
    
    @scala.inline
    def setSubtitleLeftMargin(value: Double): Self = this.set("subtitleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleLeftMargin: Self = this.set("subtitleLeftMargin", js.undefined)
    
    @scala.inline
    def setSubtitleRightMargin(value: Double): Self = this.set("subtitleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleRightMargin: Self = this.set("subtitleRightMargin", js.undefined)
    
    @scala.inline
    def setSubtitleTextColor(value: String): Self = this.set("subtitleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleTextColor: Self = this.set("subtitleTextColor", js.undefined)
    
    @scala.inline
    def setSubtitleTextStyle(value: String): Self = this.set("subtitleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleTextStyle: Self = this.set("subtitleTextStyle", js.undefined)
    
    @scala.inline
    def setSubtitleTopMargin(value: Double): Self = this.set("subtitleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleTopMargin: Self = this.set("subtitleTopMargin", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleAlignment(value: String): Self = this.set("titleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleAlignment: Self = this.set("titleAlignment", js.undefined)
    
    @scala.inline
    def setTitleBottomMargin(value: Double): Self = this.set("titleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleBottomMargin: Self = this.set("titleBottomMargin", js.undefined)
    
    @scala.inline
    def setTitleLeftMargin(value: Double): Self = this.set("titleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleLeftMargin: Self = this.set("titleLeftMargin", js.undefined)
    
    @scala.inline
    def setTitleRightMargin(value: Double): Self = this.set("titleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleRightMargin: Self = this.set("titleRightMargin", js.undefined)
    
    @scala.inline
    def setTitleTextColor(value: String): Self = this.set("titleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextColor: Self = this.set("titleTextColor", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: String): Self = this.set("titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextStyle: Self = this.set("titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleTopMargin(value: Double): Self = this.set("titleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTopMargin: Self = this.set("titleTopMargin", js.undefined)
    
    @scala.inline
    def setToolTipType(value: String): Self = this.set("toolTipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTipType: Self = this.set("toolTipType", js.undefined)
    
    @scala.inline
    def setToolbarHeight(value: Double): Self = this.set("toolbarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarHeight: Self = this.set("toolbarHeight", js.undefined)
    
    @scala.inline
    def setToolbarTemplate(value: js.Any): Self = this.set("toolbarTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarTemplate: Self = this.set("toolbarTemplate", js.undefined)
    
    @scala.inline
    def setTooltipTemplate(value: js.Any): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    
    @scala.inline
    def setTooltipTemplates(value: js.Any): Self = this.set("tooltipTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplates: Self = this.set("tooltipTemplates", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Double): Self = this.set("topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopMargin: Self = this.set("topMargin", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionEasingFunction(value: js.Any): Self = this.set("transitionEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEasingFunction: Self = this.set("transitionEasingFunction", js.undefined)
    
    @scala.inline
    def setTrendLineBrushes(value: js.Any): Self = this.set("trendLineBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendLineBrushes: Self = this.set("trendLineBrushes", js.undefined)
    
    @scala.inline
    def setTrendLinePeriod(value: Double): Self = this.set("trendLinePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendLinePeriod: Self = this.set("trendLinePeriod", js.undefined)
    
    @scala.inline
    def setTrendLineThickness(value: Double): Self = this.set("trendLineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendLineThickness: Self = this.set("trendLineThickness", js.undefined)
    
    @scala.inline
    def setTrendLineType(value: String): Self = this.set("trendLineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendLineType: Self = this.set("trendLineType", js.undefined)
    
    @scala.inline
    def setTrendLineTypePickerTemplate(value: js.Any): Self = this.set("trendLineTypePickerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrendLineTypePickerTemplate: Self = this.set("trendLineTypePickerTemplate", js.undefined)
    
    @scala.inline
    def setUnknownValuePlotting(value: String): Self = this.set("unknownValuePlotting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownValuePlotting: Self = this.set("unknownValuePlotting", js.undefined)
    
    @scala.inline
    def setUpdateTooltip(value: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit): Self = this.set("updateTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateTooltip: Self = this.set("updateTooltip", js.undefined)
    
    @scala.inline
    def setVolumeBrushes(value: js.Any): Self = this.set("volumeBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeBrushes: Self = this.set("volumeBrushes", js.undefined)
    
    @scala.inline
    def setVolumeOutlines(value: js.Any): Self = this.set("volumeOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeOutlines: Self = this.set("volumeOutlines", js.undefined)
    
    @scala.inline
    def setVolumeThickness(value: Double): Self = this.set("volumeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeThickness: Self = this.set("volumeThickness", js.undefined)
    
    @scala.inline
    def setVolumeType(value: String): Self = this.set("volumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeType: Self = this.set("volumeType", js.undefined)
    
    @scala.inline
    def setVolumeTypePickerTemplate(value: js.Any): Self = this.set("volumeTypePickerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeTypePickerTemplate: Self = this.set("volumeTypePickerTemplate", js.undefined)
    
    @scala.inline
    def setWidget(value: js.Any): Self = this.set("widget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidget: Self = this.set("widget", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWindowRect(value: js.Any): Self = this.set("windowRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowRect: Self = this.set("windowRect", js.undefined)
    
    @scala.inline
    def setXAxisExtent(value: Double): Self = this.set("xAxisExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisExtent: Self = this.set("xAxisExtent", js.undefined)
    
    @scala.inline
    def setXAxisFormatLabel(value: js.Any): Self = this.set("xAxisFormatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisFormatLabel: Self = this.set("xAxisFormatLabel", js.undefined)
    
    @scala.inline
    def setXAxisInverted(value: Boolean): Self = this.set("xAxisInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisInverted: Self = this.set("xAxisInverted", js.undefined)
    
    @scala.inline
    def setXAxisLabel(value: js.Any): Self = this.set("xAxisLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabel: Self = this.set("xAxisLabel", js.undefined)
    
    @scala.inline
    def setXAxisLabelAngle(value: Double): Self = this.set("xAxisLabelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelAngle: Self = this.set("xAxisLabelAngle", js.undefined)
    
    @scala.inline
    def setXAxisLabelBottomMargin(value: Double): Self = this.set("xAxisLabelBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelBottomMargin: Self = this.set("xAxisLabelBottomMargin", js.undefined)
    
    @scala.inline
    def setXAxisLabelHorizontalAlignment(value: String): Self = this.set("xAxisLabelHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelHorizontalAlignment: Self = this.set("xAxisLabelHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setXAxisLabelLeftMargin(value: Double): Self = this.set("xAxisLabelLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelLeftMargin: Self = this.set("xAxisLabelLeftMargin", js.undefined)
    
    @scala.inline
    def setXAxisLabelRightMargin(value: Double): Self = this.set("xAxisLabelRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelRightMargin: Self = this.set("xAxisLabelRightMargin", js.undefined)
    
    @scala.inline
    def setXAxisLabelTextColor(value: String): Self = this.set("xAxisLabelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelTextColor: Self = this.set("xAxisLabelTextColor", js.undefined)
    
    @scala.inline
    def setXAxisLabelTextStyle(value: String): Self = this.set("xAxisLabelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelTextStyle: Self = this.set("xAxisLabelTextStyle", js.undefined)
    
    @scala.inline
    def setXAxisLabelTopMargin(value: Double): Self = this.set("xAxisLabelTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelTopMargin: Self = this.set("xAxisLabelTopMargin", js.undefined)
    
    @scala.inline
    def setXAxisLabelVerticalAlignment(value: String): Self = this.set("xAxisLabelVerticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelVerticalAlignment: Self = this.set("xAxisLabelVerticalAlignment", js.undefined)
    
    @scala.inline
    def setXAxisLabelVisibility(value: String): Self = this.set("xAxisLabelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisLabelVisibility: Self = this.set("xAxisLabelVisibility", js.undefined)
    
    @scala.inline
    def setXAxisMajorStroke(value: String): Self = this.set("xAxisMajorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisMajorStroke: Self = this.set("xAxisMajorStroke", js.undefined)
    
    @scala.inline
    def setXAxisMajorStrokeThickness(value: Double): Self = this.set("xAxisMajorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisMajorStrokeThickness: Self = this.set("xAxisMajorStrokeThickness", js.undefined)
    
    @scala.inline
    def setXAxisMaximumValue(value: js.Any): Self = this.set("xAxisMaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisMaximumValue: Self = this.set("xAxisMaximumValue", js.undefined)
    
    @scala.inline
    def setXAxisMinimumValue(value: js.Any): Self = this.set("xAxisMinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisMinimumValue: Self = this.set("xAxisMinimumValue", js.undefined)
    
    @scala.inline
    def setXAxisMinorStroke(value: String): Self = this.set("xAxisMinorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisMinorStroke: Self = this.set("xAxisMinorStroke", js.undefined)
    
    @scala.inline
    def setXAxisMinorStrokeThickness(value: Double): Self = this.set("xAxisMinorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisMinorStrokeThickness: Self = this.set("xAxisMinorStrokeThickness", js.undefined)
    
    @scala.inline
    def setXAxisMode(value: String): Self = this.set("xAxisMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisMode: Self = this.set("xAxisMode", js.undefined)
    
    @scala.inline
    def setXAxisStrip(value: String): Self = this.set("xAxisStrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisStrip: Self = this.set("xAxisStrip", js.undefined)
    
    @scala.inline
    def setXAxisStroke(value: String): Self = this.set("xAxisStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisStroke: Self = this.set("xAxisStroke", js.undefined)
    
    @scala.inline
    def setXAxisStrokeThickness(value: Double): Self = this.set("xAxisStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisStrokeThickness: Self = this.set("xAxisStrokeThickness", js.undefined)
    
    @scala.inline
    def setXAxisTickLength(value: Double): Self = this.set("xAxisTickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTickLength: Self = this.set("xAxisTickLength", js.undefined)
    
    @scala.inline
    def setXAxisTickStroke(value: String): Self = this.set("xAxisTickStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTickStroke: Self = this.set("xAxisTickStroke", js.undefined)
    
    @scala.inline
    def setXAxisTickStrokeThickness(value: Double): Self = this.set("xAxisTickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTickStrokeThickness: Self = this.set("xAxisTickStrokeThickness", js.undefined)
    
    @scala.inline
    def setXAxisTitle(value: String): Self = this.set("xAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitle: Self = this.set("xAxisTitle", js.undefined)
    
    @scala.inline
    def setXAxisTitleAlignment(value: String): Self = this.set("xAxisTitleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitleAlignment: Self = this.set("xAxisTitleAlignment", js.undefined)
    
    @scala.inline
    def setXAxisTitleAngle(value: Double): Self = this.set("xAxisTitleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitleAngle: Self = this.set("xAxisTitleAngle", js.undefined)
    
    @scala.inline
    def setXAxisTitleBottomMargin(value: Double): Self = this.set("xAxisTitleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitleBottomMargin: Self = this.set("xAxisTitleBottomMargin", js.undefined)
    
    @scala.inline
    def setXAxisTitleLeftMargin(value: Double): Self = this.set("xAxisTitleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitleLeftMargin: Self = this.set("xAxisTitleLeftMargin", js.undefined)
    
    @scala.inline
    def setXAxisTitleMargin(value: Double): Self = this.set("xAxisTitleMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitleMargin: Self = this.set("xAxisTitleMargin", js.undefined)
    
    @scala.inline
    def setXAxisTitleRightMargin(value: Double): Self = this.set("xAxisTitleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitleRightMargin: Self = this.set("xAxisTitleRightMargin", js.undefined)
    
    @scala.inline
    def setXAxisTitleTextColor(value: String): Self = this.set("xAxisTitleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitleTextColor: Self = this.set("xAxisTitleTextColor", js.undefined)
    
    @scala.inline
    def setXAxisTitleTextStyle(value: String): Self = this.set("xAxisTitleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitleTextStyle: Self = this.set("xAxisTitleTextStyle", js.undefined)
    
    @scala.inline
    def setXAxisTitleTopMargin(value: Double): Self = this.set("xAxisTitleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisTitleTopMargin: Self = this.set("xAxisTitleTopMargin", js.undefined)
    
    @scala.inline
    def setYAxisAbbreviateLargeNumbers(value: Boolean): Self = this.set("yAxisAbbreviateLargeNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisAbbreviateLargeNumbers: Self = this.set("yAxisAbbreviateLargeNumbers", js.undefined)
    
    @scala.inline
    def setYAxisExtent(value: Double): Self = this.set("yAxisExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisExtent: Self = this.set("yAxisExtent", js.undefined)
    
    @scala.inline
    def setYAxisFormatLabel(value: js.Any): Self = this.set("yAxisFormatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisFormatLabel: Self = this.set("yAxisFormatLabel", js.undefined)
    
    @scala.inline
    def setYAxisInterval(value: Double): Self = this.set("yAxisInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisInterval: Self = this.set("yAxisInterval", js.undefined)
    
    @scala.inline
    def setYAxisInverted(value: Boolean): Self = this.set("yAxisInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisInverted: Self = this.set("yAxisInverted", js.undefined)
    
    @scala.inline
    def setYAxisIsLogarithmic(value: Boolean): Self = this.set("yAxisIsLogarithmic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisIsLogarithmic: Self = this.set("yAxisIsLogarithmic", js.undefined)
    
    @scala.inline
    def setYAxisLabel(value: js.Any): Self = this.set("yAxisLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabel: Self = this.set("yAxisLabel", js.undefined)
    
    @scala.inline
    def setYAxisLabelAngle(value: Double): Self = this.set("yAxisLabelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelAngle: Self = this.set("yAxisLabelAngle", js.undefined)
    
    @scala.inline
    def setYAxisLabelBottomMargin(value: Double): Self = this.set("yAxisLabelBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelBottomMargin: Self = this.set("yAxisLabelBottomMargin", js.undefined)
    
    @scala.inline
    def setYAxisLabelHorizontalAlignment(value: String): Self = this.set("yAxisLabelHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelHorizontalAlignment: Self = this.set("yAxisLabelHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setYAxisLabelLeftMargin(value: Double): Self = this.set("yAxisLabelLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelLeftMargin: Self = this.set("yAxisLabelLeftMargin", js.undefined)
    
    @scala.inline
    def setYAxisLabelLocation(value: String): Self = this.set("yAxisLabelLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelLocation: Self = this.set("yAxisLabelLocation", js.undefined)
    
    @scala.inline
    def setYAxisLabelRightMargin(value: Double): Self = this.set("yAxisLabelRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelRightMargin: Self = this.set("yAxisLabelRightMargin", js.undefined)
    
    @scala.inline
    def setYAxisLabelTextColor(value: String): Self = this.set("yAxisLabelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelTextColor: Self = this.set("yAxisLabelTextColor", js.undefined)
    
    @scala.inline
    def setYAxisLabelTextStyle(value: String): Self = this.set("yAxisLabelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelTextStyle: Self = this.set("yAxisLabelTextStyle", js.undefined)
    
    @scala.inline
    def setYAxisLabelTopMargin(value: Double): Self = this.set("yAxisLabelTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelTopMargin: Self = this.set("yAxisLabelTopMargin", js.undefined)
    
    @scala.inline
    def setYAxisLabelVerticalAlignment(value: String): Self = this.set("yAxisLabelVerticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelVerticalAlignment: Self = this.set("yAxisLabelVerticalAlignment", js.undefined)
    
    @scala.inline
    def setYAxisLabelVisibility(value: String): Self = this.set("yAxisLabelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLabelVisibility: Self = this.set("yAxisLabelVisibility", js.undefined)
    
    @scala.inline
    def setYAxisLogarithmBase(value: Double): Self = this.set("yAxisLogarithmBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisLogarithmBase: Self = this.set("yAxisLogarithmBase", js.undefined)
    
    @scala.inline
    def setYAxisMajorStroke(value: String): Self = this.set("yAxisMajorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisMajorStroke: Self = this.set("yAxisMajorStroke", js.undefined)
    
    @scala.inline
    def setYAxisMajorStrokeThickness(value: Double): Self = this.set("yAxisMajorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisMajorStrokeThickness: Self = this.set("yAxisMajorStrokeThickness", js.undefined)
    
    @scala.inline
    def setYAxisMaximumValue(value: Double): Self = this.set("yAxisMaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisMaximumValue: Self = this.set("yAxisMaximumValue", js.undefined)
    
    @scala.inline
    def setYAxisMinimumValue(value: Double): Self = this.set("yAxisMinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisMinimumValue: Self = this.set("yAxisMinimumValue", js.undefined)
    
    @scala.inline
    def setYAxisMinorInterval(value: Double): Self = this.set("yAxisMinorInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisMinorInterval: Self = this.set("yAxisMinorInterval", js.undefined)
    
    @scala.inline
    def setYAxisMinorStroke(value: String): Self = this.set("yAxisMinorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisMinorStroke: Self = this.set("yAxisMinorStroke", js.undefined)
    
    @scala.inline
    def setYAxisMinorStrokeThickness(value: Double): Self = this.set("yAxisMinorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisMinorStrokeThickness: Self = this.set("yAxisMinorStrokeThickness", js.undefined)
    
    @scala.inline
    def setYAxisMode(value: String): Self = this.set("yAxisMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisMode: Self = this.set("yAxisMode", js.undefined)
    
    @scala.inline
    def setYAxisStrip(value: String): Self = this.set("yAxisStrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisStrip: Self = this.set("yAxisStrip", js.undefined)
    
    @scala.inline
    def setYAxisStroke(value: String): Self = this.set("yAxisStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisStroke: Self = this.set("yAxisStroke", js.undefined)
    
    @scala.inline
    def setYAxisStrokeThickness(value: Double): Self = this.set("yAxisStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisStrokeThickness: Self = this.set("yAxisStrokeThickness", js.undefined)
    
    @scala.inline
    def setYAxisTickLength(value: Double): Self = this.set("yAxisTickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTickLength: Self = this.set("yAxisTickLength", js.undefined)
    
    @scala.inline
    def setYAxisTickStroke(value: String): Self = this.set("yAxisTickStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTickStroke: Self = this.set("yAxisTickStroke", js.undefined)
    
    @scala.inline
    def setYAxisTickStrokeThickness(value: Double): Self = this.set("yAxisTickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTickStrokeThickness: Self = this.set("yAxisTickStrokeThickness", js.undefined)
    
    @scala.inline
    def setYAxisTitle(value: String): Self = this.set("yAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitle: Self = this.set("yAxisTitle", js.undefined)
    
    @scala.inline
    def setYAxisTitleAlignment(value: String): Self = this.set("yAxisTitleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitleAlignment: Self = this.set("yAxisTitleAlignment", js.undefined)
    
    @scala.inline
    def setYAxisTitleAngle(value: Double): Self = this.set("yAxisTitleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitleAngle: Self = this.set("yAxisTitleAngle", js.undefined)
    
    @scala.inline
    def setYAxisTitleBottomMargin(value: Double): Self = this.set("yAxisTitleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitleBottomMargin: Self = this.set("yAxisTitleBottomMargin", js.undefined)
    
    @scala.inline
    def setYAxisTitleLeftMargin(value: Double): Self = this.set("yAxisTitleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitleLeftMargin: Self = this.set("yAxisTitleLeftMargin", js.undefined)
    
    @scala.inline
    def setYAxisTitleMargin(value: Double): Self = this.set("yAxisTitleMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitleMargin: Self = this.set("yAxisTitleMargin", js.undefined)
    
    @scala.inline
    def setYAxisTitleRightMargin(value: Double): Self = this.set("yAxisTitleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitleRightMargin: Self = this.set("yAxisTitleRightMargin", js.undefined)
    
    @scala.inline
    def setYAxisTitleTextColor(value: String): Self = this.set("yAxisTitleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitleTextColor: Self = this.set("yAxisTitleTextColor", js.undefined)
    
    @scala.inline
    def setYAxisTitleTextStyle(value: String): Self = this.set("yAxisTitleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitleTextStyle: Self = this.set("yAxisTitleTextStyle", js.undefined)
    
    @scala.inline
    def setYAxisTitleTopMargin(value: Double): Self = this.set("yAxisTitleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisTitleTopMargin: Self = this.set("yAxisTitleTopMargin", js.undefined)
    
    @scala.inline
    def setZoomSliderType(value: String): Self = this.set("zoomSliderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomSliderType: Self = this.set("zoomSliderType", js.undefined)
    
    @scala.inline
    def setZoomSliderXAxisMajorStroke(value: String): Self = this.set("zoomSliderXAxisMajorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomSliderXAxisMajorStroke: Self = this.set("zoomSliderXAxisMajorStroke", js.undefined)
    
    @scala.inline
    def setZoomSliderXAxisMajorStrokeThickness(value: Double): Self = this.set("zoomSliderXAxisMajorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomSliderXAxisMajorStrokeThickness: Self = this.set("zoomSliderXAxisMajorStrokeThickness", js.undefined)
  }
}
