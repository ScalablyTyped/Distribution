package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.TreeListDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var beforeEdit: js.UndefOr[js.Function1[/* e */ TreeListBeforeEditEvent, Unit]] = js.undefined
  
  var cancel: js.UndefOr[js.Function1[/* e */ TreeListCancelEvent, Unit]] = js.undefined
  
  var cellClose: js.UndefOr[js.Function1[/* e */ TreeListCellCloseEvent, Unit]] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ TreeListChangeEvent, Unit]] = js.undefined
  
  var collapse: js.UndefOr[js.Function1[/* e */ TreeListCollapseEvent, Unit]] = js.undefined
  
  var columnHide: js.UndefOr[js.Function1[/* e */ TreeListColumnHideEvent, Unit]] = js.undefined
  
  var columnLock: js.UndefOr[js.Function1[/* e */ TreeListColumnLockEvent, Unit]] = js.undefined
  
  var columnMenu: js.UndefOr[Boolean | TreeListColumnMenu] = js.undefined
  
  var columnMenuInit: js.UndefOr[js.Function1[/* e */ TreeListColumnMenuInitEvent, Unit]] = js.undefined
  
  var columnMenuOpen: js.UndefOr[js.Function1[/* e */ TreeListColumnMenuOpenEvent, Unit]] = js.undefined
  
  var columnReorder: js.UndefOr[js.Function1[/* e */ TreeListColumnReorderEvent, Unit]] = js.undefined
  
  var columnResize: js.UndefOr[js.Function1[/* e */ TreeListColumnResizeEvent, Unit]] = js.undefined
  
  var columnShow: js.UndefOr[js.Function1[/* e */ TreeListColumnShowEvent, Unit]] = js.undefined
  
  var columnUnlock: js.UndefOr[js.Function1[/* e */ TreeListColumnUnlockEvent, Unit]] = js.undefined
  
  var columns: js.UndefOr[js.Array[TreeListColumn]] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ TreeListDataBindingEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeListDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | TreeListDataSource] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ TreeListDragEvent, Unit]] = js.undefined
  
  var dragend: js.UndefOr[js.Function1[/* e */ TreeListDragendEvent, Unit]] = js.undefined
  
  var dragstart: js.UndefOr[js.Function1[/* e */ TreeListDragstartEvent, Unit]] = js.undefined
  
  var drop: js.UndefOr[js.Function1[/* e */ TreeListDropEvent, Unit]] = js.undefined
  
  var edit: js.UndefOr[js.Function1[/* e */ TreeListEditEvent, Unit]] = js.undefined
  
  var editable: js.UndefOr[Boolean | TreeListEditable] = js.undefined
  
  var excel: js.UndefOr[TreeListExcel] = js.undefined
  
  var excelExport: js.UndefOr[js.Function1[/* e */ TreeListExcelExportEvent, Unit]] = js.undefined
  
  var expand: js.UndefOr[js.Function1[/* e */ TreeListExpandEvent, Unit]] = js.undefined
  
  var filterMenuInit: js.UndefOr[js.Function1[/* e */ TreeListFilterMenuInitEvent, Unit]] = js.undefined
  
  var filterMenuOpen: js.UndefOr[js.Function1[/* e */ TreeListFilterMenuOpenEvent, Unit]] = js.undefined
  
  var filterable: js.UndefOr[Boolean | TreeListFilterable] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var messages: js.UndefOr[TreeListMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigatable: js.UndefOr[Boolean] = js.undefined
  
  var pageable: js.UndefOr[Boolean | TreeListPageable] = js.undefined
  
  var pdf: js.UndefOr[TreeListPdf] = js.undefined
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ TreeListPdfExportEvent, Unit]] = js.undefined
  
  var remove: js.UndefOr[js.Function1[/* e */ TreeListRemoveEvent, Unit]] = js.undefined
  
  var reorderable: js.UndefOr[Boolean] = js.undefined
  
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  var save: js.UndefOr[js.Function1[/* e */ TreeListSaveEvent, Unit]] = js.undefined
  
  var saveChanges: js.UndefOr[js.Function1[/* e */ TreeListSaveChangesEvent, Unit]] = js.undefined
  
  var scrollable: js.UndefOr[Boolean | js.Any] = js.undefined
  
  var selectable: js.UndefOr[Boolean | String] = js.undefined
  
  var sortable: js.UndefOr[Boolean | TreeListSortable] = js.undefined
  
  var toolbar: js.UndefOr[js.Array[TreeListToolbarItem] | js.Any] = js.undefined
}
object TreeListOptions {
  
  @scala.inline
  def apply(): TreeListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListOptions]
  }
  
  @scala.inline
  implicit class TreeListOptionsMutableBuilder[Self <: TreeListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setBeforeEdit(value: /* e */ TreeListBeforeEditEvent => Unit): Self = StObject.set(x, "beforeEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeEditUndefined: Self = StObject.set(x, "beforeEdit", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ TreeListCancelEvent => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setCellClose(value: /* e */ TreeListCellCloseEvent => Unit): Self = StObject.set(x, "cellClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellCloseUndefined: Self = StObject.set(x, "cellClose", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ TreeListChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setCollapse(value: /* e */ TreeListCollapseEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setColumnHide(value: /* e */ TreeListColumnHideEvent => Unit): Self = StObject.set(x, "columnHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnHideUndefined: Self = StObject.set(x, "columnHide", js.undefined)
    
    @scala.inline
    def setColumnLock(value: /* e */ TreeListColumnLockEvent => Unit): Self = StObject.set(x, "columnLock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnLockUndefined: Self = StObject.set(x, "columnLock", js.undefined)
    
    @scala.inline
    def setColumnMenu(value: Boolean | TreeListColumnMenu): Self = StObject.set(x, "columnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMenuInit(value: /* e */ TreeListColumnMenuInitEvent => Unit): Self = StObject.set(x, "columnMenuInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnMenuInitUndefined: Self = StObject.set(x, "columnMenuInit", js.undefined)
    
    @scala.inline
    def setColumnMenuOpen(value: /* e */ TreeListColumnMenuOpenEvent => Unit): Self = StObject.set(x, "columnMenuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnMenuOpenUndefined: Self = StObject.set(x, "columnMenuOpen", js.undefined)
    
    @scala.inline
    def setColumnMenuUndefined: Self = StObject.set(x, "columnMenu", js.undefined)
    
    @scala.inline
    def setColumnReorder(value: /* e */ TreeListColumnReorderEvent => Unit): Self = StObject.set(x, "columnReorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnReorderUndefined: Self = StObject.set(x, "columnReorder", js.undefined)
    
    @scala.inline
    def setColumnResize(value: /* e */ TreeListColumnResizeEvent => Unit): Self = StObject.set(x, "columnResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
    
    @scala.inline
    def setColumnShow(value: /* e */ TreeListColumnShowEvent => Unit): Self = StObject.set(x, "columnShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnShowUndefined: Self = StObject.set(x, "columnShow", js.undefined)
    
    @scala.inline
    def setColumnUnlock(value: /* e */ TreeListColumnUnlockEvent => Unit): Self = StObject.set(x, "columnUnlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnUnlockUndefined: Self = StObject.set(x, "columnUnlock", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[TreeListColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: TreeListColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDataBinding(value: /* e */ TreeListDataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ TreeListDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | TreeListDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ TreeListDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDragend(value: /* e */ TreeListDragendEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* e */ TreeListDragstartEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ TreeListDropEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setEdit(value: /* e */ TreeListEditEvent => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | TreeListEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setExcel(value: TreeListExcel): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelExport(value: /* e */ TreeListExcelExportEvent => Unit): Self = StObject.set(x, "excelExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcelExportUndefined: Self = StObject.set(x, "excelExport", js.undefined)
    
    @scala.inline
    def setExcelUndefined: Self = StObject.set(x, "excel", js.undefined)
    
    @scala.inline
    def setExpand(value: /* e */ TreeListExpandEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFilterMenuInit(value: /* e */ TreeListFilterMenuInitEvent => Unit): Self = StObject.set(x, "filterMenuInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterMenuInitUndefined: Self = StObject.set(x, "filterMenuInit", js.undefined)
    
    @scala.inline
    def setFilterMenuOpen(value: /* e */ TreeListFilterMenuOpenEvent => Unit): Self = StObject.set(x, "filterMenuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterMenuOpenUndefined: Self = StObject.set(x, "filterMenuOpen", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | TreeListFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMessages(value: TreeListMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    @scala.inline
    def setPageable(value: Boolean | TreeListPageable): Self = StObject.set(x, "pageable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageableUndefined: Self = StObject.set(x, "pageable", js.undefined)
    
    @scala.inline
    def setPdf(value: TreeListPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfExport(value: /* e */ TreeListPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ TreeListRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
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
    def setSave(value: /* e */ TreeListSaveEvent => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveChanges(value: /* e */ TreeListSaveChangesEvent => Unit): Self = StObject.set(x, "saveChanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveChangesUndefined: Self = StObject.set(x, "saveChanges", js.undefined)
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | js.Any): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean | String): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | TreeListSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setToolbar(value: js.Array[TreeListToolbarItem] | js.Any): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: TreeListToolbarItem*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
  }
}
