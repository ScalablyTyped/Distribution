package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetRenameSheetEvent extends SpreadsheetEvent {
  
  var newSheetName: js.UndefOr[String] = js.native
  
  var sheet: js.UndefOr[Sheet] = js.native
}
object SpreadsheetRenameSheetEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetRenameSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetRenameSheetEvent]
  }
  
  @scala.inline
  implicit class SpreadsheetRenameSheetEventMutableBuilder[Self <: SpreadsheetRenameSheetEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewSheetName(value: String): Self = StObject.set(x, "newSheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSheetNameUndefined: Self = StObject.set(x, "newSheetName", js.undefined)
    
    @scala.inline
    def setSheet(value: Sheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
  }
}
