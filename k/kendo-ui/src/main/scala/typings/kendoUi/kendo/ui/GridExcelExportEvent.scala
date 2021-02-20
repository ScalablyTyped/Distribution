package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.ooxml.Workbook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridExcelExportEvent extends GridEvent {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var workbook: js.UndefOr[Workbook] = js.native
}
object GridExcelExportEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridExcelExportEvent]
  }
  
  @scala.inline
  implicit class GridExcelExportEventMutableBuilder[Self <: GridExcelExportEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setWorkbook(value: Workbook): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkbookUndefined: Self = StObject.set(x, "workbook", js.undefined)
  }
}
