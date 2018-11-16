package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgDoughnutChart
  extends /**
	 * Option for igDoughnutChart
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets or sets whether the slices can be exploded.
  	 */
  var allowSliceExplosion: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether the slices can be selected.
  	 */
  var allowSliceSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired when the control is displayed on a non HTML5 compliant browser
  	 */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.undefined
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
  	 * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
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
  	 * Raised when the dimensions (center point or radius) of the doughnut hole change.
  	 */
  var holeDimensionsChanged: js.UndefOr[HoleDimensionsChangedEvent] = js.undefined
  /**
  	 * Gets or sets the inner extent of the doughnut chart. It is percent from the outer ring's radius.
  	 */
  var innerExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether all surface interactions with the plot area should be disabled.
  	 */
  var isSurfaceInteractionDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets sets maximum number of displayed records in chart.
  	 */
  var maxRecCount: js.UndefOr[scala.Double] = js.undefined
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
  	 * Gets or sets the style used when a slice is selected.
  	 */
  var selectedStyle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * An array of series objects.
  	 */
  var series: js.UndefOr[js.Array[IgDoughnutChartSeries]] = js.undefined
  /**
  	 * Raised when the slice is clicked.
  	 */
  var sliceClick: js.UndefOr[SliceClickEvent] = js.undefined
  /**
  	 * Event fired after a tooltip is hidden
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.undefined
  /**
  	 * Event fired when the mouse has left a series and the tooltip is about to hide
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.undefined
  /**
  	 * Event fired when the mouse has hovered on a series and the tooltip is about to show
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.undefined
  /**
  	 * Event fired after a tooltip is shown
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current series item object.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.series to get reference to current series object.
  	 * Use ui.actualItemBrush to get item brush.
  	 * Use ui.actualSeriesBrush to get series brush.
  	 */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.undefined
  /**
  	 * Gets sets template for tooltip associated with chart item.
  	 * Example: "Value: $(ValueMemberPathInDataSource)"
  	 */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
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
  	 * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

