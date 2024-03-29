package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadCancelEvent
  extends StObject
     with UploadEvent {
  
  var files: js.UndefOr[js.Array[Any]] = js.undefined
}
object UploadCancelEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload): UploadCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadCancelEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadCancelEvent] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: js.Array[Any]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: Any*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
