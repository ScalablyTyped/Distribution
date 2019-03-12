package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgCategoryChart
  extends /**
	 * Option for igCategoryChart
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets or sets a value indicating whether grid and tick lines are aligned to device pixels.
  	 */
  var alignsGridLinesToPixels: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the series animations should be allowed when a range change has been detected on an axis.
  	 */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the bottom margin around the chart content.
  	 */
  var bottomMargin: js.UndefOr[scala.Double] = js.undefined
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
  var calloutStyleUpdatingEventEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the member path of the content data for the callouts.
  	 */
  var calloutsContentMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the collection of callout data to be annotated.
  	 */
  var calloutsItemsSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the member path of the label data for the callouts.
  	 */
  var calloutsLabelMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets if callouts should be displayed.
  	 */
  var calloutsVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the member path of the X data for the callouts.
  	 */
  var calloutsXMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the member path of the Y data for the callouts.
  	 */
  var calloutsYMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the type of chart series to generate from the data.
  	 *
  	 * Valid values:
  	 * "line" Specifies category line series with markers at each data point
  	 * "area" Specifies category area series
  	 * "column" Specifies category column chart with vertical rectangles at each data point
  	 * "point" Specifies category point chart with markers at each data point
  	 * "stepLine" Specifies category step line chart
  	 * "stepArea" Specifies category step area chart
  	 * "spline" Specifies category spline line series with markers at each data point
  	 * "splineArea" Specifies category spline area series
  	 * "waterfall" Specifies category waterfall chart
  	 * "auto" Specifies automatic selection of chart type based on suggestions from Data Adapter
  	 */
  var chartType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets a function for creating wrapped tooltip
  	 */
  var createWrappedTooltip: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets whether annotations are shown along the axis for crosshair values
  	 */
  var crosshairsAnnotationEnabled: js.UndefOr[scala.Boolean] = js.undefined
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
  var crosshairsDisplayMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets whether crosshairs will snap to the nearest data point.
  	 */
  var crosshairsSnapToData: js.UndefOr[scala.Boolean] = js.undefined
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
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets sets url which is used for sending JSON on request for remote data.
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets a set of property paths that should be excluded from consideration by the category chart.
  	 */
  var excludedProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets whether annotations for the final value of each series is displayed on the axis.
  	 */
  var finalValueAnnotationsVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The height of the chart.
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
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
  	 * Gets or sets whether the category should be highlighted when hovered
  	 */
  var isCategoryHighlightingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the chart can be horizontally zoomed through user interactions.
  	 */
  var isHorizontalZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the item should be highlighted when hovered
  	 */
  var isItemHighlightingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the chart can highlight series through user interactions.
  	 * This property applies to Category Chart and Financial Chart controls.
  	 */
  var isSeriesHighlightingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether animation of series plots is enabled when the chart is loading into view
  	 */
  var isTransitionInEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the chart can be vertically zoomed through user interactions.
  	 */
  var isVerticalZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
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
  var leftMargin: js.UndefOr[scala.Double] = js.undefined
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
  	 * Gets or sets the behavior for markers in each series which are placed too close together for the current view, resulting in a collision.
  	 *
  	 * Valid values:
  	 * "none" Collision avoidance is disabled.
  	 * "omit" Items colliding with other items will be hidden from view.
  	 */
  var markerCollisionAvoidance: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the maximum number of markers displyed in the plot area of the chart.
  	 */
  var markerMaxCount: js.UndefOr[scala.Double] = js.undefined
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
  var maxRecCount: js.UndefOr[scala.Double] = js.undefined
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
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event raised when a property value is changed on this chart
  	 */
  var propertyChanged: js.UndefOr[PropertyChangedEvent] = js.undefined
  /**
  	 * Gets or sets the rendering resolution for all series in this chart.
  	 * Where n = Resolution, for every n horizontal pixels, combine all items into a single datapoint.  When Resolution = 0, all datapoints will be rendered as graphical objects.  Charts with a higher resolution will have faster performance.
  	 */
  var resolution: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * See $.ig.DataSource. property in the response specifying the total number of records on the server.
  	 */
  var responseTotalRecCountKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the right margin of the chart content.
  	 */
  var rightMargin: js.UndefOr[scala.Double] = js.undefined
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
  var subtitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets horizontal alignment which determines the subtitle position, relative to the left and right edges of the control.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var subtitleAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the bottom margin of chart subtitle
  	 */
  var subtitleBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the left margin of chart subtitle
  	 */
  var subtitleLeftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the right margin of chart subtitle
  	 */
  var subtitleRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets color of chart subtitle
  	 */
  var subtitleTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets CSS font property for the chart subtitle
  	 */
  var subtitleTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the top margin of chart subtitle
  	 */
  var subtitleTopMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the thickness for all series in this chart. Depending on the ChartType, this can be the main brush used, or just the outline.
  	 */
  var thickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets text to display above the plot area.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets horizontal alignment which determines the title position, relative to the left and right edges of the control.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var titleAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the bottom margin of chart title
  	 */
  var titleBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the left margin of chart title
  	 */
  var titleLeftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the right margin of chart title
  	 */
  var titleRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets color of chart title
  	 */
  var titleTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets CSS font property for the chart title
  	 */
  var titleTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the top margin of chart title
  	 */
  var titleTopMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the style of tooltip to be displayed.
  	 *
  	 * Valid values:
  	 * "default" Display default tooltip for each series in the chart.
  	 * "item" Display individual tooltips for all series in the chart.
  	 * "category" Display combined tooltip for all series in the chart.
  	 * "none" Display no tooltips in the chart.
  	 */
  var toolTipType: js.UndefOr[java.lang.String] = js.undefined
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
  var topMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the duration used for animating series plots when the data is changing
  	 */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the easing function used for animating series plots when the data is changing.
  	 * This can be set to one of the known values "linear" or "cubic," or it can be set to an easing function which takes a single numeric parameter and returns a number.
  	 */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the duration used for animating series plots when the chart is loading into view
  	 */
  var transitionInDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the easing function used for animating series plots when the chart is loading into view
  	 * This can be set to one of the known values "linear" or "cubic," or it can be set to an easing function which takes a single numeric parameter and returns a number.
  	 */
  var transitionInEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the method that determines how to animate series plots when the chart is loading into view
  	 *
  	 * Valid values:
  	 * "auto" Series transitions in an automatically chosen based on type of series and its orientation
  	 * "fromZero" Series transitions in from the reference value of the value axis.
  	 * "sweepFromLeft" Series sweeps in from the left
  	 * "sweepFromRight" Series sweeps in from the right
  	 * "sweepFromTop" Series sweeps in from the top.
  	 * "sweepFromBottom" Series sweeps in from the bottom.
  	 * "sweepFromCenter" Series sweeps in from the center.
  	 * "accordionFromLeft" Series accordions in from the left.
  	 * "accordionFromRight" Series accordions in from the right.
  	 * "accordionFromTop" Series accordions in from the top.
  	 * "accordionFromBottom" Series accordions in from the bottom.
  	 * "expand" Series expands from the value midpoints.
  	 * "sweepFromCategoryAxisMinimum" Series sweeps in from the category axis minimum.
  	 * "sweepFromCategoryAxisMaximum" Series sweeps in from the category axis maximum.
  	 * "sweepFromValueAxisMinimum" Series sweeps in from the value axis minimum.
  	 * "sweepFromValueAxisMaximum" Series sweeps in from the value axis maximum.
  	 * "accordionFromCategoryAxisMinimum" Series accordions in from the category axis minimum.
  	 * "accordionFromCategoryAxisMaximum" Series accordions in from the category axis maximum.
  	 * "accordionFromValueAxisMinimum" Series accordions in from the value axis minimum.
  	 * "accordionFromValueAxisMaximum" Series accordions in from the value axis maximum.
  	 */
  var transitionInMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the arrival speed used for animating series plots when the chart is loading into view
  	 *
  	 * Valid values:
  	 * "auto" A speed type is automatically selected.
  	 * "normal" All speeds are normal, data points will arrive at the same time.
  	 * "valueScaled" Data points will arrive later if their value is further from the start point.
  	 * "indexScaled" Data points will arrive later if their index is further from the axis origin.
  	 * "random" Data points will arrive at random times.
  	 */
  var transitionInSpeedType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the palette of brushes to used for coloring trend lines in this chart.
  	 * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var trendLineBrushes: js.UndefOr[js.Any] = js.undefined
  var trendLinePeriod: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the thickness of the trend lines in this chart.
  	 * This property applies only to these chart types: point, line, spline, and bubble
  	 */
  var trendLineThickness: js.UndefOr[scala.Double] = js.undefined
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
  var trendLineType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the behavior that determines how unknown values will be plotted on the chart.Null and Double.NaN are two examples of unknown values.
  	 *
  	 *
  	 * Valid values:
  	 * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
  	 * "dontPlot" Do not plot the unknown value on the chart.
  	 */
  var unknownValuePlotting: js.UndefOr[java.lang.String] = js.undefined
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
  	 * Gets or sets the widget of this control
  	 */
  var widget: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The width of the chart.
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the rectangle representing the current scroll and zoom state of the chart.
  	 * WindowRect is expressed as a Rectangle with coordinates and sizes between 0 and 1.
  	 * The provided object should have numeric properties called left, top, width and height.
  	 */
  var windowRect: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the distance between the X-axis and the bottom of the chart.
  	 */
  var xAxisExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets function which takes an context object and returns a formatted label for the X-axis.
  	 */
  var xAxisFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the amount of space between adjacent categories for the X-axis.
  	 * The gap is silently clamped to the range [0, 1] when used.
  	 */
  var xAxisGap: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the frequency of displayed labels along the X-axis.
  	 * Gets or sets the set value is a factor that determines which labels will be hidden. For example, an interval of 2 will display every other label.
  	 */
  var xAxisInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether to invert the direction of the X-axis by placing the first data items on the right side of the chart.
  	 */
  var xAxisInverted: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the format for labels along the X-axis.
  	 */
  var xAxisLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the angle of rotation for labels along the X-axis.
  	 */
  var xAxisLabelAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the bottom margin of labels on the X-axis
  	 */
  var xAxisLabelBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets Horizontal alignment of X-axis labels.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var xAxisLabelHorizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the left margin of labels on the X-axis
  	 */
  var xAxisLabelLeftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the right margin of labels on the X-axis
  	 */
  var xAxisLabelRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets color of labels on the X-axis
  	 */
  var xAxisLabelTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets CSS font property for labels on X-axis
  	 */
  var xAxisLabelTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the top margin of labels on the X-axis
  	 */
  var xAxisLabelTopMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets Vertical alignment of X-axis labels.
  	 *
  	 * Valid values:
  	 * "top" Align the item to the top
  	 * "center" Center the item
  	 * "bottom" Align the item to the bottom
  	 * "stretch" Stretch the item to the full height
  	 */
  var xAxisLabelVerticalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets Visibility of X-axis labels.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var xAxisLabelVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the color to apply to major gridlines along the X-axis.
  	 */
  var xAxisMajorStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to major gridlines along the X-axis.
  	 */
  var xAxisMajorStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the frequency of displayed minor lines along the X-axis.
  	 * Gets or sets the set value is a factor that determines how the minor lines will be displayed.
  	 */
  var xAxisMinorInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to minor gridlines along the X-axis.
  	 */
  var xAxisMinorStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to minor gridlines along the X-axis.
  	 */
  var xAxisMinorStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the amount of overlap between adjacent categories for the X-axis.
  	 * Gets or sets the overlap is silently clamped to the range [-1, 1] when used.
  	 */
  var xAxisOverlap: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to stripes along the X-axis.
  	 */
  var xAxisStrip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the color to apply to the X-axis line.
  	 */
  var xAxisStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to the X-axis line.
  	 */
  var xAxisStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the length of tickmarks along the X-axis.
  	 */
  var xAxisTickLength: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to tickmarks along the X-axis.
  	 */
  var xAxisTickStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to tickmarks along the X-axis.
  	 */
  var xAxisTickStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the Text to display below the X-axis.
  	 */
  var xAxisTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets Horizontal alignment of the X-axis title.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var xAxisTitleAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the angle of rotation for the X-axis title.
  	 */
  var xAxisTitleAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the bottom margin of a title on the X-axis
  	 */
  var xAxisTitleBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the left margin of a title on the X-axis
  	 */
  var xAxisTitleLeftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the margin around a title on the X-axis
  	 */
  var xAxisTitleMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the right margin of a title on the X-axis
  	 */
  var xAxisTitleRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets color of title on the X-axis
  	 */
  var xAxisTitleTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets CSS font property for title on X-axis
  	 */
  var xAxisTitleTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the top margin of a title on the X-axis
  	 */
  var xAxisTitleTopMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether the large numbers on the Y-axis labels are abbreviated.
  	 */
  var yAxisAbbreviateLargeNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the distance between the Y-axis and the left edge of the chart.
  	 */
  var yAxisExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets function which takes a context object and returns a formatted label for the Y-axis.
  	 */
  var yAxisFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the distance between each label and grid line along the Y-axis.
  	 */
  var yAxisInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether to invert the direction of the Y-axis by placing the minimum numeric value at the top of the chart.
  	 */
  var yAxisInverted: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the Y-axis should use a logarithmic scale instead of a linear one.
  	 * Since log(-1) is imaginary and log(0) is undefined, it is recommended to enable this property only when the Y-axis minimum is greater than zero.
  	 */
  var yAxisIsLogarithmic: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the property or string from which the labels are derived.
  	 */
  var yAxisLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the angle of rotation for labels along the Y-axis.
  	 */
  var yAxisLabelAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the bottom margin of labels on the Y-axis
  	 */
  var yAxisLabelBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets Horizontal alignment of Y-axis labels.
  	 *
  	 * Valid values:
  	 * "left" Align the item to the left
  	 * "center" Center the item
  	 * "right" Align the item to the right
  	 * "stretch" Stretch the item to the full width
  	 */
  var yAxisLabelHorizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the left margin of labels on the Y-axis
  	 */
  var yAxisLabelLeftMargin: js.UndefOr[scala.Double] = js.undefined
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
  var yAxisLabelLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the right margin of labels on the Y-axis
  	 */
  var yAxisLabelRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets color of labels on the Y-axis
  	 */
  var yAxisLabelTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets CSS font property for labels on Y-axis
  	 */
  var yAxisLabelTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the top margin of labels on the Y-axis
  	 */
  var yAxisLabelTopMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets Vertical alignment of Y-axis labels.
  	 *
  	 * Valid values:
  	 * "top" Align the item to the top
  	 * "center" Center the item
  	 * "bottom" Align the item to the bottom
  	 * "stretch" Stretch the item to the full height
  	 */
  var yAxisLabelVerticalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets Visibility of Y-axis labels.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var yAxisLabelVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the base value to use in the log function when mapping the position of data items along the Y-axis.
  	 * This property is effective only when YAxisIsLogarithmic is true.
  	 */
  var yAxisLogarithmBase: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to major gridlines along the Y-axis.
  	 */
  var yAxisMajorStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to major gridlines along the Y-axis.
  	 */
  var yAxisMajorStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the data value corresponding to the maximum value of the Y-axis.
  	 */
  var yAxisMaximumValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the data value corresponding to the minimum value of the Y-axis.
  	 */
  var yAxisMinimumValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the frequency of displayed minor lines along the Y-axis.
  	 */
  var yAxisMinorInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to minor gridlines along the Y-axis.
  	 */
  var yAxisMinorStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to minor gridlines along the Y-axis.
  	 */
  var yAxisMinorStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to stripes along the Y-axis.
  	 */
  var yAxisStrip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the color to apply to the Y-axis line.
  	 */
  var yAxisStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to the Y-axis line.
  	 */
  var yAxisStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the length of tickmarks along the Y-axis.
  	 */
  var yAxisTickLength: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to tickmarks along the Y-axis.
  	 */
  var yAxisTickStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to tickmarks along the Y-axis.
  	 */
  var yAxisTickStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the Text to display to the left of the Y-axis.
  	 */
  var yAxisTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets Vertical alignment of the Y-axis title.
  	 *
  	 * Valid values:
  	 * "top" Align the item to the top
  	 * "center" Center the item
  	 * "bottom" Align the item to the bottom
  	 * "stretch" Stretch the item to the full height
  	 */
  var yAxisTitleAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the angle of rotation for the Y-axis title.
  	 */
  var yAxisTitleAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the bottom margin of a title on the Y-axis
  	 */
  var yAxisTitleBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the left margin of a title on the Y-axis
  	 */
  var yAxisTitleLeftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the margin around a title on the Y-axis
  	 */
  var yAxisTitleMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the right margin of a title on the Y-axis
  	 */
  var yAxisTitleRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets color of title on the Y-axis
  	 */
  var yAxisTitleTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets CSS font property for title on Y-axis
  	 */
  var yAxisTitleTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the top margin of a title on the Y-axis
  	 */
  var yAxisTitleTopMargin: js.UndefOr[scala.Double] = js.undefined
}

object IgCategoryChart {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igCategoryChart
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    alignsGridLinesToPixels: js.UndefOr[scala.Boolean] = js.undefined,
    animateSeriesWhenAxisRangeChanges: js.UndefOr[scala.Boolean] = js.undefined,
    bottomMargin: scala.Int | scala.Double = null,
    brushes: js.Any = null,
    calloutStyleUpdating: CalloutStyleUpdatingEvent = null,
    calloutStyleUpdatingEventEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    calloutsContentMemberPath: java.lang.String = null,
    calloutsItemsSource: js.Any = null,
    calloutsLabelMemberPath: java.lang.String = null,
    calloutsVisible: js.UndefOr[scala.Boolean] = js.undefined,
    calloutsXMemberPath: java.lang.String = null,
    calloutsYMemberPath: java.lang.String = null,
    chartType: java.lang.String = null,
    createWrappedTooltip: js.Any = null,
    crosshairsAnnotationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    crosshairsDisplayMode: java.lang.String = null,
    crosshairsSnapToData: js.UndefOr[scala.Boolean] = js.undefined,
    dataBinding: DataBindingEvent = null,
    dataBound: DataBoundEvent = null,
    dataSource: js.Any = null,
    dataSourceType: java.lang.String = null,
    dataSourceUrl: java.lang.String = null,
    excludedProperties: js.Any = null,
    finalValueAnnotationsVisible: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    hideTooltip: HideTooltipEvent = null,
    includedProperties: js.Any = null,
    isCategoryHighlightingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isHorizontalZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isItemHighlightingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isSeriesHighlightingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isTransitionInEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isVerticalZoomEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    itemsSource: js.Any = null,
    leftMargin: scala.Int | scala.Double = null,
    legend: js.Any = null,
    markerBrushes: js.Any = null,
    markerCollisionAvoidance: java.lang.String = null,
    markerMaxCount: scala.Int | scala.Double = null,
    markerOutlines: js.Any = null,
    markerTypes: js.Any = null,
    maxRecCount: scala.Int | scala.Double = null,
    negativeBrushes: js.Any = null,
    negativeOutlines: js.Any = null,
    outlines: js.Any = null,
    pixelScalingRatio: scala.Int | scala.Double = null,
    propertyChanged: PropertyChangedEvent = null,
    resolution: scala.Int | scala.Double = null,
    responseDataKey: java.lang.String = null,
    responseTotalRecCountKey: java.lang.String = null,
    rightMargin: scala.Int | scala.Double = null,
    seriesAdded: SeriesAddedEvent = null,
    seriesPointerDown: SeriesPointerDownEvent = null,
    seriesPointerEnter: SeriesPointerEnterEvent = null,
    seriesPointerLeave: SeriesPointerLeaveEvent = null,
    seriesPointerMove: SeriesPointerMoveEvent = null,
    seriesPointerUp: SeriesPointerUpEvent = null,
    seriesRemoved: SeriesRemovedEvent = null,
    subtitle: java.lang.String = null,
    subtitleAlignment: java.lang.String = null,
    subtitleBottomMargin: scala.Int | scala.Double = null,
    subtitleLeftMargin: scala.Int | scala.Double = null,
    subtitleRightMargin: scala.Int | scala.Double = null,
    subtitleTextColor: java.lang.String = null,
    subtitleTextStyle: java.lang.String = null,
    subtitleTopMargin: scala.Int | scala.Double = null,
    thickness: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    titleAlignment: java.lang.String = null,
    titleBottomMargin: scala.Int | scala.Double = null,
    titleLeftMargin: scala.Int | scala.Double = null,
    titleRightMargin: scala.Int | scala.Double = null,
    titleTextColor: java.lang.String = null,
    titleTextStyle: java.lang.String = null,
    titleTopMargin: scala.Int | scala.Double = null,
    toolTipType: java.lang.String = null,
    tooltipTemplate: js.Any = null,
    tooltipTemplates: js.Any = null,
    topMargin: scala.Int | scala.Double = null,
    transitionDuration: scala.Int | scala.Double = null,
    transitionEasingFunction: js.Any = null,
    transitionInDuration: scala.Int | scala.Double = null,
    transitionInEasingFunction: js.Any = null,
    transitionInMode: java.lang.String = null,
    transitionInSpeedType: java.lang.String = null,
    trendLineBrushes: js.Any = null,
    trendLinePeriod: scala.Int | scala.Double = null,
    trendLineThickness: scala.Int | scala.Double = null,
    trendLineType: java.lang.String = null,
    unknownValuePlotting: java.lang.String = null,
    updateTooltip: UpdateTooltipEvent = null,
    widget: js.Any = null,
    width: scala.Int | scala.Double = null,
    windowRect: js.Any = null,
    xAxisExtent: scala.Int | scala.Double = null,
    xAxisFormatLabel: js.Any = null,
    xAxisGap: scala.Int | scala.Double = null,
    xAxisInterval: scala.Int | scala.Double = null,
    xAxisInverted: js.UndefOr[scala.Boolean] = js.undefined,
    xAxisLabel: js.Any = null,
    xAxisLabelAngle: scala.Int | scala.Double = null,
    xAxisLabelBottomMargin: scala.Int | scala.Double = null,
    xAxisLabelHorizontalAlignment: java.lang.String = null,
    xAxisLabelLeftMargin: scala.Int | scala.Double = null,
    xAxisLabelRightMargin: scala.Int | scala.Double = null,
    xAxisLabelTextColor: java.lang.String = null,
    xAxisLabelTextStyle: java.lang.String = null,
    xAxisLabelTopMargin: scala.Int | scala.Double = null,
    xAxisLabelVerticalAlignment: java.lang.String = null,
    xAxisLabelVisibility: java.lang.String = null,
    xAxisMajorStroke: java.lang.String = null,
    xAxisMajorStrokeThickness: scala.Int | scala.Double = null,
    xAxisMinorInterval: scala.Int | scala.Double = null,
    xAxisMinorStroke: java.lang.String = null,
    xAxisMinorStrokeThickness: scala.Int | scala.Double = null,
    xAxisOverlap: scala.Int | scala.Double = null,
    xAxisStrip: java.lang.String = null,
    xAxisStroke: java.lang.String = null,
    xAxisStrokeThickness: scala.Int | scala.Double = null,
    xAxisTickLength: scala.Int | scala.Double = null,
    xAxisTickStroke: java.lang.String = null,
    xAxisTickStrokeThickness: scala.Int | scala.Double = null,
    xAxisTitle: java.lang.String = null,
    xAxisTitleAlignment: java.lang.String = null,
    xAxisTitleAngle: scala.Int | scala.Double = null,
    xAxisTitleBottomMargin: scala.Int | scala.Double = null,
    xAxisTitleLeftMargin: scala.Int | scala.Double = null,
    xAxisTitleMargin: scala.Int | scala.Double = null,
    xAxisTitleRightMargin: scala.Int | scala.Double = null,
    xAxisTitleTextColor: java.lang.String = null,
    xAxisTitleTextStyle: java.lang.String = null,
    xAxisTitleTopMargin: scala.Int | scala.Double = null,
    yAxisAbbreviateLargeNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    yAxisExtent: scala.Int | scala.Double = null,
    yAxisFormatLabel: js.Any = null,
    yAxisInterval: scala.Int | scala.Double = null,
    yAxisInverted: js.UndefOr[scala.Boolean] = js.undefined,
    yAxisIsLogarithmic: js.UndefOr[scala.Boolean] = js.undefined,
    yAxisLabel: js.Any = null,
    yAxisLabelAngle: scala.Int | scala.Double = null,
    yAxisLabelBottomMargin: scala.Int | scala.Double = null,
    yAxisLabelHorizontalAlignment: java.lang.String = null,
    yAxisLabelLeftMargin: scala.Int | scala.Double = null,
    yAxisLabelLocation: java.lang.String = null,
    yAxisLabelRightMargin: scala.Int | scala.Double = null,
    yAxisLabelTextColor: java.lang.String = null,
    yAxisLabelTextStyle: java.lang.String = null,
    yAxisLabelTopMargin: scala.Int | scala.Double = null,
    yAxisLabelVerticalAlignment: java.lang.String = null,
    yAxisLabelVisibility: java.lang.String = null,
    yAxisLogarithmBase: scala.Int | scala.Double = null,
    yAxisMajorStroke: java.lang.String = null,
    yAxisMajorStrokeThickness: scala.Int | scala.Double = null,
    yAxisMaximumValue: scala.Int | scala.Double = null,
    yAxisMinimumValue: scala.Int | scala.Double = null,
    yAxisMinorInterval: scala.Int | scala.Double = null,
    yAxisMinorStroke: java.lang.String = null,
    yAxisMinorStrokeThickness: scala.Int | scala.Double = null,
    yAxisStrip: java.lang.String = null,
    yAxisStroke: java.lang.String = null,
    yAxisStrokeThickness: scala.Int | scala.Double = null,
    yAxisTickLength: scala.Int | scala.Double = null,
    yAxisTickStroke: java.lang.String = null,
    yAxisTickStrokeThickness: scala.Int | scala.Double = null,
    yAxisTitle: java.lang.String = null,
    yAxisTitleAlignment: java.lang.String = null,
    yAxisTitleAngle: scala.Int | scala.Double = null,
    yAxisTitleBottomMargin: scala.Int | scala.Double = null,
    yAxisTitleLeftMargin: scala.Int | scala.Double = null,
    yAxisTitleMargin: scala.Int | scala.Double = null,
    yAxisTitleRightMargin: scala.Int | scala.Double = null,
    yAxisTitleTextColor: java.lang.String = null,
    yAxisTitleTextStyle: java.lang.String = null,
    yAxisTitleTopMargin: scala.Int | scala.Double = null
  ): IgCategoryChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(alignsGridLinesToPixels)) __obj.updateDynamic("alignsGridLinesToPixels")(alignsGridLinesToPixels)
    if (!js.isUndefined(animateSeriesWhenAxisRangeChanges)) __obj.updateDynamic("animateSeriesWhenAxisRangeChanges")(animateSeriesWhenAxisRangeChanges)
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
    if (createWrappedTooltip != null) __obj.updateDynamic("createWrappedTooltip")(createWrappedTooltip)
    if (!js.isUndefined(crosshairsAnnotationEnabled)) __obj.updateDynamic("crosshairsAnnotationEnabled")(crosshairsAnnotationEnabled)
    if (crosshairsDisplayMode != null) __obj.updateDynamic("crosshairsDisplayMode")(crosshairsDisplayMode)
    if (!js.isUndefined(crosshairsSnapToData)) __obj.updateDynamic("crosshairsSnapToData")(crosshairsSnapToData)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (excludedProperties != null) __obj.updateDynamic("excludedProperties")(excludedProperties)
    if (!js.isUndefined(finalValueAnnotationsVisible)) __obj.updateDynamic("finalValueAnnotationsVisible")(finalValueAnnotationsVisible)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hideTooltip != null) __obj.updateDynamic("hideTooltip")(hideTooltip)
    if (includedProperties != null) __obj.updateDynamic("includedProperties")(includedProperties)
    if (!js.isUndefined(isCategoryHighlightingEnabled)) __obj.updateDynamic("isCategoryHighlightingEnabled")(isCategoryHighlightingEnabled)
    if (!js.isUndefined(isHorizontalZoomEnabled)) __obj.updateDynamic("isHorizontalZoomEnabled")(isHorizontalZoomEnabled)
    if (!js.isUndefined(isItemHighlightingEnabled)) __obj.updateDynamic("isItemHighlightingEnabled")(isItemHighlightingEnabled)
    if (!js.isUndefined(isSeriesHighlightingEnabled)) __obj.updateDynamic("isSeriesHighlightingEnabled")(isSeriesHighlightingEnabled)
    if (!js.isUndefined(isTransitionInEnabled)) __obj.updateDynamic("isTransitionInEnabled")(isTransitionInEnabled)
    if (!js.isUndefined(isVerticalZoomEnabled)) __obj.updateDynamic("isVerticalZoomEnabled")(isVerticalZoomEnabled)
    if (itemsSource != null) __obj.updateDynamic("itemsSource")(itemsSource)
    if (leftMargin != null) __obj.updateDynamic("leftMargin")(leftMargin.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (markerBrushes != null) __obj.updateDynamic("markerBrushes")(markerBrushes)
    if (markerCollisionAvoidance != null) __obj.updateDynamic("markerCollisionAvoidance")(markerCollisionAvoidance)
    if (markerMaxCount != null) __obj.updateDynamic("markerMaxCount")(markerMaxCount.asInstanceOf[js.Any])
    if (markerOutlines != null) __obj.updateDynamic("markerOutlines")(markerOutlines)
    if (markerTypes != null) __obj.updateDynamic("markerTypes")(markerTypes)
    if (maxRecCount != null) __obj.updateDynamic("maxRecCount")(maxRecCount.asInstanceOf[js.Any])
    if (negativeBrushes != null) __obj.updateDynamic("negativeBrushes")(negativeBrushes)
    if (negativeOutlines != null) __obj.updateDynamic("negativeOutlines")(negativeOutlines)
    if (outlines != null) __obj.updateDynamic("outlines")(outlines)
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (propertyChanged != null) __obj.updateDynamic("propertyChanged")(propertyChanged)
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
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    if (tooltipTemplates != null) __obj.updateDynamic("tooltipTemplates")(tooltipTemplates)
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasingFunction != null) __obj.updateDynamic("transitionEasingFunction")(transitionEasingFunction)
    if (transitionInDuration != null) __obj.updateDynamic("transitionInDuration")(transitionInDuration.asInstanceOf[js.Any])
    if (transitionInEasingFunction != null) __obj.updateDynamic("transitionInEasingFunction")(transitionInEasingFunction)
    if (transitionInMode != null) __obj.updateDynamic("transitionInMode")(transitionInMode)
    if (transitionInSpeedType != null) __obj.updateDynamic("transitionInSpeedType")(transitionInSpeedType)
    if (trendLineBrushes != null) __obj.updateDynamic("trendLineBrushes")(trendLineBrushes)
    if (trendLinePeriod != null) __obj.updateDynamic("trendLinePeriod")(trendLinePeriod.asInstanceOf[js.Any])
    if (trendLineThickness != null) __obj.updateDynamic("trendLineThickness")(trendLineThickness.asInstanceOf[js.Any])
    if (trendLineType != null) __obj.updateDynamic("trendLineType")(trendLineType)
    if (unknownValuePlotting != null) __obj.updateDynamic("unknownValuePlotting")(unknownValuePlotting)
    if (updateTooltip != null) __obj.updateDynamic("updateTooltip")(updateTooltip)
    if (widget != null) __obj.updateDynamic("widget")(widget)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowRect != null) __obj.updateDynamic("windowRect")(windowRect)
    if (xAxisExtent != null) __obj.updateDynamic("xAxisExtent")(xAxisExtent.asInstanceOf[js.Any])
    if (xAxisFormatLabel != null) __obj.updateDynamic("xAxisFormatLabel")(xAxisFormatLabel)
    if (xAxisGap != null) __obj.updateDynamic("xAxisGap")(xAxisGap.asInstanceOf[js.Any])
    if (xAxisInterval != null) __obj.updateDynamic("xAxisInterval")(xAxisInterval.asInstanceOf[js.Any])
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
    if (xAxisMinorInterval != null) __obj.updateDynamic("xAxisMinorInterval")(xAxisMinorInterval.asInstanceOf[js.Any])
    if (xAxisMinorStroke != null) __obj.updateDynamic("xAxisMinorStroke")(xAxisMinorStroke)
    if (xAxisMinorStrokeThickness != null) __obj.updateDynamic("xAxisMinorStrokeThickness")(xAxisMinorStrokeThickness.asInstanceOf[js.Any])
    if (xAxisOverlap != null) __obj.updateDynamic("xAxisOverlap")(xAxisOverlap.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[IgCategoryChart]
  }
}

