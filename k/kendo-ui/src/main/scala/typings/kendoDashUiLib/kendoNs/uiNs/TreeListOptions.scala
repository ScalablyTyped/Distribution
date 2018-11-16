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

