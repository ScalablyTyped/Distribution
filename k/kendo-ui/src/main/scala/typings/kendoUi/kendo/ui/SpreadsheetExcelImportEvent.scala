package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryPromise
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetExcelImportEvent extends SpreadsheetEvent {
  
  var file: js.UndefOr[Blob | File] = js.native
  
  var progress: js.UndefOr[JQueryPromise[_]] = js.native
}
object SpreadsheetExcelImportEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetExcelImportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetExcelImportEvent]
  }
  
  @scala.inline
  implicit class SpreadsheetExcelImportEventMutableBuilder[Self <: SpreadsheetExcelImportEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: Blob | File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setProgress(value: JQueryPromise[_]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
  }
}
