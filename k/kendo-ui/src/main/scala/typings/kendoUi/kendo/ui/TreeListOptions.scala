package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.TreeListDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListOptions extends StObject {
  
  var altRowTemplate: js.UndefOr[String | js.Function] = js.undefined
  
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
  
  var dataSource: js.UndefOr[Any | TreeListDataSource] = js.undefined
  
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
  
  var rowTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var save: js.UndefOr[js.Function1[/* e */ TreeListSaveEvent, Unit]] = js.undefined
  
  var saveChanges: js.UndefOr[js.Function1[/* e */ TreeListSaveChangesEvent, Unit]] = js.undefined
  
  var scrollable: js.UndefOr[Boolean | Any] = js.undefined
  
  var search: js.UndefOr[TreeListSearch] = js.undefined
  
  var selectable: js.UndefOr[Boolean | String] = js.undefined
  
  var sortable: js.UndefOr[Boolean | TreeListSortable] = js.undefined
  
  var toolbar: js.UndefOr[(js.Array[ToolBarItem | TreeListToolbarItem]) | Any] = js.undefined
}
object TreeListOptions {
  
  inline def apply(): TreeListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeListOptions] (val x: Self) extends AnyVal {
    
    inline def setAltRowTemplate(value: String | js.Function): Self = StObject.set(x, "altRowTemplate", value.asInstanceOf[js.Any])
    
    inline def setAltRowTemplateUndefined: Self = StObject.set(x, "altRowTemplate", js.undefined)
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setBeforeEdit(value: /* e */ TreeListBeforeEditEvent => Unit): Self = StObject.set(x, "beforeEdit", js.Any.fromFunction1(value))
    
    inline def setBeforeEditUndefined: Self = StObject.set(x, "beforeEdit", js.undefined)
    
    inline def setCancel(value: /* e */ TreeListCancelEvent => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setCellClose(value: /* e */ TreeListCellCloseEvent => Unit): Self = StObject.set(x, "cellClose", js.Any.fromFunction1(value))
    
    inline def setCellCloseUndefined: Self = StObject.set(x, "cellClose", js.undefined)
    
    inline def setChange(value: /* e */ TreeListChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setCollapse(value: /* e */ TreeListCollapseEvent => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction1(value))
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setColumnHide(value: /* e */ TreeListColumnHideEvent => Unit): Self = StObject.set(x, "columnHide", js.Any.fromFunction1(value))
    
    inline def setColumnHideUndefined: Self = StObject.set(x, "columnHide", js.undefined)
    
    inline def setColumnLock(value: /* e */ TreeListColumnLockEvent => Unit): Self = StObject.set(x, "columnLock", js.Any.fromFunction1(value))
    
    inline def setColumnLockUndefined: Self = StObject.set(x, "columnLock", js.undefined)
    
    inline def setColumnMenu(value: Boolean | TreeListColumnMenu): Self = StObject.set(x, "columnMenu", value.asInstanceOf[js.Any])
    
    inline def setColumnMenuInit(value: /* e */ TreeListColumnMenuInitEvent => Unit): Self = StObject.set(x, "columnMenuInit", js.Any.fromFunction1(value))
    
    inline def setColumnMenuInitUndefined: Self = StObject.set(x, "columnMenuInit", js.undefined)
    
    inline def setColumnMenuOpen(value: /* e */ TreeListColumnMenuOpenEvent => Unit): Self = StObject.set(x, "columnMenuOpen", js.Any.fromFunction1(value))
    
    inline def setColumnMenuOpenUndefined: Self = StObject.set(x, "columnMenuOpen", js.undefined)
    
    inline def setColumnMenuUndefined: Self = StObject.set(x, "columnMenu", js.undefined)
    
    inline def setColumnReorder(value: /* e */ TreeListColumnReorderEvent => Unit): Self = StObject.set(x, "columnReorder", js.Any.fromFunction1(value))
    
    inline def setColumnReorderUndefined: Self = StObject.set(x, "columnReorder", js.undefined)
    
    inline def setColumnResize(value: /* e */ TreeListColumnResizeEvent => Unit): Self = StObject.set(x, "columnResize", js.Any.fromFunction1(value))
    
    inline def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
    
    inline def setColumnShow(value: /* e */ TreeListColumnShowEvent => Unit): Self = StObject.set(x, "columnShow", js.Any.fromFunction1(value))
    
    inline def setColumnShowUndefined: Self = StObject.set(x, "columnShow", js.undefined)
    
    inline def setColumnUnlock(value: /* e */ TreeListColumnUnlockEvent => Unit): Self = StObject.set(x, "columnUnlock", js.Any.fromFunction1(value))
    
    inline def setColumnUnlockUndefined: Self = StObject.set(x, "columnUnlock", js.undefined)
    
    inline def setColumns(value: js.Array[TreeListColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: TreeListColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDataBinding(value: /* e */ TreeListDataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ TreeListDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any | TreeListDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDrag(value: /* e */ TreeListDragEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDragend(value: /* e */ TreeListDragendEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
    
    inline def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
    
    inline def setDragstart(value: /* e */ TreeListDragstartEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
    
    inline def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
    
    inline def setDrop(value: /* e */ TreeListDropEvent => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setEdit(value: /* e */ TreeListEditEvent => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setEditable(value: Boolean | TreeListEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setExcel(value: TreeListExcel): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    inline def setExcelExport(value: /* e */ TreeListExcelExportEvent => Unit): Self = StObject.set(x, "excelExport", js.Any.fromFunction1(value))
    
    inline def setExcelExportUndefined: Self = StObject.set(x, "excelExport", js.undefined)
    
    inline def setExcelUndefined: Self = StObject.set(x, "excel", js.undefined)
    
    inline def setExpand(value: /* e */ TreeListExpandEvent => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFilterMenuInit(value: /* e */ TreeListFilterMenuInitEvent => Unit): Self = StObject.set(x, "filterMenuInit", js.Any.fromFunction1(value))
    
    inline def setFilterMenuInitUndefined: Self = StObject.set(x, "filterMenuInit", js.undefined)
    
    inline def setFilterMenuOpen(value: /* e */ TreeListFilterMenuOpenEvent => Unit): Self = StObject.set(x, "filterMenuOpen", js.Any.fromFunction1(value))
    
    inline def setFilterMenuOpenUndefined: Self = StObject.set(x, "filterMenuOpen", js.undefined)
    
    inline def setFilterable(value: Boolean | TreeListFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMessages(value: TreeListMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    inline def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    inline def setPageable(value: Boolean | TreeListPageable): Self = StObject.set(x, "pageable", value.asInstanceOf[js.Any])
    
    inline def setPageableUndefined: Self = StObject.set(x, "pageable", js.undefined)
    
    inline def setPdf(value: TreeListPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfExport(value: /* e */ TreeListPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    inline def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setRemove(value: /* e */ TreeListRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    inline def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setRowTemplate(value: String | js.Function): Self = StObject.set(x, "rowTemplate", value.asInstanceOf[js.Any])
    
    inline def setRowTemplateUndefined: Self = StObject.set(x, "rowTemplate", js.undefined)
    
    inline def setSave(value: /* e */ TreeListSaveEvent => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    inline def setSaveChanges(value: /* e */ TreeListSaveChangesEvent => Unit): Self = StObject.set(x, "saveChanges", js.Any.fromFunction1(value))
    
    inline def setSaveChangesUndefined: Self = StObject.set(x, "saveChanges", js.undefined)
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setScrollable(value: Boolean | Any): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    inline def setSearch(value: TreeListSearch): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSelectable(value: Boolean | String): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSortable(value: Boolean | TreeListSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setToolbar(value: (js.Array[ToolBarItem | TreeListToolbarItem]) | Any): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setToolbarVarargs(value: (ToolBarItem | TreeListToolbarItem)*): Self = StObject.set(x, "toolbar", js.Array(value*))
  }
}
