package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridOptions extends js.Object {
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var collapseMember: js.UndefOr[js.Function1[/* e */ PivotGridCollapseMemberEvent, scala.Unit]] = js.undefined
  var columnHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ PivotGridDataBindingEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ PivotGridDataBoundEvent, scala.Unit]] = js.undefined
  var dataCellTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.PivotDataSource] = js.undefined
  var excel: js.UndefOr[PivotGridExcel] = js.undefined
  var excelExport: js.UndefOr[js.Function1[/* e */ PivotGridExcelExportEvent, scala.Unit]] = js.undefined
  var expandMember: js.UndefOr[js.Function1[/* e */ PivotGridExpandMemberEvent, scala.Unit]] = js.undefined
  var filterable: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var kpiStatusTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var kpiTrendTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var messages: js.UndefOr[PivotGridMessages] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pdf: js.UndefOr[PivotGridPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ PivotGridPdfExportEvent, scala.Unit]] = js.undefined
  var reorderable: js.UndefOr[scala.Boolean] = js.undefined
  var rowHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var sortable: js.UndefOr[scala.Boolean | PivotGridSortable] = js.undefined
}

