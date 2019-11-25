package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSparkline
  extends /**
	 * Option for igSparkline
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the sparkline brush.
  	 */
  var brush: js.UndefOr[String] = js.undefined
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
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets sets url which is used for sending JSON on request for remote data.
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position of the normal range on the sparkline.
  	 */
  var displayNormalRangeInFront: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the display type of the sparkline.
  	 *
  	 * Valid values:
  	 * "line" Display the sparkline as a line.
  	 * "area" Display the sparkline as a filled polygon.
  	 * "column" Display the sparkline as a set of columns.
  	 * "winLoss" Display the sparkline as a set of columns on a boolean scale.
  	 */
  var displayType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the first marker brush of the sparkline.
  	 */
  var firstMarkerBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the first marker size of the sparkline.
  	 */
  var firstMarkerSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the first marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var firstMarkerVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
  	 */
  var formatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The height of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
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
  var highMarkerBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the high marker size of the sparkline.
  	 */
  var highMarkerSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the high marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var highMarkerVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the horizontal axis line brush of the sparkline.
  	 */
  var horizontalAxisBrush: js.UndefOr[String] = js.undefined
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
  var horizontalAxisVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * String identifier of a column or property name to get labels from on each item in the data source.  These labels will be retrieved from the first and last item, and displayed by the horizontal axis.
  	 */
  var labelMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the last marker brush of the sparkline.
  	 */
  var lastMarkerBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the last marker size of the sparkline.
  	 */
  var lastMarkerSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the last marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var lastMarkerVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the line thickness of the sparkline.
  	 */
  var lineThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the low marker brush of the sparkline.
  	 */
  var lowMarkerBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the low marker size of the sparkline.
  	 */
  var lowMarkerSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the low marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var lowMarkerVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the marker brush of the sparkline.
  	 */
  var markerBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the marker size of the sparkline.
  	 */
  var markerSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var markerVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets sets maximum number of displayed records in chart.
  	 */
  var maxRecCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the negative brush of the sparkline.
  	 */
  var negativeBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the negative marker brush of the sparkline.
  	 */
  var negativeMarkerBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the negative marker size of the sparkline.
  	 */
  var negativeMarkerSize: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the negative marker visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var negativeMarkerVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the normal range brush of the sparkline.
  	 */
  var normalRangeFill: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the maximum value of the normal range.
  	 */
  var normalRangeMaximum: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the minimum value of the normal range.
  	 */
  var normalRangeMinimum: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the normal range visibility of the sparkline.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var normalRangeVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
  	 * See $.ig.DataSource. property in the response specifying the total number of records on the server.
  	 */
  var responseTotalRecCountKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets sets template for tooltip associated with chart item.
  	 * Example: "Value: $(ValueMemberPathInDataSource)"
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the trendline brush of the sparkline.
  	 */
  var trendLineBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the trendline period used by the sparkline.
  	 */
  var trendLinePeriod: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the thickness of the sparkline's trendline.
  	 */
  var trendLineThickness: js.UndefOr[Double] = js.undefined
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
  var trendLineType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the way null values are interpreted.
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
  	 * Gets or sets the string path to the value column.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the vertical axis line brush of the sparkline.
  	 */
  var verticalAxisBrush: js.UndefOr[String] = js.undefined
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
  var verticalAxisVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * The width of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgSparkline {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igSparkline
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    brush: String = null,
    dataBinding: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit = null,
    dataBound: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    displayNormalRangeInFront: js.UndefOr[Boolean] = js.undefined,
    displayType: String = null,
    firstMarkerBrush: String = null,
    firstMarkerSize: Int | Double = null,
    firstMarkerVisibility: String = null,
    formatLabel: js.Any = null,
    height: String | Double = null,
    hideTooltip: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit = null,
    highMarkerBrush: String = null,
    highMarkerSize: Int | Double = null,
    highMarkerVisibility: String = null,
    horizontalAxisBrush: String = null,
    horizontalAxisLabel: js.Any = null,
    horizontalAxisVisibility: String = null,
    labelMemberPath: String = null,
    lastMarkerBrush: String = null,
    lastMarkerSize: Int | Double = null,
    lastMarkerVisibility: String = null,
    lineThickness: Int | Double = null,
    lowMarkerBrush: String = null,
    lowMarkerSize: Int | Double = null,
    lowMarkerVisibility: String = null,
    markerBrush: String = null,
    markerSize: Int | Double = null,
    markerVisibility: String = null,
    maxRecCount: Int | Double = null,
    negativeBrush: String = null,
    negativeMarkerBrush: String = null,
    negativeMarkerSize: Int | Double = null,
    negativeMarkerVisibility: String = null,
    normalRangeFill: String = null,
    normalRangeMaximum: Int | Double = null,
    normalRangeMinimum: Int | Double = null,
    normalRangeVisibility: String = null,
    pixelScalingRatio: Int | Double = null,
    responseDataKey: String = null,
    responseTotalRecCountKey: String = null,
    tooltipTemplate: String = null,
    trendLineBrush: String = null,
    trendLinePeriod: Int | Double = null,
    trendLineThickness: Int | Double = null,
    trendLineType: String = null,
    unknownValuePlotting: String = null,
    updateTooltip: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit = null,
    valueMemberPath: String = null,
    verticalAxisBrush: String = null,
    verticalAxisLabel: js.Any = null,
    verticalAxisVisibility: String = null,
    width: String | Double = null
  ): IgSparkline = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (brush != null) __obj.updateDynamic("brush")(brush.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction2(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction2(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(displayNormalRangeInFront)) __obj.updateDynamic("displayNormalRangeInFront")(displayNormalRangeInFront.asInstanceOf[js.Any])
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    if (firstMarkerBrush != null) __obj.updateDynamic("firstMarkerBrush")(firstMarkerBrush.asInstanceOf[js.Any])
    if (firstMarkerSize != null) __obj.updateDynamic("firstMarkerSize")(firstMarkerSize.asInstanceOf[js.Any])
    if (firstMarkerVisibility != null) __obj.updateDynamic("firstMarkerVisibility")(firstMarkerVisibility.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(formatLabel.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hideTooltip != null) __obj.updateDynamic("hideTooltip")(js.Any.fromFunction2(hideTooltip))
    if (highMarkerBrush != null) __obj.updateDynamic("highMarkerBrush")(highMarkerBrush.asInstanceOf[js.Any])
    if (highMarkerSize != null) __obj.updateDynamic("highMarkerSize")(highMarkerSize.asInstanceOf[js.Any])
    if (highMarkerVisibility != null) __obj.updateDynamic("highMarkerVisibility")(highMarkerVisibility.asInstanceOf[js.Any])
    if (horizontalAxisBrush != null) __obj.updateDynamic("horizontalAxisBrush")(horizontalAxisBrush.asInstanceOf[js.Any])
    if (horizontalAxisLabel != null) __obj.updateDynamic("horizontalAxisLabel")(horizontalAxisLabel.asInstanceOf[js.Any])
    if (horizontalAxisVisibility != null) __obj.updateDynamic("horizontalAxisVisibility")(horizontalAxisVisibility.asInstanceOf[js.Any])
    if (labelMemberPath != null) __obj.updateDynamic("labelMemberPath")(labelMemberPath.asInstanceOf[js.Any])
    if (lastMarkerBrush != null) __obj.updateDynamic("lastMarkerBrush")(lastMarkerBrush.asInstanceOf[js.Any])
    if (lastMarkerSize != null) __obj.updateDynamic("lastMarkerSize")(lastMarkerSize.asInstanceOf[js.Any])
    if (lastMarkerVisibility != null) __obj.updateDynamic("lastMarkerVisibility")(lastMarkerVisibility.asInstanceOf[js.Any])
    if (lineThickness != null) __obj.updateDynamic("lineThickness")(lineThickness.asInstanceOf[js.Any])
    if (lowMarkerBrush != null) __obj.updateDynamic("lowMarkerBrush")(lowMarkerBrush.asInstanceOf[js.Any])
    if (lowMarkerSize != null) __obj.updateDynamic("lowMarkerSize")(lowMarkerSize.asInstanceOf[js.Any])
    if (lowMarkerVisibility != null) __obj.updateDynamic("lowMarkerVisibility")(lowMarkerVisibility.asInstanceOf[js.Any])
    if (markerBrush != null) __obj.updateDynamic("markerBrush")(markerBrush.asInstanceOf[js.Any])
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerVisibility != null) __obj.updateDynamic("markerVisibility")(markerVisibility.asInstanceOf[js.Any])
    if (maxRecCount != null) __obj.updateDynamic("maxRecCount")(maxRecCount.asInstanceOf[js.Any])
    if (negativeBrush != null) __obj.updateDynamic("negativeBrush")(negativeBrush.asInstanceOf[js.Any])
    if (negativeMarkerBrush != null) __obj.updateDynamic("negativeMarkerBrush")(negativeMarkerBrush.asInstanceOf[js.Any])
    if (negativeMarkerSize != null) __obj.updateDynamic("negativeMarkerSize")(negativeMarkerSize.asInstanceOf[js.Any])
    if (negativeMarkerVisibility != null) __obj.updateDynamic("negativeMarkerVisibility")(negativeMarkerVisibility.asInstanceOf[js.Any])
    if (normalRangeFill != null) __obj.updateDynamic("normalRangeFill")(normalRangeFill.asInstanceOf[js.Any])
    if (normalRangeMaximum != null) __obj.updateDynamic("normalRangeMaximum")(normalRangeMaximum.asInstanceOf[js.Any])
    if (normalRangeMinimum != null) __obj.updateDynamic("normalRangeMinimum")(normalRangeMinimum.asInstanceOf[js.Any])
    if (normalRangeVisibility != null) __obj.updateDynamic("normalRangeVisibility")(normalRangeVisibility.asInstanceOf[js.Any])
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (responseTotalRecCountKey != null) __obj.updateDynamic("responseTotalRecCountKey")(responseTotalRecCountKey.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate.asInstanceOf[js.Any])
    if (trendLineBrush != null) __obj.updateDynamic("trendLineBrush")(trendLineBrush.asInstanceOf[js.Any])
    if (trendLinePeriod != null) __obj.updateDynamic("trendLinePeriod")(trendLinePeriod.asInstanceOf[js.Any])
    if (trendLineThickness != null) __obj.updateDynamic("trendLineThickness")(trendLineThickness.asInstanceOf[js.Any])
    if (trendLineType != null) __obj.updateDynamic("trendLineType")(trendLineType.asInstanceOf[js.Any])
    if (unknownValuePlotting != null) __obj.updateDynamic("unknownValuePlotting")(unknownValuePlotting.asInstanceOf[js.Any])
    if (updateTooltip != null) __obj.updateDynamic("updateTooltip")(js.Any.fromFunction2(updateTooltip))
    if (valueMemberPath != null) __obj.updateDynamic("valueMemberPath")(valueMemberPath.asInstanceOf[js.Any])
    if (verticalAxisBrush != null) __obj.updateDynamic("verticalAxisBrush")(verticalAxisBrush.asInstanceOf[js.Any])
    if (verticalAxisLabel != null) __obj.updateDynamic("verticalAxisLabel")(verticalAxisLabel.asInstanceOf[js.Any])
    if (verticalAxisVisibility != null) __obj.updateDynamic("verticalAxisVisibility")(verticalAxisVisibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSparkline]
  }
}

