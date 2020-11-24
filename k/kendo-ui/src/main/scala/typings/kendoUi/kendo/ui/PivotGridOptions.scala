package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridOptions extends js.Object {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var collapseMember: js.UndefOr[js.Function1[/* e */ PivotGridCollapseMemberEvent, Unit]] = js.native
  
  var columnHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  
  var columnWidth: js.UndefOr[Double] = js.native
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ PivotGridDataBindingEvent, Unit]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ PivotGridDataBoundEvent, Unit]] = js.native
  
  var dataCellTemplate: js.UndefOr[String | js.Function] = js.native
  
  var dataSource: js.UndefOr[js.Any | PivotDataSource] = js.native
  
  var excel: js.UndefOr[PivotGridExcel] = js.native
  
  var excelExport: js.UndefOr[js.Function1[/* e */ PivotGridExcelExportEvent, Unit]] = js.native
  
  var expandMember: js.UndefOr[js.Function1[/* e */ PivotGridExpandMemberEvent, Unit]] = js.native
  
  var filterable: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var kpiStatusTemplate: js.UndefOr[String | js.Function] = js.native
  
  var kpiTrendTemplate: js.UndefOr[String | js.Function] = js.native
  
  var messages: js.UndefOr[PivotGridMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pdf: js.UndefOr[PivotGridPdf] = js.native
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ PivotGridPdfExportEvent, Unit]] = js.native
  
  var reorderable: js.UndefOr[Boolean] = js.native
  
  var rowHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  
  var sortable: js.UndefOr[Boolean | PivotGridSortable] = js.native
}
object PivotGridOptions {
  
  @scala.inline
  def apply(): PivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridOptions]
  }
  
  @scala.inline
  implicit class PivotGridOptionsOps[Self <: PivotGridOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setCollapseMember(value: /* e */ PivotGridCollapseMemberEvent => Unit): Self = this.set("collapseMember", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCollapseMember: Self = this.set("collapseMember", js.undefined)
    
    @scala.inline
    def setColumnHeaderTemplate(value: String | js.Function): Self = this.set("columnHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeaderTemplate: Self = this.set("columnHeaderTemplate", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ PivotGridDataBindingEvent => Unit): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ PivotGridDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataCellTemplate(value: String | js.Function): Self = this.set("dataCellTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCellTemplate: Self = this.set("dataCellTemplate", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | PivotDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setExcel(value: PivotGridExcel): Self = this.set("excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcel: Self = this.set("excel", js.undefined)
    
    @scala.inline
    def setExcelExport(value: /* e */ PivotGridExcelExportEvent => Unit): Self = this.set("excelExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExcelExport: Self = this.set("excelExport", js.undefined)
    
    @scala.inline
    def setExpandMember(value: /* e */ PivotGridExpandMemberEvent => Unit): Self = this.set("expandMember", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandMember: Self = this.set("expandMember", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setKpiStatusTemplate(value: String | js.Function): Self = this.set("kpiStatusTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKpiStatusTemplate: Self = this.set("kpiStatusTemplate", js.undefined)
    
    @scala.inline
    def setKpiTrendTemplate(value: String | js.Function): Self = this.set("kpiTrendTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKpiTrendTemplate: Self = this.set("kpiTrendTemplate", js.undefined)
    
    @scala.inline
    def setMessages(value: PivotGridMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPdf(value: PivotGridPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPdfExport(value: /* e */ PivotGridPdfExportEvent => Unit): Self = this.set("pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePdfExport: Self = this.set("pdfExport", js.undefined)
    
    @scala.inline
    def setReorderable(value: Boolean): Self = this.set("reorderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReorderable: Self = this.set("reorderable", js.undefined)
    
    @scala.inline
    def setRowHeaderTemplate(value: String | js.Function): Self = this.set("rowHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeaderTemplate: Self = this.set("rowHeaderTemplate", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | PivotGridSortable): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
  }
}
