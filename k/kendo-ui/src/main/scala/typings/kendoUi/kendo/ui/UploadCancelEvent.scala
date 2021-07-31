package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadCancelEvent
  extends StObject
     with UploadEvent {
  
  var files: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object UploadCancelEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload): UploadCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadCancelEvent]
  }
  
  @scala.inline
  implicit class UploadCancelEventMutableBuilder[Self <: UploadCancelEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[js.Any]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: js.Any*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
