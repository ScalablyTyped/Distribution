package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.spreadsheet.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetChangeFormatEvent
  extends StObject
     with SpreadsheetEvent {
  
  var range: js.UndefOr[Range] = js.undefined
}
object SpreadsheetChangeFormatEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetChangeFormatEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetChangeFormatEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadsheetChangeFormatEvent] (val x: Self) extends AnyVal {
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
