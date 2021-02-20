package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadSuccessEvent extends UploadEvent {
  
  var XMLHttpRequest: js.UndefOr[js.Any] = js.native
  
  var files: js.UndefOr[js.Array[_]] = js.native
  
  var operation: js.UndefOr[String] = js.native
  
  var response: js.UndefOr[js.Any] = js.native
}
object UploadSuccessEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload): UploadSuccessEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSuccessEvent]
  }
  
  @scala.inline
  implicit class UploadSuccessEventMutableBuilder[Self <: UploadSuccessEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[_]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: js.Any*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setXMLHttpRequest(value: js.Any): Self = StObject.set(x, "XMLHttpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMLHttpRequestUndefined: Self = StObject.set(x, "XMLHttpRequest", js.undefined)
  }
}
