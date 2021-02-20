package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridGroupBy
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the collapse indicator tooltip for grouped rows. Use option [locale.collapseTooltip](ui.iggridgroupby#options:locale.collapseTooltip).
    */
  var collapseTooltip: js.UndefOr[String] = js.native
  
  /**
    * Configures individual column settings.
    *
    */
  var columnSettings: js.UndefOr[IgGridGroupByColumnSettings] = js.native
  
  /**
    * default sort order - ascending or descending
    *
    *
    * Valid values:
    * "asc" The group is sorted in ascending order.
    * "desc" The group is sorted in descending order.
    */
  var defaultSortingDirection: js.UndefOr[String] = js.native
  
  /**
    * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog. Checkout the [Extending igGrid Modal Dialog](http://www.igniteui.com/help/extending-iggrid-modal-dialog) topic for details.
    *
    */
  var dialogWidget: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for the hyperlink which opens the GroupBy Dialog. Use option [locale.emptyGroupByAreaContentSelectColumnsCaption](ui.iggridgroupby#options:locale.emptyGroupByAreaContentSelectColumnsCaption).
    */
  var emptyGroupByAreaContentSelectColumnsCaption: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the expand indicator tooltip for grouped rows. Use option [locale.expandTooltip](ui.iggridgroupby#options:locale.expandTooltip).
    */
  var expandTooltip: js.UndefOr[String] = js.native
  
  /**
    * Specifies if grouped rows will have an expander image that will allow end users to expand and collapse them. This option can be set only at initialization.
    *
    */
  var expansionIndicatorVisibility: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the place in the grid where the GroupBy area will be
    *
    *
    * Valid values:
    * "top" the GroupBy area will be rendered above the grid headers
    * "hidden" the GroupBy area will not be rendered
    * "bottom" the GroupBy area will be rendered below the grid footer (and above the pager, if any)
    */
  var groupByAreaVisibility: js.UndefOr[String] = js.native
  
  /**
    * Controls containment behavior for the GroupBy Dialog.
    *
    *
    * Valid values:
    * "owner" The GroupBy Dialog will be draggable only in the grid area
    * "window" The GroupBy Dialog will be draggable in the whole window area
    */
  var groupByDialogContainment: js.UndefOr[String] = js.native
  
  /**
    * By default, the column width for the header is taken. If this is specified it's used for all headers.
    *
    */
  var groupByLabelWidth: js.UndefOr[Double] = js.native
  
  /**
    * URL param name which specifies a GroupBy [expression](ig.datasource#options:settings.sorting.expressions). When groupByUrlKey, [groupByUrlKeyAscValue](ui.iggridgroupby#options:groupByUrlKeyAscValue) and [groupByUrlKeyDescValue](ui.iggridgroupby#options:groupByUrlKeyDescValue) are set the request looks like: ?<groupByUrlKey>(<columnKey>)=<groupByUrlKeyAscValue/groupByUrlKeyDescValue> (Example: ?groupby(col1)=asc). Otherwise the OData conventions for sorting params are used.
    *
    */
  var groupByUrlKey: js.UndefOr[String] = js.native
  
  /**
    * URL param value denoting ascending grouping. When [groupByUrlKey](ui.iggridgroupby#options:groupByUrlKey), groupByUrlKeyAscValue and [groupByUrlKeyDescValue](ui.iggridgroupby#options:groupByUrlKeyDescValue) are set the request looks like: ?<groupByUrlKey>(<columnKey>)=<groupByUrlKeyAscValue/groupByUrlKeyDescValue> (Example: ?groupby(col1)=asc). Otherwise the OData conventions for sorting params are used.
    *
    */
  var groupByUrlKeyAscValue: js.UndefOr[String] = js.native
  
  /**
    * URL param value denoting descending grouping. When [groupByUrlKey](ui.iggridgroupby#options:groupByUrlKey), [groupByUrlKeyAscValue](ui.iggridgroupby#options:groupByUrlKeyAscValue) and groupByUrlKeyDescValue are set the request looks like: ?<groupByUrlKey>(<columnKey>)=<groupByUrlKeyAscValue/groupByUrlKeyDescValue> (Example: ?groupby(col1)=asc). Otherwise the OData conventions for sorting params are used.
    *
    */
  var groupByUrlKeyDescValue: js.UndefOr[String] = js.native
  
  /**
    * Specifies default summaries that will appear when grouping by a column on the bottom of each group as a row.This option has a lower priority than the groupSummaries defined under columnSettings for each column.
    * All default summaries are defined under $.ig.util.defaultSummaryMethods
    *
    */
  var groupSummaries: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies the groupSummaries postion inside each group.
    *
    *
    * Valid values:
    * "top" One summary row will be displayed at the top for each group
    * "bottom"  One summary row will be displayed at the bottom for each group
    * "both" Two summary rows will be be display for each group. One on the top and one on the bottom.
    */
  var groupSummariesPosition: js.UndefOr[String] = js.native
  
  /**
    * Returns the list of currently grouped columns. The option is read-only and cannot be set at initialization or at runtime.
    *
    */
  var groupedColumns: js.UndefOr[js.Array[IgGridGroupByGroupedColumn]] = js.native
  
  /**
    * Event which is fired when the groupedColumns collection has changed. This event is fired also when group/ungroup from GroupBy modal dialog but key, layout and grid are not set
    */
  var groupedColumnsChanged: js.UndefOr[GroupedColumnsChangedEvent] = js.native
  
  /**
    * Event which is fired when the grouped columns collection is about to change. This event is fired even when button OK is clicked from the modal dialog(after event modalDialogButtonApplyClick is fired)
    */
  var groupedColumnsChanging: js.UndefOr[GroupedColumnsChangingEvent] = js.native
  
  /**
    * Template for the grouped row's text. Variables available for the template are ${key}, ${val} and ${count}.
    *
    */
  var groupedRowTextTemplate: js.UndefOr[String] = js.native
  
  /**
    * Specifies the indentation for a grouped row. If several columns are grouped, the total indentation will grow
    *
    */
  var indentation: js.UndefOr[Double] = js.native
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if after grouping, the grouped rows will be initially expanded or collapsed.
    *
    */
  var initialExpand: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the opacity of the drag markup, while a column header is being dragged. The value must be between 0 and 1.
    *
    */
  var labelDragHelperOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[IgGridGroupByLocale] = js.native
  
  /**
    * Specifies time in milliseconds for animation duration to show/hide modal dialog
    *
    */
  var modalDialogAnimationDuration: js.UndefOr[Double] = js.native
  
  /**
    * Event fired when the button is Apply is clicked.
    */
  var modalDialogButtonApplyClick: js.UndefOr[ModalDialogButtonApplyClickEvent] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which cancel changes in the GroupBy Dialog. Use option [locale.modalDialogButtonApplyText](ui.iggridgroupby#options:locale.modalDialogButtonApplyText).
    */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies text of button which cancel changes in the GroupBy Dialog. Use option [locale.modalDialogButtonCancelText](ui.iggridgroupby#options:locale.modalDialogButtonCancelText).
    */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.native
  
  /**
    * Event fired when reset button is clicked.
    */
  var modalDialogButtonResetClick: js.UndefOr[ModalDialogButtonResetClickEvent] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each ascending sorted column in GroupBy Dialog. Use option [locale.modalDialogCaptionButtonAsc](ui.iggridgroupby#options:locale.modalDialogCaptionButtonAsc).
    */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption for each descending sorted column in GroupBy Dialog. Use option [locale.modalDialogCaptionButtonDesc](ui.iggridgroupby#options:locale.modalDialogCaptionButtonDesc).
    */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption button ungroup in GroupBy Dialog. Use option [locale.modalDialogCaptionButtonUngroup](ui.iggridgroupby#options:locale.modalDialogCaptionButtonUngroup).
    */
  var modalDialogCaptionButtonUngroup: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption text for the GroupBy Dialog. Use option [locale.modalDialogCaptionText](ui.iggridgroupby#options:locale.modalDialogCaptionText).
    */
  var modalDialogCaptionText: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies label for "Clear all" button in the GroupBy Dialog. Use option [locale.modalDialogClearAllButtonLabel](ui.iggridgroupby#options:locale.modalDialogClearAllButtonLabel).
    */
  var modalDialogClearAllButtonLabel: js.UndefOr[String] = js.native
  
  /**
    * Event fired after the modal dialog has been closed.
    */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.native
  
  /**
    * Event fired before the modal dialog is closed.
    */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.native
  
  /**
    * Event fired after the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.native
  
  /**
    * Event fired before the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.native
  
  /**
    * Specifies width of layouts dropdown in the GroupBy Dialog
    *
    */
  var modalDialogDropDownAreaWidth: js.UndefOr[Double] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption of layouts dropdown button in the GroupBy Dialog. Use option [locale.modalDialogDropDownButtonCaption](ui.iggridgroupby#options:locale.modalDialogDropDownButtonCaption).
    */
  var modalDialogDropDownButtonCaption: js.UndefOr[String] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies label for layouts dropdown in the GroupBy Dialog.  Use option [locale.modalDialogDropDownLabel](ui.iggridgroupby#options:locale.modalDialogDropDownLabel).
    */
  var modalDialogDropDownLabel: js.UndefOr[String] = js.native
  
  /**
    * Specifies width of layouts dropdown in the GroupBy Dialog
    *
    */
  var modalDialogDropDownWidth: js.UndefOr[Double] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the text of GroupBy button in the GroupBy Dialog. Use option [locale.modalDialogGroupByButtonText](ui.iggridgroupby#options:locale.modalDialogGroupByButtonText).
    */
  var modalDialogGroupByButtonText: js.UndefOr[String] = js.native
  
  /**
    * Enables/disables immediate column grouping/ungrouping. When false operation is delayed until after "Apply" button is clicked by the user.
    *
    */
  var modalDialogGroupByOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired when column in modal dialog is clicked to be grouped.
    */
  var modalDialogGroupColumn: js.UndefOr[ModalDialogGroupColumnEvent] = js.native
  
  /**
    * Event fired when column in modal dialog is clicked to be grouped.
    */
  var modalDialogGroupingColumn: js.UndefOr[ModalDialogGroupingColumnEvent] = js.native
  
  /**
    * Specifies height of the GroupBy Dialog
    *
    *
    * Valid values:
    * "string" The dialog height can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
    * "number" The dialog height can be set in pixels as a number. Example values: 800, 700.
    */
  var modalDialogHeight: js.UndefOr[String | Double] = js.native
  
  /**
    * Event fired every time the GroupBy Dialog changes its position.
    */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.native
  
  /**
    * Event fired after the modal dialog is already opened.
    */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.native
  
  /**
    * Event fired before the modal dialog is opened.
    */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies caption of layouts dropdown button in the GroupBy Dialog. Use option [locale.modalDialogRootLevelHierarchicalGrid](ui.iggridgroupby#options:locale.modalDialogRootLevelHierarchicalGrid).
    */
  var modalDialogRootLevelHierarchicalGrid: js.UndefOr[String] = js.native
  
  /**
    * Event fired when column in modal dialog is sorted.
    */
  var modalDialogSortGroupedColumn: js.UndefOr[ModalDialogSortGroupedColumnEvent] = js.native
  
  /**
    * Event fired when column in modal dialog is clicked to be ungrouped.
    */
  var modalDialogUngroupColumn: js.UndefOr[ModalDialogUngroupColumnEvent] = js.native
  
  /**
    * Event fired when column in modal dialog is clicked to be ungrouped.
    */
  var modalDialogUngroupingColumn: js.UndefOr[ModalDialogUngroupingColumnEvent] = js.native
  
  /**
    * Specifies width of the GroupBy Dialog
    *
    *
    * Valid values:
    * "string" The dialog width can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
    * "number" The dialog width can be set in pixels as a number. Example values: 800, 700.
    */
  var modalDialogWidth: js.UndefOr[String | Double] = js.native
  
  /**
    * Specifies when paging is applied and there is at least one grouped column which records should be included in page processing.
    *
    *
    * Valid values:
    * "allRecords" All records are included in page processing - data records and group-by metadata records
    * "dataRecordsOnly" Only data records are included in page processing(metadata group-by records are ignored)
    */
  var pagingMode: js.UndefOr[String] = js.native
  
  /**
    * Enables / disables GroupBy persistence between states. Checkout the [GroupBy Persistence](http://www.igniteui.com/help/iggrid-groupby-overview#groupBy-persistence) topic for details.
    *
    */
  var persist: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * This option has been removed as of 2017.2 Volume release.
    * Specifies the tooltip for the remove button. Use option [locale.removeButtonTooltip](ui.iggridgroupby#options:locale.removeButtonTooltip).
    */
  var removeButtonTooltip: js.UndefOr[String] = js.native
  
  /**
    * Specifies a key to get group by data from the remote response.
    *
    */
  var resultResponseKey: js.UndefOr[String] = js.native
  
  /**
    * Specifies the settings for GroupBy summaries.
    *
    */
  var summarySettings: js.UndefOr[IgGridGroupBySummarySettings] = js.native
  
  /**
    * Specifies whether the GroupBy operation takes place locally on client-side or remotely on server-side.
    *
    *
    * Valid values:
    * "local" Execute the GroupBy operation locally on client-side.
    * "remote" Execute the GroupBy operation by a request to the server.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Format grouped column using the formatter set in [igGrid.columns.formatter](ui.iggrid#options:columns.formatter) or [igGrid.columns.format](ui.iggrid#options:columns.format).
    *
    */
  var useGridColumnFormatter: js.UndefOr[Boolean] = js.native
}
object IgGridGroupBy {
  
  @scala.inline
  def apply(): IgGridGroupBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridGroupBy]
  }
  
  @scala.inline
  implicit class IgGridGroupByMutableBuilder[Self <: IgGridGroupBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseTooltip(value: String): Self = StObject.set(x, "collapseTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseTooltipUndefined: Self = StObject.set(x, "collapseTooltip", js.undefined)
    
    @scala.inline
    def setColumnSettings(value: IgGridGroupByColumnSettings): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    @scala.inline
    def setDefaultSortingDirection(value: String): Self = StObject.set(x, "defaultSortingDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortingDirectionUndefined: Self = StObject.set(x, "defaultSortingDirection", js.undefined)
    
    @scala.inline
    def setDialogWidget(value: String): Self = StObject.set(x, "dialogWidget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogWidgetUndefined: Self = StObject.set(x, "dialogWidget", js.undefined)
    
    @scala.inline
    def setEmptyGroupByAreaContentSelectColumnsCaption(value: String): Self = StObject.set(x, "emptyGroupByAreaContentSelectColumnsCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyGroupByAreaContentSelectColumnsCaptionUndefined: Self = StObject.set(x, "emptyGroupByAreaContentSelectColumnsCaption", js.undefined)
    
    @scala.inline
    def setExpandTooltip(value: String): Self = StObject.set(x, "expandTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandTooltipUndefined: Self = StObject.set(x, "expandTooltip", js.undefined)
    
    @scala.inline
    def setExpansionIndicatorVisibility(value: Boolean): Self = StObject.set(x, "expansionIndicatorVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpansionIndicatorVisibilityUndefined: Self = StObject.set(x, "expansionIndicatorVisibility", js.undefined)
    
    @scala.inline
    def setGroupByAreaVisibility(value: String): Self = StObject.set(x, "groupByAreaVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByAreaVisibilityUndefined: Self = StObject.set(x, "groupByAreaVisibility", js.undefined)
    
    @scala.inline
    def setGroupByDialogContainment(value: String): Self = StObject.set(x, "groupByDialogContainment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByDialogContainmentUndefined: Self = StObject.set(x, "groupByDialogContainment", js.undefined)
    
    @scala.inline
    def setGroupByLabelWidth(value: Double): Self = StObject.set(x, "groupByLabelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByLabelWidthUndefined: Self = StObject.set(x, "groupByLabelWidth", js.undefined)
    
    @scala.inline
    def setGroupByUrlKey(value: String): Self = StObject.set(x, "groupByUrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByUrlKeyAscValue(value: String): Self = StObject.set(x, "groupByUrlKeyAscValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByUrlKeyAscValueUndefined: Self = StObject.set(x, "groupByUrlKeyAscValue", js.undefined)
    
    @scala.inline
    def setGroupByUrlKeyDescValue(value: String): Self = StObject.set(x, "groupByUrlKeyDescValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByUrlKeyDescValueUndefined: Self = StObject.set(x, "groupByUrlKeyDescValue", js.undefined)
    
    @scala.inline
    def setGroupByUrlKeyUndefined: Self = StObject.set(x, "groupByUrlKey", js.undefined)
    
    @scala.inline
    def setGroupSummaries(value: js.Any): Self = StObject.set(x, "groupSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSummariesPosition(value: String): Self = StObject.set(x, "groupSummariesPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSummariesPositionUndefined: Self = StObject.set(x, "groupSummariesPosition", js.undefined)
    
    @scala.inline
    def setGroupSummariesUndefined: Self = StObject.set(x, "groupSummaries", js.undefined)
    
    @scala.inline
    def setGroupedColumns(value: js.Array[IgGridGroupByGroupedColumn]): Self = StObject.set(x, "groupedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedColumnsChanged(value: (/* event */ Event, /* ui */ GroupedColumnsChangedEventUIParam) => Unit): Self = StObject.set(x, "groupedColumnsChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupedColumnsChangedUndefined: Self = StObject.set(x, "groupedColumnsChanged", js.undefined)
    
    @scala.inline
    def setGroupedColumnsChanging(value: (/* event */ Event, /* ui */ GroupedColumnsChangingEventUIParam) => Unit): Self = StObject.set(x, "groupedColumnsChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupedColumnsChangingUndefined: Self = StObject.set(x, "groupedColumnsChanging", js.undefined)
    
    @scala.inline
    def setGroupedColumnsUndefined: Self = StObject.set(x, "groupedColumns", js.undefined)
    
    @scala.inline
    def setGroupedColumnsVarargs(value: IgGridGroupByGroupedColumn*): Self = StObject.set(x, "groupedColumns", js.Array(value :_*))
    
    @scala.inline
    def setGroupedRowTextTemplate(value: String): Self = StObject.set(x, "groupedRowTextTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedRowTextTemplateUndefined: Self = StObject.set(x, "groupedRowTextTemplate", js.undefined)
    
    @scala.inline
    def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setInitialExpand(value: Boolean): Self = StObject.set(x, "initialExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialExpandUndefined: Self = StObject.set(x, "initialExpand", js.undefined)
    
    @scala.inline
    def setLabelDragHelperOpacity(value: Double): Self = StObject.set(x, "labelDragHelperOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDragHelperOpacityUndefined: Self = StObject.set(x, "labelDragHelperOpacity", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: IgGridGroupByLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setModalDialogAnimationDuration(value: Double): Self = StObject.set(x, "modalDialogAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogAnimationDurationUndefined: Self = StObject.set(x, "modalDialogAnimationDuration", js.undefined)
    
    @scala.inline
    def setModalDialogButtonApplyClick(value: (/* event */ Event, /* ui */ ModalDialogButtonApplyClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogButtonApplyClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogButtonApplyClickUndefined: Self = StObject.set(x, "modalDialogButtonApplyClick", js.undefined)
    
    @scala.inline
    def setModalDialogButtonApplyText(value: String): Self = StObject.set(x, "modalDialogButtonApplyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogButtonApplyTextUndefined: Self = StObject.set(x, "modalDialogButtonApplyText", js.undefined)
    
    @scala.inline
    def setModalDialogButtonCancelText(value: String): Self = StObject.set(x, "modalDialogButtonCancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogButtonCancelTextUndefined: Self = StObject.set(x, "modalDialogButtonCancelText", js.undefined)
    
    @scala.inline
    def setModalDialogButtonResetClick(value: (/* event */ Event, /* ui */ ModalDialogButtonResetClickEventUIParam) => Unit): Self = StObject.set(x, "modalDialogButtonResetClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogButtonResetClickUndefined: Self = StObject.set(x, "modalDialogButtonResetClick", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionButtonAsc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionButtonAscUndefined: Self = StObject.set(x, "modalDialogCaptionButtonAsc", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionButtonDesc(value: String): Self = StObject.set(x, "modalDialogCaptionButtonDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionButtonDescUndefined: Self = StObject.set(x, "modalDialogCaptionButtonDesc", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionButtonUngroup(value: String): Self = StObject.set(x, "modalDialogCaptionButtonUngroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionButtonUngroupUndefined: Self = StObject.set(x, "modalDialogCaptionButtonUngroup", js.undefined)
    
    @scala.inline
    def setModalDialogCaptionText(value: String): Self = StObject.set(x, "modalDialogCaptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogCaptionTextUndefined: Self = StObject.set(x, "modalDialogCaptionText", js.undefined)
    
    @scala.inline
    def setModalDialogClearAllButtonLabel(value: String): Self = StObject.set(x, "modalDialogClearAllButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogClearAllButtonLabelUndefined: Self = StObject.set(x, "modalDialogClearAllButtonLabel", js.undefined)
    
    @scala.inline
    def setModalDialogClosed(value: (/* event */ Event, /* ui */ ModalDialogClosedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogClosedUndefined: Self = StObject.set(x, "modalDialogClosed", js.undefined)
    
    @scala.inline
    def setModalDialogClosing(value: (/* event */ Event, /* ui */ ModalDialogClosingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogClosingUndefined: Self = StObject.set(x, "modalDialogClosing", js.undefined)
    
    @scala.inline
    def setModalDialogContentsRendered(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogContentsRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogContentsRenderedUndefined: Self = StObject.set(x, "modalDialogContentsRendered", js.undefined)
    
    @scala.inline
    def setModalDialogContentsRendering(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogContentsRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogContentsRenderingUndefined: Self = StObject.set(x, "modalDialogContentsRendering", js.undefined)
    
    @scala.inline
    def setModalDialogDropDownAreaWidth(value: Double): Self = StObject.set(x, "modalDialogDropDownAreaWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogDropDownAreaWidthUndefined: Self = StObject.set(x, "modalDialogDropDownAreaWidth", js.undefined)
    
    @scala.inline
    def setModalDialogDropDownButtonCaption(value: String): Self = StObject.set(x, "modalDialogDropDownButtonCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogDropDownButtonCaptionUndefined: Self = StObject.set(x, "modalDialogDropDownButtonCaption", js.undefined)
    
    @scala.inline
    def setModalDialogDropDownLabel(value: String): Self = StObject.set(x, "modalDialogDropDownLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogDropDownLabelUndefined: Self = StObject.set(x, "modalDialogDropDownLabel", js.undefined)
    
    @scala.inline
    def setModalDialogDropDownWidth(value: Double): Self = StObject.set(x, "modalDialogDropDownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogDropDownWidthUndefined: Self = StObject.set(x, "modalDialogDropDownWidth", js.undefined)
    
    @scala.inline
    def setModalDialogGroupByButtonText(value: String): Self = StObject.set(x, "modalDialogGroupByButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogGroupByButtonTextUndefined: Self = StObject.set(x, "modalDialogGroupByButtonText", js.undefined)
    
    @scala.inline
    def setModalDialogGroupByOnClick(value: Boolean): Self = StObject.set(x, "modalDialogGroupByOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogGroupByOnClickUndefined: Self = StObject.set(x, "modalDialogGroupByOnClick", js.undefined)
    
    @scala.inline
    def setModalDialogGroupColumn(value: (/* event */ Event, /* ui */ ModalDialogGroupColumnEventUIParam) => Unit): Self = StObject.set(x, "modalDialogGroupColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogGroupColumnUndefined: Self = StObject.set(x, "modalDialogGroupColumn", js.undefined)
    
    @scala.inline
    def setModalDialogGroupingColumn(value: (/* event */ Event, /* ui */ ModalDialogGroupingColumnEventUIParam) => Unit): Self = StObject.set(x, "modalDialogGroupingColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogGroupingColumnUndefined: Self = StObject.set(x, "modalDialogGroupingColumn", js.undefined)
    
    @scala.inline
    def setModalDialogHeight(value: String | Double): Self = StObject.set(x, "modalDialogHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogHeightUndefined: Self = StObject.set(x, "modalDialogHeight", js.undefined)
    
    @scala.inline
    def setModalDialogMoving(value: (/* event */ Event, /* ui */ ModalDialogMovingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogMoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogMovingUndefined: Self = StObject.set(x, "modalDialogMoving", js.undefined)
    
    @scala.inline
    def setModalDialogOpened(value: (/* event */ Event, /* ui */ ModalDialogOpenedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogOpenedUndefined: Self = StObject.set(x, "modalDialogOpened", js.undefined)
    
    @scala.inline
    def setModalDialogOpening(value: (/* event */ Event, /* ui */ ModalDialogOpeningEventUIParam) => Unit): Self = StObject.set(x, "modalDialogOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogOpeningUndefined: Self = StObject.set(x, "modalDialogOpening", js.undefined)
    
    @scala.inline
    def setModalDialogRootLevelHierarchicalGrid(value: String): Self = StObject.set(x, "modalDialogRootLevelHierarchicalGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogRootLevelHierarchicalGridUndefined: Self = StObject.set(x, "modalDialogRootLevelHierarchicalGrid", js.undefined)
    
    @scala.inline
    def setModalDialogSortGroupedColumn(value: (/* event */ Event, /* ui */ ModalDialogSortGroupedColumnEventUIParam) => Unit): Self = StObject.set(x, "modalDialogSortGroupedColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogSortGroupedColumnUndefined: Self = StObject.set(x, "modalDialogSortGroupedColumn", js.undefined)
    
    @scala.inline
    def setModalDialogUngroupColumn(value: (/* event */ Event, /* ui */ ModalDialogUngroupColumnEventUIParam) => Unit): Self = StObject.set(x, "modalDialogUngroupColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogUngroupColumnUndefined: Self = StObject.set(x, "modalDialogUngroupColumn", js.undefined)
    
    @scala.inline
    def setModalDialogUngroupingColumn(value: (/* event */ Event, /* ui */ ModalDialogUngroupingColumnEventUIParam) => Unit): Self = StObject.set(x, "modalDialogUngroupingColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setModalDialogUngroupingColumnUndefined: Self = StObject.set(x, "modalDialogUngroupingColumn", js.undefined)
    
    @scala.inline
    def setModalDialogWidth(value: String | Double): Self = StObject.set(x, "modalDialogWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalDialogWidthUndefined: Self = StObject.set(x, "modalDialogWidth", js.undefined)
    
    @scala.inline
    def setPagingMode(value: String): Self = StObject.set(x, "pagingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingModeUndefined: Self = StObject.set(x, "pagingMode", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRemoveButtonTooltip(value: String): Self = StObject.set(x, "removeButtonTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveButtonTooltipUndefined: Self = StObject.set(x, "removeButtonTooltip", js.undefined)
    
    @scala.inline
    def setResultResponseKey(value: String): Self = StObject.set(x, "resultResponseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultResponseKeyUndefined: Self = StObject.set(x, "resultResponseKey", js.undefined)
    
    @scala.inline
    def setSummarySettings(value: IgGridGroupBySummarySettings): Self = StObject.set(x, "summarySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummarySettingsUndefined: Self = StObject.set(x, "summarySettings", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseGridColumnFormatter(value: Boolean): Self = StObject.set(x, "useGridColumnFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGridColumnFormatterUndefined: Self = StObject.set(x, "useGridColumnFormatter", js.undefined)
  }
}
