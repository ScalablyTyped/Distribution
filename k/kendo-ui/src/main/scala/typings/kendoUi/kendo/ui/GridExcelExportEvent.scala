package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.ooxml.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridExcelExportEvent
  extends StObject
     with GridEvent {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var workbook: js.UndefOr[Workbook] = js.undefined
}
object GridExcelExportEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridExcelExportEvent]
  }
  
  extension [Self <: GridExcelExportEvent](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setWorkbook(value: Workbook): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
    
    inline def setWorkbookUndefined: Self = StObject.set(x, "workbook", js.undefined)
  }
}
