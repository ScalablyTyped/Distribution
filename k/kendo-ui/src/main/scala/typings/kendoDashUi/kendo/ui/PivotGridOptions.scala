package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var collapseMember: js.UndefOr[js.Function1[/* e */ PivotGridCollapseMemberEvent, Unit]] = js.undefined
  var columnHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var columnWidth: js.UndefOr[Double] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ PivotGridDataBindingEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ PivotGridDataBoundEvent, Unit]] = js.undefined
  var dataCellTemplate: js.UndefOr[String | js.Function] = js.undefined
  var dataSource: js.UndefOr[js.Any | PivotDataSource] = js.undefined
  var excel: js.UndefOr[PivotGridExcel] = js.undefined
  var excelExport: js.UndefOr[js.Function1[/* e */ PivotGridExcelExportEvent, Unit]] = js.undefined
  var expandMember: js.UndefOr[js.Function1[/* e */ PivotGridExpandMemberEvent, Unit]] = js.undefined
  var filterable: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var kpiStatusTemplate: js.UndefOr[String | js.Function] = js.undefined
  var kpiTrendTemplate: js.UndefOr[String | js.Function] = js.undefined
  var messages: js.UndefOr[PivotGridMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pdf: js.UndefOr[PivotGridPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ PivotGridPdfExportEvent, Unit]] = js.undefined
  var reorderable: js.UndefOr[Boolean] = js.undefined
  var rowHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var sortable: js.UndefOr[Boolean | PivotGridSortable] = js.undefined
}

object PivotGridOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    collapseMember: /* e */ PivotGridCollapseMemberEvent => Unit = null,
    columnHeaderTemplate: String | js.Function = null,
    columnWidth: Int | Double = null,
    dataBinding: /* e */ PivotGridDataBindingEvent => Unit = null,
    dataBound: /* e */ PivotGridDataBoundEvent => Unit = null,
    dataCellTemplate: String | js.Function = null,
    dataSource: js.Any | PivotDataSource = null,
    excel: PivotGridExcel = null,
    excelExport: /* e */ PivotGridExcelExportEvent => Unit = null,
    expandMember: /* e */ PivotGridExpandMemberEvent => Unit = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    kpiStatusTemplate: String | js.Function = null,
    kpiTrendTemplate: String | js.Function = null,
    messages: PivotGridMessages = null,
    name: String = null,
    pdf: PivotGridPdf = null,
    pdfExport: /* e */ PivotGridPdfExportEvent => Unit = null,
    reorderable: js.UndefOr[Boolean] = js.undefined,
    rowHeaderTemplate: String | js.Function = null,
    sortable: Boolean | PivotGridSortable = null
  ): PivotGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (collapseMember != null) __obj.updateDynamic("collapseMember")(js.Any.fromFunction1(collapseMember))
    if (columnHeaderTemplate != null) __obj.updateDynamic("columnHeaderTemplate")(columnHeaderTemplate.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataCellTemplate != null) __obj.updateDynamic("dataCellTemplate")(dataCellTemplate.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (excel != null) __obj.updateDynamic("excel")(excel)
    if (excelExport != null) __obj.updateDynamic("excelExport")(js.Any.fromFunction1(excelExport))
    if (expandMember != null) __obj.updateDynamic("expandMember")(js.Any.fromFunction1(expandMember))
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (kpiStatusTemplate != null) __obj.updateDynamic("kpiStatusTemplate")(kpiStatusTemplate.asInstanceOf[js.Any])
    if (kpiTrendTemplate != null) __obj.updateDynamic("kpiTrendTemplate")(kpiTrendTemplate.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1(pdfExport))
    if (!js.isUndefined(reorderable)) __obj.updateDynamic("reorderable")(reorderable)
    if (rowHeaderTemplate != null) __obj.updateDynamic("rowHeaderTemplate")(rowHeaderTemplate.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridOptions]
  }
}

