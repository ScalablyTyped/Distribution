package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgShapeChart
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets a value indicating whether grid and tick lines are aligned to device pixels.
    */
  var alignsGridLinesToPixels: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the series animations should be allowed when a range change has been detected on an axis.
    */
  var animateSeriesWhenAxisRangeChanges: js.UndefOr[Boolean] = js.native
  
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
  var chartType: js.UndefOr[String] = js.native
  
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
    * String The database source URI.
    */
  var databaseSource: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets a set of property paths that should be excluded from consideration by the category chart.
    */
  var excludedProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets whether annotations for the final value of each series is displayed on the axis.
    */
  var finalValueAnnotationsVisible: js.UndefOr[Boolean] = js.native
  
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
    * Gets or sets whether the chart can be horizontally zoomed through user interactions.
    */
  var isHorizontalZoomEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the chart can highlight series through user interactions.
    * This property applies to Category Chart and Financial Chart controls.
    */
  var isSeriesHighlightingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the chart can be vertically zoomed through user interactions.
    */
  var isVerticalZoomEnabled: js.UndefOr[Boolean] = js.native
  
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
    * Gets or sets collision avoidance between markers on series that support this behaviour.
    *
    * Valid values:
    * "none" Collision avoidance is disabled.
    * "omit" Items colliding with other items will be hidden from view.
    * "fade" Items colliding with other items will be partially hidden from view by reducing their opacity.
    * "omitAndShift" Items colliding with other items will be either hidden from view or moved to new positions.
    * "fadeAndShift" Items colliding with other items will be either partially hidden from view by reducing their opacity, or moved to new positions, or a combination of both.
    */
  var markerCollision: js.UndefOr[String] = js.native
  
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
    * Gets or sets the palette of brushes to use for outlines on the chart series.
    * The value provided should be an array of CSS color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var outlines: js.UndefOr[js.Any] = js.native
  
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
    * The triangulated file source URI or an instance of $.ig.ShapeDataSource.
    */
  var shapeDataSource: js.UndefOr[String] = js.native
  
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
  
  /**
    * The triangulated file source URI or an instance of $.ig.TriangulationDataSource.
    */
  var triangulationDataSource: js.UndefOr[String] = js.native
  
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
    * Gets or sets whether the large numbers on the X-axis labels are abbreviated.
    */
  var xAxisAbbreviateLargeNumbers: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the distance between the X-axis and the bottom of the chart.
    */
  var xAxisExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets function which takes an context object and returns a formatted label for the X-axis.
    */
  var xAxisFormatLabel: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the frequency of displayed labels along the X-axis.
    * Gets or sets the set value is a factor that determines which labels will be hidden. For example, an interval of 2 will display every other label.
    */
  var xAxisInterval: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets whether to invert the direction of the X-axis by placing the first data items on the right side of the chart.
    */
  var xAxisInverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the X-axis will use a logarithmic scale, instead of a linear one.
    * Since log(-1) is imaginary and log(0) is undefined, it is recommended to enable this property only when the X-axis minimum is greater than zero.
    */
  var xAxisIsLogarithmic: js.UndefOr[Boolean] = js.native
  
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
    * Gets or sets the base value to use in the log function when mapping the position of data items along the X-axis.
    * This property is effective only when y-axis is logarithmic
    */
  var xAxisLogarithmBase: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the color to apply to major gridlines along the X-axis.
    */
  var xAxisMajorStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to major gridlines along the X-axis.
    */
  var xAxisMajorStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the data value corresponding to the maximum value on the X-axis.
    */
  var xAxisMaximumValue: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the data value corresponding to the minimum value on the X-axis.
    */
  var xAxisMinimumValue: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the frequency of displayed minor lines along the X-axis.
    * Gets or sets the set value is a factor that determines how the minor lines will be displayed.
    */
  var xAxisMinorInterval: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the color to apply to minor gridlines along the X-axis.
    */
  var xAxisMinorStroke: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness to apply to minor gridlines along the X-axis.
    */
  var xAxisMinorStrokeThickness: js.UndefOr[Double] = js.native
  
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
}
object IgShapeChart {
  
  @scala.inline
  def apply(): IgShapeChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgShapeChart]
  }
  
  @scala.inline
  implicit class IgShapeChartMutableBuilder[Self <: IgShapeChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignsGridLinesToPixels(value: Boolean): Self = StObject.set(x, "alignsGridLinesToPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignsGridLinesToPixelsUndefined: Self = StObject.set(x, "alignsGridLinesToPixels", js.undefined)
    
    @scala.inline
    def setAnimateSeriesWhenAxisRangeChanges(value: Boolean): Self = StObject.set(x, "animateSeriesWhenAxisRangeChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateSeriesWhenAxisRangeChangesUndefined: Self = StObject.set(x, "animateSeriesWhenAxisRangeChanges", js.undefined)
    
    @scala.inline
    def setBottomMargin(value: Double): Self = StObject.set(x, "bottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomMarginUndefined: Self = StObject.set(x, "bottomMargin", js.undefined)
    
    @scala.inline
    def setBrushes(value: js.Any): Self = StObject.set(x, "brushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrushesUndefined: Self = StObject.set(x, "brushes", js.undefined)
    
    @scala.inline
    def setCalloutStyleUpdating(value: (/* event */ Event, /* ui */ CalloutStyleUpdatingEventUIParam) => Unit): Self = StObject.set(x, "calloutStyleUpdating", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCalloutStyleUpdatingEventEnabled(value: Boolean): Self = StObject.set(x, "calloutStyleUpdatingEventEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutStyleUpdatingEventEnabledUndefined: Self = StObject.set(x, "calloutStyleUpdatingEventEnabled", js.undefined)
    
    @scala.inline
    def setCalloutStyleUpdatingUndefined: Self = StObject.set(x, "calloutStyleUpdating", js.undefined)
    
    @scala.inline
    def setCalloutsContentMemberPath(value: String): Self = StObject.set(x, "calloutsContentMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutsContentMemberPathUndefined: Self = StObject.set(x, "calloutsContentMemberPath", js.undefined)
    
    @scala.inline
    def setCalloutsItemsSource(value: js.Any): Self = StObject.set(x, "calloutsItemsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutsItemsSourceUndefined: Self = StObject.set(x, "calloutsItemsSource", js.undefined)
    
    @scala.inline
    def setCalloutsLabelMemberPath(value: String): Self = StObject.set(x, "calloutsLabelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutsLabelMemberPathUndefined: Self = StObject.set(x, "calloutsLabelMemberPath", js.undefined)
    
    @scala.inline
    def setCalloutsVisible(value: Boolean): Self = StObject.set(x, "calloutsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutsVisibleUndefined: Self = StObject.set(x, "calloutsVisible", js.undefined)
    
    @scala.inline
    def setCalloutsXMemberPath(value: String): Self = StObject.set(x, "calloutsXMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutsXMemberPathUndefined: Self = StObject.set(x, "calloutsXMemberPath", js.undefined)
    
    @scala.inline
    def setCalloutsYMemberPath(value: String): Self = StObject.set(x, "calloutsYMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutsYMemberPathUndefined: Self = StObject.set(x, "calloutsYMemberPath", js.undefined)
    
    @scala.inline
    def setChartType(value: String): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    @scala.inline
    def setCreateWrappedTooltip(value: js.Any): Self = StObject.set(x, "createWrappedTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateWrappedTooltipUndefined: Self = StObject.set(x, "createWrappedTooltip", js.undefined)
    
    @scala.inline
    def setCrosshairsAnnotationEnabled(value: Boolean): Self = StObject.set(x, "crosshairsAnnotationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsAnnotationEnabledUndefined: Self = StObject.set(x, "crosshairsAnnotationEnabled", js.undefined)
    
    @scala.inline
    def setCrosshairsDisplayMode(value: String): Self = StObject.set(x, "crosshairsDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsDisplayModeUndefined: Self = StObject.set(x, "crosshairsDisplayMode", js.undefined)
    
    @scala.inline
    def setCrosshairsSnapToData(value: Boolean): Self = StObject.set(x, "crosshairsSnapToData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairsSnapToDataUndefined: Self = StObject.set(x, "crosshairsSnapToData", js.undefined)
    
    @scala.inline
    def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    @scala.inline
    def setDatabaseSource(value: String): Self = StObject.set(x, "databaseSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseSourceUndefined: Self = StObject.set(x, "databaseSource", js.undefined)
    
    @scala.inline
    def setExcludedProperties(value: js.Any): Self = StObject.set(x, "excludedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedPropertiesUndefined: Self = StObject.set(x, "excludedProperties", js.undefined)
    
    @scala.inline
    def setFinalValueAnnotationsVisible(value: Boolean): Self = StObject.set(x, "finalValueAnnotationsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalValueAnnotationsVisibleUndefined: Self = StObject.set(x, "finalValueAnnotationsVisible", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHideTooltip(value: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit): Self = StObject.set(x, "hideTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHideTooltipUndefined: Self = StObject.set(x, "hideTooltip", js.undefined)
    
    @scala.inline
    def setIncludedProperties(value: js.Any): Self = StObject.set(x, "includedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedPropertiesUndefined: Self = StObject.set(x, "includedProperties", js.undefined)
    
    @scala.inline
    def setIsHorizontalZoomEnabled(value: Boolean): Self = StObject.set(x, "isHorizontalZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHorizontalZoomEnabledUndefined: Self = StObject.set(x, "isHorizontalZoomEnabled", js.undefined)
    
    @scala.inline
    def setIsSeriesHighlightingEnabled(value: Boolean): Self = StObject.set(x, "isSeriesHighlightingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSeriesHighlightingEnabledUndefined: Self = StObject.set(x, "isSeriesHighlightingEnabled", js.undefined)
    
    @scala.inline
    def setIsVerticalZoomEnabled(value: Boolean): Self = StObject.set(x, "isVerticalZoomEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVerticalZoomEnabledUndefined: Self = StObject.set(x, "isVerticalZoomEnabled", js.undefined)
    
    @scala.inline
    def setItemsSource(value: js.Any): Self = StObject.set(x, "itemsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsSourceUndefined: Self = StObject.set(x, "itemsSource", js.undefined)
    
    @scala.inline
    def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftMarginUndefined: Self = StObject.set(x, "leftMargin", js.undefined)
    
    @scala.inline
    def setLegend(value: js.Any): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setMarkerBrushes(value: js.Any): Self = StObject.set(x, "markerBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerBrushesUndefined: Self = StObject.set(x, "markerBrushes", js.undefined)
    
    @scala.inline
    def setMarkerCollision(value: String): Self = StObject.set(x, "markerCollision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerCollisionUndefined: Self = StObject.set(x, "markerCollision", js.undefined)
    
    @scala.inline
    def setMarkerMaxCount(value: Double): Self = StObject.set(x, "markerMaxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMaxCountUndefined: Self = StObject.set(x, "markerMaxCount", js.undefined)
    
    @scala.inline
    def setMarkerOutlines(value: js.Any): Self = StObject.set(x, "markerOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerOutlinesUndefined: Self = StObject.set(x, "markerOutlines", js.undefined)
    
    @scala.inline
    def setMarkerTypes(value: js.Any): Self = StObject.set(x, "markerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerTypesUndefined: Self = StObject.set(x, "markerTypes", js.undefined)
    
    @scala.inline
    def setMaxRecCount(value: Double): Self = StObject.set(x, "maxRecCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecCountUndefined: Self = StObject.set(x, "maxRecCount", js.undefined)
    
    @scala.inline
    def setOutlines(value: js.Any): Self = StObject.set(x, "outlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinesUndefined: Self = StObject.set(x, "outlines", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setPropertyChanged(value: (/* event */ Event, /* ui */ PropertyChangedEventUIParam) => Unit): Self = StObject.set(x, "propertyChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPropertyChangedUndefined: Self = StObject.set(x, "propertyChanged", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    @scala.inline
    def setResponseTotalRecCountKey(value: String): Self = StObject.set(x, "responseTotalRecCountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTotalRecCountKeyUndefined: Self = StObject.set(x, "responseTotalRecCountKey", js.undefined)
    
    @scala.inline
    def setRightMargin(value: Double): Self = StObject.set(x, "rightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightMarginUndefined: Self = StObject.set(x, "rightMargin", js.undefined)
    
    @scala.inline
    def setSeriesAdded(value: (/* event */ Event, /* ui */ SeriesAddedEventUIParam) => Unit): Self = StObject.set(x, "seriesAdded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesAddedUndefined: Self = StObject.set(x, "seriesAdded", js.undefined)
    
    @scala.inline
    def setSeriesPointerDown(value: (/* event */ Event, /* ui */ SeriesPointerDownEventUIParam) => Unit): Self = StObject.set(x, "seriesPointerDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesPointerDownUndefined: Self = StObject.set(x, "seriesPointerDown", js.undefined)
    
    @scala.inline
    def setSeriesPointerEnter(value: (/* event */ Event, /* ui */ SeriesPointerEnterEventUIParam) => Unit): Self = StObject.set(x, "seriesPointerEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesPointerEnterUndefined: Self = StObject.set(x, "seriesPointerEnter", js.undefined)
    
    @scala.inline
    def setSeriesPointerLeave(value: (/* event */ Event, /* ui */ SeriesPointerLeaveEventUIParam) => Unit): Self = StObject.set(x, "seriesPointerLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesPointerLeaveUndefined: Self = StObject.set(x, "seriesPointerLeave", js.undefined)
    
    @scala.inline
    def setSeriesPointerMove(value: (/* event */ Event, /* ui */ SeriesPointerMoveEventUIParam) => Unit): Self = StObject.set(x, "seriesPointerMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesPointerMoveUndefined: Self = StObject.set(x, "seriesPointerMove", js.undefined)
    
    @scala.inline
    def setSeriesPointerUp(value: (/* event */ Event, /* ui */ SeriesPointerUpEventUIParam) => Unit): Self = StObject.set(x, "seriesPointerUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesPointerUpUndefined: Self = StObject.set(x, "seriesPointerUp", js.undefined)
    
    @scala.inline
    def setSeriesRemoved(value: (/* event */ Event, /* ui */ SeriesRemovedEventUIParam) => Unit): Self = StObject.set(x, "seriesRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeriesRemovedUndefined: Self = StObject.set(x, "seriesRemoved", js.undefined)
    
    @scala.inline
    def setShapeDataSource(value: String): Self = StObject.set(x, "shapeDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeDataSourceUndefined: Self = StObject.set(x, "shapeDataSource", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleAlignment(value: String): Self = StObject.set(x, "subtitleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleAlignmentUndefined: Self = StObject.set(x, "subtitleAlignment", js.undefined)
    
    @scala.inline
    def setSubtitleBottomMargin(value: Double): Self = StObject.set(x, "subtitleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleBottomMarginUndefined: Self = StObject.set(x, "subtitleBottomMargin", js.undefined)
    
    @scala.inline
    def setSubtitleLeftMargin(value: Double): Self = StObject.set(x, "subtitleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleLeftMarginUndefined: Self = StObject.set(x, "subtitleLeftMargin", js.undefined)
    
    @scala.inline
    def setSubtitleRightMargin(value: Double): Self = StObject.set(x, "subtitleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleRightMarginUndefined: Self = StObject.set(x, "subtitleRightMargin", js.undefined)
    
    @scala.inline
    def setSubtitleTextColor(value: String): Self = StObject.set(x, "subtitleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextColorUndefined: Self = StObject.set(x, "subtitleTextColor", js.undefined)
    
    @scala.inline
    def setSubtitleTextStyle(value: String): Self = StObject.set(x, "subtitleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTextStyleUndefined: Self = StObject.set(x, "subtitleTextStyle", js.undefined)
    
    @scala.inline
    def setSubtitleTopMargin(value: Double): Self = StObject.set(x, "subtitleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleTopMarginUndefined: Self = StObject.set(x, "subtitleTopMargin", js.undefined)
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAlignment(value: String): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
    
    @scala.inline
    def setTitleBottomMargin(value: Double): Self = StObject.set(x, "titleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBottomMarginUndefined: Self = StObject.set(x, "titleBottomMargin", js.undefined)
    
    @scala.inline
    def setTitleLeftMargin(value: Double): Self = StObject.set(x, "titleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleLeftMarginUndefined: Self = StObject.set(x, "titleLeftMargin", js.undefined)
    
    @scala.inline
    def setTitleRightMargin(value: Double): Self = StObject.set(x, "titleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleRightMarginUndefined: Self = StObject.set(x, "titleRightMargin", js.undefined)
    
    @scala.inline
    def setTitleTextColor(value: String): Self = StObject.set(x, "titleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextColorUndefined: Self = StObject.set(x, "titleTextColor", js.undefined)
    
    @scala.inline
    def setTitleTextStyle(value: String): Self = StObject.set(x, "titleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextStyleUndefined: Self = StObject.set(x, "titleTextStyle", js.undefined)
    
    @scala.inline
    def setTitleTopMargin(value: Double): Self = StObject.set(x, "titleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTopMarginUndefined: Self = StObject.set(x, "titleTopMargin", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToolTipType(value: String): Self = StObject.set(x, "toolTipType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipTypeUndefined: Self = StObject.set(x, "toolTipType", js.undefined)
    
    @scala.inline
    def setTooltipTemplate(value: js.Any): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    
    @scala.inline
    def setTooltipTemplates(value: js.Any): Self = StObject.set(x, "tooltipTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipTemplatesUndefined: Self = StObject.set(x, "tooltipTemplates", js.undefined)
    
    @scala.inline
    def setTopMargin(value: Double): Self = StObject.set(x, "topMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopMarginUndefined: Self = StObject.set(x, "topMargin", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionEasingFunction(value: js.Any): Self = StObject.set(x, "transitionEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEasingFunctionUndefined: Self = StObject.set(x, "transitionEasingFunction", js.undefined)
    
    @scala.inline
    def setTrendLineBrushes(value: js.Any): Self = StObject.set(x, "trendLineBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendLineBrushesUndefined: Self = StObject.set(x, "trendLineBrushes", js.undefined)
    
    @scala.inline
    def setTrendLinePeriod(value: Double): Self = StObject.set(x, "trendLinePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendLinePeriodUndefined: Self = StObject.set(x, "trendLinePeriod", js.undefined)
    
    @scala.inline
    def setTrendLineThickness(value: Double): Self = StObject.set(x, "trendLineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendLineThicknessUndefined: Self = StObject.set(x, "trendLineThickness", js.undefined)
    
    @scala.inline
    def setTrendLineType(value: String): Self = StObject.set(x, "trendLineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendLineTypeUndefined: Self = StObject.set(x, "trendLineType", js.undefined)
    
    @scala.inline
    def setTriangulationDataSource(value: String): Self = StObject.set(x, "triangulationDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangulationDataSourceUndefined: Self = StObject.set(x, "triangulationDataSource", js.undefined)
    
    @scala.inline
    def setUnknownValuePlotting(value: String): Self = StObject.set(x, "unknownValuePlotting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownValuePlottingUndefined: Self = StObject.set(x, "unknownValuePlotting", js.undefined)
    
    @scala.inline
    def setUpdateTooltip(value: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit): Self = StObject.set(x, "updateTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateTooltipUndefined: Self = StObject.set(x, "updateTooltip", js.undefined)
    
    @scala.inline
    def setWidget(value: js.Any): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWindowRect(value: js.Any): Self = StObject.set(x, "windowRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowRectUndefined: Self = StObject.set(x, "windowRect", js.undefined)
    
    @scala.inline
    def setXAxisAbbreviateLargeNumbers(value: Boolean): Self = StObject.set(x, "xAxisAbbreviateLargeNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisAbbreviateLargeNumbersUndefined: Self = StObject.set(x, "xAxisAbbreviateLargeNumbers", js.undefined)
    
    @scala.inline
    def setXAxisExtent(value: Double): Self = StObject.set(x, "xAxisExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisExtentUndefined: Self = StObject.set(x, "xAxisExtent", js.undefined)
    
    @scala.inline
    def setXAxisFormatLabel(value: js.Any): Self = StObject.set(x, "xAxisFormatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisFormatLabelUndefined: Self = StObject.set(x, "xAxisFormatLabel", js.undefined)
    
    @scala.inline
    def setXAxisInterval(value: Double): Self = StObject.set(x, "xAxisInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisIntervalUndefined: Self = StObject.set(x, "xAxisInterval", js.undefined)
    
    @scala.inline
    def setXAxisInverted(value: Boolean): Self = StObject.set(x, "xAxisInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisInvertedUndefined: Self = StObject.set(x, "xAxisInverted", js.undefined)
    
    @scala.inline
    def setXAxisIsLogarithmic(value: Boolean): Self = StObject.set(x, "xAxisIsLogarithmic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisIsLogarithmicUndefined: Self = StObject.set(x, "xAxisIsLogarithmic", js.undefined)
    
    @scala.inline
    def setXAxisLabel(value: js.Any): Self = StObject.set(x, "xAxisLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelAngle(value: Double): Self = StObject.set(x, "xAxisLabelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelAngleUndefined: Self = StObject.set(x, "xAxisLabelAngle", js.undefined)
    
    @scala.inline
    def setXAxisLabelBottomMargin(value: Double): Self = StObject.set(x, "xAxisLabelBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelBottomMarginUndefined: Self = StObject.set(x, "xAxisLabelBottomMargin", js.undefined)
    
    @scala.inline
    def setXAxisLabelHorizontalAlignment(value: String): Self = StObject.set(x, "xAxisLabelHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelHorizontalAlignmentUndefined: Self = StObject.set(x, "xAxisLabelHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setXAxisLabelLeftMargin(value: Double): Self = StObject.set(x, "xAxisLabelLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelLeftMarginUndefined: Self = StObject.set(x, "xAxisLabelLeftMargin", js.undefined)
    
    @scala.inline
    def setXAxisLabelRightMargin(value: Double): Self = StObject.set(x, "xAxisLabelRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelRightMarginUndefined: Self = StObject.set(x, "xAxisLabelRightMargin", js.undefined)
    
    @scala.inline
    def setXAxisLabelTextColor(value: String): Self = StObject.set(x, "xAxisLabelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelTextColorUndefined: Self = StObject.set(x, "xAxisLabelTextColor", js.undefined)
    
    @scala.inline
    def setXAxisLabelTextStyle(value: String): Self = StObject.set(x, "xAxisLabelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelTextStyleUndefined: Self = StObject.set(x, "xAxisLabelTextStyle", js.undefined)
    
    @scala.inline
    def setXAxisLabelTopMargin(value: Double): Self = StObject.set(x, "xAxisLabelTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelTopMarginUndefined: Self = StObject.set(x, "xAxisLabelTopMargin", js.undefined)
    
    @scala.inline
    def setXAxisLabelUndefined: Self = StObject.set(x, "xAxisLabel", js.undefined)
    
    @scala.inline
    def setXAxisLabelVerticalAlignment(value: String): Self = StObject.set(x, "xAxisLabelVerticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelVerticalAlignmentUndefined: Self = StObject.set(x, "xAxisLabelVerticalAlignment", js.undefined)
    
    @scala.inline
    def setXAxisLabelVisibility(value: String): Self = StObject.set(x, "xAxisLabelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLabelVisibilityUndefined: Self = StObject.set(x, "xAxisLabelVisibility", js.undefined)
    
    @scala.inline
    def setXAxisLogarithmBase(value: Double): Self = StObject.set(x, "xAxisLogarithmBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisLogarithmBaseUndefined: Self = StObject.set(x, "xAxisLogarithmBase", js.undefined)
    
    @scala.inline
    def setXAxisMajorStroke(value: String): Self = StObject.set(x, "xAxisMajorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisMajorStrokeThickness(value: Double): Self = StObject.set(x, "xAxisMajorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisMajorStrokeThicknessUndefined: Self = StObject.set(x, "xAxisMajorStrokeThickness", js.undefined)
    
    @scala.inline
    def setXAxisMajorStrokeUndefined: Self = StObject.set(x, "xAxisMajorStroke", js.undefined)
    
    @scala.inline
    def setXAxisMaximumValue(value: Double): Self = StObject.set(x, "xAxisMaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisMaximumValueUndefined: Self = StObject.set(x, "xAxisMaximumValue", js.undefined)
    
    @scala.inline
    def setXAxisMinimumValue(value: Double): Self = StObject.set(x, "xAxisMinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisMinimumValueUndefined: Self = StObject.set(x, "xAxisMinimumValue", js.undefined)
    
    @scala.inline
    def setXAxisMinorInterval(value: Double): Self = StObject.set(x, "xAxisMinorInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisMinorIntervalUndefined: Self = StObject.set(x, "xAxisMinorInterval", js.undefined)
    
    @scala.inline
    def setXAxisMinorStroke(value: String): Self = StObject.set(x, "xAxisMinorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisMinorStrokeThickness(value: Double): Self = StObject.set(x, "xAxisMinorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisMinorStrokeThicknessUndefined: Self = StObject.set(x, "xAxisMinorStrokeThickness", js.undefined)
    
    @scala.inline
    def setXAxisMinorStrokeUndefined: Self = StObject.set(x, "xAxisMinorStroke", js.undefined)
    
    @scala.inline
    def setXAxisStrip(value: String): Self = StObject.set(x, "xAxisStrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisStripUndefined: Self = StObject.set(x, "xAxisStrip", js.undefined)
    
    @scala.inline
    def setXAxisStroke(value: String): Self = StObject.set(x, "xAxisStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisStrokeThickness(value: Double): Self = StObject.set(x, "xAxisStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisStrokeThicknessUndefined: Self = StObject.set(x, "xAxisStrokeThickness", js.undefined)
    
    @scala.inline
    def setXAxisStrokeUndefined: Self = StObject.set(x, "xAxisStroke", js.undefined)
    
    @scala.inline
    def setXAxisTickLength(value: Double): Self = StObject.set(x, "xAxisTickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTickLengthUndefined: Self = StObject.set(x, "xAxisTickLength", js.undefined)
    
    @scala.inline
    def setXAxisTickStroke(value: String): Self = StObject.set(x, "xAxisTickStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTickStrokeThickness(value: Double): Self = StObject.set(x, "xAxisTickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTickStrokeThicknessUndefined: Self = StObject.set(x, "xAxisTickStrokeThickness", js.undefined)
    
    @scala.inline
    def setXAxisTickStrokeUndefined: Self = StObject.set(x, "xAxisTickStroke", js.undefined)
    
    @scala.inline
    def setXAxisTitle(value: String): Self = StObject.set(x, "xAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleAlignment(value: String): Self = StObject.set(x, "xAxisTitleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleAlignmentUndefined: Self = StObject.set(x, "xAxisTitleAlignment", js.undefined)
    
    @scala.inline
    def setXAxisTitleAngle(value: Double): Self = StObject.set(x, "xAxisTitleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleAngleUndefined: Self = StObject.set(x, "xAxisTitleAngle", js.undefined)
    
    @scala.inline
    def setXAxisTitleBottomMargin(value: Double): Self = StObject.set(x, "xAxisTitleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleBottomMarginUndefined: Self = StObject.set(x, "xAxisTitleBottomMargin", js.undefined)
    
    @scala.inline
    def setXAxisTitleLeftMargin(value: Double): Self = StObject.set(x, "xAxisTitleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleLeftMarginUndefined: Self = StObject.set(x, "xAxisTitleLeftMargin", js.undefined)
    
    @scala.inline
    def setXAxisTitleMargin(value: Double): Self = StObject.set(x, "xAxisTitleMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleMarginUndefined: Self = StObject.set(x, "xAxisTitleMargin", js.undefined)
    
    @scala.inline
    def setXAxisTitleRightMargin(value: Double): Self = StObject.set(x, "xAxisTitleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleRightMarginUndefined: Self = StObject.set(x, "xAxisTitleRightMargin", js.undefined)
    
    @scala.inline
    def setXAxisTitleTextColor(value: String): Self = StObject.set(x, "xAxisTitleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleTextColorUndefined: Self = StObject.set(x, "xAxisTitleTextColor", js.undefined)
    
    @scala.inline
    def setXAxisTitleTextStyle(value: String): Self = StObject.set(x, "xAxisTitleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleTextStyleUndefined: Self = StObject.set(x, "xAxisTitleTextStyle", js.undefined)
    
    @scala.inline
    def setXAxisTitleTopMargin(value: Double): Self = StObject.set(x, "xAxisTitleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisTitleTopMarginUndefined: Self = StObject.set(x, "xAxisTitleTopMargin", js.undefined)
    
    @scala.inline
    def setXAxisTitleUndefined: Self = StObject.set(x, "xAxisTitle", js.undefined)
    
    @scala.inline
    def setYAxisAbbreviateLargeNumbers(value: Boolean): Self = StObject.set(x, "yAxisAbbreviateLargeNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisAbbreviateLargeNumbersUndefined: Self = StObject.set(x, "yAxisAbbreviateLargeNumbers", js.undefined)
    
    @scala.inline
    def setYAxisExtent(value: Double): Self = StObject.set(x, "yAxisExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisExtentUndefined: Self = StObject.set(x, "yAxisExtent", js.undefined)
    
    @scala.inline
    def setYAxisFormatLabel(value: js.Any): Self = StObject.set(x, "yAxisFormatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisFormatLabelUndefined: Self = StObject.set(x, "yAxisFormatLabel", js.undefined)
    
    @scala.inline
    def setYAxisInterval(value: Double): Self = StObject.set(x, "yAxisInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisIntervalUndefined: Self = StObject.set(x, "yAxisInterval", js.undefined)
    
    @scala.inline
    def setYAxisInverted(value: Boolean): Self = StObject.set(x, "yAxisInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisInvertedUndefined: Self = StObject.set(x, "yAxisInverted", js.undefined)
    
    @scala.inline
    def setYAxisIsLogarithmic(value: Boolean): Self = StObject.set(x, "yAxisIsLogarithmic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisIsLogarithmicUndefined: Self = StObject.set(x, "yAxisIsLogarithmic", js.undefined)
    
    @scala.inline
    def setYAxisLabel(value: js.Any): Self = StObject.set(x, "yAxisLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelAngle(value: Double): Self = StObject.set(x, "yAxisLabelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelAngleUndefined: Self = StObject.set(x, "yAxisLabelAngle", js.undefined)
    
    @scala.inline
    def setYAxisLabelBottomMargin(value: Double): Self = StObject.set(x, "yAxisLabelBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelBottomMarginUndefined: Self = StObject.set(x, "yAxisLabelBottomMargin", js.undefined)
    
    @scala.inline
    def setYAxisLabelHorizontalAlignment(value: String): Self = StObject.set(x, "yAxisLabelHorizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelHorizontalAlignmentUndefined: Self = StObject.set(x, "yAxisLabelHorizontalAlignment", js.undefined)
    
    @scala.inline
    def setYAxisLabelLeftMargin(value: Double): Self = StObject.set(x, "yAxisLabelLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelLeftMarginUndefined: Self = StObject.set(x, "yAxisLabelLeftMargin", js.undefined)
    
    @scala.inline
    def setYAxisLabelLocation(value: String): Self = StObject.set(x, "yAxisLabelLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelLocationUndefined: Self = StObject.set(x, "yAxisLabelLocation", js.undefined)
    
    @scala.inline
    def setYAxisLabelRightMargin(value: Double): Self = StObject.set(x, "yAxisLabelRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelRightMarginUndefined: Self = StObject.set(x, "yAxisLabelRightMargin", js.undefined)
    
    @scala.inline
    def setYAxisLabelTextColor(value: String): Self = StObject.set(x, "yAxisLabelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelTextColorUndefined: Self = StObject.set(x, "yAxisLabelTextColor", js.undefined)
    
    @scala.inline
    def setYAxisLabelTextStyle(value: String): Self = StObject.set(x, "yAxisLabelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelTextStyleUndefined: Self = StObject.set(x, "yAxisLabelTextStyle", js.undefined)
    
    @scala.inline
    def setYAxisLabelTopMargin(value: Double): Self = StObject.set(x, "yAxisLabelTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelTopMarginUndefined: Self = StObject.set(x, "yAxisLabelTopMargin", js.undefined)
    
    @scala.inline
    def setYAxisLabelUndefined: Self = StObject.set(x, "yAxisLabel", js.undefined)
    
    @scala.inline
    def setYAxisLabelVerticalAlignment(value: String): Self = StObject.set(x, "yAxisLabelVerticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelVerticalAlignmentUndefined: Self = StObject.set(x, "yAxisLabelVerticalAlignment", js.undefined)
    
    @scala.inline
    def setYAxisLabelVisibility(value: String): Self = StObject.set(x, "yAxisLabelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLabelVisibilityUndefined: Self = StObject.set(x, "yAxisLabelVisibility", js.undefined)
    
    @scala.inline
    def setYAxisLogarithmBase(value: Double): Self = StObject.set(x, "yAxisLogarithmBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisLogarithmBaseUndefined: Self = StObject.set(x, "yAxisLogarithmBase", js.undefined)
    
    @scala.inline
    def setYAxisMajorStroke(value: String): Self = StObject.set(x, "yAxisMajorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisMajorStrokeThickness(value: Double): Self = StObject.set(x, "yAxisMajorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisMajorStrokeThicknessUndefined: Self = StObject.set(x, "yAxisMajorStrokeThickness", js.undefined)
    
    @scala.inline
    def setYAxisMajorStrokeUndefined: Self = StObject.set(x, "yAxisMajorStroke", js.undefined)
    
    @scala.inline
    def setYAxisMaximumValue(value: Double): Self = StObject.set(x, "yAxisMaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisMaximumValueUndefined: Self = StObject.set(x, "yAxisMaximumValue", js.undefined)
    
    @scala.inline
    def setYAxisMinimumValue(value: Double): Self = StObject.set(x, "yAxisMinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisMinimumValueUndefined: Self = StObject.set(x, "yAxisMinimumValue", js.undefined)
    
    @scala.inline
    def setYAxisMinorInterval(value: Double): Self = StObject.set(x, "yAxisMinorInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisMinorIntervalUndefined: Self = StObject.set(x, "yAxisMinorInterval", js.undefined)
    
    @scala.inline
    def setYAxisMinorStroke(value: String): Self = StObject.set(x, "yAxisMinorStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisMinorStrokeThickness(value: Double): Self = StObject.set(x, "yAxisMinorStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisMinorStrokeThicknessUndefined: Self = StObject.set(x, "yAxisMinorStrokeThickness", js.undefined)
    
    @scala.inline
    def setYAxisMinorStrokeUndefined: Self = StObject.set(x, "yAxisMinorStroke", js.undefined)
    
    @scala.inline
    def setYAxisStrip(value: String): Self = StObject.set(x, "yAxisStrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisStripUndefined: Self = StObject.set(x, "yAxisStrip", js.undefined)
    
    @scala.inline
    def setYAxisStroke(value: String): Self = StObject.set(x, "yAxisStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisStrokeThickness(value: Double): Self = StObject.set(x, "yAxisStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisStrokeThicknessUndefined: Self = StObject.set(x, "yAxisStrokeThickness", js.undefined)
    
    @scala.inline
    def setYAxisStrokeUndefined: Self = StObject.set(x, "yAxisStroke", js.undefined)
    
    @scala.inline
    def setYAxisTickLength(value: Double): Self = StObject.set(x, "yAxisTickLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTickLengthUndefined: Self = StObject.set(x, "yAxisTickLength", js.undefined)
    
    @scala.inline
    def setYAxisTickStroke(value: String): Self = StObject.set(x, "yAxisTickStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTickStrokeThickness(value: Double): Self = StObject.set(x, "yAxisTickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTickStrokeThicknessUndefined: Self = StObject.set(x, "yAxisTickStrokeThickness", js.undefined)
    
    @scala.inline
    def setYAxisTickStrokeUndefined: Self = StObject.set(x, "yAxisTickStroke", js.undefined)
    
    @scala.inline
    def setYAxisTitle(value: String): Self = StObject.set(x, "yAxisTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleAlignment(value: String): Self = StObject.set(x, "yAxisTitleAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleAlignmentUndefined: Self = StObject.set(x, "yAxisTitleAlignment", js.undefined)
    
    @scala.inline
    def setYAxisTitleAngle(value: Double): Self = StObject.set(x, "yAxisTitleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleAngleUndefined: Self = StObject.set(x, "yAxisTitleAngle", js.undefined)
    
    @scala.inline
    def setYAxisTitleBottomMargin(value: Double): Self = StObject.set(x, "yAxisTitleBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleBottomMarginUndefined: Self = StObject.set(x, "yAxisTitleBottomMargin", js.undefined)
    
    @scala.inline
    def setYAxisTitleLeftMargin(value: Double): Self = StObject.set(x, "yAxisTitleLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleLeftMarginUndefined: Self = StObject.set(x, "yAxisTitleLeftMargin", js.undefined)
    
    @scala.inline
    def setYAxisTitleMargin(value: Double): Self = StObject.set(x, "yAxisTitleMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleMarginUndefined: Self = StObject.set(x, "yAxisTitleMargin", js.undefined)
    
    @scala.inline
    def setYAxisTitleRightMargin(value: Double): Self = StObject.set(x, "yAxisTitleRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleRightMarginUndefined: Self = StObject.set(x, "yAxisTitleRightMargin", js.undefined)
    
    @scala.inline
    def setYAxisTitleTextColor(value: String): Self = StObject.set(x, "yAxisTitleTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleTextColorUndefined: Self = StObject.set(x, "yAxisTitleTextColor", js.undefined)
    
    @scala.inline
    def setYAxisTitleTextStyle(value: String): Self = StObject.set(x, "yAxisTitleTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleTextStyleUndefined: Self = StObject.set(x, "yAxisTitleTextStyle", js.undefined)
    
    @scala.inline
    def setYAxisTitleTopMargin(value: Double): Self = StObject.set(x, "yAxisTitleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisTitleTopMarginUndefined: Self = StObject.set(x, "yAxisTitleTopMargin", js.undefined)
    
    @scala.inline
    def setYAxisTitleUndefined: Self = StObject.set(x, "yAxisTitle", js.undefined)
  }
}
