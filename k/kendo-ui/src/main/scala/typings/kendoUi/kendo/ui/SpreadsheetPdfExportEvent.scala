package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetPdfExportEvent
  extends StObject
     with SpreadsheetEvent {
  
  var promise: js.UndefOr[JQueryPromise[Any]] = js.undefined
}
object SpreadsheetPdfExportEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetPdfExportEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadsheetPdfExportEvent] (val x: Self) extends AnyVal {
    
    inline def setPromise(value: JQueryPromise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
