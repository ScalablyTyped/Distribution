package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgSparkline
  extends /**
	 * Option for igSparkline
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets or sets the sparkline brush.
  	 */
  var brush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event which is raised before data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to igSparkline.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  /**
  	 * Event which is raised after data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to igSparkline.
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
  	 * Gets or sets the position of the normal range on the sparkline.
  	 */
  var displayNormalRangeInFront: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the display type of the sparkline.
  	 *
  	 * Valid values:
  	 * "line" Display the sparkline as a line.
  	 * "area" Display the sparkline as a filled polygon.
  	 * "column" Display the sparkline as a set of columns.
  	 * "winLoss" Display the sparkline as a set of columns on a boolean scale.
  	 */
  var displayType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the first marker brush of the sparkline.
  	 */
  var firstMarkerBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the first marker size of the sparkline.
  	 */
  var firstMarkerSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the first marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var firstMarkerVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
  	 */
  var formatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The height of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
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
  	 * Gets or sets the high marker brush of the sparkline.
  	 */
  var highMarkerBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the high marker size of the sparkline.
  	 */
  var highMarkerSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the high marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var highMarkerVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the horizontal axis line brush of the sparkline.
  	 */
  var horizontalAxisBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The value or content to display on the horizontal axis.
  	 * This can be set to a formatted string, such as "{0}", or it can be set to a DataTemplate.
  	 */
  var horizontalAxisLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the display state of the horizontal axis.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var horizontalAxisVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * String identifier of a column or property name to get labels from on each item in the data source.  These labels will be retrieved from the first and last item, and displayed by the horizontal axis.
  	 */
  var labelMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the last marker brush of the sparkline.
  	 */
  var lastMarkerBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the last marker size of the sparkline.
  	 */
  var lastMarkerSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the last marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var lastMarkerVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the line thickness of the sparkline.
  	 */
  var lineThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the low marker brush of the sparkline.
  	 */
  var lowMarkerBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the low marker size of the sparkline.
  	 */
  var lowMarkerSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the low marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var lowMarkerVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the marker brush of the sparkline.
  	 */
  var markerBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the marker size of the sparkline.
  	 */
  var markerSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var markerVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets sets maximum number of displayed records in chart.
  	 */
  var maxRecCount: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the negative brush of the sparkline.
  	 */
  var negativeBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the negative marker brush of the sparkline.
  	 */
  var negativeMarkerBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the negative marker size of the sparkline.
  	 */
  var negativeMarkerSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the negative marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var negativeMarkerVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the normal range brush of the sparkline.
  	 */
  var normalRangeFill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the maximum value of the normal range.
  	 */
  var normalRangeMaximum: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the minimum value of the normal range.
  	 */
  var normalRangeMinimum: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the normal range visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var normalRangeVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * See $.ig.DataSource. property in the response specifying the total number of records on the server.
  	 */
  var responseTotalRecCountKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets sets template for tooltip associated with chart item.
  	 * Example: "Value: $(ValueMemberPathInDataSource)"
  	 */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the trendline brush of the sparkline.
  	 */
  var trendLineBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the trendline period used by the sparkline.
  	 */
  var trendLinePeriod: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the thickness of the sparkline's trendline.
  	 */
  var trendLineThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the type of trendline used by the sparkline.
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
  	 * Gets or sets the way null values are interpreted.
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
  	 * Gets or sets the string path to the value column.
  	 */
  var valueMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the vertical axis line brush of the sparkline.
  	 */
  var verticalAxisBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The value or content to display on the vertical axis.
  	 * This can be set to a formatted string, such as "{0:n}", or it can be set to a DataTemplate.
  	 */
  var verticalAxisLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the display state of the vertical axis.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var verticalAxisVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The width of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

