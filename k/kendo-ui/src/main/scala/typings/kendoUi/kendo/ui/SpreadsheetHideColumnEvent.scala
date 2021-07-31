package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetHideColumnEvent
  extends StObject
     with SpreadsheetEvent {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var sheet: js.UndefOr[Sheet] = js.undefined
}
object SpreadsheetHideColumnEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetHideColumnEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetHideColumnEvent]
  }
  
  @scala.inline
  implicit class SpreadsheetHideColumnEventMutableBuilder[Self <: SpreadsheetHideColumnEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setSheet(value: Sheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
  }
}
