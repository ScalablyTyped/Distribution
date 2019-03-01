package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListOptions extends js.Object {
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var beforeEdit: js.UndefOr[js.Function1[/* e */ TreeListBeforeEditEvent, scala.Unit]] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ TreeListCancelEvent, scala.Unit]] = js.undefined
  var cellClose: js.UndefOr[js.Function1[/* e */ TreeListCellCloseEvent, scala.Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ TreeListChangeEvent, scala.Unit]] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ TreeListCollapseEvent, scala.Unit]] = js.undefined
  var columnHide: js.UndefOr[js.Function1[/* e */ TreeListColumnHideEvent, scala.Unit]] = js.undefined
  var columnLock: js.UndefOr[js.Function1[/* e */ TreeListColumnLockEvent, scala.Unit]] = js.undefined
  var columnMenu: js.UndefOr[scala.Boolean | TreeListColumnMenu] = js.undefined
  var columnMenuInit: js.UndefOr[js.Function1[/* e */ TreeListColumnMenuInitEvent, scala.Unit]] = js.undefined
  var columnMenuOpen: js.UndefOr[js.Function1[/* e */ TreeListColumnMenuOpenEvent, scala.Unit]] = js.undefined
  var columnReorder: js.UndefOr[js.Function1[/* e */ TreeListColumnReorderEvent, scala.Unit]] = js.undefined
  var columnResize: js.UndefOr[js.Function1[/* e */ TreeListColumnResizeEvent, scala.Unit]] = js.undefined
  var columnShow: js.UndefOr[js.Function1[/* e */ TreeListColumnShowEvent, scala.Unit]] = js.undefined
  var columnUnlock: js.UndefOr[js.Function1[/* e */ TreeListColumnUnlockEvent, scala.Unit]] = js.undefined
  var columns: js.UndefOr[js.Array[TreeListColumn]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ TreeListDataBindingEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ TreeListDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.TreeListDataSource] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ TreeListDragEvent, scala.Unit]] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ TreeListDragendEvent, scala.Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ TreeListDragstartEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ TreeListDropEvent, scala.Unit]] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ TreeListEditEvent, scala.Unit]] = js.undefined
  var editable: js.UndefOr[scala.Boolean | TreeListEditable] = js.undefined
  var excel: js.UndefOr[TreeListExcel] = js.undefined
  var excelExport: js.UndefOr[js.Function1[/* e */ TreeListExcelExportEvent, scala.Unit]] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ TreeListExpandEvent, scala.Unit]] = js.undefined
  var filterMenuInit: js.UndefOr[js.Function1[/* e */ TreeListFilterMenuInitEvent, scala.Unit]] = js.undefined
  var filterMenuOpen: js.UndefOr[js.Function1[/* e */ TreeListFilterMenuOpenEvent, scala.Unit]] = js.undefined
  var filterable: js.UndefOr[scala.Boolean | TreeListFilterable] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var messages: js.UndefOr[TreeListMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigatable: js.UndefOr[scala.Boolean] = js.undefined
  var pageable: js.UndefOr[scala.Boolean | TreeListPageable] = js.undefined
  var pdf: js.UndefOr[TreeListPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ TreeListPdfExportEvent, scala.Unit]] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ TreeListRemoveEvent, scala.Unit]] = js.undefined
  var reorderable: js.UndefOr[scala.Boolean] = js.undefined
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ TreeListSaveEvent, scala.Unit]] = js.undefined
  var saveChanges: js.UndefOr[js.Function1[/* e */ TreeListSaveChangesEvent, scala.Unit]] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean | js.Any] = js.undefined
  var selectable: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var sortable: js.UndefOr[scala.Boolean | TreeListSortable] = js.undefined
  var toolbar: js.UndefOr[js.Array[TreeListToolbarItem] | js.Any] = js.undefined
}

object TreeListOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    beforeEdit: js.Function1[/* e */ TreeListBeforeEditEvent, scala.Unit] = null,
    cancel: js.Function1[/* e */ TreeListCancelEvent, scala.Unit] = null,
    cellClose: js.Function1[/* e */ TreeListCellCloseEvent, scala.Unit] = null,
    change: js.Function1[/* e */ TreeListChangeEvent, scala.Unit] = null,
    collapse: js.Function1[/* e */ TreeListCollapseEvent, scala.Unit] = null,
    columnHide: js.Function1[/* e */ TreeListColumnHideEvent, scala.Unit] = null,
    columnLock: js.Function1[/* e */ TreeListColumnLockEvent, scala.Unit] = null,
    columnMenu: scala.Boolean | TreeListColumnMenu = null,
    columnMenuInit: js.Function1[/* e */ TreeListColumnMenuInitEvent, scala.Unit] = null,
    columnMenuOpen: js.Function1[/* e */ TreeListColumnMenuOpenEvent, scala.Unit] = null,
    columnReorder: js.Function1[/* e */ TreeListColumnReorderEvent, scala.Unit] = null,
    columnResize: js.Function1[/* e */ TreeListColumnResizeEvent, scala.Unit] = null,
    columnShow: js.Function1[/* e */ TreeListColumnShowEvent, scala.Unit] = null,
    columnUnlock: js.Function1[/* e */ TreeListColumnUnlockEvent, scala.Unit] = null,
    columns: js.Array[TreeListColumn] = null,
    dataBinding: js.Function1[/* e */ TreeListDataBindingEvent, scala.Unit] = null,
    dataBound: js.Function1[/* e */ TreeListDataBoundEvent, scala.Unit] = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.TreeListDataSource = null,
    drag: js.Function1[/* e */ TreeListDragEvent, scala.Unit] = null,
    dragend: js.Function1[/* e */ TreeListDragendEvent, scala.Unit] = null,
    dragstart: js.Function1[/* e */ TreeListDragstartEvent, scala.Unit] = null,
    drop: js.Function1[/* e */ TreeListDropEvent, scala.Unit] = null,
    edit: js.Function1[/* e */ TreeListEditEvent, scala.Unit] = null,
    editable: scala.Boolean | TreeListEditable = null,
    excel: TreeListExcel = null,
    excelExport: js.Function1[/* e */ TreeListExcelExportEvent, scala.Unit] = null,
    expand: js.Function1[/* e */ TreeListExpandEvent, scala.Unit] = null,
    filterMenuInit: js.Function1[/* e */ TreeListFilterMenuInitEvent, scala.Unit] = null,
    filterMenuOpen: js.Function1[/* e */ TreeListFilterMenuOpenEvent, scala.Unit] = null,
    filterable: scala.Boolean | TreeListFilterable = null,
    height: scala.Double | java.lang.String = null,
    messages: TreeListMessages = null,
    name: java.lang.String = null,
    navigatable: js.UndefOr[scala.Boolean] = js.undefined,
    pageable: scala.Boolean | TreeListPageable = null,
    pdf: TreeListPdf = null,
    pdfExport: js.Function1[/* e */ TreeListPdfExportEvent, scala.Unit] = null,
    remove: js.Function1[/* e */ TreeListRemoveEvent, scala.Unit] = null,
    reorderable: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    save: js.Function1[/* e */ TreeListSaveEvent, scala.Unit] = null,
    saveChanges: js.Function1[/* e */ TreeListSaveChangesEvent, scala.Unit] = null,
    scrollable: scala.Boolean | js.Any = null,
    selectable: scala.Boolean | java.lang.String = null,
    sortable: scala.Boolean | TreeListSortable = null,
    toolbar: js.Array[TreeListToolbarItem] | js.Any = null
  ): TreeListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (beforeEdit != null) __obj.updateDynamic("beforeEdit")(beforeEdit)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (cellClose != null) __obj.updateDynamic("cellClose")(cellClose)
    if (change != null) __obj.updateDynamic("change")(change)
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (columnHide != null) __obj.updateDynamic("columnHide")(columnHide)
    if (columnLock != null) __obj.updateDynamic("columnLock")(columnLock)
    if (columnMenu != null) __obj.updateDynamic("columnMenu")(columnMenu.asInstanceOf[js.Any])
    if (columnMenuInit != null) __obj.updateDynamic("columnMenuInit")(columnMenuInit)
    if (columnMenuOpen != null) __obj.updateDynamic("columnMenuOpen")(columnMenuOpen)
    if (columnReorder != null) __obj.updateDynamic("columnReorder")(columnReorder)
    if (columnResize != null) __obj.updateDynamic("columnResize")(columnResize)
    if (columnShow != null) __obj.updateDynamic("columnShow")(columnShow)
    if (columnUnlock != null) __obj.updateDynamic("columnUnlock")(columnUnlock)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragend != null) __obj.updateDynamic("dragend")(dragend)
    if (dragstart != null) __obj.updateDynamic("dragstart")(dragstart)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (excel != null) __obj.updateDynamic("excel")(excel)
    if (excelExport != null) __obj.updateDynamic("excelExport")(excelExport)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (filterMenuInit != null) __obj.updateDynamic("filterMenuInit")(filterMenuInit)
    if (filterMenuOpen != null) __obj.updateDynamic("filterMenuOpen")(filterMenuOpen)
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable)
    if (pageable != null) __obj.updateDynamic("pageable")(pageable.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(pdfExport)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (!js.isUndefined(reorderable)) __obj.updateDynamic("reorderable")(reorderable)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (save != null) __obj.updateDynamic("save")(save)
    if (saveChanges != null) __obj.updateDynamic("saveChanges")(saveChanges)
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListOptions]
  }
}

