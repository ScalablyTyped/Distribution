package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetRenameSheetEvent
  extends StObject
     with SpreadsheetEvent {
  
  var newSheetName: js.UndefOr[String] = js.undefined
  
  var sheet: js.UndefOr[Sheet] = js.undefined
}
object SpreadsheetRenameSheetEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetRenameSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetRenameSheetEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadsheetRenameSheetEvent] (val x: Self) extends AnyVal {
    
    inline def setNewSheetName(value: String): Self = StObject.set(x, "newSheetName", value.asInstanceOf[js.Any])
    
    inline def setNewSheetNameUndefined: Self = StObject.set(x, "newSheetName", js.undefined)
    
    inline def setSheet(value: Sheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
  }
}
