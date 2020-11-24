package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.TreeListDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListOptions extends js.Object {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var beforeEdit: js.UndefOr[js.Function1[/* e */ TreeListBeforeEditEvent, Unit]] = js.native
  
  var cancel: js.UndefOr[js.Function1[/* e */ TreeListCancelEvent, Unit]] = js.native
  
  var cellClose: js.UndefOr[js.Function1[/* e */ TreeListCellCloseEvent, Unit]] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ TreeListChangeEvent, Unit]] = js.native
  
  var collapse: js.UndefOr[js.Function1[/* e */ TreeListCollapseEvent, Unit]] = js.native
  
  var columnHide: js.UndefOr[js.Function1[/* e */ TreeListColumnHideEvent, Unit]] = js.native
  
  var columnLock: js.UndefOr[js.Function1[/* e */ TreeListColumnLockEvent, Unit]] = js.native
  
  var columnMenu: js.UndefOr[Boolean | TreeListColumnMenu] = js.native
  
  var columnMenuInit: js.UndefOr[js.Function1[/* e */ TreeListColumnMenuInitEvent, Unit]] = js.native
  
  var columnMenuOpen: js.UndefOr[js.Function1[/* e */ TreeListColumnMenuOpenEvent, Unit]] = js.native
  
  var columnReorder: js.UndefOr[js.Function1[/* e */ TreeListColumnReorderEvent, Unit]] = js.native
  
  var columnResize: js.UndefOr[js.Function1[/* e */ TreeListColumnResizeEvent, Unit]] = js.native
  
  var columnShow: js.UndefOr[js.Function1[/* e */ TreeListColumnShowEvent, Unit]] = js.native
  
  var columnUnlock: js.UndefOr[js.Function1[/* e */ TreeListColumnUnlockEvent, Unit]] = js.native
  
  var columns: js.UndefOr[js.Array[TreeListColumn]] = js.native
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ TreeListDataBindingEvent, Unit]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeListDataBoundEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | TreeListDataSource] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ TreeListDragEvent, Unit]] = js.native
  
  var dragend: js.UndefOr[js.Function1[/* e */ TreeListDragendEvent, Unit]] = js.native
  
  var dragstart: js.UndefOr[js.Function1[/* e */ TreeListDragstartEvent, Unit]] = js.native
  
  var drop: js.UndefOr[js.Function1[/* e */ TreeListDropEvent, Unit]] = js.native
  
  var edit: js.UndefOr[js.Function1[/* e */ TreeListEditEvent, Unit]] = js.native
  
  var editable: js.UndefOr[Boolean | TreeListEditable] = js.native
  
  var excel: js.UndefOr[TreeListExcel] = js.native
  
  var excelExport: js.UndefOr[js.Function1[/* e */ TreeListExcelExportEvent, Unit]] = js.native
  
  var expand: js.UndefOr[js.Function1[/* e */ TreeListExpandEvent, Unit]] = js.native
  
  var filterMenuInit: js.UndefOr[js.Function1[/* e */ TreeListFilterMenuInitEvent, Unit]] = js.native
  
  var filterMenuOpen: js.UndefOr[js.Function1[/* e */ TreeListFilterMenuOpenEvent, Unit]] = js.native
  
  var filterable: js.UndefOr[Boolean | TreeListFilterable] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var messages: js.UndefOr[TreeListMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigatable: js.UndefOr[Boolean] = js.native
  
  var pageable: js.UndefOr[Boolean | TreeListPageable] = js.native
  
  var pdf: js.UndefOr[TreeListPdf] = js.native
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ TreeListPdfExportEvent, Unit]] = js.native
  
  var remove: js.UndefOr[js.Function1[/* e */ TreeListRemoveEvent, Unit]] = js.native
  
  var reorderable: js.UndefOr[Boolean] = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var save: js.UndefOr[js.Function1[/* e */ TreeListSaveEvent, Unit]] = js.native
  
  var saveChanges: js.UndefOr[js.Function1[/* e */ TreeListSaveChangesEvent, Unit]] = js.native
  
  var scrollable: js.UndefOr[Boolean | js.Any] = js.native
  
  var selectable: js.UndefOr[Boolean | String] = js.native
  
  var sortable: js.UndefOr[Boolean | TreeListSortable] = js.native
  
  var toolbar: js.UndefOr[js.Array[TreeListToolbarItem] | js.Any] = js.native
}
object TreeListOptions {
  
  @scala.inline
  def apply(): TreeListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListOptions]
  }
  
  @scala.inline
  implicit class TreeListOptionsOps[Self <: TreeListOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setBeforeEdit(value: /* e */ TreeListBeforeEditEvent => Unit): Self = this.set("beforeEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeEdit: Self = this.set("beforeEdit", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ TreeListCancelEvent => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCellClose(value: /* e */ TreeListCellCloseEvent => Unit): Self = this.set("cellClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellClose: Self = this.set("cellClose", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ TreeListChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCollapse(value: /* e */ TreeListCollapseEvent => Unit): Self = this.set("collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setColumnHide(value: /* e */ TreeListColumnHideEvent => Unit): Self = this.set("columnHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnHide: Self = this.set("columnHide", js.undefined)
    
    @scala.inline
    def setColumnLock(value: /* e */ TreeListColumnLockEvent => Unit): Self = this.set("columnLock", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnLock: Self = this.set("columnLock", js.undefined)
    
    @scala.inline
    def setColumnMenu(value: Boolean | TreeListColumnMenu): Self = this.set("columnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnMenu: Self = this.set("columnMenu", js.undefined)
    
    @scala.inline
    def setColumnMenuInit(value: /* e */ TreeListColumnMenuInitEvent => Unit): Self = this.set("columnMenuInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnMenuInit: Self = this.set("columnMenuInit", js.undefined)
    
    @scala.inline
    def setColumnMenuOpen(value: /* e */ TreeListColumnMenuOpenEvent => Unit): Self = this.set("columnMenuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnMenuOpen: Self = this.set("columnMenuOpen", js.undefined)
    
    @scala.inline
    def setColumnReorder(value: /* e */ TreeListColumnReorderEvent => Unit): Self = this.set("columnReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnReorder: Self = this.set("columnReorder", js.undefined)
    
    @scala.inline
    def setColumnResize(value: /* e */ TreeListColumnResizeEvent => Unit): Self = this.set("columnResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnResize: Self = this.set("columnResize", js.undefined)
    
    @scala.inline
    def setColumnShow(value: /* e */ TreeListColumnShowEvent => Unit): Self = this.set("columnShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnShow: Self = this.set("columnShow", js.undefined)
    
    @scala.inline
    def setColumnUnlock(value: /* e */ TreeListColumnUnlockEvent => Unit): Self = this.set("columnUnlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnUnlock: Self = this.set("columnUnlock", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: TreeListColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[TreeListColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ TreeListDataBindingEvent => Unit): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ TreeListDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | TreeListDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ TreeListDragEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragend(value: /* e */ TreeListDragendEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* e */ TreeListDragstartEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ TreeListDropEvent => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setEdit(value: /* e */ TreeListEditEvent => Unit): Self = this.set("edit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | TreeListEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setExcel(value: TreeListExcel): Self = this.set("excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcel: Self = this.set("excel", js.undefined)
    
    @scala.inline
    def setExcelExport(value: /* e */ TreeListExcelExportEvent => Unit): Self = this.set("excelExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExcelExport: Self = this.set("excelExport", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ TreeListExpandEvent => Unit): Self = this.set("expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setFilterMenuInit(value: /* e */ TreeListFilterMenuInitEvent => Unit): Self = this.set("filterMenuInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterMenuInit: Self = this.set("filterMenuInit", js.undefined)
    
    @scala.inline
    def setFilterMenuOpen(value: /* e */ TreeListFilterMenuOpenEvent => Unit): Self = this.set("filterMenuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilterMenuOpen: Self = this.set("filterMenuOpen", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | TreeListFilterable): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMessages(value: TreeListMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = this.set("navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatable: Self = this.set("navigatable", js.undefined)
    
    @scala.inline
    def setPageable(value: Boolean | TreeListPageable): Self = this.set("pageable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageable: Self = this.set("pageable", js.undefined)
    
    @scala.inline
    def setPdf(value: TreeListPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPdfExport(value: /* e */ TreeListPdfExportEvent => Unit): Self = this.set("pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePdfExport: Self = this.set("pdfExport", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ TreeListRemoveEvent => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
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
    def setSave(value: /* e */ TreeListSaveEvent => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setSaveChanges(value: /* e */ TreeListSaveChangesEvent => Unit): Self = this.set("saveChanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSaveChanges: Self = this.set("saveChanges", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | js.Any): Self = this.set("scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollable: Self = this.set("scrollable", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean | String): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | TreeListSortable): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: TreeListToolbarItem*): Self = this.set("toolbar", js.Array(value :_*))
    
    @scala.inline
    def setToolbar(value: js.Array[TreeListToolbarItem] | js.Any): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
}
