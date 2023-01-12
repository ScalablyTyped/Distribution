package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorFileBrowserTransport extends StObject {
  
  var create: js.UndefOr[String | EditorFileBrowserTransportCreate] = js.undefined
  
  var destroy: js.UndefOr[String | EditorFileBrowserTransportDestroy] = js.undefined
  
  var fileUrl: js.UndefOr[String | js.Function] = js.undefined
  
  var read: js.UndefOr[String | js.Function | EditorFileBrowserTransportRead] = js.undefined
  
  var uploadUrl: js.UndefOr[String] = js.undefined
}
object EditorFileBrowserTransport {
  
  inline def apply(): EditorFileBrowserTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowserTransport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorFileBrowserTransport] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: String | EditorFileBrowserTransportCreate): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: String | EditorFileBrowserTransportDestroy): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setFileUrl(value: String | js.Function): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
    
    inline def setFileUrlUndefined: Self = StObject.set(x, "fileUrl", js.undefined)
    
    inline def setRead(value: String | js.Function | EditorFileBrowserTransportRead): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
