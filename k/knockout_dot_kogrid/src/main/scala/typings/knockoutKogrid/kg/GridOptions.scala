package typings.knockoutKogrid.kg

import typings.jquery.JQueryGenericPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridOptions[EntityType] extends js.Object {
  
  /** Callback for when you want to validate something after selection. */
  var afterSelectionChange: js.UndefOr[js.Function1[/* row */ Row[EntityType], Unit]] = js.native
  
  /** Callback if you want to inspect something before selection,
    return false if you want to cancel the selection. return true otherwise.
    If you need to wait for an async call to proceed with selection you can
    use rowItem.changeSelection(event) method after returning false initially.
    Note: when shift+ Selecting multiple items in the grid this will only get called
    once and the rowItem will be an array of items that are queued to be selected. */
  var beforeSelectionChange: js.UndefOr[js.Function1[/* row */ Row[EntityType], Boolean]] = js.native
  
  /** To be able to have selectable rows in grid. */
  var canSelectRows: js.UndefOr[Boolean] = js.native
  
  /** definitions of columns as an array [], if not defined columns are auto-generated. See github wiki for more details. */
  var columnDefs: js.UndefOr[
    js.Array[ColumnDef] | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<Array<ColumnDef>> */ js.Any)
  ] = js.native
  
  /** Column width of columns in grid. */
  var columnWidth: js.UndefOr[Double] = js.native
  
  /** Data being displayed in the grid. Each item in the array is mapped to a row being displayed. */
  var data: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<EntityType> */ js.Any
  ] = js.native
  
  /** Row selection check boxes appear as the first column. */
  var displaySelectionCheckbox: Boolean = js.native
  
  /** Enable or disable resizing of columns */
  var enableColumnResize: js.UndefOr[Boolean] = js.native
  
  /** Enables the server-side paging feature */
  var enablePaging: js.UndefOr[Boolean] = js.native
  
  /** Enable drag and drop row reordering. Only works in HTML5 compliant browsers. */
  var enableRowReordering: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables sorting in grid. */
  var enableSorting: js.UndefOr[Boolean] = js.native
  
  /** filterOptions -
    filterText: The text bound to the built-in search box.
    useExternalFilter: Bypass internal filtering if you want to roll your own filtering mechanism but want to use builtin search box.
    */
  var filterOptions: js.UndefOr[FilterOptions] = js.native
  
  /** Defining the height of the footer in pixels. */
  var footerRowHeight: js.UndefOr[Double] = js.native
  
  /** Show or hide the footer alltogether the footer is enabled by default */
  var footerVisible: js.UndefOr[Boolean] = js.native
  
  /** Initial fields to group data by. Array of field names, not displayName. */
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  /** The height of the header row in pixels. */
  var headerRowHeight: js.UndefOr[Double] = js.native
  
  /** Define a header row template for further customization. See github wiki for more details. */
  var headerRowTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.native
  
  /** Enables the use of jquery UI reaggable/droppable plugin. requires jqueryUI to work if enabled.
    Useful if you want drag + drop but your users insist on crappy browsers. */
  var jqueryUIDraggable: js.UndefOr[Boolean] = js.native
  
  /** Enable the use jqueryUIThemes */
  var jqueryUITheme: js.UndefOr[Boolean] = js.native
  
  /** Prevent unselections when in single selection mode. */
  var keepLastSelected: js.UndefOr[Boolean] = js.native
  
  /** Maintains the column widths while resizing.
    Defaults to true when using *'s or undefined widths. Can be ovverriden by setting to false. */
  var maintainColumnRatios: js.UndefOr[js.Any] = js.native
  
  /** Set this to false if you only want one item selected at a time */
  var multiSelect: js.UndefOr[Boolean] = js.native
  
  /**  pagingOptions - */
  var pagingOptions: js.UndefOr[PagingOptions] = js.native
  
  /** Array of plugin functions to register in ng-grid */
  var plugins: js.UndefOr[js.Array[Plugin[EntityType]]] = js.native
  
  /** Row height of rows in grid. */
  var rowHeight: js.UndefOr[Double] = js.native
  
  /** Define a row template to customize output. See github wiki for more details. */
  var rowTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.native
  
  /** Defines the binding to select all at once */
  var selectAllState: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  ] = js.native
  
  /** Disable row selections by clicking on the row and only when the checkbox is clicked. */
  var selectWithCheckboxOnly: js.UndefOr[Boolean] = js.native
  
  /** all of the items selected in the grid. In single select mode there will only be one item in the array. */
  var selectedItems: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ js.Any
  ] = js.native
  
  /** Enables menu to choose which columns to display and group by.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showColumnMenu: js.UndefOr[Boolean] = js.native
  
  /** Enables display of the filterbox in the column menu.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showFilter: js.UndefOr[Boolean] = js.native
  
  /** Show the dropzone for drag and drop grouping */
  var showGroupPanel: js.UndefOr[Boolean] = js.native
  
  /** Define a sortInfo object to specify a default sorting state.
    You can also observe this variable to utilize server-side sorting (see useExternalSorting).
    Syntax is sortinfo: { fields: ['fieldName1',' fieldName2'], direction: 'ASC'/'asc' || 'desc'/'DESC'}*/
  var sortInfo: js.UndefOr[
    SortInfo | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<SortInfo> */ js.Any)
  ] = js.native
  
  /** Set the tab index of the Vieport. */
  var tabIndex: js.UndefOr[Double] = js.native
  
  /** Prevents the internal sorting from executing.
    The sortInfo object will be updated with the sorting information so you can handle sorting (see sortInfo)*/
  var useExternalSorting: js.UndefOr[Boolean] = js.native
}
object GridOptions {
  
  @scala.inline
  def apply[EntityType](displaySelectionCheckbox: Boolean): GridOptions[EntityType] = {
    val __obj = js.Dynamic.literal(displaySelectionCheckbox = displaySelectionCheckbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions[EntityType]]
  }
  
  @scala.inline
  implicit class GridOptionsOps[Self <: GridOptions[_], EntityType] (val x: Self with GridOptions[EntityType]) extends AnyVal {
    
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
    def setDisplaySelectionCheckbox(value: Boolean): Self = this.set("displaySelectionCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSelectionChange(value: /* row */ Row[EntityType] => Unit): Self = this.set("afterSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterSelectionChange: Self = this.set("afterSelectionChange", js.undefined)
    
    @scala.inline
    def setBeforeSelectionChange(value: /* row */ Row[EntityType] => Boolean): Self = this.set("beforeSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeSelectionChange: Self = this.set("beforeSelectionChange", js.undefined)
    
    @scala.inline
    def setCanSelectRows(value: Boolean): Self = this.set("canSelectRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSelectRows: Self = this.set("canSelectRows", js.undefined)
    
    @scala.inline
    def setColumnDefsVarargs(value: ColumnDef*): Self = this.set("columnDefs", js.Array(value :_*))
    
    @scala.inline
    def setColumnDefs(
      value: js.Array[ColumnDef] | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<Array<ColumnDef>> */ js.Any)
    ): Self = this.set("columnDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnDefs: Self = this.set("columnDefs", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setData(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<EntityType> */ js.Any
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEnableColumnResize(value: Boolean): Self = this.set("enableColumnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnResize: Self = this.set("enableColumnResize", js.undefined)
    
    @scala.inline
    def setEnablePaging(value: Boolean): Self = this.set("enablePaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePaging: Self = this.set("enablePaging", js.undefined)
    
    @scala.inline
    def setEnableRowReordering(value: Boolean): Self = this.set("enableRowReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRowReordering: Self = this.set("enableRowReordering", js.undefined)
    
    @scala.inline
    def setEnableSorting(value: Boolean): Self = this.set("enableSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSorting: Self = this.set("enableSorting", js.undefined)
    
    @scala.inline
    def setFilterOptions(value: FilterOptions): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setFooterRowHeight(value: Double): Self = this.set("footerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterRowHeight: Self = this.set("footerRowHeight", js.undefined)
    
    @scala.inline
    def setFooterVisible(value: Boolean): Self = this.set("footerVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterVisible: Self = this.set("footerVisible", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setHeaderRowHeight(value: Double): Self = this.set("headerRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRowHeight: Self = this.set("headerRowHeight", js.undefined)
    
    @scala.inline
    def setHeaderRowTemplate(value: String | JQueryGenericPromise[String]): Self = this.set("headerRowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRowTemplate: Self = this.set("headerRowTemplate", js.undefined)
    
    @scala.inline
    def setJqueryUIDraggable(value: Boolean): Self = this.set("jqueryUIDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJqueryUIDraggable: Self = this.set("jqueryUIDraggable", js.undefined)
    
    @scala.inline
    def setJqueryUITheme(value: Boolean): Self = this.set("jqueryUITheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJqueryUITheme: Self = this.set("jqueryUITheme", js.undefined)
    
    @scala.inline
    def setKeepLastSelected(value: Boolean): Self = this.set("keepLastSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepLastSelected: Self = this.set("keepLastSelected", js.undefined)
    
    @scala.inline
    def setMaintainColumnRatios(value: js.Any): Self = this.set("maintainColumnRatios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintainColumnRatios: Self = this.set("maintainColumnRatios", js.undefined)
    
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    
    @scala.inline
    def setPagingOptions(value: PagingOptions): Self = this.set("pagingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagingOptions: Self = this.set("pagingOptions", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Plugin[EntityType]*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Plugin[EntityType]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setRowTemplate(value: String | JQueryGenericPromise[String]): Self = this.set("rowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowTemplate: Self = this.set("rowTemplate", js.undefined)
    
    @scala.inline
    def setSelectAllState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("selectAllState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllState: Self = this.set("selectAllState", js.undefined)
    
    @scala.inline
    def setSelectWithCheckboxOnly(value: Boolean): Self = this.set("selectWithCheckboxOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectWithCheckboxOnly: Self = this.set("selectWithCheckboxOnly", js.undefined)
    
    @scala.inline
    def setSelectedItems(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> */ js.Any
    ): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setShowColumnMenu(value: Boolean): Self = this.set("showColumnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnMenu: Self = this.set("showColumnMenu", js.undefined)
    
    @scala.inline
    def setShowFilter(value: Boolean): Self = this.set("showFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFilter: Self = this.set("showFilter", js.undefined)
    
    @scala.inline
    def setShowGroupPanel(value: Boolean): Self = this.set("showGroupPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGroupPanel: Self = this.set("showGroupPanel", js.undefined)
    
    @scala.inline
    def setSortInfo(
      value: SortInfo | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<SortInfo> */ js.Any)
    ): Self = this.set("sortInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortInfo: Self = this.set("sortInfo", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setUseExternalSorting(value: Boolean): Self = this.set("useExternalSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExternalSorting: Self = this.set("useExternalSorting", js.undefined)
  }
}
