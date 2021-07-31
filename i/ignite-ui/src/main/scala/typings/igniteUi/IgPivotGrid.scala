package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotGrid
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
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
  def apply(): IgPivotGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotGrid]
  }
  
  @scala.inline
  implicit class IgPivotGridMutableBuilder[Self <: IgPivotGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHeaderColumnsSorting(value: Boolean): Self = StObject.set(x, "allowHeaderColumnsSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHeaderColumnsSortingUndefined: Self = StObject.set(x, "allowHeaderColumnsSorting", js.undefined)
    
    @scala.inline
    def setAllowHeaderRowsSorting(value: Boolean): Self = StObject.set(x, "allowHeaderRowsSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHeaderRowsSortingUndefined: Self = StObject.set(x, "allowHeaderRowsSorting", js.undefined)
    
    @scala.inline
    def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
    
    @scala.inline
    def setCompactColumnHeaderIndentation(value: Double): Self = StObject.set(x, "compactColumnHeaderIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactColumnHeaderIndentationUndefined: Self = StObject.set(x, "compactColumnHeaderIndentation", js.undefined)
    
    @scala.inline
    def setCompactColumnHeaders(value: Boolean): Self = StObject.set(x, "compactColumnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactColumnHeadersUndefined: Self = StObject.set(x, "compactColumnHeaders", js.undefined)
    
    @scala.inline
    def setCompactRowHeaderIndentation(value: Double): Self = StObject.set(x, "compactRowHeaderIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactRowHeaderIndentationUndefined: Self = StObject.set(x, "compactRowHeaderIndentation", js.undefined)
    
    @scala.inline
    def setCompactRowHeaders(value: Boolean): Self = StObject.set(x, "compactRowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactRowHeadersUndefined: Self = StObject.set(x, "compactRowHeaders", js.undefined)
    
    @scala.inline
    def setCustomMoveValidation(value: js.Function): Self = StObject.set(x, "customMoveValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMoveValidationUndefined: Self = StObject.set(x, "customMoveValidation", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceInitialized(value: (/* event */ Event, /* ui */ DataSourceInitializedEventUIParam) => Unit): Self = StObject.set(x, "dataSourceInitialized", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataSourceInitializedUndefined: Self = StObject.set(x, "dataSourceInitialized", js.undefined)
    
    @scala.inline
    def setDataSourceOptions(value: IgPivotGridDataSourceOptions): Self = StObject.set(x, "dataSourceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceOptionsUndefined: Self = StObject.set(x, "dataSourceOptions", js.undefined)
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceUpdated(value: (/* event */ Event, /* ui */ DataSourceUpdatedEventUIParam) => Unit): Self = StObject.set(x, "dataSourceUpdated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataSourceUpdatedUndefined: Self = StObject.set(x, "dataSourceUpdated", js.undefined)
    
    @scala.inline
    def setDefaultLevelSortBehavior(value: String): Self = StObject.set(x, "defaultLevelSortBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLevelSortBehaviorUndefined: Self = StObject.set(x, "defaultLevelSortBehavior", js.undefined)
    
    @scala.inline
    def setDefaultRowHeaderWidth(value: Double): Self = StObject.set(x, "defaultRowHeaderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRowHeaderWidthUndefined: Self = StObject.set(x, "defaultRowHeaderWidth", js.undefined)
    
    @scala.inline
    def setDeferUpdate(value: Boolean): Self = StObject.set(x, "deferUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferUpdateUndefined: Self = StObject.set(x, "deferUpdate", js.undefined)
    
    @scala.inline
    def setDisableColumnsDropArea(value: Boolean): Self = StObject.set(x, "disableColumnsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableColumnsDropAreaUndefined: Self = StObject.set(x, "disableColumnsDropArea", js.undefined)
    
    @scala.inline
    def setDisableFiltersDropArea(value: Boolean): Self = StObject.set(x, "disableFiltersDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFiltersDropAreaUndefined: Self = StObject.set(x, "disableFiltersDropArea", js.undefined)
    
    @scala.inline
    def setDisableMeasuresDropArea(value: Boolean): Self = StObject.set(x, "disableMeasuresDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMeasuresDropAreaUndefined: Self = StObject.set(x, "disableMeasuresDropArea", js.undefined)
    
    @scala.inline
    def setDisableRowsDropArea(value: Boolean): Self = StObject.set(x, "disableRowsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRowsDropAreaUndefined: Self = StObject.set(x, "disableRowsDropArea", js.undefined)
    
    @scala.inline
    def setDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragAndDropSettings(value: IgPivotGridDragAndDropSettings): Self = StObject.set(x, "dragAndDropSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragAndDropSettingsUndefined: Self = StObject.set(x, "dragAndDropSettings", js.undefined)
    
    @scala.inline
    def setDragStart(value: (/* event */ Event, /* ui */ DragStartEventUIParam) => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    @scala.inline
    def setDragStop(value: (/* event */ Event, /* ui */ DragStopEventUIParam) => Unit): Self = StObject.set(x, "dragStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDropDownParent(value: js.Any): Self = StObject.set(x, "dropDownParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownParentUndefined: Self = StObject.set(x, "dropDownParent", js.undefined)
    
    @scala.inline
    def setFilterDropDownClosed(value: (/* event */ Event, /* ui */ FilterDropDownClosedEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownClosedUndefined: Self = StObject.set(x, "filterDropDownClosed", js.undefined)
    
    @scala.inline
    def setFilterDropDownClosing(value: (/* event */ Event, /* ui */ FilterDropDownClosingEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownClosingUndefined: Self = StObject.set(x, "filterDropDownClosing", js.undefined)
    
    @scala.inline
    def setFilterDropDownOk(value: (/* event */ Event, /* ui */ FilterDropDownOkEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownOk", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownOkUndefined: Self = StObject.set(x, "filterDropDownOk", js.undefined)
    
    @scala.inline
    def setFilterDropDownOpened(value: (/* event */ Event, /* ui */ FilterDropDownOpenedEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownOpenedUndefined: Self = StObject.set(x, "filterDropDownOpened", js.undefined)
    
    @scala.inline
    def setFilterDropDownOpening(value: (/* event */ Event, /* ui */ FilterDropDownOpeningEventUIParam) => Unit): Self = StObject.set(x, "filterDropDownOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterDropDownOpeningUndefined: Self = StObject.set(x, "filterDropDownOpening", js.undefined)
    
    @scala.inline
    def setFilterMembersLoaded(value: (/* event */ Event, /* ui */ FilterMembersLoadedEventUIParam) => Unit): Self = StObject.set(x, "filterMembersLoaded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterMembersLoadedUndefined: Self = StObject.set(x, "filterMembersLoaded", js.undefined)
    
    @scala.inline
    def setFirstLevelSortDirection(value: js.Any): Self = StObject.set(x, "firstLevelSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLevelSortDirectionUndefined: Self = StObject.set(x, "firstLevelSortDirection", js.undefined)
    
    @scala.inline
    def setFirstSortDirection(value: js.Any): Self = StObject.set(x, "firstSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSortDirectionUndefined: Self = StObject.set(x, "firstSortDirection", js.undefined)
    
    @scala.inline
    def setGridOptions(value: IgPivotGridGridOptions): Self = StObject.set(x, "gridOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridOptionsUndefined: Self = StObject.set(x, "gridOptions", js.undefined)
    
    @scala.inline
    def setHeadersSorted(value: (/* event */ Event, /* ui */ HeadersSortedEventUIParam) => Unit): Self = StObject.set(x, "headersSorted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeadersSortedUndefined: Self = StObject.set(x, "headersSorted", js.undefined)
    
    @scala.inline
    def setHeadersSorting(value: (/* event */ Event, /* ui */ HeadersSortingEventUIParam) => Unit): Self = StObject.set(x, "headersSorting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHeadersSortingUndefined: Self = StObject.set(x, "headersSorting", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHideColumnsDropArea(value: Boolean): Self = StObject.set(x, "hideColumnsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideColumnsDropAreaUndefined: Self = StObject.set(x, "hideColumnsDropArea", js.undefined)
    
    @scala.inline
    def setHideFiltersDropArea(value: Boolean): Self = StObject.set(x, "hideFiltersDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFiltersDropAreaUndefined: Self = StObject.set(x, "hideFiltersDropArea", js.undefined)
    
    @scala.inline
    def setHideMeasuresDropArea(value: Boolean): Self = StObject.set(x, "hideMeasuresDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideMeasuresDropAreaUndefined: Self = StObject.set(x, "hideMeasuresDropArea", js.undefined)
    
    @scala.inline
    def setHideRowsDropArea(value: Boolean): Self = StObject.set(x, "hideRowsDropArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideRowsDropAreaUndefined: Self = StObject.set(x, "hideRowsDropArea", js.undefined)
    
    @scala.inline
    def setIsParentInFrontForColumns(value: Boolean): Self = StObject.set(x, "isParentInFrontForColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsParentInFrontForColumnsUndefined: Self = StObject.set(x, "isParentInFrontForColumns", js.undefined)
    
    @scala.inline
    def setIsParentInFrontForRows(value: Boolean): Self = StObject.set(x, "isParentInFrontForRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsParentInFrontForRowsUndefined: Self = StObject.set(x, "isParentInFrontForRows", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLevelSortDirections(value: js.Array[IgPivotGridLevelSortDirection]): Self = StObject.set(x, "levelSortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelSortDirectionsUndefined: Self = StObject.set(x, "levelSortDirections", js.undefined)
    
    @scala.inline
    def setLevelSortDirectionsVarargs(value: IgPivotGridLevelSortDirection*): Self = StObject.set(x, "levelSortDirections", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMetadataDropped(value: (/* event */ Event, /* ui */ MetadataDroppedEventUIParam) => Unit): Self = StObject.set(x, "metadataDropped", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMetadataDroppedUndefined: Self = StObject.set(x, "metadataDropped", js.undefined)
    
    @scala.inline
    def setMetadataDropping(value: (/* event */ Event, /* ui */ MetadataDroppingEventUIParam) => Unit): Self = StObject.set(x, "metadataDropping", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMetadataDroppingUndefined: Self = StObject.set(x, "metadataDropping", js.undefined)
    
    @scala.inline
    def setMetadataRemoved(value: (/* event */ Event, /* ui */ MetadataRemovedEventUIParam) => Unit): Self = StObject.set(x, "metadataRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMetadataRemovedUndefined: Self = StObject.set(x, "metadataRemoved", js.undefined)
    
    @scala.inline
    def setMetadataRemoving(value: (/* event */ Event, /* ui */ MetadataRemovingEventUIParam) => Unit): Self = StObject.set(x, "metadataRemoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMetadataRemovingUndefined: Self = StObject.set(x, "metadataRemoving", js.undefined)
    
    @scala.inline
    def setPivotGridHeadersRendered(value: (/* event */ Event, /* ui */ PivotGridHeadersRenderedEventUIParam) => Unit): Self = StObject.set(x, "pivotGridHeadersRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPivotGridHeadersRenderedUndefined: Self = StObject.set(x, "pivotGridHeadersRendered", js.undefined)
    
    @scala.inline
    def setPivotGridRendered(value: (/* event */ Event, /* ui */ PivotGridRenderedEventUIParam) => Unit): Self = StObject.set(x, "pivotGridRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPivotGridRenderedUndefined: Self = StObject.set(x, "pivotGridRendered", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRowHeaderLinkGroupIndentation(value: Double): Self = StObject.set(x, "rowHeaderLinkGroupIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeaderLinkGroupIndentationUndefined: Self = StObject.set(x, "rowHeaderLinkGroupIndentation", js.undefined)
    
    @scala.inline
    def setRowHeadersLayout(value: js.Any): Self = StObject.set(x, "rowHeadersLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeadersLayoutUndefined: Self = StObject.set(x, "rowHeadersLayout", js.undefined)
    
    @scala.inline
    def setSorted(value: (/* event */ Event, /* ui */ SortedEventUIParam) => Unit): Self = StObject.set(x, "sorted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    
    @scala.inline
    def setSorting(value: (/* event */ Event, /* ui */ SortingEventUIParam) => Unit): Self = StObject.set(x, "sorting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    @scala.inline
    def setTreeRowHeaderIndentation(value: Double): Self = StObject.set(x, "treeRowHeaderIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeRowHeaderIndentationUndefined: Self = StObject.set(x, "treeRowHeaderIndentation", js.undefined)
    
    @scala.inline
    def setTupleMemberCollapsed(value: (/* event */ Event, /* ui */ TupleMemberCollapsedEventUIParam) => Unit): Self = StObject.set(x, "tupleMemberCollapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTupleMemberCollapsedUndefined: Self = StObject.set(x, "tupleMemberCollapsed", js.undefined)
    
    @scala.inline
    def setTupleMemberCollapsing(value: (/* event */ Event, /* ui */ TupleMemberCollapsingEventUIParam) => Unit): Self = StObject.set(x, "tupleMemberCollapsing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTupleMemberCollapsingUndefined: Self = StObject.set(x, "tupleMemberCollapsing", js.undefined)
    
    @scala.inline
    def setTupleMemberExpanded(value: (/* event */ Event, /* ui */ TupleMemberExpandedEventUIParam) => Unit): Self = StObject.set(x, "tupleMemberExpanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTupleMemberExpandedUndefined: Self = StObject.set(x, "tupleMemberExpanded", js.undefined)
    
    @scala.inline
    def setTupleMemberExpanding(value: (/* event */ Event, /* ui */ TupleMemberExpandingEventUIParam) => Unit): Self = StObject.set(x, "tupleMemberExpanding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTupleMemberExpandingUndefined: Self = StObject.set(x, "tupleMemberExpanding", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
