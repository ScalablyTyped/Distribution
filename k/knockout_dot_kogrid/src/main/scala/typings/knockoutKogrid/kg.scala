package typings.knockoutKogrid

import typings.jquery.JQueryGenericPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kg {
  
  trait ColumnDef extends StObject {
    
    /** Appends a css class for the column cells */
    var cellClass: js.UndefOr[String] = js.undefined
    
    /**
      * A function which takes the value of the cell and returns the display value. Useful when your data model has an underlying value which you need to convert to a human readable format.
      * @param val 
      * @returns the display value
      * @example function(unixTimeTicks) { return new Date(unixTimeTicks); }
      */
    var cellFormatter: js.UndefOr[js.Function1[/* val */ Any, String]] = js.undefined
    
    /**Sets the cell template for the column. See github wiki for more details.*/
    var cellTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.undefined
    
    /** Sets the pretty display name of the column. default is the field given */
    var displayName: js.UndefOr[String] = js.undefined
    
    /** The string name of the property in your data model you want that column to represent. Can also be a property path on your data model. 'foo.bar.myField', 'Name.First', etc.. */
    var field: String
    
    /** Sets the template for the column header cell. See github wiki for more details. */
    var headerCellTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.undefined
    
    /** Appends a css class for the column header. */
    var headerClass: js.UndefOr[String] = js.undefined
    
    /**Sets the maximum width of the column.*/
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /**Whether or not column is resizable. */
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the sort function for the column. Useful when you have data that is formatted in an unusal way or if you want to sort on an underlying data type. Example: function(a,b){return a > b} */
    var sortFn: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Double]] = js.undefined
    
    /**Whether or not column is sortable. */
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the width of the column. Can be a fixed width in pixels as an int (42), string px('42px'), percentage string ('42%'), weighted asterisks (width divided by total number of *'s is all column definition widths) See github wiki for more details. */
    var width: js.UndefOr[String] = js.undefined
  }
  object ColumnDef {
    
    inline def apply(field: String): ColumnDef = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnDef] (val x: Self) extends AnyVal {
      
      inline def setCellClass(value: String): Self = StObject.set(x, "cellClass", value.asInstanceOf[js.Any])
      
      inline def setCellClassUndefined: Self = StObject.set(x, "cellClass", js.undefined)
      
      inline def setCellFormatter(value: /* val */ Any => String): Self = StObject.set(x, "cellFormatter", js.Any.fromFunction1(value))
      
      inline def setCellFormatterUndefined: Self = StObject.set(x, "cellFormatter", js.undefined)
      
      inline def setCellTemplate(value: String | JQueryGenericPromise[String]): Self = StObject.set(x, "cellTemplate", value.asInstanceOf[js.Any])
      
      inline def setCellTemplateUndefined: Self = StObject.set(x, "cellTemplate", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setHeaderCellTemplate(value: String | JQueryGenericPromise[String]): Self = StObject.set(x, "headerCellTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderCellTemplateUndefined: Self = StObject.set(x, "headerCellTemplate", js.undefined)
      
      inline def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassUndefined: Self = StObject.set(x, "headerClass", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setSortFn(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sortFn", js.Any.fromFunction2(value))
      
      inline def setSortFnUndefined: Self = StObject.set(x, "sortFn", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.knockoutKogrid.knockoutKogridStrings.asc
    - typings.knockoutKogrid.knockoutKogridStrings.desc
  */
  trait Direction extends StObject
  object Direction {
    
    inline def asc: typings.knockoutKogrid.knockoutKogridStrings.asc = "asc".asInstanceOf[typings.knockoutKogrid.knockoutKogridStrings.asc]
    
    inline def desc: typings.knockoutKogrid.knockoutKogridStrings.desc = "desc".asInstanceOf[typings.knockoutKogrid.knockoutKogridStrings.desc]
  }
  
  trait DomUtilityService extends StObject {
    
    def BuildStyles(grid: Grid[Any]): Unit
    
    def UpdateGridLayout(grid: Grid[Any]): Unit
  }
  object DomUtilityService {
    
    inline def apply(BuildStyles: Grid[Any] => Unit, UpdateGridLayout: Grid[Any] => Unit): DomUtilityService = {
      val __obj = js.Dynamic.literal(BuildStyles = js.Any.fromFunction1(BuildStyles), UpdateGridLayout = js.Any.fromFunction1(UpdateGridLayout))
      __obj.asInstanceOf[DomUtilityService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomUtilityService] (val x: Self) extends AnyVal {
      
      inline def setBuildStyles(value: Grid[Any] => Unit): Self = StObject.set(x, "BuildStyles", js.Any.fromFunction1(value))
      
      inline def setUpdateGridLayout(value: Grid[Any] => Unit): Self = StObject.set(x, "UpdateGridLayout", js.Any.fromFunction1(value))
    }
  }
  
  trait FilterOptions extends StObject {
    
    /** Variable to contain the current search filter */
    var filterText: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
      ] = js.undefined
    
    /** Number of seconds to throttle before reapplying search */
    var filterThrottle: js.UndefOr[Double] = js.undefined
    
    /** Is the filtering internal or does it require a server visit. You should subscribe to filterText to refresh */
    var useExternalFilter: js.UndefOr[Boolean] = js.undefined
  }
  object FilterOptions {
    
    inline def apply(): FilterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterOptions] (val x: Self) extends AnyVal {
      
      inline def setFilterText(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ Any
      ): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
      
      inline def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
      
      inline def setFilterThrottle(value: Double): Self = StObject.set(x, "filterThrottle", value.asInstanceOf[js.Any])
      
      inline def setFilterThrottleUndefined: Self = StObject.set(x, "filterThrottle", js.undefined)
      
      inline def setUseExternalFilter(value: Boolean): Self = StObject.set(x, "useExternalFilter", value.asInstanceOf[js.Any])
      
      inline def setUseExternalFilterUndefined: Self = StObject.set(x, "useExternalFilter", js.undefined)
    }
  }
  
  trait Grid[EntityType] extends StObject {
    
    @JSName("$$selectionPhase")
    var DollarDollarselectionPhase: Boolean
    
    var config: GridOptions[EntityType]
    
    def configureColumnWidths(): Unit
    
    var rowFactory: RowFactory[EntityType]
    
    var selectionService: SelectionService[EntityType]
  }
  object Grid {
    
    inline def apply[EntityType](
      DollarDollarselectionPhase: Boolean,
      config: GridOptions[EntityType],
      configureColumnWidths: () => Unit,
      rowFactory: RowFactory[EntityType],
      selectionService: SelectionService[EntityType]
    ): Grid[EntityType] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configureColumnWidths = js.Any.fromFunction0(configureColumnWidths), rowFactory = rowFactory.asInstanceOf[js.Any], selectionService = selectionService.asInstanceOf[js.Any])
      __obj.updateDynamic("$$selectionPhase")(DollarDollarselectionPhase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grid[EntityType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Grid[?], EntityType] (val x: Self & Grid[EntityType]) extends AnyVal {
      
      inline def setConfig(value: GridOptions[EntityType]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigureColumnWidths(value: () => Unit): Self = StObject.set(x, "configureColumnWidths", js.Any.fromFunction0(value))
      
      inline def setDollarDollarselectionPhase(value: Boolean): Self = StObject.set(x, "$$selectionPhase", value.asInstanceOf[js.Any])
      
      inline def setRowFactory(value: RowFactory[EntityType]): Self = StObject.set(x, "rowFactory", value.asInstanceOf[js.Any])
      
      inline def setSelectionService(value: SelectionService[EntityType]): Self = StObject.set(x, "selectionService", value.asInstanceOf[js.Any])
    }
  }
  
  trait GridOptions[EntityType] extends StObject {
    
    /** Callback for when you want to validate something after selection. */
    var afterSelectionChange: js.UndefOr[js.Function1[/* row */ Row[EntityType], Unit]] = js.undefined
    
    /** Callback if you want to inspect something before selection,
      return false if you want to cancel the selection. return true otherwise.
      If you need to wait for an async call to proceed with selection you can
      use rowItem.changeSelection(event) method after returning false initially.
      Note: when shift+ Selecting multiple items in the grid this will only get called
      once and the rowItem will be an array of items that are queued to be selected. */
    var beforeSelectionChange: js.UndefOr[js.Function1[/* row */ Row[EntityType], Boolean]] = js.undefined
    
    /** To be able to have selectable rows in grid. */
    var canSelectRows: js.UndefOr[Boolean] = js.undefined
    
    /** definitions of columns as an array [], if not defined columns are auto-generated. See github wiki for more details. */
    var columnDefs: js.UndefOr[
        js.Array[ColumnDef] | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<Array<ColumnDef>> */ Any)
      ] = js.undefined
    
    /** Column width of columns in grid. */
    var columnWidth: js.UndefOr[Double] = js.undefined
    
    /** Data being displayed in the grid. Each item in the array is mapped to a row being displayed. */
    var data: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<EntityType> */ Any
      ] = js.undefined
    
    /** Row selection check boxes appear as the first column. */
    var displaySelectionCheckbox: Boolean
    
    /** Enable or disable resizing of columns */
    var enableColumnResize: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the server-side paging feature */
    var enablePaging: js.UndefOr[Boolean] = js.undefined
    
    /** Enable drag and drop row reordering. Only works in HTML5 compliant browsers. */
    var enableRowReordering: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables sorting in grid. */
    var enableSorting: js.UndefOr[Boolean] = js.undefined
    
    /** filterOptions -
      filterText: The text bound to the built-in search box.
      useExternalFilter: Bypass internal filtering if you want to roll your own filtering mechanism but want to use builtin search box.
      */
    var filterOptions: js.UndefOr[FilterOptions] = js.undefined
    
    /** Defining the height of the footer in pixels. */
    var footerRowHeight: js.UndefOr[Double] = js.undefined
    
    /** Show or hide the footer alltogether the footer is enabled by default */
    var footerVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Initial fields to group data by. Array of field names, not displayName. */
    var groups: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The height of the header row in pixels. */
    var headerRowHeight: js.UndefOr[Double] = js.undefined
    
    /** Define a header row template for further customization. See github wiki for more details. */
    var headerRowTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.undefined
    
    /** Enables the use of jquery UI reaggable/droppable plugin. requires jqueryUI to work if enabled.
      Useful if you want drag + drop but your users insist on crappy browsers. */
    var jqueryUIDraggable: js.UndefOr[Boolean] = js.undefined
    
    /** Enable the use jqueryUIThemes */
    var jqueryUITheme: js.UndefOr[Boolean] = js.undefined
    
    /** Prevent unselections when in single selection mode. */
    var keepLastSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Maintains the column widths while resizing.
      Defaults to true when using *'s or undefined widths. Can be ovverriden by setting to false. */
    var maintainColumnRatios: js.UndefOr[Any] = js.undefined
    
    /** Set this to false if you only want one item selected at a time */
    var multiSelect: js.UndefOr[Boolean] = js.undefined
    
    /**  pagingOptions - */
    var pagingOptions: js.UndefOr[PagingOptions] = js.undefined
    
    /** Array of plugin functions to register in ng-grid */
    var plugins: js.UndefOr[js.Array[Plugin[EntityType]]] = js.undefined
    
    /** Row height of rows in grid. */
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    /** Define a row template to customize output. See github wiki for more details. */
    var rowTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.undefined
    
    /** Defines the binding to select all at once */
    var selectAllState: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
      ] = js.undefined
    
    /** Disable row selections by clicking on the row and only when the checkbox is clicked. */
    var selectWithCheckboxOnly: js.UndefOr[Boolean] = js.undefined
    
    /** all of the items selected in the grid. In single select mode there will only be one item in the array. */
    var selectedItems: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ Any
      ] = js.undefined
    
    /** Enables menu to choose which columns to display and group by.
      If both showColumnMenu and showFilter are false the menu button will not display.*/
    var showColumnMenu: js.UndefOr[Boolean] = js.undefined
    
    /** Enables display of the filterbox in the column menu.
      If both showColumnMenu and showFilter are false the menu button will not display.*/
    var showFilter: js.UndefOr[Boolean] = js.undefined
    
    /** Show the dropzone for drag and drop grouping */
    var showGroupPanel: js.UndefOr[Boolean] = js.undefined
    
    /** Define a sortInfo object to specify a default sorting state.
      You can also observe this variable to utilize server-side sorting (see useExternalSorting).
      Syntax is sortinfo: { fields: ['fieldName1',' fieldName2'], direction: 'ASC'/'asc' || 'desc'/'DESC'}*/
    var sortInfo: js.UndefOr[
        SortInfo | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<SortInfo> */ Any)
      ] = js.undefined
    
    /** Set the tab index of the Vieport. */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /** Prevents the internal sorting from executing.
      The sortInfo object will be updated with the sorting information so you can handle sorting (see sortInfo)*/
    var useExternalSorting: js.UndefOr[Boolean] = js.undefined
  }
  object GridOptions {
    
    inline def apply[EntityType](displaySelectionCheckbox: Boolean): GridOptions[EntityType] = {
      val __obj = js.Dynamic.literal(displaySelectionCheckbox = displaySelectionCheckbox.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridOptions[EntityType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridOptions[?], EntityType] (val x: Self & GridOptions[EntityType]) extends AnyVal {
      
      inline def setAfterSelectionChange(value: /* row */ Row[EntityType] => Unit): Self = StObject.set(x, "afterSelectionChange", js.Any.fromFunction1(value))
      
      inline def setAfterSelectionChangeUndefined: Self = StObject.set(x, "afterSelectionChange", js.undefined)
      
      inline def setBeforeSelectionChange(value: /* row */ Row[EntityType] => Boolean): Self = StObject.set(x, "beforeSelectionChange", js.Any.fromFunction1(value))
      
      inline def setBeforeSelectionChangeUndefined: Self = StObject.set(x, "beforeSelectionChange", js.undefined)
      
      inline def setCanSelectRows(value: Boolean): Self = StObject.set(x, "canSelectRows", value.asInstanceOf[js.Any])
      
      inline def setCanSelectRowsUndefined: Self = StObject.set(x, "canSelectRows", js.undefined)
      
      inline def setColumnDefs(
        value: js.Array[ColumnDef] | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<Array<ColumnDef>> */ Any)
      ): Self = StObject.set(x, "columnDefs", value.asInstanceOf[js.Any])
      
      inline def setColumnDefsUndefined: Self = StObject.set(x, "columnDefs", js.undefined)
      
      inline def setColumnDefsVarargs(value: ColumnDef*): Self = StObject.set(x, "columnDefs", js.Array(value*))
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setData(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<EntityType> */ Any
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisplaySelectionCheckbox(value: Boolean): Self = StObject.set(x, "displaySelectionCheckbox", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnResize(value: Boolean): Self = StObject.set(x, "enableColumnResize", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnResizeUndefined: Self = StObject.set(x, "enableColumnResize", js.undefined)
      
      inline def setEnablePaging(value: Boolean): Self = StObject.set(x, "enablePaging", value.asInstanceOf[js.Any])
      
      inline def setEnablePagingUndefined: Self = StObject.set(x, "enablePaging", js.undefined)
      
      inline def setEnableRowReordering(value: Boolean): Self = StObject.set(x, "enableRowReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableRowReorderingUndefined: Self = StObject.set(x, "enableRowReordering", js.undefined)
      
      inline def setEnableSorting(value: Boolean): Self = StObject.set(x, "enableSorting", value.asInstanceOf[js.Any])
      
      inline def setEnableSortingUndefined: Self = StObject.set(x, "enableSorting", js.undefined)
      
      inline def setFilterOptions(value: FilterOptions): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
      
      inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
      
      inline def setFooterRowHeight(value: Double): Self = StObject.set(x, "footerRowHeight", value.asInstanceOf[js.Any])
      
      inline def setFooterRowHeightUndefined: Self = StObject.set(x, "footerRowHeight", js.undefined)
      
      inline def setFooterVisible(value: Boolean): Self = StObject.set(x, "footerVisible", value.asInstanceOf[js.Any])
      
      inline def setFooterVisibleUndefined: Self = StObject.set(x, "footerVisible", js.undefined)
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setHeaderRowHeight(value: Double): Self = StObject.set(x, "headerRowHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderRowHeightUndefined: Self = StObject.set(x, "headerRowHeight", js.undefined)
      
      inline def setHeaderRowTemplate(value: String | JQueryGenericPromise[String]): Self = StObject.set(x, "headerRowTemplate", value.asInstanceOf[js.Any])
      
      inline def setHeaderRowTemplateUndefined: Self = StObject.set(x, "headerRowTemplate", js.undefined)
      
      inline def setJqueryUIDraggable(value: Boolean): Self = StObject.set(x, "jqueryUIDraggable", value.asInstanceOf[js.Any])
      
      inline def setJqueryUIDraggableUndefined: Self = StObject.set(x, "jqueryUIDraggable", js.undefined)
      
      inline def setJqueryUITheme(value: Boolean): Self = StObject.set(x, "jqueryUITheme", value.asInstanceOf[js.Any])
      
      inline def setJqueryUIThemeUndefined: Self = StObject.set(x, "jqueryUITheme", js.undefined)
      
      inline def setKeepLastSelected(value: Boolean): Self = StObject.set(x, "keepLastSelected", value.asInstanceOf[js.Any])
      
      inline def setKeepLastSelectedUndefined: Self = StObject.set(x, "keepLastSelected", js.undefined)
      
      inline def setMaintainColumnRatios(value: Any): Self = StObject.set(x, "maintainColumnRatios", value.asInstanceOf[js.Any])
      
      inline def setMaintainColumnRatiosUndefined: Self = StObject.set(x, "maintainColumnRatios", js.undefined)
      
      inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setPagingOptions(value: PagingOptions): Self = StObject.set(x, "pagingOptions", value.asInstanceOf[js.Any])
      
      inline def setPagingOptionsUndefined: Self = StObject.set(x, "pagingOptions", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin[EntityType]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin[EntityType]*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setRowTemplate(value: String | JQueryGenericPromise[String]): Self = StObject.set(x, "rowTemplate", value.asInstanceOf[js.Any])
      
      inline def setRowTemplateUndefined: Self = StObject.set(x, "rowTemplate", js.undefined)
      
      inline def setSelectAllState(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
      ): Self = StObject.set(x, "selectAllState", value.asInstanceOf[js.Any])
      
      inline def setSelectAllStateUndefined: Self = StObject.set(x, "selectAllState", js.undefined)
      
      inline def setSelectWithCheckboxOnly(value: Boolean): Self = StObject.set(x, "selectWithCheckboxOnly", value.asInstanceOf[js.Any])
      
      inline def setSelectWithCheckboxOnlyUndefined: Self = StObject.set(x, "selectWithCheckboxOnly", js.undefined)
      
      inline def setSelectedItems(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ Any
      ): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setShowColumnMenu(value: Boolean): Self = StObject.set(x, "showColumnMenu", value.asInstanceOf[js.Any])
      
      inline def setShowColumnMenuUndefined: Self = StObject.set(x, "showColumnMenu", js.undefined)
      
      inline def setShowFilter(value: Boolean): Self = StObject.set(x, "showFilter", value.asInstanceOf[js.Any])
      
      inline def setShowFilterUndefined: Self = StObject.set(x, "showFilter", js.undefined)
      
      inline def setShowGroupPanel(value: Boolean): Self = StObject.set(x, "showGroupPanel", value.asInstanceOf[js.Any])
      
      inline def setShowGroupPanelUndefined: Self = StObject.set(x, "showGroupPanel", js.undefined)
      
      inline def setSortInfo(
        value: SortInfo | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<SortInfo> */ Any)
      ): Self = StObject.set(x, "sortInfo", value.asInstanceOf[js.Any])
      
      inline def setSortInfoUndefined: Self = StObject.set(x, "sortInfo", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setUseExternalSorting(value: Boolean): Self = StObject.set(x, "useExternalSorting", value.asInstanceOf[js.Any])
      
      inline def setUseExternalSortingUndefined: Self = StObject.set(x, "useExternalSorting", js.undefined)
    }
  }
  
  trait PagingOptions extends StObject {
    
    /** currentPage: the uhm... current page. */
    var currentPage: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
      ] = js.undefined
    
    /** pageSize: currently selected page size.  */
    var pageSize: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
      ] = js.undefined
    
    /**  pageSizes: list of available page sizes.  */
    var pageSizes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<number> */ Any
      ] = js.undefined
    
    /** totalServerItems: Total items are on the server.  */
    var totalServerItems: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
      ] = js.undefined
  }
  object PagingOptions {
    
    inline def apply(): PagingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagingOptions] (val x: Self) extends AnyVal {
      
      inline def setCurrentPage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
      ): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setPageSize(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
      ): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageSizes(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<number> */ Any
      ): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
      
      inline def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
      
      inline def setTotalServerItems(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<number> */ Any
      ): Self = StObject.set(x, "totalServerItems", value.asInstanceOf[js.Any])
      
      inline def setTotalServerItemsUndefined: Self = StObject.set(x, "totalServerItems", js.undefined)
    }
  }
  
  trait Plugin[EntityType] extends StObject {
    
    def onGridInit(grid: Grid[EntityType]): Unit
  }
  object Plugin {
    
    inline def apply[EntityType](onGridInit: Grid[EntityType] => Unit): Plugin[EntityType] = {
      val __obj = js.Dynamic.literal(onGridInit = js.Any.fromFunction1(onGridInit))
      __obj.asInstanceOf[Plugin[EntityType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plugin[?], EntityType] (val x: Self & Plugin[EntityType]) extends AnyVal {
      
      inline def setOnGridInit(value: Grid[EntityType] => Unit): Self = StObject.set(x, "onGridInit", js.Any.fromFunction1(value))
    }
  }
  
  trait Row[EntityType] extends StObject {
    
    var entity: EntityType
    
    var selected: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  }
  object Row {
    
    inline def apply[EntityType](
      entity: EntityType,
      selected: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Row[EntityType] = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Row[EntityType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Row[?], EntityType] (val x: Self & Row[EntityType]) extends AnyVal {
      
      inline def setEntity(value: EntityType): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setSelected(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
      ): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowFactory[EntityType] extends StObject {
    
    var rowCache: js.Array[Row[EntityType]]
  }
  object RowFactory {
    
    inline def apply[EntityType](rowCache: js.Array[Row[EntityType]]): RowFactory[EntityType] = {
      val __obj = js.Dynamic.literal(rowCache = rowCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowFactory[EntityType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowFactory[?], EntityType] (val x: Self & RowFactory[EntityType]) extends AnyVal {
      
      inline def setRowCache(value: js.Array[Row[EntityType]]): Self = StObject.set(x, "rowCache", value.asInstanceOf[js.Any])
      
      inline def setRowCacheVarargs(value: Row[EntityType]*): Self = StObject.set(x, "rowCache", js.Array(value*))
    }
  }
  
  trait SelectionService[EntityType] extends StObject {
    
    var lastClickedRow: Row[EntityType]
    
    var multi: Boolean
    
    def setSelection(row: Row[EntityType], selected: Boolean): Unit
  }
  object SelectionService {
    
    inline def apply[EntityType](lastClickedRow: Row[EntityType], multi: Boolean, setSelection: (Row[EntityType], Boolean) => Unit): SelectionService[EntityType] = {
      val __obj = js.Dynamic.literal(lastClickedRow = lastClickedRow.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], setSelection = js.Any.fromFunction2(setSelection))
      __obj.asInstanceOf[SelectionService[EntityType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionService[?], EntityType] (val x: Self & SelectionService[EntityType]) extends AnyVal {
      
      inline def setLastClickedRow(value: Row[EntityType]): Self = StObject.set(x, "lastClickedRow", value.asInstanceOf[js.Any])
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setSetSelection(value: (Row[EntityType], Boolean) => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction2(value))
    }
  }
  
  trait SortColumn extends StObject {
    
    /** The string name of the property in your data model you want that column to represent. Can also be a property path on your data model. 'foo.bar.myField', 'Name.First', etc.. */
    var field: String
    
    /** Sets the sort function for the column. Useful when you have data that is formatted in an unusal way or if you want to sort on an underlying data type. Example: function(a,b){return a > b} */
    var sortingAlgorithm: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Double]] = js.undefined
  }
  object SortColumn {
    
    inline def apply(field: String): SortColumn = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortColumn] (val x: Self) extends AnyVal {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setSortingAlgorithm(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sortingAlgorithm", js.Any.fromFunction2(value))
      
      inline def setSortingAlgorithmUndefined: Self = StObject.set(x, "sortingAlgorithm", js.undefined)
    }
  }
  
  trait SortInfo extends StObject {
    
    /** Which column to sort */
    var column: SortColumn
    
    /** Which direction to sort */
    var direction: Direction
  }
  object SortInfo {
    
    inline def apply(column: SortColumn, direction: Direction): SortInfo = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortInfo] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: SortColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
}
