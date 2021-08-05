package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridExcelExportEvent
  extends StObject
     with PivotGridEvent {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var workbook: js.UndefOr[js.Any] = js.undefined
}
object PivotGridExcelExportEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PivotGrid): PivotGridExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridExcelExportEvent]
  }
  
  extension [Self <: PivotGridExcelExportEvent](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setWorkbook(value: js.Any): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
    
    inline def setWorkbookUndefined: Self = StObject.set(x, "workbook", js.undefined)
  }
}
