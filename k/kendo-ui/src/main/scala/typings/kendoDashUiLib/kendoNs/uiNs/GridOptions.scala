package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions extends js.Object {
  var allowCopy: js.UndefOr[scala.Boolean | GridAllowCopy] = js.undefined
  var altRowTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var beforeEdit: js.UndefOr[js.Function1[/* e */ GridBeforeEditEvent, scala.Unit]] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ GridCancelEvent, scala.Unit]] = js.undefined
  var cellClose: js.UndefOr[js.Function1[/* e */ GridCellCloseEvent, scala.Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ GridChangeEvent, scala.Unit]] = js.undefined
  var columnHide: js.UndefOr[js.Function1[/* e */ GridColumnHideEvent, scala.Unit]] = js.undefined
  var columnLock: js.UndefOr[js.Function1[/* e */ GridColumnLockEvent, scala.Unit]] = js.undefined
  var columnMenu: js.UndefOr[scala.Boolean | GridColumnMenu] = js.undefined
  var columnMenuInit: js.UndefOr[js.Function1[/* e */ GridColumnMenuInitEvent, scala.Unit]] = js.undefined
  var columnMenuOpen: js.UndefOr[js.Function1[/* e */ GridColumnMenuOpenEvent, scala.Unit]] = js.undefined
  var columnReorder: js.UndefOr[js.Function1[/* e */ GridColumnReorderEvent, scala.Unit]] = js.undefined
  var columnResize: js.UndefOr[js.Function1[/* e */ GridColumnResizeEvent, scala.Unit]] = js.undefined
  var columnResizeHandleWidth: js.UndefOr[scala.Double] = js.undefined
  var columnShow: js.UndefOr[js.Function1[/* e */ GridColumnShowEvent, scala.Unit]] = js.undefined
  var columnUnlock: js.UndefOr[js.Function1[/* e */ GridColumnUnlockEvent, scala.Unit]] = js.undefined
  var columns: js.UndefOr[js.Array[GridColumn]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ GridDataBindingEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ GridDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var detailCollapse: js.UndefOr[js.Function1[/* e */ GridDetailCollapseEvent, scala.Unit]] = js.undefined
  var detailExpand: js.UndefOr[js.Function1[/* e */ GridDetailExpandEvent, scala.Unit]] = js.undefined
  var detailInit: js.UndefOr[js.Function1[/* e */ GridDetailInitEvent, scala.Unit]] = js.undefined
  var detailTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ GridEditEvent, scala.Unit]] = js.undefined
  var editable: js.UndefOr[scala.Boolean | java.lang.String | GridEditable] = js.undefined
  var excel: js.UndefOr[GridExcel] = js.undefined
  var excelExport: js.UndefOr[js.Function1[/* e */ GridExcelExportEvent, scala.Unit]] = js.undefined
  var filter: js.UndefOr[js.Function1[/* e */ GridFilterEvent, scala.Unit]] = js.undefined
  var filterMenuInit: js.UndefOr[js.Function1[/* e */ GridFilterMenuInitEvent, scala.Unit]] = js.undefined
  var filterMenuOpen: js.UndefOr[js.Function1[/* e */ GridFilterMenuOpenEvent, scala.Unit]] = js.undefined
  var filterable: js.UndefOr[scala.Boolean | GridFilterable] = js.undefined
  var group: js.UndefOr[js.Function1[/* e */ GridGroupEvent, scala.Unit]] = js.undefined
  var groupCollapse: js.UndefOr[js.Function1[/* e */ GridGroupCollapseEvent, scala.Unit]] = js.undefined
  var groupExpand: js.UndefOr[js.Function1[/* e */ GridGroupExpandEvent, scala.Unit]] = js.undefined
  var groupable: js.UndefOr[scala.Boolean | GridGroupable] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var messages: js.UndefOr[GridMessages] = js.undefined
  var mobile: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigatable: js.UndefOr[scala.Boolean] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ GridNavigateEvent, scala.Unit]] = js.undefined
  var noRecords: js.UndefOr[scala.Boolean | GridNoRecords] = js.undefined
  var page: js.UndefOr[js.Function1[/* e */ GridPageEvent, scala.Unit]] = js.undefined
  var pageable: js.UndefOr[scala.Boolean | GridPageable] = js.undefined
  var pdf: js.UndefOr[GridPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ GridPdfExportEvent, scala.Unit]] = js.undefined
  var persistSelection: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ GridRemoveEvent, scala.Unit]] = js.undefined
  var reorderable: js.UndefOr[scala.Boolean] = js.undefined
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var rowTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ GridSaveEvent, scala.Unit]] = js.undefined
  var saveChanges: js.UndefOr[js.Function1[/* e */ GridSaveChangesEvent, scala.Unit]] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean | GridScrollable] = js.undefined
  var selectable: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var sort: js.UndefOr[js.Function1[/* e */ GridSortEvent, scala.Unit]] = js.undefined
  var sortable: js.UndefOr[scala.Boolean | GridSortable] = js.undefined
  var toolbar: js.UndefOr[js.Array[java.lang.String | GridToolbarItem]] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(
    allowCopy: scala.Boolean | GridAllowCopy = null,
    altRowTemplate: java.lang.String | js.Function = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    beforeEdit: js.Function1[/* e */ GridBeforeEditEvent, scala.Unit] = null,
    cancel: js.Function1[/* e */ GridCancelEvent, scala.Unit] = null,
    cellClose: js.Function1[/* e */ GridCellCloseEvent, scala.Unit] = null,
    change: js.Function1[/* e */ GridChangeEvent, scala.Unit] = null,
    columnHide: js.Function1[/* e */ GridColumnHideEvent, scala.Unit] = null,
    columnLock: js.Function1[/* e */ GridColumnLockEvent, scala.Unit] = null,
    columnMenu: scala.Boolean | GridColumnMenu = null,
    columnMenuInit: js.Function1[/* e */ GridColumnMenuInitEvent, scala.Unit] = null,
    columnMenuOpen: js.Function1[/* e */ GridColumnMenuOpenEvent, scala.Unit] = null,
    columnReorder: js.Function1[/* e */ GridColumnReorderEvent, scala.Unit] = null,
    columnResize: js.Function1[/* e */ GridColumnResizeEvent, scala.Unit] = null,
    columnResizeHandleWidth: scala.Int | scala.Double = null,
    columnShow: js.Function1[/* e */ GridColumnShowEvent, scala.Unit] = null,
    columnUnlock: js.Function1[/* e */ GridColumnUnlockEvent, scala.Unit] = null,
    columns: js.Array[GridColumn] = null,
    dataBinding: js.Function1[/* e */ GridDataBindingEvent, scala.Unit] = null,
    dataBound: js.Function1[/* e */ GridDataBoundEvent, scala.Unit] = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    detailCollapse: js.Function1[/* e */ GridDetailCollapseEvent, scala.Unit] = null,
    detailExpand: js.Function1[/* e */ GridDetailExpandEvent, scala.Unit] = null,
    detailInit: js.Function1[/* e */ GridDetailInitEvent, scala.Unit] = null,
    detailTemplate: java.lang.String | js.Function = null,
    edit: js.Function1[/* e */ GridEditEvent, scala.Unit] = null,
    editable: scala.Boolean | java.lang.String | GridEditable = null,
    excel: GridExcel = null,
    excelExport: js.Function1[/* e */ GridExcelExportEvent, scala.Unit] = null,
    filter: js.Function1[/* e */ GridFilterEvent, scala.Unit] = null,
    filterMenuInit: js.Function1[/* e */ GridFilterMenuInitEvent, scala.Unit] = null,
    filterMenuOpen: js.Function1[/* e */ GridFilterMenuOpenEvent, scala.Unit] = null,
    filterable: scala.Boolean | GridFilterable = null,
    group: js.Function1[/* e */ GridGroupEvent, scala.Unit] = null,
    groupCollapse: js.Function1[/* e */ GridGroupCollapseEvent, scala.Unit] = null,
    groupExpand: js.Function1[/* e */ GridGroupExpandEvent, scala.Unit] = null,
    groupable: scala.Boolean | GridGroupable = null,
    height: scala.Double | java.lang.String = null,
    messages: GridMessages = null,
    mobile: scala.Boolean | java.lang.String = null,
    name: java.lang.String = null,
    navigatable: js.UndefOr[scala.Boolean] = js.undefined,
    navigate: js.Function1[/* e */ GridNavigateEvent, scala.Unit] = null,
    noRecords: scala.Boolean | GridNoRecords = null,
    page: js.Function1[/* e */ GridPageEvent, scala.Unit] = null,
    pageable: scala.Boolean | GridPageable = null,
    pdf: GridPdf = null,
    pdfExport: js.Function1[/* e */ GridPdfExportEvent, scala.Unit] = null,
    persistSelection: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.Function1[/* e */ GridRemoveEvent, scala.Unit] = null,
    reorderable: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    rowTemplate: java.lang.String | js.Function = null,
    save: js.Function1[/* e */ GridSaveEvent, scala.Unit] = null,
    saveChanges: js.Function1[/* e */ GridSaveChangesEvent, scala.Unit] = null,
    scrollable: scala.Boolean | GridScrollable = null,
    selectable: scala.Boolean | java.lang.String = null,
    sort: js.Function1[/* e */ GridSortEvent, scala.Unit] = null,
    sortable: scala.Boolean | GridSortable = null,
    toolbar: js.Array[java.lang.String | GridToolbarItem] = null
  ): GridOptions = {
    val __obj = js.Dynamic.literal()
    if (allowCopy != null) __obj.updateDynamic("allowCopy")(allowCopy.asInstanceOf[js.Any])
    if (altRowTemplate != null) __obj.updateDynamic("altRowTemplate")(altRowTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (beforeEdit != null) __obj.updateDynamic("beforeEdit")(beforeEdit)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (cellClose != null) __obj.updateDynamic("cellClose")(cellClose)
    if (change != null) __obj.updateDynamic("change")(change)
    if (columnHide != null) __obj.updateDynamic("columnHide")(columnHide)
    if (columnLock != null) __obj.updateDynamic("columnLock")(columnLock)
    if (columnMenu != null) __obj.updateDynamic("columnMenu")(columnMenu.asInstanceOf[js.Any])
    if (columnMenuInit != null) __obj.updateDynamic("columnMenuInit")(columnMenuInit)
    if (columnMenuOpen != null) __obj.updateDynamic("columnMenuOpen")(columnMenuOpen)
    if (columnReorder != null) __obj.updateDynamic("columnReorder")(columnReorder)
    if (columnResize != null) __obj.updateDynamic("columnResize")(columnResize)
    if (columnResizeHandleWidth != null) __obj.updateDynamic("columnResizeHandleWidth")(columnResizeHandleWidth.asInstanceOf[js.Any])
    if (columnShow != null) __obj.updateDynamic("columnShow")(columnShow)
    if (columnUnlock != null) __obj.updateDynamic("columnUnlock")(columnUnlock)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (detailCollapse != null) __obj.updateDynamic("detailCollapse")(detailCollapse)
    if (detailExpand != null) __obj.updateDynamic("detailExpand")(detailExpand)
    if (detailInit != null) __obj.updateDynamic("detailInit")(detailInit)
    if (detailTemplate != null) __obj.updateDynamic("detailTemplate")(detailTemplate.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (excel != null) __obj.updateDynamic("excel")(excel)
    if (excelExport != null) __obj.updateDynamic("excelExport")(excelExport)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterMenuInit != null) __obj.updateDynamic("filterMenuInit")(filterMenuInit)
    if (filterMenuOpen != null) __obj.updateDynamic("filterMenuOpen")(filterMenuOpen)
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (groupCollapse != null) __obj.updateDynamic("groupCollapse")(groupCollapse)
    if (groupExpand != null) __obj.updateDynamic("groupExpand")(groupExpand)
    if (groupable != null) __obj.updateDynamic("groupable")(groupable.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable)
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
    if (noRecords != null) __obj.updateDynamic("noRecords")(noRecords.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page)
    if (pageable != null) __obj.updateDynamic("pageable")(pageable.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(pdfExport)
    if (!js.isUndefined(persistSelection)) __obj.updateDynamic("persistSelection")(persistSelection)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (!js.isUndefined(reorderable)) __obj.updateDynamic("reorderable")(reorderable)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save)
    if (saveChanges != null) __obj.updateDynamic("saveChanges")(saveChanges)
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[GridOptions]
  }
}

