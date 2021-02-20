package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadUploadEvent extends UploadEvent {
  
  var XMLHttpRequest: js.UndefOr[js.Any] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var files: js.UndefOr[js.Array[_]] = js.native
  
  var formData: js.UndefOr[js.Any] = js.native
}
object UploadUploadEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload): UploadUploadEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadUploadEvent]
  }
  
  @scala.inline
  implicit class UploadUploadEventMutableBuilder[Self <: UploadUploadEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFiles(value: js.Array[_]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: js.Any*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setXMLHttpRequest(value: js.Any): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMLHttpRequestUndefined: Self = StObject.set(x, "XMLHttpRequest", js.undefined)
  }
}
