package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGrid
  extends /**
	 * Option for igPivotGrid
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables sorting of the header cells in columns.
  	 *
  	 */
  var allowHeaderColumnsSorting: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enables sorting of the header cells in rows.
  	 *
  	 */
  var allowHeaderRowsSorting: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enables sorting of the value cells in columns.
  	 *
  	 */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The indentation for every level column when the compactColumnHeaders is set to true.
  	 *
  	 */
  var compactColumnHeaderIndentation: js.UndefOr[Double] = js.undefined
  /**
  	 * A boolean value indicating whether the column headers should be arranged for compact header layout i.e. each hierarchy is in a single row.
  	 *
  	 */
  var compactColumnHeaders: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The indentation for every level row when the rowHeadersLayout is set to 'superCompact'.
  	 *
  	 */
  var compactRowHeaderIndentation: js.UndefOr[Double] = js.undefined
  /**
  	 * A boolean value indicating whether the row headers should be arranged for compact header layout i.e. each hierarchy is in a single column.
  	 *
  	 */
  var compactRowHeaders: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A function that will be called to determine if an item can be moved in or dropped on an area of the pivot grid.
  	 *
  	 * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
  	 * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
  	 * paramType="string" The unique name of the item.
  	 * returnType="bool"  The function must return true if the item should be accepted.
  	 */
  var customMoveValidation: js.UndefOr[js.Function] = js.undefined
  /**
  	 * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after the data source has initialized.
  	 */
  var dataSourceInitialized: js.UndefOr[DataSourceInitializedEvent] = js.undefined
  /**
  	 * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
  	 * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
  	 *
  	 */
  var dataSourceOptions: js.UndefOr[IgPivotGridDataSourceOptions] = js.undefined
  /**
  	 * Fired after the data source has updated.
  	 */
  var dataSourceUpdated: js.UndefOr[DataSourceUpdatedEvent] = js.undefined
  /**
  	 * Specifies the default sort behavior for the levels if no sort behavior is specified in an item from the levelSortDirections option.
  	 *
  	 * Valid values:
  	 * "system" Sorts the headers by a specified sort key.
  	 * "alphabetical" Sorts alphabetically the header captions.
  	 */
  var defaultLevelSortBehavior: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the width of the row headers.
  	 *
  	 */
  var defaultRowHeaderWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Setting deferUpdate to true will not apply changes to the data source until the updateGrid method is called.
  	 *
  	 */
  var deferUpdate: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableColumnsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableFiltersDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableMeasuresDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
  	 *
  	 */
  var disableRowsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Fired on drag. Return false to cancel the drag.
  	 */
  var drag: js.UndefOr[DragEvent] = js.undefined
  /**
  	 * Settings for the drag and drop functionality of the igPivotGrid.
  	 *
  	 */
  var dragAndDropSettings: js.UndefOr[IgPivotGridDragAndDropSettings] = js.undefined
  /**
  	 * Fired on drag start. Return false to cancel the dragging.
  	 */
  var dragStart: js.UndefOr[DragStartEvent] = js.undefined
  /**
  	 * Fired on drag stop.
  	 */
  var dragStop: js.UndefOr[DragStopEvent] = js.undefined
  /**
  	 * Specifies the parent for the drop downs.
  	 */
  var dropDownParent: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after the filter members drop down closes.
  	 */
  var filterDropDownClosed: js.UndefOr[FilterDropDownClosedEvent] = js.undefined
  /**
  	 * Fired before the filter members drop down closes. Return false to cancel the closing.
  	 */
  var filterDropDownClosing: js.UndefOr[FilterDropDownClosingEvent] = js.undefined
  /**
  	 * Fired after the OK button in the filter members drop down is clicked. Return false to cancel the applying of the filters.
  	 */
  var filterDropDownOk: js.UndefOr[FilterDropDownOkEvent] = js.undefined
  /**
  	 * Fired after the filter members drop down opens.
  	 */
  var filterDropDownOpened: js.UndefOr[FilterDropDownOpenedEvent] = js.undefined
  /**
  	 * Fired before the filter members drop down opens. Return false to cancel the opening.
  	 */
  var filterDropDownOpening: js.UndefOr[FilterDropDownOpeningEvent] = js.undefined
  /**
  	 * Fired after the filter members are loaded.
  	 */
  var filterMembersLoaded: js.UndefOr[FilterMembersLoadedEvent] = js.undefined
  /**
  	 * Specifies the default sort direction for the levels if no sort direction is specified in an item from the levelSortDirections option.
  	 *
  	 */
  var firstLevelSortDirection: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies the default sort direction for the rows.
  	 *
  	 */
  var firstSortDirection: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Options specific to the igGrid that will render the pivot grid view.
  	 *
  	 */
  var gridOptions: js.UndefOr[IgPivotGridGridOptions] = js.undefined
  /**
  	 * Fired after the sorting of the headers.
  	 */
  var headersSorted: js.UndefOr[HeadersSortedEvent] = js.undefined
  /**
  	 * Fired before the sorting of the headers. Return false to cancel the sorting.
  	 */
  var headersSorting: js.UndefOr[HeadersSortingEvent] = js.undefined
  /**
  	 * This is the total height of the grid.
  	 *
  	 *
  	 * Valid values:
  	 * "null" Will stretch vertically to fit data, if no other heights are defined
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Hide the columns drop area.
  	 *
  	 */
  var hideColumnsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Hide the filters drop area.
  	 *
  	 */
  var hideFiltersDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Hide the measures drop area.
  	 *
  	 */
  var hideMeasuresDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Hide the rows drop area.
  	 *
  	 */
  var hideRowsDropArea: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A boolean value indicating whether a parent in the columns is in front of its children.
  	 * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
  	 * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 *
  	 */
  var isParentInFrontForColumns: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A boolean value indicating whether a parent in the rows is in front of its children.
  	 * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
  	 * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 *
  	 */
  var isParentInFrontForRows: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * An array of level sort direction items, which predefine the sorted header cells.
  	 *
  	 */
  var levelSortDirections: js.UndefOr[js.Array[IgPivotGridLevelSortDirection]] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after a metadata item drop.
  	 */
  var metadataDropped: js.UndefOr[MetadataDroppedEvent] = js.undefined
  /**
  	 * Fired before a metadata item drop. Return false to cancel the drop.
  	 */
  var metadataDropping: js.UndefOr[MetadataDroppingEvent] = js.undefined
  /**
  	 * Fired after a metadata item is removed when the user clicks the close icon.
  	 */
  var metadataRemoved: js.UndefOr[MetadataRemovedEvent] = js.undefined
  /**
  	 * Fired before a metadata item is removed when the user clicks the close icon. Return false to cancel the removing.
  	 */
  var metadataRemoving: js.UndefOr[MetadataRemovingEvent] = js.undefined
  /**
  	 * Event fired after the headers have been rendered.
  	 */
  var pivotGridHeadersRendered: js.UndefOr[PivotGridHeadersRenderedEvent] = js.undefined
  /**
  	 * Event fired after the whole grid widget has been rendered (including headers, footers, etc.).
  	 */
  var pivotGridRendered: js.UndefOr[PivotGridRenderedEvent] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Use it when you set rowHeadersLayout to "tree". This property will set a margin between the level's caption and the next level's (underlined text) caption.
  	 */
  var rowHeaderLinkGroupIndentation: js.UndefOr[Double] = js.undefined
  /**
  	 * A value indicating whether the layout that row headers should be arranged.standard Each hierarchy in the rows is displayed in a separate column. The child members of a member in the rows are displayed on its right.
  	 * superCompact Each hierarchy in the rows is displayed in a separate column. The child members of a member in the rows are displayed on above or below it (Depending on the isParentInFrontForRows setting).
  	 * tree All hierarchies in the rows are displayed in a tree-like structure in a single column (The column's width is dependent on the defaultRowHEaderWidth, which can be set to "null" to enable the built-in auto-sizing functionality).
  	 *
  	 *
  	 * Valid values:
  	 * "standard"
  	 * "superCompact"
  	 * "tree"
  	 */
  var rowHeadersLayout: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after the sorting of the columns.
  	 */
  var sorted: js.UndefOr[SortedEvent] = js.undefined
  /**
  	 * Fired before the sorting of the columns. Return false to cancel the sorting.
  	 */
  var sorting: js.UndefOr[SortingEvent] = js.undefined
  /**
  	 * The indentation for the neighboring hierarchy's level row when the rowHeaderLayout is set to 'tree'.
  	 */
  var treeRowHeaderIndentation: js.UndefOr[Double] = js.undefined
  /**
  	 * Fired after the collapse of the tuple member.
  	 */
  var tupleMemberCollapsed: js.UndefOr[TupleMemberCollapsedEvent] = js.undefined
  /**
  	 * Fired before the collapse of the tuple member. Return false to cancel the collapsing.
  	 */
  var tupleMemberCollapsing: js.UndefOr[TupleMemberCollapsingEvent] = js.undefined
  /**
  	 * Fired after the expand of the tuple member.
  	 */
  var tupleMemberExpanded: js.UndefOr[TupleMemberExpandedEvent] = js.undefined
  /**
  	 * Fired before the expand of the tuple member. Return false to cancel the expanding.
  	 */
  var tupleMemberExpanding: js.UndefOr[TupleMemberExpandingEvent] = js.undefined
  /**
  	 *
  	 *
  	 * Valid values:
  	 * "null" Will stretch to fit the data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgPivotGrid {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igPivotGrid
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowHeaderColumnsSorting: js.UndefOr[Boolean] = js.undefined,
    allowHeaderRowsSorting: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    compactColumnHeaderIndentation: Int | Double = null,
    compactColumnHeaders: js.UndefOr[Boolean] = js.undefined,
    compactRowHeaderIndentation: Int | Double = null,
    compactRowHeaders: js.UndefOr[Boolean] = js.undefined,
    customMoveValidation: js.Function = null,
    dataSource: js.Any = null,
    dataSourceInitialized: DataSourceInitializedEvent = null,
    dataSourceOptions: IgPivotGridDataSourceOptions = null,
    dataSourceUpdated: DataSourceUpdatedEvent = null,
    defaultLevelSortBehavior: String = null,
    defaultRowHeaderWidth: Int | Double = null,
    deferUpdate: js.UndefOr[Boolean] = js.undefined,
    disableColumnsDropArea: js.UndefOr[Boolean] = js.undefined,
    disableFiltersDropArea: js.UndefOr[Boolean] = js.undefined,
    disableMeasuresDropArea: js.UndefOr[Boolean] = js.undefined,
    disableRowsDropArea: js.UndefOr[Boolean] = js.undefined,
    drag: DragEvent = null,
    dragAndDropSettings: IgPivotGridDragAndDropSettings = null,
    dragStart: DragStartEvent = null,
    dragStop: DragStopEvent = null,
    dropDownParent: js.Any = null,
    filterDropDownClosed: FilterDropDownClosedEvent = null,
    filterDropDownClosing: FilterDropDownClosingEvent = null,
    filterDropDownOk: FilterDropDownOkEvent = null,
    filterDropDownOpened: FilterDropDownOpenedEvent = null,
    filterDropDownOpening: FilterDropDownOpeningEvent = null,
    filterMembersLoaded: FilterMembersLoadedEvent = null,
    firstLevelSortDirection: js.Any = null,
    firstSortDirection: js.Any = null,
    gridOptions: IgPivotGridGridOptions = null,
    headersSorted: HeadersSortedEvent = null,
    headersSorting: HeadersSortingEvent = null,
    height: String | Double = null,
    hideColumnsDropArea: js.UndefOr[Boolean] = js.undefined,
    hideFiltersDropArea: js.UndefOr[Boolean] = js.undefined,
    hideMeasuresDropArea: js.UndefOr[Boolean] = js.undefined,
    hideRowsDropArea: js.UndefOr[Boolean] = js.undefined,
    isParentInFrontForColumns: js.UndefOr[Boolean] = js.undefined,
    isParentInFrontForRows: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    levelSortDirections: js.Array[IgPivotGridLevelSortDirection] = null,
    locale: js.Any = null,
    metadataDropped: MetadataDroppedEvent = null,
    metadataDropping: MetadataDroppingEvent = null,
    metadataRemoved: MetadataRemovedEvent = null,
    metadataRemoving: MetadataRemovingEvent = null,
    pivotGridHeadersRendered: PivotGridHeadersRenderedEvent = null,
    pivotGridRendered: PivotGridRenderedEvent = null,
    regional: String | js.Object = null,
    rowHeaderLinkGroupIndentation: Int | Double = null,
    rowHeadersLayout: js.Any = null,
    sorted: SortedEvent = null,
    sorting: SortingEvent = null,
    treeRowHeaderIndentation: Int | Double = null,
    tupleMemberCollapsed: TupleMemberCollapsedEvent = null,
    tupleMemberCollapsing: TupleMemberCollapsingEvent = null,
    tupleMemberExpanded: TupleMemberExpandedEvent = null,
    tupleMemberExpanding: TupleMemberExpandingEvent = null,
    width: String | Double = null
  ): IgPivotGrid = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowHeaderColumnsSorting)) __obj.updateDynamic("allowHeaderColumnsSorting")(allowHeaderColumnsSorting)
    if (!js.isUndefined(allowHeaderRowsSorting)) __obj.updateDynamic("allowHeaderRowsSorting")(allowHeaderRowsSorting)
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting)
    if (compactColumnHeaderIndentation != null) __obj.updateDynamic("compactColumnHeaderIndentation")(compactColumnHeaderIndentation.asInstanceOf[js.Any])
    if (!js.isUndefined(compactColumnHeaders)) __obj.updateDynamic("compactColumnHeaders")(compactColumnHeaders)
    if (compactRowHeaderIndentation != null) __obj.updateDynamic("compactRowHeaderIndentation")(compactRowHeaderIndentation.asInstanceOf[js.Any])
    if (!js.isUndefined(compactRowHeaders)) __obj.updateDynamic("compactRowHeaders")(compactRowHeaders)
    if (customMoveValidation != null) __obj.updateDynamic("customMoveValidation")(customMoveValidation)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceInitialized != null) __obj.updateDynamic("dataSourceInitialized")(dataSourceInitialized)
    if (dataSourceOptions != null) __obj.updateDynamic("dataSourceOptions")(dataSourceOptions)
    if (dataSourceUpdated != null) __obj.updateDynamic("dataSourceUpdated")(dataSourceUpdated)
    if (defaultLevelSortBehavior != null) __obj.updateDynamic("defaultLevelSortBehavior")(defaultLevelSortBehavior)
    if (defaultRowHeaderWidth != null) __obj.updateDynamic("defaultRowHeaderWidth")(defaultRowHeaderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(deferUpdate)) __obj.updateDynamic("deferUpdate")(deferUpdate)
    if (!js.isUndefined(disableColumnsDropArea)) __obj.updateDynamic("disableColumnsDropArea")(disableColumnsDropArea)
    if (!js.isUndefined(disableFiltersDropArea)) __obj.updateDynamic("disableFiltersDropArea")(disableFiltersDropArea)
    if (!js.isUndefined(disableMeasuresDropArea)) __obj.updateDynamic("disableMeasuresDropArea")(disableMeasuresDropArea)
    if (!js.isUndefined(disableRowsDropArea)) __obj.updateDynamic("disableRowsDropArea")(disableRowsDropArea)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragAndDropSettings != null) __obj.updateDynamic("dragAndDropSettings")(dragAndDropSettings)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (dragStop != null) __obj.updateDynamic("dragStop")(dragStop)
    if (dropDownParent != null) __obj.updateDynamic("dropDownParent")(dropDownParent)
    if (filterDropDownClosed != null) __obj.updateDynamic("filterDropDownClosed")(filterDropDownClosed)
    if (filterDropDownClosing != null) __obj.updateDynamic("filterDropDownClosing")(filterDropDownClosing)
    if (filterDropDownOk != null) __obj.updateDynamic("filterDropDownOk")(filterDropDownOk)
    if (filterDropDownOpened != null) __obj.updateDynamic("filterDropDownOpened")(filterDropDownOpened)
    if (filterDropDownOpening != null) __obj.updateDynamic("filterDropDownOpening")(filterDropDownOpening)
    if (filterMembersLoaded != null) __obj.updateDynamic("filterMembersLoaded")(filterMembersLoaded)
    if (firstLevelSortDirection != null) __obj.updateDynamic("firstLevelSortDirection")(firstLevelSortDirection)
    if (firstSortDirection != null) __obj.updateDynamic("firstSortDirection")(firstSortDirection)
    if (gridOptions != null) __obj.updateDynamic("gridOptions")(gridOptions)
    if (headersSorted != null) __obj.updateDynamic("headersSorted")(headersSorted)
    if (headersSorting != null) __obj.updateDynamic("headersSorting")(headersSorting)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideColumnsDropArea)) __obj.updateDynamic("hideColumnsDropArea")(hideColumnsDropArea)
    if (!js.isUndefined(hideFiltersDropArea)) __obj.updateDynamic("hideFiltersDropArea")(hideFiltersDropArea)
    if (!js.isUndefined(hideMeasuresDropArea)) __obj.updateDynamic("hideMeasuresDropArea")(hideMeasuresDropArea)
    if (!js.isUndefined(hideRowsDropArea)) __obj.updateDynamic("hideRowsDropArea")(hideRowsDropArea)
    if (!js.isUndefined(isParentInFrontForColumns)) __obj.updateDynamic("isParentInFrontForColumns")(isParentInFrontForColumns)
    if (!js.isUndefined(isParentInFrontForRows)) __obj.updateDynamic("isParentInFrontForRows")(isParentInFrontForRows)
    if (language != null) __obj.updateDynamic("language")(language)
    if (levelSortDirections != null) __obj.updateDynamic("levelSortDirections")(levelSortDirections)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (metadataDropped != null) __obj.updateDynamic("metadataDropped")(metadataDropped)
    if (metadataDropping != null) __obj.updateDynamic("metadataDropping")(metadataDropping)
    if (metadataRemoved != null) __obj.updateDynamic("metadataRemoved")(metadataRemoved)
    if (metadataRemoving != null) __obj.updateDynamic("metadataRemoving")(metadataRemoving)
    if (pivotGridHeadersRendered != null) __obj.updateDynamic("pivotGridHeadersRendered")(pivotGridHeadersRendered)
    if (pivotGridRendered != null) __obj.updateDynamic("pivotGridRendered")(pivotGridRendered)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rowHeaderLinkGroupIndentation != null) __obj.updateDynamic("rowHeaderLinkGroupIndentation")(rowHeaderLinkGroupIndentation.asInstanceOf[js.Any])
    if (rowHeadersLayout != null) __obj.updateDynamic("rowHeadersLayout")(rowHeadersLayout)
    if (sorted != null) __obj.updateDynamic("sorted")(sorted)
    if (sorting != null) __obj.updateDynamic("sorting")(sorting)
    if (treeRowHeaderIndentation != null) __obj.updateDynamic("treeRowHeaderIndentation")(treeRowHeaderIndentation.asInstanceOf[js.Any])
    if (tupleMemberCollapsed != null) __obj.updateDynamic("tupleMemberCollapsed")(tupleMemberCollapsed)
    if (tupleMemberCollapsing != null) __obj.updateDynamic("tupleMemberCollapsing")(tupleMemberCollapsing)
    if (tupleMemberExpanded != null) __obj.updateDynamic("tupleMemberExpanded")(tupleMemberExpanded)
    if (tupleMemberExpanding != null) __obj.updateDynamic("tupleMemberExpanding")(tupleMemberExpanding)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotGrid]
  }
}

