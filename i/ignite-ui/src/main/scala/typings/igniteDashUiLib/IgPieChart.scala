package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgPieChart
  extends /**
	 * Option for igPieChart
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  	 * Gets or sets the Brushes property.
  	 * The brushes property defines the palette from which automatically assigned slice brushes are selected.
  	 * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var brushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the property name that contains the labels.
  	 */
  var dataLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or Sets the property name that contains the values.
  	 */
  var dataValue: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Determines how much the exploded slice is offset from the center. Value between 0 and 1.
  	 */
  var explodedRadius: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the collection of exploded slice indices.
  	 * Should be an array of integers that indicate the indexes of the slices to explode.
  	 */
  var explodedSlices: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets or sets the function to use to transform a pie slice data context into a label for the slice. Function takes one argument of type object.
  	 * Use context.item to get the item associated with the slice, if any.
  	 * Use context.outline to get the outline brush used to paint the slice.
  	 * Use context.itemLabel to get the label object that would be used for the slice.
  	 * Use context.percentValue to see the percentage value that is associated with the slice.
  	 * Use context.isOthersSlice to tell if the associated slice is the others slice.
  	 * Should return a string value that should be used for the label.
  	 */
  var formatLabel: js.UndefOr[js.Function] = js.undefined
  /**
  	 * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Raised when a slice's label is clicked.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.item to get reference to the slice object.
  	 *             Use ui.allowSliceClick to determine whether or not the label click should fire slice click event.
  	 */
  var labelClick: js.UndefOr[LabelClickEvent] = js.undefined
  /**
  	 * Gets or sets the pixel amount, by which the labels are offset from the edge of the slices.
  	 */
  var labelExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the color for labels rendered inside of the pie chart.  If no color is provided then
  	 *             the chart will attempt to find the colors in CSS.  If that is not available it will use a default color.
  	 */
  var labelInnerColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the property name that contains the labels.  This option is deprecated - please use `dataLabel` instead.
  	 */
  var labelMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the color for labels rendered outside of the pie chart.  If no color is provided then
  	 *             the chart will attempt to find the colors in CSS.  If that is not available it will use a default color.
  	 */
  var labelOuterColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the position of chart labels.
  	 *
  	 *
  	 * Valid values:
  	 * "none" No labels will be displayed.
  	 * "center" Labels will be displayed in the center.
  	 * "insideEnd" Labels will be displayed inside and by the edge of the container.
  	 * "outsideEnd" Labels will be displayed outside the container.
  	 * "bestFit" Labels will automatically decide their location.
  	 */
  var labelsPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the margin between a label and the end of its leader line.
  	 */
  var leaderLineMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets what type of leader lines will be used for the outside end labels.
  	 *
  	 *
  	 * Valid values:
  	 * "straight"
  	 * "arc"
  	 * "spline"
  	 */
  var leaderLineType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets whether the leader lines are visible.
  	 *
  	 *
  	 * Valid values:
  	 * "visible"
  	 * "collapsed"
  	 */
  var leaderLineVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Can be any valid options accepted by $.ig.ChartLegend, or an instance of an $.ig.ChartLegend itself.
  	 */
  var legend: js.UndefOr[IgPieChartLegend] = js.undefined
  /**
  	 * Gets or sets the LegendItemBadgeTemplate property.
  	 * The legend item badge is created according to the LegendItemBadgeTemplate on-demand by
  	 * the chart object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var legendItemBadgeTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the LegendItemTemplate property.
  	 * The legend item control content is created according to the LegendItemTemplate on-demand by
  	 * the chart object itself.
  	 * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
  	 */
  var legendItemTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the property name that contains the legend labels.
  	 */
  var legendLabelMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets a style object that can be used to override the style settings on the others category slice.
  	 */
  var othersCategoryStyle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the label of the Others slice.
  	 */
  var othersCategoryText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the threshold value that determines if slices are grouped into the Others slice.
  	 */
  var othersCategoryThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether to use numeric or percent-based threshold value.
  	 *
  	 * Valid values:
  	 * "number" Data value is compared directly to the value of OthersCategoryThreshold.
  	 * "percent" Data value is compared to OthersCategoryThreshold as a percentage of the total.
  	 */
  var othersCategoryType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the Outlines property.
  	 * The Outlines property defines the palette from which automatically assigned slice outlines are selected.
  	 * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the scaling factor of the chart's radius. Value between 0 and 1.
  	 */
  var radiusFactor: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the currently selected data item.  If a different data item is provided the pie chart
  	 *             will select the slice associated with the new item.
  	 */
  var selectedItem: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event fired when the selectedItem option has changed.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.oldItem to get a reference to the previous selected data item.
  	 *             Use ui.newItem to get a reference to the current selected data item.
  	 */
  var selectedItemChanged: js.UndefOr[SelectedItemChangedEvent] = js.undefined
  /**
  	 * Event fired when the selectedItem option is about to change.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.oldItem to get a reference to the current selected data item.
  	 *             Use ui.newItem to get a reference to the newly selected data item.
  	 *             Use ui.cancel to stop the selected item from changing.
  	 */
  var selectedItemChanging: js.UndefOr[SelectedItemChangingEvent] = js.undefined
  /**
  	 * Gets or sets the currently selected data items.  Adding or removing data items from this array will
  	 *             select or deselect the slices associated with those items.
  	 */
  var selectedItems: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Event fired when the selectedItems array has changed.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.oldItems to get a reference to the previous selected data items.
  	 *             Use ui.newItems to get a reference to the current selected data items.
  	 */
  var selectedItemsChanged: js.UndefOr[SelectedItemsChangedEvent] = js.undefined
  /**
  	 * Event fired when the selectedItems array is about to change.
  	 *             Function takes arguments evt and ui.
  	 *             Use ui.oldItems to get a reference to the current selected data items.
  	 *             Use ui.newItems to get a reference to the newly selected data items.
  	 *             Use ui.cancel to stop the selected items from changing.
  	 */
  var selectedItemsChanging: js.UndefOr[SelectedItemsChangingEvent] = js.undefined
  /**
  	 * Sets the collection of selected slice indices.
  	 *             Should be an array of integers that indicate the indexes of the slices to select.
  	 */
  var selectedSlices: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets or sets the style used when a slice is selected.
  	 */
  var selectedStyle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the type of selection the pie chart allows.
  	 *
  	 *
  	 * Valid values:
  	 * "single" A single slice is allowed to be selected.
  	 * "multiple" Multiple slices are allowed to be selected.
  	 * "manual" Slices can only be selected programmatically.
  	 */
  var selectionMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Whether the chart should render a tooltip.
  	 */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Raised when the slice is clicked.
  	 * Function takes arguments evt and ui.
  	 * Use ui.chart to get reference to chart object.
  	 * Use ui.slice to get reference to slice object.
  	 * Use ui.slice.item to get reference to current pie chart item.
  	 * Use ui.slice.isExploded to get is the slice exploded.
  	 * Use ui.slice.isSelected to get is the slice selected.
  	 */
  var sliceClick: js.UndefOr[SliceClickEvent] = js.undefined
  /**
  	 * Gets or sets the starting angle of the chart.
  	 * The default zero value is equivalent to 3 o'clock.
  	 */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the rotational direction of the chart.
  	 *
  	 *
  	 * Valid values:
  	 * "counterclockwise"
  	 * "clockwise"
  	 */
  var sweepDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Overrides the style used for text in the pie chart.
  	 */
  var textStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The swatch used to style this widget
  	 */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired after a tooltip is hidden
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current pie chart item.
  	 * Use ui.chart to get reference to chart object.
  	 */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.undefined
  /**
  	 * Event fired when the mouse has left an element and the tooltip is about to hide
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current pie chart item.
  	 * Use ui.chart to get reference to chart object.
  	 */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.undefined
  /**
  	 * Event fired when the mouse has hovered on an element long enough to display a tooltip
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current pie chart item.
  	 * Use ui.chart to get reference to chart object.
  	 */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.undefined
  /**
  	 * Event fired after a tooltip is shown
  	 * Function takes arguments evt and ui.
  	 * Use ui.element to get reference to tooltip DOM element.
  	 * Use ui.item to get reference to current pie chart item.
  	 * Use ui.chart to get reference to chart object.
  	 */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.undefined
  /**
  	 * The name of template or the template itself that chart tooltip will use to render.
  	 */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or Sets the property name that contains the values.  This option is deprecated - please use `dataValue` instead.
  	 */
  var valueMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

