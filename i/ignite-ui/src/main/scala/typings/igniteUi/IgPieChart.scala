package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
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
  implicit class IgPieChartMutableBuilder[Self <: IgPieChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSliceExplosion(value: Boolean): Self = StObject.set(x, "allowSliceExplosion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSliceExplosionUndefined: Self = StObject.set(x, "allowSliceExplosion", js.undefined)
    
    @scala.inline
    def setAllowSliceSelection(value: Boolean): Self = StObject.set(x, "allowSliceSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSliceSelectionUndefined: Self = StObject.set(x, "allowSliceSelection", js.undefined)
    
    @scala.inline
    def setBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = StObject.set(x, "browserNotSupported", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBrowserNotSupportedUndefined: Self = StObject.set(x, "browserNotSupported", js.undefined)
    
    @scala.inline
    def setBrushes(value: js.Any): Self = StObject.set(x, "brushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrushesUndefined: Self = StObject.set(x, "brushes", js.undefined)
    
    @scala.inline
    def setDataLabel(value: String): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
    
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
    def setDataValue(value: String): Self = StObject.set(x, "dataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValueUndefined: Self = StObject.set(x, "dataValue", js.undefined)
    
    @scala.inline
    def setExplodedRadius(value: Double): Self = StObject.set(x, "explodedRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplodedRadiusUndefined: Self = StObject.set(x, "explodedRadius", js.undefined)
    
    @scala.inline
    def setExplodedSlices(value: js.Array[_]): Self = StObject.set(x, "explodedSlices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplodedSlicesUndefined: Self = StObject.set(x, "explodedSlices", js.undefined)
    
    @scala.inline
    def setExplodedSlicesVarargs(value: js.Any*): Self = StObject.set(x, "explodedSlices", js.Array(value :_*))
    
    @scala.inline
    def setFormatLabel(value: js.Function): Self = StObject.set(x, "formatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLabelClick(value: (/* event */ Event, /* ui */ LabelClickEventUIParam) => Unit): Self = StObject.set(x, "labelClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLabelClickUndefined: Self = StObject.set(x, "labelClick", js.undefined)
    
    @scala.inline
    def setLabelExtent(value: Double): Self = StObject.set(x, "labelExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelExtentUndefined: Self = StObject.set(x, "labelExtent", js.undefined)
    
    @scala.inline
    def setLabelInnerColor(value: String): Self = StObject.set(x, "labelInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelInnerColorUndefined: Self = StObject.set(x, "labelInnerColor", js.undefined)
    
    @scala.inline
    def setLabelMemberPath(value: String): Self = StObject.set(x, "labelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelMemberPathUndefined: Self = StObject.set(x, "labelMemberPath", js.undefined)
    
    @scala.inline
    def setLabelOuterColor(value: String): Self = StObject.set(x, "labelOuterColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOuterColorUndefined: Self = StObject.set(x, "labelOuterColor", js.undefined)
    
    @scala.inline
    def setLabelsPosition(value: String): Self = StObject.set(x, "labelsPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsPositionUndefined: Self = StObject.set(x, "labelsPosition", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLeaderLineMargin(value: Double): Self = StObject.set(x, "leaderLineMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderLineMarginUndefined: Self = StObject.set(x, "leaderLineMargin", js.undefined)
    
    @scala.inline
    def setLeaderLineType(value: String): Self = StObject.set(x, "leaderLineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderLineTypeUndefined: Self = StObject.set(x, "leaderLineType", js.undefined)
    
    @scala.inline
    def setLeaderLineVisibility(value: String): Self = StObject.set(x, "leaderLineVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderLineVisibilityUndefined: Self = StObject.set(x, "leaderLineVisibility", js.undefined)
    
    @scala.inline
    def setLegend(value: IgPieChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemBadgeTemplate(value: js.Any): Self = StObject.set(x, "legendItemBadgeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemBadgeTemplateUndefined: Self = StObject.set(x, "legendItemBadgeTemplate", js.undefined)
    
    @scala.inline
    def setLegendItemTemplate(value: js.Any): Self = StObject.set(x, "legendItemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemTemplateUndefined: Self = StObject.set(x, "legendItemTemplate", js.undefined)
    
    @scala.inline
    def setLegendLabelMemberPath(value: String): Self = StObject.set(x, "legendLabelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendLabelMemberPathUndefined: Self = StObject.set(x, "legendLabelMemberPath", js.undefined)
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setOthersCategoryStyle(value: js.Any): Self = StObject.set(x, "othersCategoryStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOthersCategoryStyleUndefined: Self = StObject.set(x, "othersCategoryStyle", js.undefined)
    
    @scala.inline
    def setOthersCategoryText(value: String): Self = StObject.set(x, "othersCategoryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOthersCategoryTextUndefined: Self = StObject.set(x, "othersCategoryText", js.undefined)
    
    @scala.inline
    def setOthersCategoryThreshold(value: Double): Self = StObject.set(x, "othersCategoryThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOthersCategoryThresholdUndefined: Self = StObject.set(x, "othersCategoryThreshold", js.undefined)
    
    @scala.inline
    def setOthersCategoryType(value: String): Self = StObject.set(x, "othersCategoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOthersCategoryTypeUndefined: Self = StObject.set(x, "othersCategoryType", js.undefined)
    
    @scala.inline
    def setOutlines(value: js.Any): Self = StObject.set(x, "outlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinesUndefined: Self = StObject.set(x, "outlines", js.undefined)
    
    @scala.inline
    def setRadiusFactor(value: Double): Self = StObject.set(x, "radiusFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusFactorUndefined: Self = StObject.set(x, "radiusFactor", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: js.Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemChanged(value: (/* event */ Event, /* ui */ SelectedItemChangedEventUIParam) => Unit): Self = StObject.set(x, "selectedItemChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectedItemChangedUndefined: Self = StObject.set(x, "selectedItemChanged", js.undefined)
    
    @scala.inline
    def setSelectedItemChanging(value: (/* event */ Event, /* ui */ SelectedItemChangingEventUIParam) => Unit): Self = StObject.set(x, "selectedItemChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectedItemChangingUndefined: Self = StObject.set(x, "selectedItemChanging", js.undefined)
    
    @scala.inline
    def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsChanged(value: (/* event */ Event, /* ui */ SelectedItemsChangedEventUIParam) => Unit): Self = StObject.set(x, "selectedItemsChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectedItemsChangedUndefined: Self = StObject.set(x, "selectedItemsChanged", js.undefined)
    
    @scala.inline
    def setSelectedItemsChanging(value: (/* event */ Event, /* ui */ SelectedItemsChangingEventUIParam) => Unit): Self = StObject.set(x, "selectedItemsChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectedItemsChangingUndefined: Self = StObject.set(x, "selectedItemsChanging", js.undefined)
    
    @scala.inline
    def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedSlices(value: js.Array[_]): Self = StObject.set(x, "selectedSlices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedSlicesUndefined: Self = StObject.set(x, "selectedSlices", js.undefined)
    
    @scala.inline
    def setSelectedSlicesVarargs(value: js.Any*): Self = StObject.set(x, "selectedSlices", js.Array(value :_*))
    
    @scala.inline
    def setSelectedStyle(value: js.Any): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStyleUndefined: Self = StObject.set(x, "selectedStyle", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    @scala.inline
    def setSliceClick(value: (/* event */ Event, /* ui */ SliceClickEventUIParam) => Unit): Self = StObject.set(x, "sliceClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSliceClickUndefined: Self = StObject.set(x, "sliceClick", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setSweepDirection(value: String): Self = StObject.set(x, "sweepDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweepDirectionUndefined: Self = StObject.set(x, "sweepDirection", js.undefined)
    
    @scala.inline
    def setTextStyle(value: String): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = StObject.set(x, "tooltipHidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipHiddenUndefined: Self = StObject.set(x, "tooltipHidden", js.undefined)
    
    @scala.inline
    def setTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = StObject.set(x, "tooltipHiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipHidingUndefined: Self = StObject.set(x, "tooltipHiding", js.undefined)
    
    @scala.inline
    def setTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = StObject.set(x, "tooltipShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipShowingUndefined: Self = StObject.set(x, "tooltipShowing", js.undefined)
    
    @scala.inline
    def setTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = StObject.set(x, "tooltipShown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTooltipShownUndefined: Self = StObject.set(x, "tooltipShown", js.undefined)
    
    @scala.inline
    def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    
    @scala.inline
    def setValueMemberPath(value: String): Self = StObject.set(x, "valueMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMemberPathUndefined: Self = StObject.set(x, "valueMemberPath", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
