package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorImageBrowserTransport extends StObject {
  
  var create: js.UndefOr[String | EditorImageBrowserTransportCreate] = js.undefined
  
  var destroy: js.UndefOr[String | EditorImageBrowserTransportDestroy] = js.undefined
  
  var imageUrl: js.UndefOr[String | js.Function] = js.undefined
  
  var read: js.UndefOr[String | js.Function | EditorImageBrowserTransportRead] = js.undefined
  
  var thumbnailUrl: js.UndefOr[String | js.Function] = js.undefined
  
  var uploadUrl: js.UndefOr[String] = js.undefined
}
object EditorImageBrowserTransport {
  
  inline def apply(): EditorImageBrowserTransport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserTransport]
  }
  
  extension [Self <: EditorImageBrowserTransport](x: Self) {
    
    inline def setCreate(value: String | EditorImageBrowserTransportCreate): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: String | EditorImageBrowserTransportDestroy): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setImageUrl(value: String | js.Function): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setRead(value: String | js.Function | EditorImageBrowserTransportRead): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setThumbnailUrl(value: String | js.Function): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
