package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.ooxml.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetExcelExportEvent
  extends StObject
     with SpreadsheetEvent {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var workbook: js.UndefOr[Workbook] = js.undefined
}
object SpreadsheetExcelExportEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetExcelExportEvent]
  }
  
  extension [Self <: SpreadsheetExcelExportEvent](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setWorkbook(value: Workbook): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
    
    inline def setWorkbookUndefined: Self = StObject.set(x, "workbook", js.undefined)
  }
}
