package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions extends js.Object {
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
  var columnUnlock: js.UndefOr[js.Function1[/* e */ GridColumnUnlockEvent, Unit]] = js.undefined
  var columns: js.UndefOr[js.Array[GridColumn]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ GridDataBindingEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ GridDataBoundEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var detailCollapse: js.UndefOr[js.Function1[/* e */ GridDetailCollapseEvent, Unit]] = js.undefined
  var detailExpand: js.UndefOr[js.Function1[/* e */ GridDetailExpandEvent, Unit]] = js.undefined
  var detailInit: js.UndefOr[js.Function1[/* e */ GridDetailInitEvent, Unit]] = js.undefined
  var detailTemplate: js.UndefOr[String | js.Function] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ GridEditEvent, Unit]] = js.undefined
  var editable: js.UndefOr[Boolean | String | GridEditable] = js.undefined
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
  var selectable: js.UndefOr[Boolean | String] = js.undefined
  var sort: js.UndefOr[js.Function1[/* e */ GridSortEvent, Unit]] = js.undefined
  var sortable: js.UndefOr[Boolean | GridSortable] = js.undefined
  var toolbar: js.UndefOr[js.Array[String | GridToolbarItem]] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(
    allowCopy: Boolean | GridAllowCopy = null,
    altRowTemplate: String | js.Function = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    beforeEdit: /* e */ GridBeforeEditEvent => Unit = null,
    cancel: /* e */ GridCancelEvent => Unit = null,
    cellClose: /* e */ GridCellCloseEvent => Unit = null,
    change: /* e */ GridChangeEvent => Unit = null,
    columnHide: /* e */ GridColumnHideEvent => Unit = null,
    columnLock: /* e */ GridColumnLockEvent => Unit = null,
    columnMenu: Boolean | GridColumnMenu = null,
    columnMenuInit: /* e */ GridColumnMenuInitEvent => Unit = null,
    columnMenuOpen: /* e */ GridColumnMenuOpenEvent => Unit = null,
    columnReorder: /* e */ GridColumnReorderEvent => Unit = null,
    columnResize: /* e */ GridColumnResizeEvent => Unit = null,
    columnResizeHandleWidth: Int | Double = null,
    columnShow: /* e */ GridColumnShowEvent => Unit = null,
    columnUnlock: /* e */ GridColumnUnlockEvent => Unit = null,
    columns: js.Array[GridColumn] = null,
    dataBinding: /* e */ GridDataBindingEvent => Unit = null,
    dataBound: /* e */ GridDataBoundEvent => Unit = null,
    dataSource: js.Any | DataSource = null,
    detailCollapse: /* e */ GridDetailCollapseEvent => Unit = null,
    detailExpand: /* e */ GridDetailExpandEvent => Unit = null,
    detailInit: /* e */ GridDetailInitEvent => Unit = null,
    detailTemplate: String | js.Function = null,
    edit: /* e */ GridEditEvent => Unit = null,
    editable: Boolean | String | GridEditable = null,
    excel: GridExcel = null,
    excelExport: /* e */ GridExcelExportEvent => Unit = null,
    filter: /* e */ GridFilterEvent => Unit = null,
    filterMenuInit: /* e */ GridFilterMenuInitEvent => Unit = null,
    filterMenuOpen: /* e */ GridFilterMenuOpenEvent => Unit = null,
    filterable: Boolean | GridFilterable = null,
    group: /* e */ GridGroupEvent => Unit = null,
    groupCollapse: /* e */ GridGroupCollapseEvent => Unit = null,
    groupExpand: /* e */ GridGroupExpandEvent => Unit = null,
    groupable: Boolean | GridGroupable = null,
    height: Double | String = null,
    messages: GridMessages = null,
    mobile: Boolean | String = null,
    name: String = null,
    navigatable: js.UndefOr[Boolean] = js.undefined,
    navigate: /* e */ GridNavigateEvent => Unit = null,
    noRecords: Boolean | GridNoRecords = null,
    page: /* e */ GridPageEvent => Unit = null,
    pageable: Boolean | GridPageable = null,
    pdf: GridPdf = null,
    pdfExport: /* e */ GridPdfExportEvent => Unit = null,
    persistSelection: js.UndefOr[Boolean] = js.undefined,
    remove: /* e */ GridRemoveEvent => Unit = null,
    reorderable: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    rowTemplate: String | js.Function = null,
    save: /* e */ GridSaveEvent => Unit = null,
    saveChanges: /* e */ GridSaveChangesEvent => Unit = null,
    scrollable: Boolean | GridScrollable = null,
    selectable: Boolean | String = null,
    sort: /* e */ GridSortEvent => Unit = null,
    sortable: Boolean | GridSortable = null,
    toolbar: js.Array[String | GridToolbarItem] = null
  ): GridOptions = {
    val __obj = js.Dynamic.literal()
    if (allowCopy != null) __obj.updateDynamic("allowCopy")(allowCopy.asInstanceOf[js.Any])
    if (altRowTemplate != null) __obj.updateDynamic("altRowTemplate")(altRowTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (beforeEdit != null) __obj.updateDynamic("beforeEdit")(js.Any.fromFunction1(beforeEdit))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (cellClose != null) __obj.updateDynamic("cellClose")(js.Any.fromFunction1(cellClose))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (columnHide != null) __obj.updateDynamic("columnHide")(js.Any.fromFunction1(columnHide))
    if (columnLock != null) __obj.updateDynamic("columnLock")(js.Any.fromFunction1(columnLock))
    if (columnMenu != null) __obj.updateDynamic("columnMenu")(columnMenu.asInstanceOf[js.Any])
    if (columnMenuInit != null) __obj.updateDynamic("columnMenuInit")(js.Any.fromFunction1(columnMenuInit))
    if (columnMenuOpen != null) __obj.updateDynamic("columnMenuOpen")(js.Any.fromFunction1(columnMenuOpen))
    if (columnReorder != null) __obj.updateDynamic("columnReorder")(js.Any.fromFunction1(columnReorder))
    if (columnResize != null) __obj.updateDynamic("columnResize")(js.Any.fromFunction1(columnResize))
    if (columnResizeHandleWidth != null) __obj.updateDynamic("columnResizeHandleWidth")(columnResizeHandleWidth.asInstanceOf[js.Any])
    if (columnShow != null) __obj.updateDynamic("columnShow")(js.Any.fromFunction1(columnShow))
    if (columnUnlock != null) __obj.updateDynamic("columnUnlock")(js.Any.fromFunction1(columnUnlock))
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (detailCollapse != null) __obj.updateDynamic("detailCollapse")(js.Any.fromFunction1(detailCollapse))
    if (detailExpand != null) __obj.updateDynamic("detailExpand")(js.Any.fromFunction1(detailExpand))
    if (detailInit != null) __obj.updateDynamic("detailInit")(js.Any.fromFunction1(detailInit))
    if (detailTemplate != null) __obj.updateDynamic("detailTemplate")(detailTemplate.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1(edit))
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (excel != null) __obj.updateDynamic("excel")(excel)
    if (excelExport != null) __obj.updateDynamic("excelExport")(js.Any.fromFunction1(excelExport))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (filterMenuInit != null) __obj.updateDynamic("filterMenuInit")(js.Any.fromFunction1(filterMenuInit))
    if (filterMenuOpen != null) __obj.updateDynamic("filterMenuOpen")(js.Any.fromFunction1(filterMenuOpen))
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(js.Any.fromFunction1(group))
    if (groupCollapse != null) __obj.updateDynamic("groupCollapse")(js.Any.fromFunction1(groupCollapse))
    if (groupExpand != null) __obj.updateDynamic("groupExpand")(js.Any.fromFunction1(groupExpand))
    if (groupable != null) __obj.updateDynamic("groupable")(groupable.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable)
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1(navigate))
    if (noRecords != null) __obj.updateDynamic("noRecords")(noRecords.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(js.Any.fromFunction1(page))
    if (pageable != null) __obj.updateDynamic("pageable")(pageable.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1(pdfExport))
    if (!js.isUndefined(persistSelection)) __obj.updateDynamic("persistSelection")(persistSelection)
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (!js.isUndefined(reorderable)) __obj.updateDynamic("reorderable")(reorderable)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (saveChanges != null) __obj.updateDynamic("saveChanges")(js.Any.fromFunction1(saveChanges))
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction1(sort))
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[GridOptions]
  }
}

