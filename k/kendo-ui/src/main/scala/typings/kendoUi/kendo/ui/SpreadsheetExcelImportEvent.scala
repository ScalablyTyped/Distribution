package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryPromise
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetExcelImportEvent
  extends StObject
     with SpreadsheetEvent {
  
  var file: js.UndefOr[Blob | File] = js.undefined
  
  var progress: js.UndefOr[JQueryPromise[Any]] = js.undefined
}
object SpreadsheetExcelImportEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetExcelImportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetExcelImportEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadsheetExcelImportEvent] (val x: Self) extends AnyVal {
    
    inline def setFile(value: Blob | File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setProgress(value: JQueryPromise[Any]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
