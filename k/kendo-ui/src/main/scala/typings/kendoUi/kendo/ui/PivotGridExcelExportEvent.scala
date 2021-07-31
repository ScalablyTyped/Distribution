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
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: PivotGrid): PivotGridExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridExcelExportEvent]
  }
  
  @scala.inline
  implicit class PivotGridExcelExportEventMutableBuilder[Self <: PivotGridExcelExportEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setWorkbook(value: js.Any): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkbookUndefined: Self = StObject.set(x, "workbook", js.undefined)
  }
}
