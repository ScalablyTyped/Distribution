package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgShapeChart
  extends /**
	 * Option for igShapeChart
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets a value indicating whether grid and tick lines are aligned to device pixels.
  	 */
  var alignsGridLinesToPixels: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the series animations should be allowed when a range change has been detected on an axis.
  	 */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.undefined
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
  	 * Gets or sets the type of chart series to generate from the data.
  	 *
  	 * Valid values:
  	 * "auto" Specifies automatic selection of chart type based on suggestion from internal Data Adapter
  	 * "point" Specifies point chart with small markers at X/Y data
  	 * "line" Specifies line chart with small markers at X/Y data and connected with lines
  	 * "spline" Specifies spline chart with small markers at X/Y data and connected with splines
  	 * "bubble" Specifies bubble chart with proportional markers at X/Y data
  	 * "highDensity" Specifies high density chart with colored bitmap pixels at X/Y data based on density of nearby points
  	 * "area" Specifies area chart with colored surface based on a triangulation of X/Y data with numeric values assigned to each point.
  	 * "contour" Specifies area chart with colored lines based on a triangulation of X/Y data with numeric values assigned to each point.
  	 * "polygon" Specifies polygon chart with polygons defined by X/Y data
  	 * "polyline" Specifies polyline chart with polylines defined by X/Y data
  	 */
  var chartType: js.UndefOr[String] = js.undefined
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
  	 * String The database source URI.
  	 */
  var databaseSource: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets a set of property paths that should be excluded from consideration by the category chart.
  	 */
  var excludedProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets whether annotations for the final value of each series is displayed on the axis.
  	 */
  var finalValueAnnotationsVisible: js.UndefOr[Boolean] = js.undefined
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
  	 * Gets or sets whether the chart can be horizontally zoomed through user interactions.
  	 */
  var isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the chart can highlight series through user interactions.
  	 * This property applies to Category Chart and Financial Chart controls.
  	 */
  var isSeriesHighlightingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the chart can be vertically zoomed through user interactions.
  	 */
  var isVerticalZoomEnabled: js.UndefOr[Boolean] = js.undefined
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
  	 * Gets or sets collision avoidance between markers on series that support this behaviour.
  	 *
  	 * Valid values:
  	 * "none" Collision avoidance is disabled.
  	 * "omit" Items colliding with other items will be hidden from view.
  	 * "fade" Items colliding with other items will be partially hidden from view by reducing their opacity.
  	 * "omitAndShift" Items colliding with other items will be either hidden from view or moved to new positions.
  	 * "fadeAndShift" Items colliding with other items will be either partially hidden from view by reducing their opacity, or moved to new positions, or a combination of both.
  	 */
  var markerCollision: js.UndefOr[String] = js.undefined
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
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Event raised when a property value is changed on this chart
  	 */
  var propertyChanged: js.UndefOr[PropertyChangedEvent] = js.undefined
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
  	 * The triangulated file source URI or an instance of $.ig.ShapeDataSource.
  	 */
  var shapeDataSource: js.UndefOr[String] = js.undefined
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
  /**
  	 * The triangulated file source URI or an instance of $.ig.TriangulationDataSource.
  	 */
  var triangulationDataSource: js.UndefOr[String] = js.undefined
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
  	 * Gets or sets whether the large numbers on the X-axis labels are abbreviated.
  	 */
  var xAxisAbbreviateLargeNumbers: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the distance between the X-axis and the bottom of the chart.
  	 */
  var xAxisExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets function which takes an context object and returns a formatted label for the X-axis.
  	 */
  var xAxisFormatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the frequency of displayed labels along the X-axis.
  	 * Gets or sets the set value is a factor that determines which labels will be hidden. For example, an interval of 2 will display every other label.
  	 */
  var xAxisInterval: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets whether to invert the direction of the X-axis by placing the first data items on the right side of the chart.
  	 */
  var xAxisInverted: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the X-axis will use a logarithmic scale, instead of a linear one.
  	 * Since log(-1) is imaginary and log(0) is undefined, it is recommended to enable this property only when the X-axis minimum is greater than zero.
  	 */
  var xAxisIsLogarithmic: js.UndefOr[Boolean] = js.undefined
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
  	 * Gets or sets the base value to use in the log function when mapping the position of data items along the X-axis.
  	 * This property is effective only when y-axis is logarithmic
  	 */
  var xAxisLogarithmBase: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to major gridlines along the X-axis.
  	 */
  var xAxisMajorStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to major gridlines along the X-axis.
  	 */
  var xAxisMajorStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the data value corresponding to the maximum value on the X-axis.
  	 */
  var xAxisMaximumValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the data value corresponding to the minimum value on the X-axis.
  	 */
  var xAxisMinimumValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the frequency of displayed minor lines along the X-axis.
  	 * Gets or sets the set value is a factor that determines how the minor lines will be displayed.
  	 */
  var xAxisMinorInterval: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the color to apply to minor gridlines along the X-axis.
  	 */
  var xAxisMinorStroke: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness to apply to minor gridlines along the X-axis.
  	 */
  var xAxisMinorStrokeThickness: js.UndefOr[Double] = js.undefined
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
}

object IgShapeChart {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igShapeChart
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    alignsGridLinesToPixels: js.UndefOr[Boolean] = js.undefined,
    animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.undefined,
    bottomMargin: Int | Double = null,
    brushes: js.Any = null,
    calloutStyleUpdating: (/* event */ Event_, /* ui */ CalloutStyleUpdatingEventUIParam) => Unit = null,
    calloutStyleUpdatingEventEnabled: js.UndefOr[Boolean] = js.undefined,
    calloutsContentMemberPath: String = null,
    calloutsItemsSource: js.Any = null,
    calloutsLabelMemberPath: String = null,
    calloutsVisible: js.UndefOr[Boolean] = js.undefined,
    calloutsXMemberPath: String = null,
    calloutsYMemberPath: String = null,
    chartType: String = null,
    createWrappedTooltip: js.Any = null,
    crosshairsAnnotationEnabled: js.UndefOr[Boolean] = js.undefined,
    crosshairsDisplayMode: String = null,
    crosshairsSnapToData: js.UndefOr[Boolean] = js.undefined,
    dataBinding: (/* event */ Event_, /* ui */ DataBindingEventUIParam) => Unit = null,
    dataBound: (/* event */ Event_, /* ui */ DataBoundEventUIParam) => Unit = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    databaseSource: String = null,
    excludedProperties: js.Any = null,
    finalValueAnnotationsVisible: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    hideTooltip: (/* event */ Event_, /* ui */ HideTooltipEventUIParam) => Unit = null,
    includedProperties: js.Any = null,
    isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    isSeriesHighlightingEnabled: js.UndefOr[Boolean] = js.undefined,
    isVerticalZoomEnabled: js.UndefOr[Boolean] = js.undefined,
    itemsSource: js.Any = null,
    leftMargin: Int | Double = null,
    legend: js.Any = null,
    markerBrushes: js.Any = null,
    markerCollision: String = null,
    markerMaxCount: Int | Double = null,
    markerOutlines: js.Any = null,
    markerTypes: js.Any = null,
    maxRecCount: Int | Double = null,
    outlines: js.Any = null,
    pixelScalingRatio: Int | Double = null,
    propertyChanged: (/* event */ Event_, /* ui */ PropertyChangedEventUIParam) => Unit = null,
    resolution: Int | Double = null,
    responseDataKey: String = null,
    responseTotalRecCountKey: String = null,
    rightMargin: Int | Double = null,
    seriesAdded: (/* event */ Event_, /* ui */ SeriesAddedEventUIParam) => Unit = null,
    seriesPointerDown: (/* event */ Event_, /* ui */ SeriesPointerDownEventUIParam) => Unit = null,
    seriesPointerEnter: (/* event */ Event_, /* ui */ SeriesPointerEnterEventUIParam) => Unit = null,
    seriesPointerLeave: (/* event */ Event_, /* ui */ SeriesPointerLeaveEventUIParam) => Unit = null,
    seriesPointerMove: (/* event */ Event_, /* ui */ SeriesPointerMoveEventUIParam) => Unit = null,
    seriesPointerUp: (/* event */ Event_, /* ui */ SeriesPointerUpEventUIParam) => Unit = null,
    seriesRemoved: (/* event */ Event_, /* ui */ SeriesRemovedEventUIParam) => Unit = null,
    shapeDataSource: String = null,
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
    tooltipTemplate: js.Any = null,
    tooltipTemplates: js.Any = null,
    topMargin: Int | Double = null,
    transitionDuration: Int | Double = null,
    transitionEasingFunction: js.Any = null,
    trendLineBrushes: js.Any = null,
    trendLinePeriod: Int | Double = null,
    trendLineThickness: Int | Double = null,
    trendLineType: String = null,
    triangulationDataSource: String = null,
    unknownValuePlotting: String = null,
    updateTooltip: (/* event */ Event_, /* ui */ UpdateTooltipEventUIParam) => Unit = null,
    widget: js.Any = null,
    width: Int | Double = null,
    windowRect: js.Any = null,
    xAxisAbbreviateLargeNumbers: js.UndefOr[Boolean] = js.undefined,
    xAxisExtent: Int | Double = null,
    xAxisFormatLabel: js.Any = null,
    xAxisInterval: Int | Double = null,
    xAxisInverted: js.UndefOr[Boolean] = js.undefined,
    xAxisIsLogarithmic: js.UndefOr[Boolean] = js.undefined,
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
    xAxisLogarithmBase: Int | Double = null,
    xAxisMajorStroke: String = null,
    xAxisMajorStrokeThickness: Int | Double = null,
    xAxisMaximumValue: Int | Double = null,
    xAxisMinimumValue: Int | Double = null,
    xAxisMinorInterval: Int | Double = null,
    xAxisMinorStroke: String = null,
    xAxisMinorStrokeThickness: Int | Double = null,
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
    yAxisTitleTopMargin: Int | Double = null
  ): IgShapeChart = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(alignsGridLinesToPixels)) __obj.updateDynamic("alignsGridLinesToPixels")(alignsGridLinesToPixels.asInstanceOf[js.Any])
    if (!js.isUndefined(animateSeriesWhenAxisRangeChanges)) __obj.updateDynamic("animateSeriesWhenAxisRangeChanges")(animateSeriesWhenAxisRangeChanges.asInstanceOf[js.Any])
    if (bottomMargin != null) __obj.updateDynamic("bottomMargin")(bottomMargin.asInstanceOf[js.Any])
    if (brushes != null) __obj.updateDynamic("brushes")(brushes.asInstanceOf[js.Any])
    if (calloutStyleUpdating != null) __obj.updateDynamic("calloutStyleUpdating")(js.Any.fromFunction2(calloutStyleUpdating))
    if (!js.isUndefined(calloutStyleUpdatingEventEnabled)) __obj.updateDynamic("calloutStyleUpdatingEventEnabled")(calloutStyleUpdatingEventEnabled.asInstanceOf[js.Any])
    if (calloutsContentMemberPath != null) __obj.updateDynamic("calloutsContentMemberPath")(calloutsContentMemberPath.asInstanceOf[js.Any])
    if (calloutsItemsSource != null) __obj.updateDynamic("calloutsItemsSource")(calloutsItemsSource.asInstanceOf[js.Any])
    if (calloutsLabelMemberPath != null) __obj.updateDynamic("calloutsLabelMemberPath")(calloutsLabelMemberPath.asInstanceOf[js.Any])
    if (!js.isUndefined(calloutsVisible)) __obj.updateDynamic("calloutsVisible")(calloutsVisible.asInstanceOf[js.Any])
    if (calloutsXMemberPath != null) __obj.updateDynamic("calloutsXMemberPath")(calloutsXMemberPath.asInstanceOf[js.Any])
    if (calloutsYMemberPath != null) __obj.updateDynamic("calloutsYMemberPath")(calloutsYMemberPath.asInstanceOf[js.Any])
    if (chartType != null) __obj.updateDynamic("chartType")(chartType.asInstanceOf[js.Any])
    if (createWrappedTooltip != null) __obj.updateDynamic("createWrappedTooltip")(createWrappedTooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(crosshairsAnnotationEnabled)) __obj.updateDynamic("crosshairsAnnotationEnabled")(crosshairsAnnotationEnabled.asInstanceOf[js.Any])
    if (crosshairsDisplayMode != null) __obj.updateDynamic("crosshairsDisplayMode")(crosshairsDisplayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(crosshairsSnapToData)) __obj.updateDynamic("crosshairsSnapToData")(crosshairsSnapToData.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction2(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction2(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (databaseSource != null) __obj.updateDynamic("databaseSource")(databaseSource.asInstanceOf[js.Any])
    if (excludedProperties != null) __obj.updateDynamic("excludedProperties")(excludedProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(finalValueAnnotationsVisible)) __obj.updateDynamic("finalValueAnnotationsVisible")(finalValueAnnotationsVisible.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hideTooltip != null) __obj.updateDynamic("hideTooltip")(js.Any.fromFunction2(hideTooltip))
    if (includedProperties != null) __obj.updateDynamic("includedProperties")(includedProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(isHorizontalZoomEnabled)) __obj.updateDynamic("isHorizontalZoomEnabled")(isHorizontalZoomEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isSeriesHighlightingEnabled)) __obj.updateDynamic("isSeriesHighlightingEnabled")(isSeriesHighlightingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isVerticalZoomEnabled)) __obj.updateDynamic("isVerticalZoomEnabled")(isVerticalZoomEnabled.asInstanceOf[js.Any])
    if (itemsSource != null) __obj.updateDynamic("itemsSource")(itemsSource.asInstanceOf[js.Any])
    if (leftMargin != null) __obj.updateDynamic("leftMargin")(leftMargin.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (markerBrushes != null) __obj.updateDynamic("markerBrushes")(markerBrushes.asInstanceOf[js.Any])
    if (markerCollision != null) __obj.updateDynamic("markerCollision")(markerCollision.asInstanceOf[js.Any])
    if (markerMaxCount != null) __obj.updateDynamic("markerMaxCount")(markerMaxCount.asInstanceOf[js.Any])
    if (markerOutlines != null) __obj.updateDynamic("markerOutlines")(markerOutlines.asInstanceOf[js.Any])
    if (markerTypes != null) __obj.updateDynamic("markerTypes")(markerTypes.asInstanceOf[js.Any])
    if (maxRecCount != null) __obj.updateDynamic("maxRecCount")(maxRecCount.asInstanceOf[js.Any])
    if (outlines != null) __obj.updateDynamic("outlines")(outlines.asInstanceOf[js.Any])
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (propertyChanged != null) __obj.updateDynamic("propertyChanged")(js.Any.fromFunction2(propertyChanged))
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (responseTotalRecCountKey != null) __obj.updateDynamic("responseTotalRecCountKey")(responseTotalRecCountKey.asInstanceOf[js.Any])
    if (rightMargin != null) __obj.updateDynamic("rightMargin")(rightMargin.asInstanceOf[js.Any])
    if (seriesAdded != null) __obj.updateDynamic("seriesAdded")(js.Any.fromFunction2(seriesAdded))
    if (seriesPointerDown != null) __obj.updateDynamic("seriesPointerDown")(js.Any.fromFunction2(seriesPointerDown))
    if (seriesPointerEnter != null) __obj.updateDynamic("seriesPointerEnter")(js.Any.fromFunction2(seriesPointerEnter))
    if (seriesPointerLeave != null) __obj.updateDynamic("seriesPointerLeave")(js.Any.fromFunction2(seriesPointerLeave))
    if (seriesPointerMove != null) __obj.updateDynamic("seriesPointerMove")(js.Any.fromFunction2(seriesPointerMove))
    if (seriesPointerUp != null) __obj.updateDynamic("seriesPointerUp")(js.Any.fromFunction2(seriesPointerUp))
    if (seriesRemoved != null) __obj.updateDynamic("seriesRemoved")(js.Any.fromFunction2(seriesRemoved))
    if (shapeDataSource != null) __obj.updateDynamic("shapeDataSource")(shapeDataSource.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (subtitleAlignment != null) __obj.updateDynamic("subtitleAlignment")(subtitleAlignment.asInstanceOf[js.Any])
    if (subtitleBottomMargin != null) __obj.updateDynamic("subtitleBottomMargin")(subtitleBottomMargin.asInstanceOf[js.Any])
    if (subtitleLeftMargin != null) __obj.updateDynamic("subtitleLeftMargin")(subtitleLeftMargin.asInstanceOf[js.Any])
    if (subtitleRightMargin != null) __obj.updateDynamic("subtitleRightMargin")(subtitleRightMargin.asInstanceOf[js.Any])
    if (subtitleTextColor != null) __obj.updateDynamic("subtitleTextColor")(subtitleTextColor.asInstanceOf[js.Any])
    if (subtitleTextStyle != null) __obj.updateDynamic("subtitleTextStyle")(subtitleTextStyle.asInstanceOf[js.Any])
    if (subtitleTopMargin != null) __obj.updateDynamic("subtitleTopMargin")(subtitleTopMargin.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAlignment != null) __obj.updateDynamic("titleAlignment")(titleAlignment.asInstanceOf[js.Any])
    if (titleBottomMargin != null) __obj.updateDynamic("titleBottomMargin")(titleBottomMargin.asInstanceOf[js.Any])
    if (titleLeftMargin != null) __obj.updateDynamic("titleLeftMargin")(titleLeftMargin.asInstanceOf[js.Any])
    if (titleRightMargin != null) __obj.updateDynamic("titleRightMargin")(titleRightMargin.asInstanceOf[js.Any])
    if (titleTextColor != null) __obj.updateDynamic("titleTextColor")(titleTextColor.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (titleTopMargin != null) __obj.updateDynamic("titleTopMargin")(titleTopMargin.asInstanceOf[js.Any])
    if (toolTipType != null) __obj.updateDynamic("toolTipType")(toolTipType.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    if (tooltipTemplates != null) __obj.updateDynamic("tooltipTemplates")(tooltipTemplates.asInstanceOf[js.Any])
    if (topMargin != null) __obj.updateDynamic("topMargin")(topMargin.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasingFunction != null) __obj.updateDynamic("transitionEasingFunction")(transitionEasingFunction.asInstanceOf[js.Any])
    if (trendLineBrushes != null) __obj.updateDynamic("trendLineBrushes")(trendLineBrushes.asInstanceOf[js.Any])
    if (trendLinePeriod != null) __obj.updateDynamic("trendLinePeriod")(trendLinePeriod.asInstanceOf[js.Any])
    if (trendLineThickness != null) __obj.updateDynamic("trendLineThickness")(trendLineThickness.asInstanceOf[js.Any])
    if (trendLineType != null) __obj.updateDynamic("trendLineType")(trendLineType.asInstanceOf[js.Any])
    if (triangulationDataSource != null) __obj.updateDynamic("triangulationDataSource")(triangulationDataSource.asInstanceOf[js.Any])
    if (unknownValuePlotting != null) __obj.updateDynamic("unknownValuePlotting")(unknownValuePlotting.asInstanceOf[js.Any])
    if (updateTooltip != null) __obj.updateDynamic("updateTooltip")(js.Any.fromFunction2(updateTooltip))
    if (widget != null) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowRect != null) __obj.updateDynamic("windowRect")(windowRect.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisAbbreviateLargeNumbers)) __obj.updateDynamic("xAxisAbbreviateLargeNumbers")(xAxisAbbreviateLargeNumbers.asInstanceOf[js.Any])
    if (xAxisExtent != null) __obj.updateDynamic("xAxisExtent")(xAxisExtent.asInstanceOf[js.Any])
    if (xAxisFormatLabel != null) __obj.updateDynamic("xAxisFormatLabel")(xAxisFormatLabel.asInstanceOf[js.Any])
    if (xAxisInterval != null) __obj.updateDynamic("xAxisInterval")(xAxisInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisInverted)) __obj.updateDynamic("xAxisInverted")(xAxisInverted.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxisIsLogarithmic)) __obj.updateDynamic("xAxisIsLogarithmic")(xAxisIsLogarithmic.asInstanceOf[js.Any])
    if (xAxisLabel != null) __obj.updateDynamic("xAxisLabel")(xAxisLabel.asInstanceOf[js.Any])
    if (xAxisLabelAngle != null) __obj.updateDynamic("xAxisLabelAngle")(xAxisLabelAngle.asInstanceOf[js.Any])
    if (xAxisLabelBottomMargin != null) __obj.updateDynamic("xAxisLabelBottomMargin")(xAxisLabelBottomMargin.asInstanceOf[js.Any])
    if (xAxisLabelHorizontalAlignment != null) __obj.updateDynamic("xAxisLabelHorizontalAlignment")(xAxisLabelHorizontalAlignment.asInstanceOf[js.Any])
    if (xAxisLabelLeftMargin != null) __obj.updateDynamic("xAxisLabelLeftMargin")(xAxisLabelLeftMargin.asInstanceOf[js.Any])
    if (xAxisLabelRightMargin != null) __obj.updateDynamic("xAxisLabelRightMargin")(xAxisLabelRightMargin.asInstanceOf[js.Any])
    if (xAxisLabelTextColor != null) __obj.updateDynamic("xAxisLabelTextColor")(xAxisLabelTextColor.asInstanceOf[js.Any])
    if (xAxisLabelTextStyle != null) __obj.updateDynamic("xAxisLabelTextStyle")(xAxisLabelTextStyle.asInstanceOf[js.Any])
    if (xAxisLabelTopMargin != null) __obj.updateDynamic("xAxisLabelTopMargin")(xAxisLabelTopMargin.asInstanceOf[js.Any])
    if (xAxisLabelVerticalAlignment != null) __obj.updateDynamic("xAxisLabelVerticalAlignment")(xAxisLabelVerticalAlignment.asInstanceOf[js.Any])
    if (xAxisLabelVisibility != null) __obj.updateDynamic("xAxisLabelVisibility")(xAxisLabelVisibility.asInstanceOf[js.Any])
    if (xAxisLogarithmBase != null) __obj.updateDynamic("xAxisLogarithmBase")(xAxisLogarithmBase.asInstanceOf[js.Any])
    if (xAxisMajorStroke != null) __obj.updateDynamic("xAxisMajorStroke")(xAxisMajorStroke.asInstanceOf[js.Any])
    if (xAxisMajorStrokeThickness != null) __obj.updateDynamic("xAxisMajorStrokeThickness")(xAxisMajorStrokeThickness.asInstanceOf[js.Any])
    if (xAxisMaximumValue != null) __obj.updateDynamic("xAxisMaximumValue")(xAxisMaximumValue.asInstanceOf[js.Any])
    if (xAxisMinimumValue != null) __obj.updateDynamic("xAxisMinimumValue")(xAxisMinimumValue.asInstanceOf[js.Any])
    if (xAxisMinorInterval != null) __obj.updateDynamic("xAxisMinorInterval")(xAxisMinorInterval.asInstanceOf[js.Any])
    if (xAxisMinorStroke != null) __obj.updateDynamic("xAxisMinorStroke")(xAxisMinorStroke.asInstanceOf[js.Any])
    if (xAxisMinorStrokeThickness != null) __obj.updateDynamic("xAxisMinorStrokeThickness")(xAxisMinorStrokeThickness.asInstanceOf[js.Any])
    if (xAxisStrip != null) __obj.updateDynamic("xAxisStrip")(xAxisStrip.asInstanceOf[js.Any])
    if (xAxisStroke != null) __obj.updateDynamic("xAxisStroke")(xAxisStroke.asInstanceOf[js.Any])
    if (xAxisStrokeThickness != null) __obj.updateDynamic("xAxisStrokeThickness")(xAxisStrokeThickness.asInstanceOf[js.Any])
    if (xAxisTickLength != null) __obj.updateDynamic("xAxisTickLength")(xAxisTickLength.asInstanceOf[js.Any])
    if (xAxisTickStroke != null) __obj.updateDynamic("xAxisTickStroke")(xAxisTickStroke.asInstanceOf[js.Any])
    if (xAxisTickStrokeThickness != null) __obj.updateDynamic("xAxisTickStrokeThickness")(xAxisTickStrokeThickness.asInstanceOf[js.Any])
    if (xAxisTitle != null) __obj.updateDynamic("xAxisTitle")(xAxisTitle.asInstanceOf[js.Any])
    if (xAxisTitleAlignment != null) __obj.updateDynamic("xAxisTitleAlignment")(xAxisTitleAlignment.asInstanceOf[js.Any])
    if (xAxisTitleAngle != null) __obj.updateDynamic("xAxisTitleAngle")(xAxisTitleAngle.asInstanceOf[js.Any])
    if (xAxisTitleBottomMargin != null) __obj.updateDynamic("xAxisTitleBottomMargin")(xAxisTitleBottomMargin.asInstanceOf[js.Any])
    if (xAxisTitleLeftMargin != null) __obj.updateDynamic("xAxisTitleLeftMargin")(xAxisTitleLeftMargin.asInstanceOf[js.Any])
    if (xAxisTitleMargin != null) __obj.updateDynamic("xAxisTitleMargin")(xAxisTitleMargin.asInstanceOf[js.Any])
    if (xAxisTitleRightMargin != null) __obj.updateDynamic("xAxisTitleRightMargin")(xAxisTitleRightMargin.asInstanceOf[js.Any])
    if (xAxisTitleTextColor != null) __obj.updateDynamic("xAxisTitleTextColor")(xAxisTitleTextColor.asInstanceOf[js.Any])
    if (xAxisTitleTextStyle != null) __obj.updateDynamic("xAxisTitleTextStyle")(xAxisTitleTextStyle.asInstanceOf[js.Any])
    if (xAxisTitleTopMargin != null) __obj.updateDynamic("xAxisTitleTopMargin")(xAxisTitleTopMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisAbbreviateLargeNumbers)) __obj.updateDynamic("yAxisAbbreviateLargeNumbers")(yAxisAbbreviateLargeNumbers.asInstanceOf[js.Any])
    if (yAxisExtent != null) __obj.updateDynamic("yAxisExtent")(yAxisExtent.asInstanceOf[js.Any])
    if (yAxisFormatLabel != null) __obj.updateDynamic("yAxisFormatLabel")(yAxisFormatLabel.asInstanceOf[js.Any])
    if (yAxisInterval != null) __obj.updateDynamic("yAxisInterval")(yAxisInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisInverted)) __obj.updateDynamic("yAxisInverted")(yAxisInverted.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisIsLogarithmic)) __obj.updateDynamic("yAxisIsLogarithmic")(yAxisIsLogarithmic.asInstanceOf[js.Any])
    if (yAxisLabel != null) __obj.updateDynamic("yAxisLabel")(yAxisLabel.asInstanceOf[js.Any])
    if (yAxisLabelAngle != null) __obj.updateDynamic("yAxisLabelAngle")(yAxisLabelAngle.asInstanceOf[js.Any])
    if (yAxisLabelBottomMargin != null) __obj.updateDynamic("yAxisLabelBottomMargin")(yAxisLabelBottomMargin.asInstanceOf[js.Any])
    if (yAxisLabelHorizontalAlignment != null) __obj.updateDynamic("yAxisLabelHorizontalAlignment")(yAxisLabelHorizontalAlignment.asInstanceOf[js.Any])
    if (yAxisLabelLeftMargin != null) __obj.updateDynamic("yAxisLabelLeftMargin")(yAxisLabelLeftMargin.asInstanceOf[js.Any])
    if (yAxisLabelLocation != null) __obj.updateDynamic("yAxisLabelLocation")(yAxisLabelLocation.asInstanceOf[js.Any])
    if (yAxisLabelRightMargin != null) __obj.updateDynamic("yAxisLabelRightMargin")(yAxisLabelRightMargin.asInstanceOf[js.Any])
    if (yAxisLabelTextColor != null) __obj.updateDynamic("yAxisLabelTextColor")(yAxisLabelTextColor.asInstanceOf[js.Any])
    if (yAxisLabelTextStyle != null) __obj.updateDynamic("yAxisLabelTextStyle")(yAxisLabelTextStyle.asInstanceOf[js.Any])
    if (yAxisLabelTopMargin != null) __obj.updateDynamic("yAxisLabelTopMargin")(yAxisLabelTopMargin.asInstanceOf[js.Any])
    if (yAxisLabelVerticalAlignment != null) __obj.updateDynamic("yAxisLabelVerticalAlignment")(yAxisLabelVerticalAlignment.asInstanceOf[js.Any])
    if (yAxisLabelVisibility != null) __obj.updateDynamic("yAxisLabelVisibility")(yAxisLabelVisibility.asInstanceOf[js.Any])
    if (yAxisLogarithmBase != null) __obj.updateDynamic("yAxisLogarithmBase")(yAxisLogarithmBase.asInstanceOf[js.Any])
    if (yAxisMajorStroke != null) __obj.updateDynamic("yAxisMajorStroke")(yAxisMajorStroke.asInstanceOf[js.Any])
    if (yAxisMajorStrokeThickness != null) __obj.updateDynamic("yAxisMajorStrokeThickness")(yAxisMajorStrokeThickness.asInstanceOf[js.Any])
    if (yAxisMaximumValue != null) __obj.updateDynamic("yAxisMaximumValue")(yAxisMaximumValue.asInstanceOf[js.Any])
    if (yAxisMinimumValue != null) __obj.updateDynamic("yAxisMinimumValue")(yAxisMinimumValue.asInstanceOf[js.Any])
    if (yAxisMinorInterval != null) __obj.updateDynamic("yAxisMinorInterval")(yAxisMinorInterval.asInstanceOf[js.Any])
    if (yAxisMinorStroke != null) __obj.updateDynamic("yAxisMinorStroke")(yAxisMinorStroke.asInstanceOf[js.Any])
    if (yAxisMinorStrokeThickness != null) __obj.updateDynamic("yAxisMinorStrokeThickness")(yAxisMinorStrokeThickness.asInstanceOf[js.Any])
    if (yAxisStrip != null) __obj.updateDynamic("yAxisStrip")(yAxisStrip.asInstanceOf[js.Any])
    if (yAxisStroke != null) __obj.updateDynamic("yAxisStroke")(yAxisStroke.asInstanceOf[js.Any])
    if (yAxisStrokeThickness != null) __obj.updateDynamic("yAxisStrokeThickness")(yAxisStrokeThickness.asInstanceOf[js.Any])
    if (yAxisTickLength != null) __obj.updateDynamic("yAxisTickLength")(yAxisTickLength.asInstanceOf[js.Any])
    if (yAxisTickStroke != null) __obj.updateDynamic("yAxisTickStroke")(yAxisTickStroke.asInstanceOf[js.Any])
    if (yAxisTickStrokeThickness != null) __obj.updateDynamic("yAxisTickStrokeThickness")(yAxisTickStrokeThickness.asInstanceOf[js.Any])
    if (yAxisTitle != null) __obj.updateDynamic("yAxisTitle")(yAxisTitle.asInstanceOf[js.Any])
    if (yAxisTitleAlignment != null) __obj.updateDynamic("yAxisTitleAlignment")(yAxisTitleAlignment.asInstanceOf[js.Any])
    if (yAxisTitleAngle != null) __obj.updateDynamic("yAxisTitleAngle")(yAxisTitleAngle.asInstanceOf[js.Any])
    if (yAxisTitleBottomMargin != null) __obj.updateDynamic("yAxisTitleBottomMargin")(yAxisTitleBottomMargin.asInstanceOf[js.Any])
    if (yAxisTitleLeftMargin != null) __obj.updateDynamic("yAxisTitleLeftMargin")(yAxisTitleLeftMargin.asInstanceOf[js.Any])
    if (yAxisTitleMargin != null) __obj.updateDynamic("yAxisTitleMargin")(yAxisTitleMargin.asInstanceOf[js.Any])
    if (yAxisTitleRightMargin != null) __obj.updateDynamic("yAxisTitleRightMargin")(yAxisTitleRightMargin.asInstanceOf[js.Any])
    if (yAxisTitleTextColor != null) __obj.updateDynamic("yAxisTitleTextColor")(yAxisTitleTextColor.asInstanceOf[js.Any])
    if (yAxisTitleTextStyle != null) __obj.updateDynamic("yAxisTitleTextStyle")(yAxisTitleTextStyle.asInstanceOf[js.Any])
    if (yAxisTitleTopMargin != null) __obj.updateDynamic("yAxisTitleTopMargin")(yAxisTitleTopMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgShapeChart]
  }
}

