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

