package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridGroupBy
  extends /**
	 * Option for igGridGroupBy
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the collapse indicator tooltip for grouped rows. Use option [locale.collapseTooltip](ui.iggridgroupby#options:locale.collapseTooltip).
  	 */
  var collapseTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Configures individual column settings.
  	 *
  	 */
  var columnSettings: js.UndefOr[IgGridGroupByColumnSettings] = js.undefined
  /**
  	 * default sort order - ascending or descending
  	 *
  	 *
  	 * Valid values:
  	 * "asc" The group is sorted in ascending order.
  	 * "desc" The group is sorted in descending order.
  	 */
  var defaultSortingDirection: js.UndefOr[String] = js.undefined
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog. Checkout the [Extending igGrid Modal Dialog](http://www.igniteui.com/help/extending-iggrid-modal-dialog) topic for details.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for the hyperlink which opens the GroupBy Dialog. Use option [locale.emptyGroupByAreaContentSelectColumnsCaption](ui.iggridgroupby#options:locale.emptyGroupByAreaContentSelectColumnsCaption).
  	 */
  var emptyGroupByAreaContentSelectColumnsCaption: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the expand indicator tooltip for grouped rows. Use option [locale.expandTooltip](ui.iggridgroupby#options:locale.expandTooltip).
  	 */
  var expandTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies if grouped rows will have an expander image that will allow end users to expand and collapse them. This option can be set only at initialization.
  	 *
  	 */
  var expansionIndicatorVisibility: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Sets the place in the grid where the GroupBy area will be
  	 *
  	 *
  	 * Valid values:
  	 * "top" the GroupBy area will be rendered above the grid headers
  	 * "hidden" the GroupBy area will not be rendered
  	 * "bottom" the GroupBy area will be rendered below the grid footer (and above the pager, if any)
  	 */
  var groupByAreaVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Controls containment behavior for the GroupBy Dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "owner" The GroupBy Dialog will be draggable only in the grid area
  	 * "window" The GroupBy Dialog will be draggable in the whole window area
  	 */
  var groupByDialogContainment: js.UndefOr[String] = js.undefined
  /**
  	 * By default, the column width for the header is taken. If this is specified it's used for all headers.
  	 *
  	 */
  var groupByLabelWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * URL param name which specifies a GroupBy [expression](ig.datasource#options:settings.sorting.expressions). When groupByUrlKey, [groupByUrlKeyAscValue](ui.iggridgroupby#options:groupByUrlKeyAscValue) and [groupByUrlKeyDescValue](ui.iggridgroupby#options:groupByUrlKeyDescValue) are set the request looks like: ?<groupByUrlKey>(<columnKey>)=<groupByUrlKeyAscValue/groupByUrlKeyDescValue> (Example: ?groupby(col1)=asc). Otherwise the OData conventions for sorting params are used.
  	 *
  	 */
  var groupByUrlKey: js.UndefOr[String] = js.undefined
  /**
  	 * URL param value denoting ascending grouping. When [groupByUrlKey](ui.iggridgroupby#options:groupByUrlKey), groupByUrlKeyAscValue and [groupByUrlKeyDescValue](ui.iggridgroupby#options:groupByUrlKeyDescValue) are set the request looks like: ?<groupByUrlKey>(<columnKey>)=<groupByUrlKeyAscValue/groupByUrlKeyDescValue> (Example: ?groupby(col1)=asc). Otherwise the OData conventions for sorting params are used.
  	 *
  	 */
  var groupByUrlKeyAscValue: js.UndefOr[String] = js.undefined
  /**
  	 * URL param value denoting descending grouping. When [groupByUrlKey](ui.iggridgroupby#options:groupByUrlKey), [groupByUrlKeyAscValue](ui.iggridgroupby#options:groupByUrlKeyAscValue) and groupByUrlKeyDescValue are set the request looks like: ?<groupByUrlKey>(<columnKey>)=<groupByUrlKeyAscValue/groupByUrlKeyDescValue> (Example: ?groupby(col1)=asc). Otherwise the OData conventions for sorting params are used.
  	 *
  	 */
  var groupByUrlKeyDescValue: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies default summaries that will appear when grouping by a column on the bottom of each group as a row.This option has a lower priority than the groupSummaries defined under columnSettings for each column.
  	 * All default summaries are defined under $.ig.util.defaultSummaryMethods
  	 *
  	 */
  var groupSummaries: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies the groupSummaries postion inside each group.
  	 *
  	 *
  	 * Valid values:
  	 * "top" One summary row will be displayed at the top for each group
  	 * "bottom"  One summary row will be displayed at the bottom for each group
  	 * "both" Two summary rows will be be display for each group. One on the top and one on the bottom.
  	 */
  var groupSummariesPosition: js.UndefOr[String] = js.undefined
  /**
  	 * Returns the list of currently grouped columns. The option is read-only and cannot be set at initialization or at runtime.
  	 *
  	 */
  var groupedColumns: js.UndefOr[js.Array[IgGridGroupByGroupedColumn]] = js.undefined
  /**
  	 * Event which is fired when the groupedColumns collection has changed. This event is fired also when group/ungroup from GroupBy modal dialog but key, layout and grid are not set
  	 */
  var groupedColumnsChanged: js.UndefOr[GroupedColumnsChangedEvent] = js.undefined
  /**
  	 * Event which is fired when the grouped columns collection is about to change. This event is fired even when button OK is clicked from the modal dialog(after event modalDialogButtonApplyClick is fired)
  	 */
  var groupedColumnsChanging: js.UndefOr[GroupedColumnsChangingEvent] = js.undefined
  /**
  	 * Template for the grouped row's text. Variables available for the template are ${key}, ${val} and ${count}.
  	 *
  	 */
  var groupedRowTextTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the indentation for a grouped row. If several columns are grouped, the total indentation will grow
  	 *
  	 */
  var indentation: js.UndefOr[Double] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies if after grouping, the grouped rows will be initially expanded or collapsed.
  	 *
  	 */
  var initialExpand: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies the opacity of the drag markup, while a column header is being dragged. The value must be between 0 and 1.
  	 *
  	 */
  var labelDragHelperOpacity: js.UndefOr[Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[IgGridGroupByLocale] = js.undefined
  /**
  	 * Specifies time in milliseconds for animation duration to show/hide modal dialog
  	 *
  	 */
  var modalDialogAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Event fired when the button is Apply is clicked.
  	 */
  var modalDialogButtonApplyClick: js.UndefOr[ModalDialogButtonApplyClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancel changes in the GroupBy Dialog. Use option [locale.modalDialogButtonApplyText](ui.iggridgroupby#options:locale.modalDialogButtonApplyText).
  	 */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancel changes in the GroupBy Dialog. Use option [locale.modalDialogButtonCancelText](ui.iggridgroupby#options:locale.modalDialogButtonCancelText).
  	 */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired when reset button is clicked.
  	 */
  var modalDialogButtonResetClick: js.UndefOr[ModalDialogButtonResetClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each ascending sorted column in GroupBy Dialog. Use option [locale.modalDialogCaptionButtonAsc](ui.iggridgroupby#options:locale.modalDialogCaptionButtonAsc).
  	 */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each descending sorted column in GroupBy Dialog. Use option [locale.modalDialogCaptionButtonDesc](ui.iggridgroupby#options:locale.modalDialogCaptionButtonDesc).
  	 */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption button ungroup in GroupBy Dialog. Use option [locale.modalDialogCaptionButtonUngroup](ui.iggridgroupby#options:locale.modalDialogCaptionButtonUngroup).
  	 */
  var modalDialogCaptionButtonUngroup: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for the GroupBy Dialog. Use option [locale.modalDialogCaptionText](ui.iggridgroupby#options:locale.modalDialogCaptionText).
  	 */
  var modalDialogCaptionText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies label for "Clear all" button in the GroupBy Dialog. Use option [locale.modalDialogClearAllButtonLabel](ui.iggridgroupby#options:locale.modalDialogClearAllButtonLabel).
  	 */
  var modalDialogClearAllButtonLabel: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after the modal dialog has been closed.
  	 */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.undefined
  /**
  	 * Event fired before the modal dialog is closed.
  	 */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.undefined
  /**
  	 * Event fired after the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.undefined
  /**
  	 * Event fired before the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.undefined
  /**
  	 * Specifies width of layouts dropdown in the GroupBy Dialog
  	 *
  	 */
  var modalDialogDropDownAreaWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption of layouts dropdown button in the GroupBy Dialog. Use option [locale.modalDialogDropDownButtonCaption](ui.iggridgroupby#options:locale.modalDialogDropDownButtonCaption).
  	 */
  var modalDialogDropDownButtonCaption: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies label for layouts dropdown in the GroupBy Dialog.  Use option [locale.modalDialogDropDownLabel](ui.iggridgroupby#options:locale.modalDialogDropDownLabel).
  	 */
  var modalDialogDropDownLabel: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies width of layouts dropdown in the GroupBy Dialog
  	 *
  	 */
  var modalDialogDropDownWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text of GroupBy button in the GroupBy Dialog. Use option [locale.modalDialogGroupByButtonText](ui.iggridgroupby#options:locale.modalDialogGroupByButtonText).
  	 */
  var modalDialogGroupByButtonText: js.UndefOr[String] = js.undefined
  /**
  	 * Enables/disables immediate column grouping/ungrouping. When false operation is delayed until after "Apply" button is clicked by the user.
  	 *
  	 */
  var modalDialogGroupByOnClick: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired when column in modal dialog is clicked to be grouped.
  	 */
  var modalDialogGroupColumn: js.UndefOr[ModalDialogGroupColumnEvent] = js.undefined
  /**
  	 * Event fired when column in modal dialog is clicked to be grouped.
  	 */
  var modalDialogGroupingColumn: js.UndefOr[ModalDialogGroupingColumnEvent] = js.undefined
  /**
  	 * Specifies height of the GroupBy Dialog
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog height can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
  	 * "number" The dialog height can be set in pixels as a number. Example values: 800, 700.
  	 */
  var modalDialogHeight: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Event fired every time the GroupBy Dialog changes its position.
  	 */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.undefined
  /**
  	 * Event fired after the modal dialog is already opened.
  	 */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.undefined
  /**
  	 * Event fired before the modal dialog is opened.
  	 */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption of layouts dropdown button in the GroupBy Dialog. Use option [locale.modalDialogRootLevelHierarchicalGrid](ui.iggridgroupby#options:locale.modalDialogRootLevelHierarchicalGrid).
  	 */
  var modalDialogRootLevelHierarchicalGrid: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired when column in modal dialog is sorted.
  	 */
  var modalDialogSortGroupedColumn: js.UndefOr[ModalDialogSortGroupedColumnEvent] = js.undefined
  /**
  	 * Event fired when column in modal dialog is clicked to be ungrouped.
  	 */
  var modalDialogUngroupColumn: js.UndefOr[ModalDialogUngroupColumnEvent] = js.undefined
  /**
  	 * Event fired when column in modal dialog is clicked to be ungrouped.
  	 */
  var modalDialogUngroupingColumn: js.UndefOr[ModalDialogUngroupingColumnEvent] = js.undefined
  /**
  	 * Specifies width of the GroupBy Dialog
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog width can be set in pixels (px) or percentage (%). Example values: "800px", "800" (defaults to pixels), "100%".
  	 * "number" The dialog width can be set in pixels as a number. Example values: 800, 700.
  	 */
  var modalDialogWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Specifies when paging is applied and there is at least one grouped column which records should be included in page processing.
  	 *
  	 *
  	 * Valid values:
  	 * "allRecords" All records are included in page processing - data records and group-by metadata records
  	 * "dataRecordsOnly" Only data records are included in page processing(metadata group-by records are ignored)
  	 */
  var pagingMode: js.UndefOr[String] = js.undefined
  /**
  	 * Enables / disables GroupBy persistence between states. Checkout the [GroupBy Persistence](http://www.igniteui.com/help/iggrid-groupby-overview#groupBy-persistence) topic for details.
  	 *
  	 */
  var persist: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the tooltip for the remove button. Use option [locale.removeButtonTooltip](ui.iggridgroupby#options:locale.removeButtonTooltip).
  	 */
  var removeButtonTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies a key to get group by data from the remote response.
  	 *
  	 */
  var resultResponseKey: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the settings for GroupBy summaries.
  	 *
  	 */
  var summarySettings: js.UndefOr[IgGridGroupBySummarySettings] = js.undefined
  /**
  	 * Specifies whether the GroupBy operation takes place locally on client-side or remotely on server-side.
  	 *
  	 *
  	 * Valid values:
  	 * "local" Execute the GroupBy operation locally on client-side.
  	 * "remote" Execute the GroupBy operation by a request to the server.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
  /**
  	 * Format grouped column using the formatter set in [igGrid.columns.formatter](ui.iggrid#options:columns.formatter) or [igGrid.columns.format](ui.iggrid#options:columns.format).
  	 *
  	 */
  var useGridColumnFormatter: js.UndefOr[Boolean] = js.undefined
}

object IgGridGroupBy {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridGroupBy
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    collapseTooltip: String = null,
    columnSettings: IgGridGroupByColumnSettings = null,
    defaultSortingDirection: String = null,
    dialogWidget: String = null,
    emptyGroupByAreaContentSelectColumnsCaption: String = null,
    expandTooltip: String = null,
    expansionIndicatorVisibility: js.UndefOr[Boolean] = js.undefined,
    groupByAreaVisibility: String = null,
    groupByDialogContainment: String = null,
    groupByLabelWidth: Int | Double = null,
    groupByUrlKey: String = null,
    groupByUrlKeyAscValue: String = null,
    groupByUrlKeyDescValue: String = null,
    groupSummaries: js.Any = null,
    groupSummariesPosition: String = null,
    groupedColumns: js.Array[IgGridGroupByGroupedColumn] = null,
    groupedColumnsChanged: (/* event */ Event, /* ui */ GroupedColumnsChangedEventUIParam) => Unit = null,
    groupedColumnsChanging: (/* event */ Event, /* ui */ GroupedColumnsChangingEventUIParam) => Unit = null,
    groupedRowTextTemplate: String = null,
    indentation: Int | Double = null,
    inherit: js.UndefOr[Boolean] = js.undefined,
    initialExpand: js.UndefOr[Boolean] = js.undefined,
    labelDragHelperOpacity: Int | Double = null,
    language: String = null,
    locale: IgGridGroupByLocale = null,
    modalDialogAnimationDuration: Int | Double = null,
    modalDialogButtonApplyClick: (/* event */ Event, /* ui */ ModalDialogButtonApplyClickEventUIParam) => Unit = null,
    modalDialogButtonApplyText: String = null,
    modalDialogButtonCancelText: String = null,
    modalDialogButtonResetClick: (/* event */ Event, /* ui */ ModalDialogButtonResetClickEventUIParam) => Unit = null,
    modalDialogCaptionButtonAsc: String = null,
    modalDialogCaptionButtonDesc: String = null,
    modalDialogCaptionButtonUngroup: String = null,
    modalDialogCaptionText: String = null,
    modalDialogClearAllButtonLabel: String = null,
    modalDialogClosed: (/* event */ Event, /* ui */ ModalDialogClosedEventUIParam) => Unit = null,
    modalDialogClosing: (/* event */ Event, /* ui */ ModalDialogClosingEventUIParam) => Unit = null,
    modalDialogContentsRendered: (/* event */ Event, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit = null,
    modalDialogContentsRendering: (/* event */ Event, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit = null,
    modalDialogDropDownAreaWidth: Int | Double = null,
    modalDialogDropDownButtonCaption: String = null,
    modalDialogDropDownLabel: String = null,
    modalDialogDropDownWidth: Int | Double = null,
    modalDialogGroupByButtonText: String = null,
    modalDialogGroupByOnClick: js.UndefOr[Boolean] = js.undefined,
    modalDialogGroupColumn: (/* event */ Event, /* ui */ ModalDialogGroupColumnEventUIParam) => Unit = null,
    modalDialogGroupingColumn: (/* event */ Event, /* ui */ ModalDialogGroupingColumnEventUIParam) => Unit = null,
    modalDialogHeight: String | Double = null,
    modalDialogMoving: (/* event */ Event, /* ui */ ModalDialogMovingEventUIParam) => Unit = null,
    modalDialogOpened: (/* event */ Event, /* ui */ ModalDialogOpenedEventUIParam) => Unit = null,
    modalDialogOpening: (/* event */ Event, /* ui */ ModalDialogOpeningEventUIParam) => Unit = null,
    modalDialogRootLevelHierarchicalGrid: String = null,
    modalDialogSortGroupedColumn: (/* event */ Event, /* ui */ ModalDialogSortGroupedColumnEventUIParam) => Unit = null,
    modalDialogUngroupColumn: (/* event */ Event, /* ui */ ModalDialogUngroupColumnEventUIParam) => Unit = null,
    modalDialogUngroupingColumn: (/* event */ Event, /* ui */ ModalDialogUngroupingColumnEventUIParam) => Unit = null,
    modalDialogWidth: String | Double = null,
    pagingMode: String = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    regional: String | js.Object = null,
    removeButtonTooltip: String = null,
    resultResponseKey: String = null,
    summarySettings: IgGridGroupBySummarySettings = null,
    `type`: String = null,
    useGridColumnFormatter: js.UndefOr[Boolean] = js.undefined
  ): IgGridGroupBy = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collapseTooltip != null) __obj.updateDynamic("collapseTooltip")(collapseTooltip)
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings)
    if (defaultSortingDirection != null) __obj.updateDynamic("defaultSortingDirection")(defaultSortingDirection)
    if (dialogWidget != null) __obj.updateDynamic("dialogWidget")(dialogWidget)
    if (emptyGroupByAreaContentSelectColumnsCaption != null) __obj.updateDynamic("emptyGroupByAreaContentSelectColumnsCaption")(emptyGroupByAreaContentSelectColumnsCaption)
    if (expandTooltip != null) __obj.updateDynamic("expandTooltip")(expandTooltip)
    if (!js.isUndefined(expansionIndicatorVisibility)) __obj.updateDynamic("expansionIndicatorVisibility")(expansionIndicatorVisibility)
    if (groupByAreaVisibility != null) __obj.updateDynamic("groupByAreaVisibility")(groupByAreaVisibility)
    if (groupByDialogContainment != null) __obj.updateDynamic("groupByDialogContainment")(groupByDialogContainment)
    if (groupByLabelWidth != null) __obj.updateDynamic("groupByLabelWidth")(groupByLabelWidth.asInstanceOf[js.Any])
    if (groupByUrlKey != null) __obj.updateDynamic("groupByUrlKey")(groupByUrlKey)
    if (groupByUrlKeyAscValue != null) __obj.updateDynamic("groupByUrlKeyAscValue")(groupByUrlKeyAscValue)
    if (groupByUrlKeyDescValue != null) __obj.updateDynamic("groupByUrlKeyDescValue")(groupByUrlKeyDescValue)
    if (groupSummaries != null) __obj.updateDynamic("groupSummaries")(groupSummaries)
    if (groupSummariesPosition != null) __obj.updateDynamic("groupSummariesPosition")(groupSummariesPosition)
    if (groupedColumns != null) __obj.updateDynamic("groupedColumns")(groupedColumns)
    if (groupedColumnsChanged != null) __obj.updateDynamic("groupedColumnsChanged")(js.Any.fromFunction2(groupedColumnsChanged))
    if (groupedColumnsChanging != null) __obj.updateDynamic("groupedColumnsChanging")(js.Any.fromFunction2(groupedColumnsChanging))
    if (groupedRowTextTemplate != null) __obj.updateDynamic("groupedRowTextTemplate")(groupedRowTextTemplate)
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (!js.isUndefined(initialExpand)) __obj.updateDynamic("initialExpand")(initialExpand)
    if (labelDragHelperOpacity != null) __obj.updateDynamic("labelDragHelperOpacity")(labelDragHelperOpacity.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (modalDialogAnimationDuration != null) __obj.updateDynamic("modalDialogAnimationDuration")(modalDialogAnimationDuration.asInstanceOf[js.Any])
    if (modalDialogButtonApplyClick != null) __obj.updateDynamic("modalDialogButtonApplyClick")(js.Any.fromFunction2(modalDialogButtonApplyClick))
    if (modalDialogButtonApplyText != null) __obj.updateDynamic("modalDialogButtonApplyText")(modalDialogButtonApplyText)
    if (modalDialogButtonCancelText != null) __obj.updateDynamic("modalDialogButtonCancelText")(modalDialogButtonCancelText)
    if (modalDialogButtonResetClick != null) __obj.updateDynamic("modalDialogButtonResetClick")(js.Any.fromFunction2(modalDialogButtonResetClick))
    if (modalDialogCaptionButtonAsc != null) __obj.updateDynamic("modalDialogCaptionButtonAsc")(modalDialogCaptionButtonAsc)
    if (modalDialogCaptionButtonDesc != null) __obj.updateDynamic("modalDialogCaptionButtonDesc")(modalDialogCaptionButtonDesc)
    if (modalDialogCaptionButtonUngroup != null) __obj.updateDynamic("modalDialogCaptionButtonUngroup")(modalDialogCaptionButtonUngroup)
    if (modalDialogCaptionText != null) __obj.updateDynamic("modalDialogCaptionText")(modalDialogCaptionText)
    if (modalDialogClearAllButtonLabel != null) __obj.updateDynamic("modalDialogClearAllButtonLabel")(modalDialogClearAllButtonLabel)
    if (modalDialogClosed != null) __obj.updateDynamic("modalDialogClosed")(js.Any.fromFunction2(modalDialogClosed))
    if (modalDialogClosing != null) __obj.updateDynamic("modalDialogClosing")(js.Any.fromFunction2(modalDialogClosing))
    if (modalDialogContentsRendered != null) __obj.updateDynamic("modalDialogContentsRendered")(js.Any.fromFunction2(modalDialogContentsRendered))
    if (modalDialogContentsRendering != null) __obj.updateDynamic("modalDialogContentsRendering")(js.Any.fromFunction2(modalDialogContentsRendering))
    if (modalDialogDropDownAreaWidth != null) __obj.updateDynamic("modalDialogDropDownAreaWidth")(modalDialogDropDownAreaWidth.asInstanceOf[js.Any])
    if (modalDialogDropDownButtonCaption != null) __obj.updateDynamic("modalDialogDropDownButtonCaption")(modalDialogDropDownButtonCaption)
    if (modalDialogDropDownLabel != null) __obj.updateDynamic("modalDialogDropDownLabel")(modalDialogDropDownLabel)
    if (modalDialogDropDownWidth != null) __obj.updateDynamic("modalDialogDropDownWidth")(modalDialogDropDownWidth.asInstanceOf[js.Any])
    if (modalDialogGroupByButtonText != null) __obj.updateDynamic("modalDialogGroupByButtonText")(modalDialogGroupByButtonText)
    if (!js.isUndefined(modalDialogGroupByOnClick)) __obj.updateDynamic("modalDialogGroupByOnClick")(modalDialogGroupByOnClick)
    if (modalDialogGroupColumn != null) __obj.updateDynamic("modalDialogGroupColumn")(js.Any.fromFunction2(modalDialogGroupColumn))
    if (modalDialogGroupingColumn != null) __obj.updateDynamic("modalDialogGroupingColumn")(js.Any.fromFunction2(modalDialogGroupingColumn))
    if (modalDialogHeight != null) __obj.updateDynamic("modalDialogHeight")(modalDialogHeight.asInstanceOf[js.Any])
    if (modalDialogMoving != null) __obj.updateDynamic("modalDialogMoving")(js.Any.fromFunction2(modalDialogMoving))
    if (modalDialogOpened != null) __obj.updateDynamic("modalDialogOpened")(js.Any.fromFunction2(modalDialogOpened))
    if (modalDialogOpening != null) __obj.updateDynamic("modalDialogOpening")(js.Any.fromFunction2(modalDialogOpening))
    if (modalDialogRootLevelHierarchicalGrid != null) __obj.updateDynamic("modalDialogRootLevelHierarchicalGrid")(modalDialogRootLevelHierarchicalGrid)
    if (modalDialogSortGroupedColumn != null) __obj.updateDynamic("modalDialogSortGroupedColumn")(js.Any.fromFunction2(modalDialogSortGroupedColumn))
    if (modalDialogUngroupColumn != null) __obj.updateDynamic("modalDialogUngroupColumn")(js.Any.fromFunction2(modalDialogUngroupColumn))
    if (modalDialogUngroupingColumn != null) __obj.updateDynamic("modalDialogUngroupingColumn")(js.Any.fromFunction2(modalDialogUngroupingColumn))
    if (modalDialogWidth != null) __obj.updateDynamic("modalDialogWidth")(modalDialogWidth.asInstanceOf[js.Any])
    if (pagingMode != null) __obj.updateDynamic("pagingMode")(pagingMode)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (removeButtonTooltip != null) __obj.updateDynamic("removeButtonTooltip")(removeButtonTooltip)
    if (resultResponseKey != null) __obj.updateDynamic("resultResponseKey")(resultResponseKey)
    if (summarySettings != null) __obj.updateDynamic("summarySettings")(summarySettings)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useGridColumnFormatter)) __obj.updateDynamic("useGridColumnFormatter")(useGridColumnFormatter)
    __obj.asInstanceOf[IgGridGroupBy]
  }
}

