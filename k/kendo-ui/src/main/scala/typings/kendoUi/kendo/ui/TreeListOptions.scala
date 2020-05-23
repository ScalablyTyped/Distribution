package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.TreeListDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListOptions extends js.Object {
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
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    beforeEdit: /* e */ TreeListBeforeEditEvent => Unit = null,
    cancel: /* e */ TreeListCancelEvent => Unit = null,
    cellClose: /* e */ TreeListCellCloseEvent => Unit = null,
    change: /* e */ TreeListChangeEvent => Unit = null,
    collapse: /* e */ TreeListCollapseEvent => Unit = null,
    columnHide: /* e */ TreeListColumnHideEvent => Unit = null,
    columnLock: /* e */ TreeListColumnLockEvent => Unit = null,
    columnMenu: Boolean | TreeListColumnMenu = null,
    columnMenuInit: /* e */ TreeListColumnMenuInitEvent => Unit = null,
    columnMenuOpen: /* e */ TreeListColumnMenuOpenEvent => Unit = null,
    columnReorder: /* e */ TreeListColumnReorderEvent => Unit = null,
    columnResize: /* e */ TreeListColumnResizeEvent => Unit = null,
    columnShow: /* e */ TreeListColumnShowEvent => Unit = null,
    columnUnlock: /* e */ TreeListColumnUnlockEvent => Unit = null,
    columns: js.Array[TreeListColumn] = null,
    dataBinding: /* e */ TreeListDataBindingEvent => Unit = null,
    dataBound: /* e */ TreeListDataBoundEvent => Unit = null,
    dataSource: js.Any | TreeListDataSource = null,
    drag: /* e */ TreeListDragEvent => Unit = null,
    dragend: /* e */ TreeListDragendEvent => Unit = null,
    dragstart: /* e */ TreeListDragstartEvent => Unit = null,
    drop: /* e */ TreeListDropEvent => Unit = null,
    edit: /* e */ TreeListEditEvent => Unit = null,
    editable: Boolean | TreeListEditable = null,
    excel: TreeListExcel = null,
    excelExport: /* e */ TreeListExcelExportEvent => Unit = null,
    expand: /* e */ TreeListExpandEvent => Unit = null,
    filterMenuInit: /* e */ TreeListFilterMenuInitEvent => Unit = null,
    filterMenuOpen: /* e */ TreeListFilterMenuOpenEvent => Unit = null,
    filterable: Boolean | TreeListFilterable = null,
    height: Double | String = null,
    messages: TreeListMessages = null,
    name: String = null,
    navigatable: js.UndefOr[Boolean] = js.undefined,
    pageable: Boolean | TreeListPageable = null,
    pdf: TreeListPdf = null,
    pdfExport: /* e */ TreeListPdfExportEvent => Unit = null,
    remove: /* e */ TreeListRemoveEvent => Unit = null,
    reorderable: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    save: /* e */ TreeListSaveEvent => Unit = null,
    saveChanges: /* e */ TreeListSaveChangesEvent => Unit = null,
    scrollable: Boolean | js.Any = null,
    selectable: Boolean | String = null,
    sortable: Boolean | TreeListSortable = null,
    toolbar: js.Array[TreeListToolbarItem] | js.Any = null
  ): TreeListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.get.asInstanceOf[js.Any])
    if (beforeEdit != null) __obj.updateDynamic("beforeEdit")(js.Any.fromFunction1(beforeEdit))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (cellClose != null) __obj.updateDynamic("cellClose")(js.Any.fromFunction1(cellClose))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1(collapse))
    if (columnHide != null) __obj.updateDynamic("columnHide")(js.Any.fromFunction1(columnHide))
    if (columnLock != null) __obj.updateDynamic("columnLock")(js.Any.fromFunction1(columnLock))
    if (columnMenu != null) __obj.updateDynamic("columnMenu")(columnMenu.asInstanceOf[js.Any])
    if (columnMenuInit != null) __obj.updateDynamic("columnMenuInit")(js.Any.fromFunction1(columnMenuInit))
    if (columnMenuOpen != null) __obj.updateDynamic("columnMenuOpen")(js.Any.fromFunction1(columnMenuOpen))
    if (columnReorder != null) __obj.updateDynamic("columnReorder")(js.Any.fromFunction1(columnReorder))
    if (columnResize != null) __obj.updateDynamic("columnResize")(js.Any.fromFunction1(columnResize))
    if (columnShow != null) __obj.updateDynamic("columnShow")(js.Any.fromFunction1(columnShow))
    if (columnUnlock != null) __obj.updateDynamic("columnUnlock")(js.Any.fromFunction1(columnUnlock))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1(edit))
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (excel != null) __obj.updateDynamic("excel")(excel.asInstanceOf[js.Any])
    if (excelExport != null) __obj.updateDynamic("excelExport")(js.Any.fromFunction1(excelExport))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1(expand))
    if (filterMenuInit != null) __obj.updateDynamic("filterMenuInit")(js.Any.fromFunction1(filterMenuInit))
    if (filterMenuOpen != null) __obj.updateDynamic("filterMenuOpen")(js.Any.fromFunction1(filterMenuOpen))
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable.get.asInstanceOf[js.Any])
    if (pageable != null) __obj.updateDynamic("pageable")(pageable.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1(pdfExport))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (!js.isUndefined(reorderable)) __obj.updateDynamic("reorderable")(reorderable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (saveChanges != null) __obj.updateDynamic("saveChanges")(js.Any.fromFunction1(saveChanges))
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListOptions]
  }
}

