package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPivotGrid
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Enables sorting of the header cells in columns.
    *
    */
  var allowHeaderColumnsSorting: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables sorting of the header cells in rows.
    *
    */
  var allowHeaderRowsSorting: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables sorting of the value cells in columns.
    *
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  
  /**
    * The indentation for every level column when the compactColumnHeaders is set to true.
    *
    */
  var compactColumnHeaderIndentation: js.UndefOr[Double] = js.native
  
  /**
    * A boolean value indicating whether the column headers should be arranged for compact header layout i.e. each hierarchy is in a single row.
    *
    */
  var compactColumnHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * The indentation for every level row when the rowHeadersLayout is set to 'superCompact'.
    *
    */
  var compactRowHeaderIndentation: js.UndefOr[Double] = js.native
  
  /**
    * A boolean value indicating whether the row headers should be arranged for compact header layout i.e. each hierarchy is in a single column.
    *
    */
  var compactRowHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that will be called to determine if an item can be moved in or dropped on an area of the pivot grid.
    *
    * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
    * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
    * paramType="string" The unique name of the item.
    * returnType="bool"  The function must return true if the item should be accepted.
    */
  var customMoveValidation: js.UndefOr[js.Function] = js.native
  
  /**
    * An instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after the data source has initialized.
    */
  var dataSourceInitialized: js.UndefOr[DataSourceInitializedEvent] = js.native
  
  /**
    * An object that will be used to create an instance of $.ig.OlapXmlaDataSource or $.ig.OlapFlatDataSource.
    * The provided value must contain an object with settings for one of the data source types - xmlaOptions or flatDataOptions.
    *
    */
  var dataSourceOptions: js.UndefOr[IgPivotGridDataSourceOptions] = js.native
  
  /**
    * Fired after the data source has updated.
    */
  var dataSourceUpdated: js.UndefOr[DataSourceUpdatedEvent] = js.native
  
  /**
    * Specifies the default sort behavior for the levels if no sort behavior is specified in an item from the levelSortDirections option.
    *
    * Valid values:
    * "system" Sorts the headers by a specified sort key.
    * "alphabetical" Sorts alphabetically the header captions.
    */
  var defaultLevelSortBehavior: js.UndefOr[String] = js.native
  
  /**
    * Specifies the width of the row headers.
    *
    */
  var defaultRowHeaderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Setting deferUpdate to true will not apply changes to the data source until the updateGrid method is called.
    *
    */
  var deferUpdate: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableColumnsDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableFiltersDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableMeasuresDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
    *
    */
  var disableRowsDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired on drag. Return false to cancel the drag.
    */
  var drag: js.UndefOr[DragEvent] = js.native
  
  /**
    * Settings for the drag and drop functionality of the igPivotGrid.
    *
    */
  var dragAndDropSettings: js.UndefOr[IgPivotGridDragAndDropSettings] = js.native
  
  /**
    * Fired on drag start. Return false to cancel the dragging.
    */
  var dragStart: js.UndefOr[DragStartEvent] = js.native
  
  /**
    * Fired on drag stop.
    */
  var dragStop: js.UndefOr[DragStopEvent] = js.native
  
  /**
    * Specifies the parent for the drop downs.
    */
  var dropDownParent: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after the filter members drop down closes.
    */
  var filterDropDownClosed: js.UndefOr[FilterDropDownClosedEvent] = js.native
  
  /**
    * Fired before the filter members drop down closes. Return false to cancel the closing.
    */
  var filterDropDownClosing: js.UndefOr[FilterDropDownClosingEvent] = js.native
  
  /**
    * Fired after the OK button in the filter members drop down is clicked. Return false to cancel the applying of the filters.
    */
  var filterDropDownOk: js.UndefOr[FilterDropDownOkEvent] = js.native
  
  /**
    * Fired after the filter members drop down opens.
    */
  var filterDropDownOpened: js.UndefOr[FilterDropDownOpenedEvent] = js.native
  
  /**
    * Fired before the filter members drop down opens. Return false to cancel the opening.
    */
  var filterDropDownOpening: js.UndefOr[FilterDropDownOpeningEvent] = js.native
  
  /**
    * Fired after the filter members are loaded.
    */
  var filterMembersLoaded: js.UndefOr[FilterMembersLoadedEvent] = js.native
  
  /**
    * Specifies the default sort direction for the levels if no sort direction is specified in an item from the levelSortDirections option.
    *
    */
  var firstLevelSortDirection: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies the default sort direction for the rows.
    *
    */
  var firstSortDirection: js.UndefOr[js.Any] = js.native
  
  /**
    * Options specific to the igGrid that will render the pivot grid view.
    *
    */
  var gridOptions: js.UndefOr[IgPivotGridGridOptions] = js.native
  
  /**
    * Fired after the sorting of the headers.
    */
  var headersSorted: js.UndefOr[HeadersSortedEvent] = js.native
  
  /**
    * Fired before the sorting of the headers. Return false to cancel the sorting.
    */
  var headersSorting: js.UndefOr[HeadersSortingEvent] = js.native
  
  /**
    * This is the total height of the grid.
    *
    *
    * Valid values:
    * "null" Will stretch vertically to fit data, if no other heights are defined
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Hide the columns drop area.
    *
    */
  var hideColumnsDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Hide the filters drop area.
    *
    */
  var hideFiltersDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Hide the measures drop area.
    *
    */
  var hideMeasuresDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * Hide the rows drop area.
    *
    */
  var hideRowsDropArea: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean value indicating whether a parent in the columns is in front of its children.
    * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
    * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    *
    */
  var isParentInFrontForColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean value indicating whether a parent in the rows is in front of its children.
    * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
    * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
    *
    */
  var isParentInFrontForRows: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * An array of level sort direction items, which predefine the sorted header cells.
    *
    */
  var levelSortDirections: js.UndefOr[js.Array[IgPivotGridLevelSortDirection]] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after a metadata item drop.
    */
  var metadataDropped: js.UndefOr[MetadataDroppedEvent] = js.native
  
  /**
    * Fired before a metadata item drop. Return false to cancel the drop.
    */
  var metadataDropping: js.UndefOr[MetadataDroppingEvent] = js.native
  
  /**
    * Fired after a metadata item is removed when the user clicks the close icon.
    */
  var metadataRemoved: js.UndefOr[MetadataRemovedEvent] = js.native
  
  /**
    * Fired before a metadata item is removed when the user clicks the close icon. Return false to cancel the removing.
    */
  var metadataRemoving: js.UndefOr[MetadataRemovingEvent] = js.native
  
  /**
    * Event fired after the headers have been rendered.
    */
  var pivotGridHeadersRendered: js.UndefOr[PivotGridHeadersRenderedEvent] = js.native
  
  /**
    * Event fired after the whole grid widget has been rendered (including headers, footers, etc.).
    */
  var pivotGridRendered: js.UndefOr[PivotGridRenderedEvent] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Use it when you set rowHeadersLayout to "tree". This property will set a margin between the level's caption and the next level's (underlined text) caption.
    */
  var rowHeaderLinkGroupIndentation: js.UndefOr[Double] = js.native
  
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
  var rowHeadersLayout: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after the sorting of the columns.
    */
  var sorted: js.UndefOr[SortedEvent] = js.native
  
  /**
    * Fired before the sorting of the columns. Return false to cancel the sorting.
    */
  var sorting: js.UndefOr[SortingEvent] = js.native
  
  /**
    * The indentation for the neighboring hierarchy's level row when the rowHeaderLayout is set to 'tree'.
    */
  var treeRowHeaderIndentation: js.UndefOr[Double] = js.native
  
  /**
    * Fired after the collapse of the tuple member.
    */
  var tupleMemberCollapsed: js.UndefOr[TupleMemberCollapsedEvent] = js.native
  
  /**
    * Fired before the collapse of the tuple member. Return false to cancel the collapsing.
    */
  var tupleMemberCollapsing: js.UndefOr[TupleMemberCollapsingEvent] = js.native
  
  /**
    * Fired after the expand of the tuple member.
    */
  var tupleMemberExpanded: js.UndefOr[TupleMemberExpandedEvent] = js.native
  
  /**
    * Fired before the expand of the tuple member. Return false to cancel the expanding.
    */
  var tupleMemberExpanding: js.UndefOr[TupleMemberExpandingEvent] = js.native
  
  /**
    *
    *
    * Valid values:
    * "null" Will stretch to fit the data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgPivotGrid {
  
  @scala.inline
  def apply(): IgPivotGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGrid]
  }
  
  @scala.inline
  implicit class IgPivotGridOps[Self <: IgPivotGrid] (val x: Self) extends AnyVal {
    
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
    def setAllowHeaderColumnsSorting(value: Boolean): Self = this.set("allowHeaderColumnsSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHeaderColumnsSorting: Self = this.set("allowHeaderColumnsSorting", js.undefined)
    
    @scala.inline
    def setAllowHeaderRowsSorting(value: Boolean): Self = this.set("allowHeaderRowsSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHeaderRowsSorting: Self = this.set("allowHeaderRowsSorting", js.undefined)
    
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    
    @scala.inline
    def setCompactColumnHeaderIndentation(value: Double): Self = this.set("compactColumnHeaderIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompactColumnHeaderIndentation: Self = this.set("compactColumnHeaderIndentation", js.undefined)
    
    @scala.inline
    def setCompactColumnHeaders(value: Boolean): Self = this.set("compactColumnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompactColumnHeaders: Self = this.set("compactColumnHeaders", js.undefined)
    
    @scala.inline
    def setCompactRowHeaderIndentation(value: Double): Self = this.set("compactRowHeaderIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompactRowHeaderIndentation: Self = this.set("compactRowHeaderIndentation", js.undefined)
    
    @scala.inline
    def setCompactRowHeaders(value: Boolean): Self = this.set("compactRowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompactRowHeaders: Self = this.set("compactRowHeaders", js.undefined)
    
    @scala.inline
    def setCustomMoveValidation(value: js.Function): Self = this.set("customMoveValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMoveValidation: Self = this.set("customMoveValidation", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceInitialized(value: (/* event */ Event, /* ui */ DataSourceInitializedEventUIParam) => Unit): Self = this.set("dataSourceInitialized", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDataSourceInitialized: Self = this.set("dataSourceInitialized", js.undefined)
    
    @scala.inline
    def setDataSourceOptions(value: IgPivotGridDataSourceOptions): Self = this.set("dataSourceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceOptions: Self = this.set("dataSourceOptions", js.undefined)
    
    @scala.inline
    def setDataSourceUpdated(value: (/* event */ Event, /* ui */ DataSourceUpdatedEventUIParam) => Unit): Self = this.set("dataSourceUpdated", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDataSourceUpdated: Self = this.set("dataSourceUpdated", js.undefined)
    
    @scala.inline
    def setDefaultLevelSortBehavior(value: String): Self = this.set("defaultLevelSortBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLevelSortBehavior: Self = this.set("defaultLevelSortBehavior", js.undefined)
    
    @scala.inline
    def setDefaultRowHeaderWidth(value: Double): Self = this.set("defaultRowHeaderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRowHeaderWidth: Self = this.set("defaultRowHeaderWidth", js.undefined)
    
    @scala.inline
    def setDeferUpdate(value: Boolean): Self = this.set("deferUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferUpdate: Self = this.set("deferUpdate", js.undefined)
    
    @scala.inline
    def setDisableColumnsDropArea(value: Boolean): Self = this.set("disableColumnsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableColumnsDropArea: Self = this.set("disableColumnsDropArea", js.undefined)
    
    @scala.inline
    def setDisableFiltersDropArea(value: Boolean): Self = this.set("disableFiltersDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFiltersDropArea: Self = this.set("disableFiltersDropArea", js.undefined)
    
    @scala.inline
    def setDisableMeasuresDropArea(value: Boolean): Self = this.set("disableMeasuresDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMeasuresDropArea: Self = this.set("disableMeasuresDropArea", js.undefined)
    
    @scala.inline
    def setDisableRowsDropArea(value: Boolean): Self = this.set("disableRowsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRowsDropArea: Self = this.set("disableRowsDropArea", js.undefined)
    
    @scala.inline
    def setDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = this.set("drag", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragAndDropSettings(value: IgPivotGridDragAndDropSettings): Self = this.set("dragAndDropSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragAndDropSettings: Self = this.set("dragAndDropSettings", js.undefined)
    
    @scala.inline
    def setDragStart(value: (/* event */ Event, /* ui */ DragStartEventUIParam) => Unit): Self = this.set("dragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setDragStop(value: (/* event */ Event, /* ui */ DragStopEventUIParam) => Unit): Self = this.set("dragStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDragStop: Self = this.set("dragStop", js.undefined)
    
    @scala.inline
    def setDropDownParent(value: js.Any): Self = this.set("dropDownParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownParent: Self = this.set("dropDownParent", js.undefined)
    
    @scala.inline
    def setFilterDropDownClosed(value: (/* event */ Event, /* ui */ FilterDropDownClosedEventUIParam) => Unit): Self = this.set("filterDropDownClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownClosed: Self = this.set("filterDropDownClosed", js.undefined)
    
    @scala.inline
    def setFilterDropDownClosing(value: (/* event */ Event, /* ui */ FilterDropDownClosingEventUIParam) => Unit): Self = this.set("filterDropDownClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownClosing: Self = this.set("filterDropDownClosing", js.undefined)
    
    @scala.inline
    def setFilterDropDownOk(value: (/* event */ Event, /* ui */ FilterDropDownOkEventUIParam) => Unit): Self = this.set("filterDropDownOk", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownOk: Self = this.set("filterDropDownOk", js.undefined)
    
    @scala.inline
    def setFilterDropDownOpened(value: (/* event */ Event, /* ui */ FilterDropDownOpenedEventUIParam) => Unit): Self = this.set("filterDropDownOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownOpened: Self = this.set("filterDropDownOpened", js.undefined)
    
    @scala.inline
    def setFilterDropDownOpening(value: (/* event */ Event, /* ui */ FilterDropDownOpeningEventUIParam) => Unit): Self = this.set("filterDropDownOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterDropDownOpening: Self = this.set("filterDropDownOpening", js.undefined)
    
    @scala.inline
    def setFilterMembersLoaded(value: (/* event */ Event, /* ui */ FilterMembersLoadedEventUIParam) => Unit): Self = this.set("filterMembersLoaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterMembersLoaded: Self = this.set("filterMembersLoaded", js.undefined)
    
    @scala.inline
    def setFirstLevelSortDirection(value: js.Any): Self = this.set("firstLevelSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLevelSortDirection: Self = this.set("firstLevelSortDirection", js.undefined)
    
    @scala.inline
    def setFirstSortDirection(value: js.Any): Self = this.set("firstSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstSortDirection: Self = this.set("firstSortDirection", js.undefined)
    
    @scala.inline
    def setGridOptions(value: IgPivotGridGridOptions): Self = this.set("gridOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridOptions: Self = this.set("gridOptions", js.undefined)
    
    @scala.inline
    def setHeadersSorted(value: (/* event */ Event, /* ui */ HeadersSortedEventUIParam) => Unit): Self = this.set("headersSorted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeadersSorted: Self = this.set("headersSorted", js.undefined)
    
    @scala.inline
    def setHeadersSorting(value: (/* event */ Event, /* ui */ HeadersSortingEventUIParam) => Unit): Self = this.set("headersSorting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeadersSorting: Self = this.set("headersSorting", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHideColumnsDropArea(value: Boolean): Self = this.set("hideColumnsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideColumnsDropArea: Self = this.set("hideColumnsDropArea", js.undefined)
    
    @scala.inline
    def setHideFiltersDropArea(value: Boolean): Self = this.set("hideFiltersDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFiltersDropArea: Self = this.set("hideFiltersDropArea", js.undefined)
    
    @scala.inline
    def setHideMeasuresDropArea(value: Boolean): Self = this.set("hideMeasuresDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideMeasuresDropArea: Self = this.set("hideMeasuresDropArea", js.undefined)
    
    @scala.inline
    def setHideRowsDropArea(value: Boolean): Self = this.set("hideRowsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideRowsDropArea: Self = this.set("hideRowsDropArea", js.undefined)
    
    @scala.inline
    def setIsParentInFrontForColumns(value: Boolean): Self = this.set("isParentInFrontForColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsParentInFrontForColumns: Self = this.set("isParentInFrontForColumns", js.undefined)
    
    @scala.inline
    def setIsParentInFrontForRows(value: Boolean): Self = this.set("isParentInFrontForRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsParentInFrontForRows: Self = this.set("isParentInFrontForRows", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLevelSortDirectionsVarargs(value: IgPivotGridLevelSortDirection*): Self = this.set("levelSortDirections", js.Array(value :_*))
    
    @scala.inline
    def setLevelSortDirections(value: js.Array[IgPivotGridLevelSortDirection]): Self = this.set("levelSortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelSortDirections: Self = this.set("levelSortDirections", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMetadataDropped(value: (/* event */ Event, /* ui */ MetadataDroppedEventUIParam) => Unit): Self = this.set("metadataDropped", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMetadataDropped: Self = this.set("metadataDropped", js.undefined)
    
    @scala.inline
    def setMetadataDropping(value: (/* event */ Event, /* ui */ MetadataDroppingEventUIParam) => Unit): Self = this.set("metadataDropping", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMetadataDropping: Self = this.set("metadataDropping", js.undefined)
    
    @scala.inline
    def setMetadataRemoved(value: (/* event */ Event, /* ui */ MetadataRemovedEventUIParam) => Unit): Self = this.set("metadataRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMetadataRemoved: Self = this.set("metadataRemoved", js.undefined)
    
    @scala.inline
    def setMetadataRemoving(value: (/* event */ Event, /* ui */ MetadataRemovingEventUIParam) => Unit): Self = this.set("metadataRemoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMetadataRemoving: Self = this.set("metadataRemoving", js.undefined)
    
    @scala.inline
    def setPivotGridHeadersRendered(value: (/* event */ Event, /* ui */ PivotGridHeadersRenderedEventUIParam) => Unit): Self = this.set("pivotGridHeadersRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePivotGridHeadersRendered: Self = this.set("pivotGridHeadersRendered", js.undefined)
    
    @scala.inline
    def setPivotGridRendered(value: (/* event */ Event, /* ui */ PivotGridRenderedEventUIParam) => Unit): Self = this.set("pivotGridRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePivotGridRendered: Self = this.set("pivotGridRendered", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setRowHeaderLinkGroupIndentation(value: Double): Self = this.set("rowHeaderLinkGroupIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeaderLinkGroupIndentation: Self = this.set("rowHeaderLinkGroupIndentation", js.undefined)
    
    @scala.inline
    def setRowHeadersLayout(value: js.Any): Self = this.set("rowHeadersLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeadersLayout: Self = this.set("rowHeadersLayout", js.undefined)
    
    @scala.inline
    def setSorted(value: (/* event */ Event, /* ui */ SortedEventUIParam) => Unit): Self = this.set("sorted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSorted: Self = this.set("sorted", js.undefined)
    
    @scala.inline
    def setSorting(value: (/* event */ Event, /* ui */ SortingEventUIParam) => Unit): Self = this.set("sorting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    
    @scala.inline
    def setTreeRowHeaderIndentation(value: Double): Self = this.set("treeRowHeaderIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeRowHeaderIndentation: Self = this.set("treeRowHeaderIndentation", js.undefined)
    
    @scala.inline
    def setTupleMemberCollapsed(value: (/* event */ Event, /* ui */ TupleMemberCollapsedEventUIParam) => Unit): Self = this.set("tupleMemberCollapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTupleMemberCollapsed: Self = this.set("tupleMemberCollapsed", js.undefined)
    
    @scala.inline
    def setTupleMemberCollapsing(value: (/* event */ Event, /* ui */ TupleMemberCollapsingEventUIParam) => Unit): Self = this.set("tupleMemberCollapsing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTupleMemberCollapsing: Self = this.set("tupleMemberCollapsing", js.undefined)
    
    @scala.inline
    def setTupleMemberExpanded(value: (/* event */ Event, /* ui */ TupleMemberExpandedEventUIParam) => Unit): Self = this.set("tupleMemberExpanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTupleMemberExpanded: Self = this.set("tupleMemberExpanded", js.undefined)
    
    @scala.inline
    def setTupleMemberExpanding(value: (/* event */ Event, /* ui */ TupleMemberExpandingEventUIParam) => Unit): Self = this.set("tupleMemberExpanding", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTupleMemberExpanding: Self = this.set("tupleMemberExpanding", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
