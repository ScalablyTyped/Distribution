package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorFileBrowserTransport extends StObject {
  
  var create: js.UndefOr[String | EditorFileBrowserTransportCreate] = js.native
  
  var destroy: js.UndefOr[String | EditorFileBrowserTransportDestroy] = js.native
  
  var fileUrl: js.UndefOr[String | js.Function] = js.native
  
  var read: js.UndefOr[String | js.Function | EditorFileBrowserTransportRead] = js.native
  
  var uploadUrl: js.UndefOr[String] = js.native
}
object EditorFileBrowserTransport {
  
  @scala.inline
  def apply(): EditorFileBrowserTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowserTransport]
  }
  
  @scala.inline
  implicit class EditorFileBrowserTransportMutableBuilder[Self <: EditorFileBrowserTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: String | EditorFileBrowserTransportCreate): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDestroy(value: String | EditorFileBrowserTransportDestroy): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setFileUrl(value: String | js.Function): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUrlUndefined: Self = StObject.set(x, "fileUrl", js.undefined)
    
    @scala.inline
    def setRead(value: String | js.Function | EditorFileBrowserTransportRead): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
