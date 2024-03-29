package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetDataBindingEvent
  extends StObject
     with SpreadsheetEvent {
  
  var sheet: js.UndefOr[Sheet] = js.undefined
}
object SpreadsheetDataBindingEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetDataBindingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetDataBindingEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadsheetDataBindingEvent] (val x: Self) extends AnyVal {
    
    inline def setSheet(value: Sheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
  }
}
