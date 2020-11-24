package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendoUiStrings.`inline`
import typings.kendoUi.kendoUiStrings.incell
import typings.kendoUi.kendoUiStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridOptions extends js.Object {
  
  var allowCopy: js.UndefOr[Boolean | GridAllowCopy] = js.native
  
  var altRowTemplate: js.UndefOr[String | js.Function] = js.native
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var beforeEdit: js.UndefOr[js.Function1[/* e */ GridBeforeEditEvent, Unit]] = js.native
  
  var cancel: js.UndefOr[js.Function1[/* e */ GridCancelEvent, Unit]] = js.native
  
  var cellClose: js.UndefOr[js.Function1[/* e */ GridCellCloseEvent, Unit]] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ GridChangeEvent, Unit]] = js.native
  
  var columnHide: js.UndefOr[js.Function1[/* e */ GridColumnHideEvent, Unit]] = js.native
  
  var columnLock: js.UndefOr[js.Function1[/* e */ GridColumnLockEvent, Unit]] = js.native
  
  var columnMenu: js.UndefOr[Boolean | GridColumnMenu] = js.native
  
  var columnMenuInit: js.UndefOr[js.Function1[/* e */ GridColumnMenuInitEvent, Unit]] = js.native
  
  var columnMenuOpen: js.UndefOr[js.Function1[/* e */ GridColumnMenuOpenEvent, Unit]] = js.native
  
  var columnReorder: js.UndefOr[js.Function1[/* e */ GridColumnReorderEvent, Unit]] = js.native
  
  var columnResize: js.UndefOr[js.Function1[/* e */ GridColumnResizeEvent, Unit]] = js.native
  
  var columnResizeHandleWidth: js.UndefOr[Double] = js.native
  
  var columnShow: js.UndefOr[js.Function1[/* e */ GridColumnShowEvent, Unit]] = js.native
  
  var columnStick: js.UndefOr[js.Function1[/* e */ GridColumnStickEvent, Unit]] = js.native
  
  var columnUnlock: js.UndefOr[js.Function1[/* e */ GridColumnUnlockEvent, Unit]] = js.native
  
  var columnUnstick: js.UndefOr[js.Function1[/* e */ GridColumnUnstickEvent, Unit]] = js.native
  
  var columns: js.UndefOr[js.Array[GridColumn]] = js.native
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ GridDataBindingEvent, Unit]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ GridDataBoundEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var detailCollapse: js.UndefOr[js.Function1[/* e */ GridDetailCollapseEvent, Unit]] = js.native
  
  var detailExpand: js.UndefOr[js.Function1[/* e */ GridDetailExpandEvent, Unit]] = js.native
  
  var detailInit: js.UndefOr[js.Function1[/* e */ GridDetailInitEvent, Unit]] = js.native
  
  var detailTemplate: js.UndefOr[String | js.Function] = js.native
  
  var edit: js.UndefOr[js.Function1[/* e */ GridEditEvent, Unit]] = js.native
  
  var editable: js.UndefOr[Boolean | `inline` | incell | popup | GridEditable] = js.native
  
  var excel: js.UndefOr[GridExcel] = js.native
  
  var excelExport: js.UndefOr[js.Function1[/* e */ GridExcelExportEvent, Unit]] = js.native
  
  var filter: js.UndefOr[js.Function1[/* e */ GridFilterEvent, Unit]] = js.native
  
  var filterMenuInit: js.UndefOr[js.Function1[/* e */ GridFilterMenuInitEvent, Unit]] = js.native
  
  var filterMenuOpen: js.UndefOr[js.Function1[/* e */ GridFilterMenuOpenEvent, Unit]] = js.native
  
  var filterable: js.UndefOr[Boolean | GridFilterable] = js.native
  
  var group: js.UndefOr[js.Function1[/* e */ GridGroupEvent, Unit]] = js.native
  
  var groupCollapse: js.UndefOr[js.Function1[/* e */ GridGroupCollapseEvent, Unit]] = js.native
  
  var groupExpand: js.UndefOr[js.Function1[/* e */ GridGroupExpandEvent, Unit]] = js.native
  
  var groupable: js.UndefOr[Boolean | GridGroupable] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var messages: js.UndefOr[GridMessages] = js.native
  
  var mobile: js.UndefOr[Boolean | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigatable: js.UndefOr[Boolean] = js.native
  
  var navigate: js.UndefOr[js.Function1[/* e */ GridNavigateEvent, Unit]] = js.native
  
  var noRecords: js.UndefOr[Boolean | GridNoRecords] = js.native
  
  var page: js.UndefOr[js.Function1[/* e */ GridPageEvent, Unit]] = js.native
  
  var pageable: js.UndefOr[Boolean | GridPageable] = js.native
  
  var pdf: js.UndefOr[GridPdf] = js.native
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ GridPdfExportEvent, Unit]] = js.native
  
  var persistSelection: js.UndefOr[Boolean] = js.native
  
  var remove: js.UndefOr[js.Function1[/* e */ GridRemoveEvent, Unit]] = js.native
  
  var reorderable: js.UndefOr[Boolean] = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var rowTemplate: js.UndefOr[String | js.Function] = js.native
  
  var save: js.UndefOr[js.Function1[/* e */ GridSaveEvent, Unit]] = js.native
  
  var saveChanges: js.UndefOr[js.Function1[/* e */ GridSaveChangesEvent, Unit]] = js.native
  
  var scrollable: js.UndefOr[Boolean | GridScrollable] = js.native
  
  var search: js.UndefOr[GridSearch] = js.native
  
  var selectable: js.UndefOr[Boolean | String] = js.native
  
  var sort: js.UndefOr[js.Function1[/* e */ GridSortEvent, Unit]] = js.native
  
  var sortable: js.UndefOr[Boolean | GridSortable] = js.native
  
  var toolbar: js.UndefOr[String | js.Function | (js.Array[String | GridToolbarItem])] = js.native
}
object GridOptions {
  
  @scala.inline
  def apply(): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridOptions]
  }
  
  @scala.inline
  implicit class GridOptionsOps[Self <: GridOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowCopy(value: Boolean | GridAllowCopy): Self = this.set("allowCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCopy: Self = this.set("allowCopy", js.undefined)
    
    @scala.inline
    def setAltRowTemplate(value: String | js.Function): Self = this.set("altRowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltRowTemplate: Self = this.set("altRowTemplate", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setBeforeEdit(value: /* e */ GridBeforeEditEvent => Unit): Self = this.set("beforeEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeEdit: Self = this.set("beforeEdit", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ GridCancelEvent => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCellClose(value: /* e */ GridCellCloseEvent => Unit): Self = this.set("cellClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellClose: Self = this.set("cellClose", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ GridChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setColumnHide(value: /* e */ GridColumnHideEvent => Unit): Self = this.set("columnHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnHide: Self = this.set("columnHide", js.undefined)
    
    @scala.inline
    def setColumnLock(value: /* e */ GridColumnLockEvent => Unit): Self = this.set("columnLock", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnLock: Self = this.set("columnLock", js.undefined)
    
    @scala.inline
    def setColumnMenu(value: Boolean | GridColumnMenu): Self = this.set("columnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnMenu: Self = this.set("columnMenu", js.undefined)
    
    @scala.inline
    def setColumnMenuInit(value: /* e */ GridColumnMenuInitEvent => Unit): Self = this.set("columnMenuInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnMenuInit: Self = this.set("columnMenuInit", js.undefined)
    
    @scala.inline
    def setColumnMenuOpen(value: /* e */ GridColumnMenuOpenEvent => Unit): Self = this.set("columnMenuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnMenuOpen: Self = this.set("columnMenuOpen", js.undefined)
    
    @scala.inline
    def setColumnReorder(value: /* e */ GridColumnReorderEvent => Unit): Self = this.set("columnReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnReorder: Self = this.set("columnReorder", js.undefined)
    
    @scala.inline
    def setColumnResize(value: /* e */ GridColumnResizeEvent => Unit): Self = this.set("columnResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnResize: Self = this.set("columnResize", js.undefined)
    
    @scala.inline
    def setColumnResizeHandleWidth(value: Double): Self = this.set("columnResizeHandleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnResizeHandleWidth: Self = this.set("columnResizeHandleWidth", js.undefined)
    
    @scala.inline
    def setColumnShow(value: /* e */ GridColumnShowEvent => Unit): Self = this.set("columnShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnShow: Self = this.set("columnShow", js.undefined)
    
    @scala.inline
    def setColumnStick(value: /* e */ GridColumnStickEvent => Unit): Self = this.set("columnStick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnStick: Self = this.set("columnStick", js.undefined)
    
    @scala.inline
    def setColumnUnlock(value: /* e */ GridColumnUnlockEvent => Unit): Self = this.set("columnUnlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnUnlock: Self = this.set("columnUnlock", js.undefined)
    
    @scala.inline
    def setColumnUnstick(value: /* e */ GridColumnUnstickEvent => Unit): Self = this.set("columnUnstick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnUnstick: Self = this.set("columnUnstick", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: GridColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[GridColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ GridDataBindingEvent => Unit): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ GridDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDetailCollapse(value: /* e */ GridDetailCollapseEvent => Unit): Self = this.set("detailCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDetailCollapse: Self = this.set("detailCollapse", js.undefined)
    
    @scala.inline
    def setDetailExpand(value: /* e */ GridDetailExpandEvent => Unit): Self = this.set("detailExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDetailExpand: Self = this.set("detailExpand", js.undefined)
    
    @scala.inline
    def setDetailInit(value: /* e */ GridDetailInitEvent => Unit): Self = this.set("detailInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDetailInit: Self = this.set("detailInit", js.undefined)
    
    @scala.inline
    def setDetailTemplate(value: String | js.Function): Self = this.set("detailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailTemplate: Self = this.set("detailTemplate", js.undefined)
    
    @scala.inline
    def setEdit(value: /* e */ GridEditEvent => Unit): Self = this.set("edit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | `inline` | incell | popup | GridEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setExcel(value: GridExcel): Self = this.set("excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcel: Self = this.set("excel", js.undefined)
    
    @scala.inline
    def setExcelExport(value: /* e */ GridExcelExportEvent => Unit): Self = this.set("excelExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExcelExport: Self = this.set("excelExport", js.undefined)
    
    @scala.inline
    def setFilter(value: /* e */ GridFilterEvent => Unit): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterMenuInit(value: /* e */ GridFilterMenuInitEvent => Unit): Self = this.set("filterMenuInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterMenuInit: Self = this.set("filterMenuInit", js.undefined)
    
    @scala.inline
    def setFilterMenuOpen(value: /* e */ GridFilterMenuOpenEvent => Unit): Self = this.set("filterMenuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterMenuOpen: Self = this.set("filterMenuOpen", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | GridFilterable): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setGroup(value: /* e */ GridGroupEvent => Unit): Self = this.set("group", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupCollapse(value: /* e */ GridGroupCollapseEvent => Unit): Self = this.set("groupCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGroupCollapse: Self = this.set("groupCollapse", js.undefined)
    
    @scala.inline
    def setGroupExpand(value: /* e */ GridGroupExpandEvent => Unit): Self = this.set("groupExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGroupExpand: Self = this.set("groupExpand", js.undefined)
    
    @scala.inline
    def setGroupable(value: Boolean | GridGroupable): Self = this.set("groupable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupable: Self = this.set("groupable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMessages(value: GridMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMobile(value: Boolean | String): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = this.set("navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatable: Self = this.set("navigatable", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ GridNavigateEvent => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    
    @scala.inline
    def setNoRecords(value: Boolean | GridNoRecords): Self = this.set("noRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRecords: Self = this.set("noRecords", js.undefined)
    
    @scala.inline
    def setPage(value: /* e */ GridPageEvent => Unit): Self = this.set("page", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPageable(value: Boolean | GridPageable): Self = this.set("pageable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageable: Self = this.set("pageable", js.undefined)
    
    @scala.inline
    def setPdf(value: GridPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPdfExport(value: /* e */ GridPdfExportEvent => Unit): Self = this.set("pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePdfExport: Self = this.set("pdfExport", js.undefined)
    
    @scala.inline
    def setPersistSelection(value: Boolean): Self = this.set("persistSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistSelection: Self = this.set("persistSelection", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ GridRemoveEvent => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setReorderable(value: Boolean): Self = this.set("reorderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReorderable: Self = this.set("reorderable", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setRowTemplate(value: String | js.Function): Self = this.set("rowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowTemplate: Self = this.set("rowTemplate", js.undefined)
    
    @scala.inline
    def setSave(value: /* e */ GridSaveEvent => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setSaveChanges(value: /* e */ GridSaveChangesEvent => Unit): Self = this.set("saveChanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSaveChanges: Self = this.set("saveChanges", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | GridScrollable): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    
    @scala.inline
    def setSearch(value: GridSearch): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean | String): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSort(value: /* e */ GridSortEvent => Unit): Self = this.set("sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | GridSortable): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: (String | GridToolbarItem)*): Self = this.set("toolbar", js.Array(value :_*))
    
    @scala.inline
    def setToolbar(value: String | js.Function | (js.Array[String | GridToolbarItem])): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
}
