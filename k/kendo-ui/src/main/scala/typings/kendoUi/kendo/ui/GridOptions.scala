package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendoUiStrings.`inline`
import typings.kendoUi.kendoUiStrings.incell
import typings.kendoUi.kendoUiStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridOptions extends StObject {
  
  var allowCopy: js.UndefOr[Boolean | GridAllowCopy] = js.undefined
  
  var altRowTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var beforeEdit: js.UndefOr[js.Function1[/* e */ GridBeforeEditEvent, Unit]] = js.undefined
  
  var cancel: js.UndefOr[js.Function1[/* e */ GridCancelEvent, Unit]] = js.undefined
  
  var cellClose: js.UndefOr[js.Function1[/* e */ GridCellCloseEvent, Unit]] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ GridChangeEvent, Unit]] = js.undefined
  
  var columnHide: js.UndefOr[js.Function1[/* e */ GridColumnHideEvent, Unit]] = js.undefined
  
  var columnLock: js.UndefOr[js.Function1[/* e */ GridColumnLockEvent, Unit]] = js.undefined
  
  var columnMenu: js.UndefOr[Boolean | GridColumnMenu] = js.undefined
  
  var columnMenuInit: js.UndefOr[js.Function1[/* e */ GridColumnMenuInitEvent, Unit]] = js.undefined
  
  var columnMenuOpen: js.UndefOr[js.Function1[/* e */ GridColumnMenuOpenEvent, Unit]] = js.undefined
  
  var columnReorder: js.UndefOr[js.Function1[/* e */ GridColumnReorderEvent, Unit]] = js.undefined
  
  var columnResize: js.UndefOr[js.Function1[/* e */ GridColumnResizeEvent, Unit]] = js.undefined
  
  var columnResizeHandleWidth: js.UndefOr[Double] = js.undefined
  
  var columnShow: js.UndefOr[js.Function1[/* e */ GridColumnShowEvent, Unit]] = js.undefined
  
  var columnStick: js.UndefOr[js.Function1[/* e */ GridColumnStickEvent, Unit]] = js.undefined
  
  var columnUnlock: js.UndefOr[js.Function1[/* e */ GridColumnUnlockEvent, Unit]] = js.undefined
  
  var columnUnstick: js.UndefOr[js.Function1[/* e */ GridColumnUnstickEvent, Unit]] = js.undefined
  
  var columns: js.UndefOr[js.Array[GridColumn]] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ GridDataBindingEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ GridDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  
  var detailCollapse: js.UndefOr[js.Function1[/* e */ GridDetailCollapseEvent, Unit]] = js.undefined
  
  var detailExpand: js.UndefOr[js.Function1[/* e */ GridDetailExpandEvent, Unit]] = js.undefined
  
  var detailInit: js.UndefOr[js.Function1[/* e */ GridDetailInitEvent, Unit]] = js.undefined
  
  var detailTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var edit: js.UndefOr[js.Function1[/* e */ GridEditEvent, Unit]] = js.undefined
  
  var editable: js.UndefOr[Boolean | `inline` | incell | popup | GridEditable] = js.undefined
  
  var excel: js.UndefOr[GridExcel] = js.undefined
  
  var excelExport: js.UndefOr[js.Function1[/* e */ GridExcelExportEvent, Unit]] = js.undefined
  
  var filter: js.UndefOr[js.Function1[/* e */ GridFilterEvent, Unit]] = js.undefined
  
  var filterMenuInit: js.UndefOr[js.Function1[/* e */ GridFilterMenuInitEvent, Unit]] = js.undefined
  
  var filterMenuOpen: js.UndefOr[js.Function1[/* e */ GridFilterMenuOpenEvent, Unit]] = js.undefined
  
  var filterable: js.UndefOr[Boolean | GridFilterable] = js.undefined
  
  var group: js.UndefOr[js.Function1[/* e */ GridGroupEvent, Unit]] = js.undefined
  
  var groupCollapse: js.UndefOr[js.Function1[/* e */ GridGroupCollapseEvent, Unit]] = js.undefined
  
  var groupExpand: js.UndefOr[js.Function1[/* e */ GridGroupExpandEvent, Unit]] = js.undefined
  
  var groupable: js.UndefOr[Boolean | GridGroupable] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var messages: js.UndefOr[GridMessages] = js.undefined
  
  var mobile: js.UndefOr[Boolean | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigatable: js.UndefOr[Boolean] = js.undefined
  
  var navigate: js.UndefOr[js.Function1[/* e */ GridNavigateEvent, Unit]] = js.undefined
  
  var noRecords: js.UndefOr[Boolean | GridNoRecords] = js.undefined
  
  var page: js.UndefOr[js.Function1[/* e */ GridPageEvent, Unit]] = js.undefined
  
  var pageable: js.UndefOr[Boolean | GridPageable] = js.undefined
  
  var pdf: js.UndefOr[GridPdf] = js.undefined
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ GridPdfExportEvent, Unit]] = js.undefined
  
  var persistSelection: js.UndefOr[Boolean] = js.undefined
  
  var remove: js.UndefOr[js.Function1[/* e */ GridRemoveEvent, Unit]] = js.undefined
  
  var reorderable: js.UndefOr[Boolean] = js.undefined
  
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  var rowTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var save: js.UndefOr[js.Function1[/* e */ GridSaveEvent, Unit]] = js.undefined
  
  var saveChanges: js.UndefOr[js.Function1[/* e */ GridSaveChangesEvent, Unit]] = js.undefined
  
  var scrollable: js.UndefOr[Boolean | GridScrollable] = js.undefined
  
  var search: js.UndefOr[GridSearch] = js.undefined
  
  var selectable: js.UndefOr[Boolean | String] = js.undefined
  
  var sort: js.UndefOr[js.Function1[/* e */ GridSortEvent, Unit]] = js.undefined
  
  var sortable: js.UndefOr[Boolean | GridSortable] = js.undefined
  
  var toolbar: js.UndefOr[String | js.Function | (js.Array[String | GridToolbarItem])] = js.undefined
}
object GridOptions {
  
  @scala.inline
  def apply(): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions]
  }
  
  @scala.inline
  implicit class GridOptionsMutableBuilder[Self <: GridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCopy(value: Boolean | GridAllowCopy): Self = StObject.set(x, "allowCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCopyUndefined: Self = StObject.set(x, "allowCopy", js.undefined)
    
    @scala.inline
    def setAltRowTemplate(value: String | js.Function): Self = StObject.set(x, "altRowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltRowTemplateUndefined: Self = StObject.set(x, "altRowTemplate", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setBeforeEdit(value: /* e */ GridBeforeEditEvent => Unit): Self = StObject.set(x, "beforeEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeEditUndefined: Self = StObject.set(x, "beforeEdit", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ GridCancelEvent => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setCellClose(value: /* e */ GridCellCloseEvent => Unit): Self = StObject.set(x, "cellClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellCloseUndefined: Self = StObject.set(x, "cellClose", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ GridChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setColumnHide(value: /* e */ GridColumnHideEvent => Unit): Self = StObject.set(x, "columnHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnHideUndefined: Self = StObject.set(x, "columnHide", js.undefined)
    
    @scala.inline
    def setColumnLock(value: /* e */ GridColumnLockEvent => Unit): Self = StObject.set(x, "columnLock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnLockUndefined: Self = StObject.set(x, "columnLock", js.undefined)
    
    @scala.inline
    def setColumnMenu(value: Boolean | GridColumnMenu): Self = StObject.set(x, "columnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMenuInit(value: /* e */ GridColumnMenuInitEvent => Unit): Self = StObject.set(x, "columnMenuInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnMenuInitUndefined: Self = StObject.set(x, "columnMenuInit", js.undefined)
    
    @scala.inline
    def setColumnMenuOpen(value: /* e */ GridColumnMenuOpenEvent => Unit): Self = StObject.set(x, "columnMenuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnMenuOpenUndefined: Self = StObject.set(x, "columnMenuOpen", js.undefined)
    
    @scala.inline
    def setColumnMenuUndefined: Self = StObject.set(x, "columnMenu", js.undefined)
    
    @scala.inline
    def setColumnReorder(value: /* e */ GridColumnReorderEvent => Unit): Self = StObject.set(x, "columnReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnReorderUndefined: Self = StObject.set(x, "columnReorder", js.undefined)
    
    @scala.inline
    def setColumnResize(value: /* e */ GridColumnResizeEvent => Unit): Self = StObject.set(x, "columnResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnResizeHandleWidth(value: Double): Self = StObject.set(x, "columnResizeHandleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnResizeHandleWidthUndefined: Self = StObject.set(x, "columnResizeHandleWidth", js.undefined)
    
    @scala.inline
    def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
    
    @scala.inline
    def setColumnShow(value: /* e */ GridColumnShowEvent => Unit): Self = StObject.set(x, "columnShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnShowUndefined: Self = StObject.set(x, "columnShow", js.undefined)
    
    @scala.inline
    def setColumnStick(value: /* e */ GridColumnStickEvent => Unit): Self = StObject.set(x, "columnStick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnStickUndefined: Self = StObject.set(x, "columnStick", js.undefined)
    
    @scala.inline
    def setColumnUnlock(value: /* e */ GridColumnUnlockEvent => Unit): Self = StObject.set(x, "columnUnlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnUnlockUndefined: Self = StObject.set(x, "columnUnlock", js.undefined)
    
    @scala.inline
    def setColumnUnstick(value: /* e */ GridColumnUnstickEvent => Unit): Self = StObject.set(x, "columnUnstick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnUnstickUndefined: Self = StObject.set(x, "columnUnstick", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[GridColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: GridColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDataBinding(value: /* e */ GridDataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ GridDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDetailCollapse(value: /* e */ GridDetailCollapseEvent => Unit): Self = StObject.set(x, "detailCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetailCollapseUndefined: Self = StObject.set(x, "detailCollapse", js.undefined)
    
    @scala.inline
    def setDetailExpand(value: /* e */ GridDetailExpandEvent => Unit): Self = StObject.set(x, "detailExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetailExpandUndefined: Self = StObject.set(x, "detailExpand", js.undefined)
    
    @scala.inline
    def setDetailInit(value: /* e */ GridDetailInitEvent => Unit): Self = StObject.set(x, "detailInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetailInitUndefined: Self = StObject.set(x, "detailInit", js.undefined)
    
    @scala.inline
    def setDetailTemplate(value: String | js.Function): Self = StObject.set(x, "detailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailTemplateUndefined: Self = StObject.set(x, "detailTemplate", js.undefined)
    
    @scala.inline
    def setEdit(value: /* e */ GridEditEvent => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | `inline` | incell | popup | GridEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setExcel(value: GridExcel): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelExport(value: /* e */ GridExcelExportEvent => Unit): Self = StObject.set(x, "excelExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcelExportUndefined: Self = StObject.set(x, "excelExport", js.undefined)
    
    @scala.inline
    def setExcelUndefined: Self = StObject.set(x, "excel", js.undefined)
    
    @scala.inline
    def setFilter(value: /* e */ GridFilterEvent => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterMenuInit(value: /* e */ GridFilterMenuInitEvent => Unit): Self = StObject.set(x, "filterMenuInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterMenuInitUndefined: Self = StObject.set(x, "filterMenuInit", js.undefined)
    
    @scala.inline
    def setFilterMenuOpen(value: /* e */ GridFilterMenuOpenEvent => Unit): Self = StObject.set(x, "filterMenuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterMenuOpenUndefined: Self = StObject.set(x, "filterMenuOpen", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | GridFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setGroup(value: /* e */ GridGroupEvent => Unit): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupCollapse(value: /* e */ GridGroupCollapseEvent => Unit): Self = StObject.set(x, "groupCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupCollapseUndefined: Self = StObject.set(x, "groupCollapse", js.undefined)
    
    @scala.inline
    def setGroupExpand(value: /* e */ GridGroupExpandEvent => Unit): Self = StObject.set(x, "groupExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupExpandUndefined: Self = StObject.set(x, "groupExpand", js.undefined)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupable(value: Boolean | GridGroupable): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMessages(value: GridMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMobile(value: Boolean | String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ GridNavigateEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    @scala.inline
    def setNoRecords(value: Boolean | GridNoRecords): Self = StObject.set(x, "noRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRecordsUndefined: Self = StObject.set(x, "noRecords", js.undefined)
    
    @scala.inline
    def setPage(value: /* e */ GridPageEvent => Unit): Self = StObject.set(x, "page", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPageable(value: Boolean | GridPageable): Self = StObject.set(x, "pageable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageableUndefined: Self = StObject.set(x, "pageable", js.undefined)
    
    @scala.inline
    def setPdf(value: GridPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfExport(value: /* e */ GridPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setPersistSelection(value: Boolean): Self = StObject.set(x, "persistSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistSelectionUndefined: Self = StObject.set(x, "persistSelection", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ GridRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setRowTemplate(value: String | js.Function): Self = StObject.set(x, "rowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowTemplateUndefined: Self = StObject.set(x, "rowTemplate", js.undefined)
    
    @scala.inline
    def setSave(value: /* e */ GridSaveEvent => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveChanges(value: /* e */ GridSaveChangesEvent => Unit): Self = StObject.set(x, "saveChanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveChangesUndefined: Self = StObject.set(x, "saveChanges", js.undefined)
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | GridScrollable): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setSearch(value: GridSearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean | String): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSort(value: /* e */ GridSortEvent => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | GridSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setToolbar(value: String | js.Function | (js.Array[String | GridToolbarItem])): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: (String | GridToolbarItem)*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
  }
}
