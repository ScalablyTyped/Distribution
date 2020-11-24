package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPieChart
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets whether the slices can be exploded.
    */
  var allowSliceExplosion: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the slices can be selected.
    */
  var allowSliceSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired when the control is displayed on a non HTML5 compliant browser
    */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  
  /**
    * Gets or sets the Brushes property.
    * The brushes property defines the palette from which automatically assigned slice brushes are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var brushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the property name that contains the labels.
    */
  var dataLabel: js.UndefOr[String] = js.native
  
  /**
    * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    */
  var dataSourceType: js.UndefOr[String] = js.native
  
  /**
    * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  
  /**
    * Gets or Sets the property name that contains the values.
    */
  var dataValue: js.UndefOr[String] = js.native
  
  /**
    * Determines how much the exploded slice is offset from the center. Value between 0 and 1.
    */
  var explodedRadius: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the collection of exploded slice indices.
    * Should be an array of integers that indicate the indexes of the slices to explode.
    */
  var explodedSlices: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets or sets the function to use to transform a pie slice data context into a label for the slice. Function takes one argument of type object.
    * Use context.item to get the item associated with the slice, if any.
    * Use context.outline to get the outline brush used to paint the slice.
    * Use context.itemLabel to get the label object that would be used for the slice.
    * Use context.percentValue to see the percentage value that is associated with the slice.
    * Use context.isOthersSlice to tell if the associated slice is the others slice.
    * Should return a string value that should be used for the label.
    */
  var formatLabel: js.UndefOr[js.Function] = js.native
  
  /**
    * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Raised when a slice's label is clicked.
    *             Function takes arguments evt and ui.
    *             Use ui.item to get reference to the slice object.
    *             Use ui.allowSliceClick to determine whether or not the label click should fire slice click event.
    */
  var labelClick: js.UndefOr[LabelClickEvent] = js.native
  
  /**
    * Gets or sets the pixel amount, by which the labels are offset from the edge of the slices.
    */
  var labelExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the color for labels rendered inside of the pie chart.  If no color is provided then
    *             the chart will attempt to find the colors in CSS.  If that is not available it will use a default color.
    */
  var labelInnerColor: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the property name that contains the labels.  This option is deprecated - please use `dataLabel` instead.
    */
  var labelMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the color for labels rendered outside of the pie chart.  If no color is provided then
    *             the chart will attempt to find the colors in CSS.  If that is not available it will use a default color.
    */
  var labelOuterColor: js.UndefOr[String] = js.native
  
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
  var labelsPosition: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the margin between a label and the end of its leader line.
    */
  var leaderLineMargin: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets what type of leader lines will be used for the outside end labels.
    *
    *
    * Valid values:
    * "straight"
    * "arc"
    * "spline"
    */
  var leaderLineType: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets whether the leader lines are visible.
    *
    *
    * Valid values:
    * "visible"
    * "collapsed"
    */
  var leaderLineVisibility: js.UndefOr[String] = js.native
  
  /**
    * Can be any valid options accepted by $.ig.ChartLegend, or an instance of an $.ig.ChartLegend itself.
    */
  var legend: js.UndefOr[IgPieChartLegend] = js.native
  
  /**
    * Gets or sets the LegendItemBadgeTemplate property.
    * The legend item badge is created according to the LegendItemBadgeTemplate on-demand by
    * the chart object itself.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var legendItemBadgeTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the LegendItemTemplate property.
    * The legend item control content is created according to the LegendItemTemplate on-demand by
    * the chart object itself.
    * The provided object should have properties called render and optionally measure. See definition for option: legendItemBadgeTemplate
    */
  var legendItemTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the property name that contains the legend labels.
    */
  var legendLabelMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets a style object that can be used to override the style settings on the others category slice.
    */
  var othersCategoryStyle: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the label of the Others slice.
    */
  var othersCategoryText: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the threshold value that determines if slices are grouped into the Others slice.
    */
  var othersCategoryThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets whether to use numeric or percent-based threshold value.
    *
    * Valid values:
    * "number" Data value is compared directly to the value of OthersCategoryThreshold.
    * "percent" Data value is compared to OthersCategoryThreshold as a percentage of the total.
    */
  var othersCategoryType: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the Outlines property.
    * The Outlines property defines the palette from which automatically assigned slice outlines are selected.
    * The value provided should be an array of css color strings. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var outlines: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the scaling factor of the chart's radius. Value between 0 and 1.
    */
  var radiusFactor: js.UndefOr[Double] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the currently selected data item.  If a different data item is provided the pie chart
    *             will select the slice associated with the new item.
    */
  var selectedItem: js.UndefOr[js.Any] = js.native
  
  /**
    * Event fired when the selectedItem option has changed.
    *             Function takes arguments evt and ui.
    *             Use ui.oldItem to get a reference to the previous selected data item.
    *             Use ui.newItem to get a reference to the current selected data item.
    */
  var selectedItemChanged: js.UndefOr[SelectedItemChangedEvent] = js.native
  
  /**
    * Event fired when the selectedItem option is about to change.
    *             Function takes arguments evt and ui.
    *             Use ui.oldItem to get a reference to the current selected data item.
    *             Use ui.newItem to get a reference to the newly selected data item.
    *             Use ui.cancel to stop the selected item from changing.
    */
  var selectedItemChanging: js.UndefOr[SelectedItemChangingEvent] = js.native
  
  /**
    * Gets or sets the currently selected data items.  Adding or removing data items from this array will
    *             select or deselect the slices associated with those items.
    */
  var selectedItems: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Event fired when the selectedItems array has changed.
    *             Function takes arguments evt and ui.
    *             Use ui.oldItems to get a reference to the previous selected data items.
    *             Use ui.newItems to get a reference to the current selected data items.
    */
  var selectedItemsChanged: js.UndefOr[SelectedItemsChangedEvent] = js.native
  
  /**
    * Event fired when the selectedItems array is about to change.
    *             Function takes arguments evt and ui.
    *             Use ui.oldItems to get a reference to the current selected data items.
    *             Use ui.newItems to get a reference to the newly selected data items.
    *             Use ui.cancel to stop the selected items from changing.
    */
  var selectedItemsChanging: js.UndefOr[SelectedItemsChangingEvent] = js.native
  
  /**
    * Sets the collection of selected slice indices.
    *             Should be an array of integers that indicate the indexes of the slices to select.
    */
  var selectedSlices: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets or sets the style used when a slice is selected.
    */
  var selectedStyle: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the type of selection the pie chart allows.
    *
    *
    * Valid values:
    * "single" A single slice is allowed to be selected.
    * "multiple" Multiple slices are allowed to be selected.
    * "manual" Slices can only be selected programmatically.
    */
  var selectionMode: js.UndefOr[String] = js.native
  
  /**
    * Whether the chart should render a tooltip.
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  
  /**
    * Raised when the slice is clicked.
    * Function takes arguments evt and ui.
    * Use ui.chart to get reference to chart object.
    * Use ui.slice to get reference to slice object.
    * Use ui.slice.item to get reference to current pie chart item.
    * Use ui.slice.isExploded to get is the slice exploded.
    * Use ui.slice.isSelected to get is the slice selected.
    */
  var sliceClick: js.UndefOr[SliceClickEvent] = js.native
  
  /**
    * Gets or sets the starting angle of the chart.
    * The default zero value is equivalent to 3 o'clock.
    */
  var startAngle: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the rotational direction of the chart.
    *
    *
    * Valid values:
    * "counterclockwise"
    * "clockwise"
    */
  var sweepDirection: js.UndefOr[String] = js.native
  
  /**
    * Overrides the style used for text in the pie chart.
    */
  var textStyle: js.UndefOr[String] = js.native
  
  /**
    * The swatch used to style this widget
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * Event fired after a tooltip is hidden
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current pie chart item.
    * Use ui.chart to get reference to chart object.
    */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.native
  
  /**
    * Event fired when the mouse has left an element and the tooltip is about to hide
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current pie chart item.
    * Use ui.chart to get reference to chart object.
    */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.native
  
  /**
    * Event fired when the mouse has hovered on an element long enough to display a tooltip
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current pie chart item.
    * Use ui.chart to get reference to chart object.
    */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.native
  
  /**
    * Event fired after a tooltip is shown
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current pie chart item.
    * Use ui.chart to get reference to chart object.
    */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  
  /**
    * The name of template or the template itself that chart tooltip will use to render.
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  
  /**
    * Gets or Sets the property name that contains the values.  This option is deprecated - please use `dataValue` instead.
    */
  var valueMemberPath: js.UndefOr[String] = js.native
  
  /**
    * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgPieChart {
  
  @scala.inline
  def apply(): IgPieChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPieChart]
  }
  
  @scala.inline
  implicit class IgPieChartOps[Self <: IgPieChart] (val x: Self) extends AnyVal {
    
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
    def setAllowSliceExplosion(value: Boolean): Self = this.set("allowSliceExplosion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSliceExplosion: Self = this.set("allowSliceExplosion", js.undefined)
    
    @scala.inline
    def setAllowSliceSelection(value: Boolean): Self = this.set("allowSliceSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSliceSelection: Self = this.set("allowSliceSelection", js.undefined)
    
    @scala.inline
    def setBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = this.set("browserNotSupported", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBrowserNotSupported: Self = this.set("browserNotSupported", js.undefined)
    
    @scala.inline
    def setBrushes(value: js.Any): Self = this.set("brushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrushes: Self = this.set("brushes", js.undefined)
    
    @scala.inline
    def setDataLabel(value: String): Self = this.set("dataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabel: Self = this.set("dataLabel", js.undefined)
    
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
    def setDataValue(value: String): Self = this.set("dataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataValue: Self = this.set("dataValue", js.undefined)
    
    @scala.inline
    def setExplodedRadius(value: Double): Self = this.set("explodedRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplodedRadius: Self = this.set("explodedRadius", js.undefined)
    
    @scala.inline
    def setExplodedSlicesVarargs(value: js.Any*): Self = this.set("explodedSlices", js.Array(value :_*))
    
    @scala.inline
    def setExplodedSlices(value: js.Array[_]): Self = this.set("explodedSlices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplodedSlices: Self = this.set("explodedSlices", js.undefined)
    
    @scala.inline
    def setFormatLabel(value: js.Function): Self = this.set("formatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatLabel: Self = this.set("formatLabel", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLabelClick(value: (/* event */ Event, /* ui */ LabelClickEventUIParam) => Unit): Self = this.set("labelClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLabelClick: Self = this.set("labelClick", js.undefined)
    
    @scala.inline
    def setLabelExtent(value: Double): Self = this.set("labelExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelExtent: Self = this.set("labelExtent", js.undefined)
    
    @scala.inline
    def setLabelInnerColor(value: String): Self = this.set("labelInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInnerColor: Self = this.set("labelInnerColor", js.undefined)
    
    @scala.inline
    def setLabelMemberPath(value: String): Self = this.set("labelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelMemberPath: Self = this.set("labelMemberPath", js.undefined)
    
    @scala.inline
    def setLabelOuterColor(value: String): Self = this.set("labelOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOuterColor: Self = this.set("labelOuterColor", js.undefined)
    
    @scala.inline
    def setLabelsPosition(value: String): Self = this.set("labelsPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelsPosition: Self = this.set("labelsPosition", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLeaderLineMargin(value: Double): Self = this.set("leaderLineMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaderLineMargin: Self = this.set("leaderLineMargin", js.undefined)
    
    @scala.inline
    def setLeaderLineType(value: String): Self = this.set("leaderLineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaderLineType: Self = this.set("leaderLineType", js.undefined)
    
    @scala.inline
    def setLeaderLineVisibility(value: String): Self = this.set("leaderLineVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaderLineVisibility: Self = this.set("leaderLineVisibility", js.undefined)
    
    @scala.inline
    def setLegend(value: IgPieChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLegendItemBadgeTemplate(value: js.Any): Self = this.set("legendItemBadgeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendItemBadgeTemplate: Self = this.set("legendItemBadgeTemplate", js.undefined)
    
    @scala.inline
    def setLegendItemTemplate(value: js.Any): Self = this.set("legendItemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendItemTemplate: Self = this.set("legendItemTemplate", js.undefined)
    
    @scala.inline
    def setLegendLabelMemberPath(value: String): Self = this.set("legendLabelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendLabelMemberPath: Self = this.set("legendLabelMemberPath", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOthersCategoryStyle(value: js.Any): Self = this.set("othersCategoryStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOthersCategoryStyle: Self = this.set("othersCategoryStyle", js.undefined)
    
    @scala.inline
    def setOthersCategoryText(value: String): Self = this.set("othersCategoryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOthersCategoryText: Self = this.set("othersCategoryText", js.undefined)
    
    @scala.inline
    def setOthersCategoryThreshold(value: Double): Self = this.set("othersCategoryThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOthersCategoryThreshold: Self = this.set("othersCategoryThreshold", js.undefined)
    
    @scala.inline
    def setOthersCategoryType(value: String): Self = this.set("othersCategoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOthersCategoryType: Self = this.set("othersCategoryType", js.undefined)
    
    @scala.inline
    def setOutlines(value: js.Any): Self = this.set("outlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlines: Self = this.set("outlines", js.undefined)
    
    @scala.inline
    def setRadiusFactor(value: Double): Self = this.set("radiusFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusFactor: Self = this.set("radiusFactor", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: js.Any): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    
    @scala.inline
    def setSelectedItemChanged(value: (/* event */ Event, /* ui */ SelectedItemChangedEventUIParam) => Unit): Self = this.set("selectedItemChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectedItemChanged: Self = this.set("selectedItemChanged", js.undefined)
    
    @scala.inline
    def setSelectedItemChanging(value: (/* event */ Event, /* ui */ SelectedItemChangingEventUIParam) => Unit): Self = this.set("selectedItemChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectedItemChanging: Self = this.set("selectedItemChanging", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setSelectedItemsChanged(value: (/* event */ Event, /* ui */ SelectedItemsChangedEventUIParam) => Unit): Self = this.set("selectedItemsChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectedItemsChanged: Self = this.set("selectedItemsChanged", js.undefined)
    
    @scala.inline
    def setSelectedItemsChanging(value: (/* event */ Event, /* ui */ SelectedItemsChangingEventUIParam) => Unit): Self = this.set("selectedItemsChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectedItemsChanging: Self = this.set("selectedItemsChanging", js.undefined)
    
    @scala.inline
    def setSelectedSlicesVarargs(value: js.Any*): Self = this.set("selectedSlices", js.Array(value :_*))
    
    @scala.inline
    def setSelectedSlices(value: js.Array[_]): Self = this.set("selectedSlices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedSlices: Self = this.set("selectedSlices", js.undefined)
    
    @scala.inline
    def setSelectedStyle(value: js.Any): Self = this.set("selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedStyle: Self = this.set("selectedStyle", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    
    @scala.inline
    def setSliceClick(value: (/* event */ Event, /* ui */ SliceClickEventUIParam) => Unit): Self = this.set("sliceClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSliceClick: Self = this.set("sliceClick", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setSweepDirection(value: String): Self = this.set("sweepDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSweepDirection: Self = this.set("sweepDirection", js.undefined)
    
    @scala.inline
    def setTextStyle(value: String): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = this.set("tooltipHidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTooltipHidden: Self = this.set("tooltipHidden", js.undefined)
    
    @scala.inline
    def setTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = this.set("tooltipHiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTooltipHiding: Self = this.set("tooltipHiding", js.undefined)
    
    @scala.inline
    def setTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = this.set("tooltipShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTooltipShowing: Self = this.set("tooltipShowing", js.undefined)
    
    @scala.inline
    def setTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = this.set("tooltipShown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTooltipShown: Self = this.set("tooltipShown", js.undefined)
    
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    
    @scala.inline
    def setValueMemberPath(value: String): Self = this.set("valueMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMemberPath: Self = this.set("valueMemberPath", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
