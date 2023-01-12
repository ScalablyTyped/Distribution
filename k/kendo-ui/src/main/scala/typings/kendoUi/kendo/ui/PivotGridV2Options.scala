package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.PivotDataSourceV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridV2Options extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var collapseMember: js.UndefOr[js.Function1[/* e */ PivotGridV2CollapseMemberEvent, Unit]] = js.undefined
  
  var columnHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var columnWidth: js.UndefOr[Double] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ PivotGridV2DataBindingEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ PivotGridV2DataBoundEvent, Unit]] = js.undefined
  
  var dataCellTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var dataSource: js.UndefOr[Any | PivotDataSourceV2] = js.undefined
  
  var expandMember: js.UndefOr[js.Function1[/* e */ PivotGridV2ExpandMemberEvent, Unit]] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pdf: js.UndefOr[PivotGridV2Pdf] = js.undefined
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ PivotGridV2PdfExportEvent, Unit]] = js.undefined
  
  var rowHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
}
object PivotGridV2Options {
  
  inline def apply(): PivotGridV2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridV2Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotGridV2Options] (val x: Self) extends AnyVal {
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setCollapseMember(value: /* e */ PivotGridV2CollapseMemberEvent => Unit): Self = StObject.set(x, "collapseMember", js.Any.fromFunction1(value))
    
    inline def setCollapseMemberUndefined: Self = StObject.set(x, "collapseMember", js.undefined)
    
    inline def setColumnHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "columnHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderTemplateUndefined: Self = StObject.set(x, "columnHeaderTemplate", js.undefined)
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setDataBinding(value: /* e */ PivotGridV2DataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ PivotGridV2DataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataCellTemplate(value: String | js.Function): Self = StObject.set(x, "dataCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setDataCellTemplateUndefined: Self = StObject.set(x, "dataCellTemplate", js.undefined)
    
    inline def setDataSource(value: Any | PivotDataSourceV2): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setExpandMember(value: /* e */ PivotGridV2ExpandMemberEvent => Unit): Self = StObject.set(x, "expandMember", js.Any.fromFunction1(value))
    
    inline def setExpandMemberUndefined: Self = StObject.set(x, "expandMember", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPdf(value: PivotGridV2Pdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfExport(value: /* e */ PivotGridV2PdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    inline def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setRowHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "rowHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setRowHeaderTemplateUndefined: Self = StObject.set(x, "rowHeaderTemplate", js.undefined)
  }
}
