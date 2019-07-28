package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPieChart
  extends /**
	 * Option for igPieChart
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets whether the slices can be exploded.
  	 */
  var allowSliceExplosion: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the slices can be selected.
  	 */
  var allowSliceSelection: js.UndefOr[Boolean] = js.undefined
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
  var dataLabel: js.UndefOr[String] = js.undefined
  /**
  	 * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
  	 */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or Sets the property name that contains the values.
  	 */
  var dataValue: js.UndefOr[String] = js.undefined
  /**
  	 * Determines how much the exploded slice is offset from the center. Value between 0 and 1.
  	 */
  var explodedRadius: js.UndefOr[Double] = js.undefined
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
  var height: js.UndefOr[String | Double] = js.undefined
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
  var labelExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the color for labels rendered inside of the pie chart.  If no color is provided then
  	 *             the chart will attempt to find the colors in CSS.  If that is not available it will use a default color.
  	 */
  var labelInnerColor: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the property name that contains the labels.  This option is deprecated - please use `dataLabel` instead.
  	 */
  var labelMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the color for labels rendered outside of the pie chart.  If no color is provided then
  	 *             the chart will attempt to find the colors in CSS.  If that is not available it will use a default color.
  	 */
  var labelOuterColor: js.UndefOr[String] = js.undefined
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
  var labelsPosition: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the margin between a label and the end of its leader line.
  	 */
  var leaderLineMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets what type of leader lines will be used for the outside end labels.
  	 *
  	 *
  	 * Valid values:
  	 * "straight"
  	 * "arc"
  	 * "spline"
  	 */
  var leaderLineType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets whether the leader lines are visible.
  	 *
  	 *
  	 * Valid values:
  	 * "visible"
  	 * "collapsed"
  	 */
  var leaderLineVisibility: js.UndefOr[String] = js.undefined
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
  var legendLabelMemberPath: js.UndefOr[String] = js.undefined
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
  var othersCategoryText: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the threshold value that determines if slices are grouped into the Others slice.
  	 */
  var othersCategoryThreshold: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets whether to use numeric or percent-based threshold value.
  	 *
  	 * Valid values:
  	 * "number" Data value is compared directly to the value of OthersCategoryThreshold.
  	 * "percent" Data value is compared to OthersCategoryThreshold as a percentage of the total.
  	 */
  var othersCategoryType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the Outlines property.
  	 * The Outlines property defines the palette from which automatically assigned slice outlines are selected.
  	 * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the scaling factor of the chart's radius. Value between 0 and 1.
  	 */
  var radiusFactor: js.UndefOr[Double] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[String] = js.undefined
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
  var selectionMode: js.UndefOr[String] = js.undefined
  /**
  	 * Whether the chart should render a tooltip.
  	 */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
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
  var startAngle: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the rotational direction of the chart.
  	 *
  	 *
  	 * Valid values:
  	 * "counterclockwise"
  	 * "clockwise"
  	 */
  var sweepDirection: js.UndefOr[String] = js.undefined
  /**
  	 * Overrides the style used for text in the pie chart.
  	 */
  var textStyle: js.UndefOr[String] = js.undefined
  /**
  	 * The swatch used to style this widget
  	 */
  var theme: js.UndefOr[String] = js.undefined
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
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or Sets the property name that contains the values.  This option is deprecated - please use `dataValue` instead.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgPieChart {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igPieChart
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowSliceExplosion: js.UndefOr[Boolean] = js.undefined,
    allowSliceSelection: js.UndefOr[Boolean] = js.undefined,
    browserNotSupported: BrowserNotSupportedEvent = null,
    brushes: js.Any = null,
    dataLabel: String = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    dataValue: String = null,
    explodedRadius: Int | Double = null,
    explodedSlices: js.Array[_] = null,
    formatLabel: js.Function = null,
    height: String | Double = null,
    labelClick: LabelClickEvent = null,
    labelExtent: Int | Double = null,
    labelInnerColor: String = null,
    labelMemberPath: String = null,
    labelOuterColor: String = null,
    labelsPosition: String = null,
    language: String = null,
    leaderLineMargin: Int | Double = null,
    leaderLineType: String = null,
    leaderLineVisibility: String = null,
    legend: IgPieChartLegend = null,
    legendItemBadgeTemplate: js.Any = null,
    legendItemTemplate: js.Any = null,
    legendLabelMemberPath: String = null,
    locale: js.Any = null,
    othersCategoryStyle: js.Any = null,
    othersCategoryText: String = null,
    othersCategoryThreshold: Int | Double = null,
    othersCategoryType: String = null,
    outlines: js.Any = null,
    radiusFactor: Int | Double = null,
    regional: String | js.Object = null,
    responseDataKey: String = null,
    selectedItem: js.Any = null,
    selectedItemChanged: SelectedItemChangedEvent = null,
    selectedItemChanging: SelectedItemChangingEvent = null,
    selectedItems: js.Array[_] = null,
    selectedItemsChanged: SelectedItemsChangedEvent = null,
    selectedItemsChanging: SelectedItemsChangingEvent = null,
    selectedSlices: js.Array[_] = null,
    selectedStyle: js.Any = null,
    selectionMode: String = null,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    sliceClick: SliceClickEvent = null,
    startAngle: Int | Double = null,
    sweepDirection: String = null,
    textStyle: String = null,
    theme: String = null,
    tooltipHidden: TooltipHiddenEvent = null,
    tooltipHiding: TooltipHidingEvent = null,
    tooltipShowing: TooltipShowingEvent = null,
    tooltipShown: TooltipShownEvent = null,
    tooltipTemplate: String = null,
    valueMemberPath: String = null,
    width: String | Double = null
  ): IgPieChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowSliceExplosion)) __obj.updateDynamic("allowSliceExplosion")(allowSliceExplosion)
    if (!js.isUndefined(allowSliceSelection)) __obj.updateDynamic("allowSliceSelection")(allowSliceSelection)
    if (browserNotSupported != null) __obj.updateDynamic("browserNotSupported")(browserNotSupported)
    if (brushes != null) __obj.updateDynamic("brushes")(brushes)
    if (dataLabel != null) __obj.updateDynamic("dataLabel")(dataLabel)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (dataValue != null) __obj.updateDynamic("dataValue")(dataValue)
    if (explodedRadius != null) __obj.updateDynamic("explodedRadius")(explodedRadius.asInstanceOf[js.Any])
    if (explodedSlices != null) __obj.updateDynamic("explodedSlices")(explodedSlices)
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(formatLabel)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (labelClick != null) __obj.updateDynamic("labelClick")(labelClick)
    if (labelExtent != null) __obj.updateDynamic("labelExtent")(labelExtent.asInstanceOf[js.Any])
    if (labelInnerColor != null) __obj.updateDynamic("labelInnerColor")(labelInnerColor)
    if (labelMemberPath != null) __obj.updateDynamic("labelMemberPath")(labelMemberPath)
    if (labelOuterColor != null) __obj.updateDynamic("labelOuterColor")(labelOuterColor)
    if (labelsPosition != null) __obj.updateDynamic("labelsPosition")(labelsPosition)
    if (language != null) __obj.updateDynamic("language")(language)
    if (leaderLineMargin != null) __obj.updateDynamic("leaderLineMargin")(leaderLineMargin.asInstanceOf[js.Any])
    if (leaderLineType != null) __obj.updateDynamic("leaderLineType")(leaderLineType)
    if (leaderLineVisibility != null) __obj.updateDynamic("leaderLineVisibility")(leaderLineVisibility)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendItemBadgeTemplate != null) __obj.updateDynamic("legendItemBadgeTemplate")(legendItemBadgeTemplate)
    if (legendItemTemplate != null) __obj.updateDynamic("legendItemTemplate")(legendItemTemplate)
    if (legendLabelMemberPath != null) __obj.updateDynamic("legendLabelMemberPath")(legendLabelMemberPath)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (othersCategoryStyle != null) __obj.updateDynamic("othersCategoryStyle")(othersCategoryStyle)
    if (othersCategoryText != null) __obj.updateDynamic("othersCategoryText")(othersCategoryText)
    if (othersCategoryThreshold != null) __obj.updateDynamic("othersCategoryThreshold")(othersCategoryThreshold.asInstanceOf[js.Any])
    if (othersCategoryType != null) __obj.updateDynamic("othersCategoryType")(othersCategoryType)
    if (outlines != null) __obj.updateDynamic("outlines")(outlines)
    if (radiusFactor != null) __obj.updateDynamic("radiusFactor")(radiusFactor.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem)
    if (selectedItemChanged != null) __obj.updateDynamic("selectedItemChanged")(selectedItemChanged)
    if (selectedItemChanging != null) __obj.updateDynamic("selectedItemChanging")(selectedItemChanging)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (selectedItemsChanged != null) __obj.updateDynamic("selectedItemsChanged")(selectedItemsChanged)
    if (selectedItemsChanging != null) __obj.updateDynamic("selectedItemsChanging")(selectedItemsChanging)
    if (selectedSlices != null) __obj.updateDynamic("selectedSlices")(selectedSlices)
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (sliceClick != null) __obj.updateDynamic("sliceClick")(sliceClick)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (sweepDirection != null) __obj.updateDynamic("sweepDirection")(sweepDirection)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltipHidden != null) __obj.updateDynamic("tooltipHidden")(tooltipHidden)
    if (tooltipHiding != null) __obj.updateDynamic("tooltipHiding")(tooltipHiding)
    if (tooltipShowing != null) __obj.updateDynamic("tooltipShowing")(tooltipShowing)
    if (tooltipShown != null) __obj.updateDynamic("tooltipShown")(tooltipShown)
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    if (valueMemberPath != null) __obj.updateDynamic("valueMemberPath")(valueMemberPath)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPieChart]
  }
}

