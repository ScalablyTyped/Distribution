package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorFileBrowser extends StObject {
  
  var fileTypes: js.UndefOr[String] = js.undefined
  
  var messages: js.UndefOr[EditorFileBrowserMessages] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[EditorFileBrowserSchema] = js.undefined
  
  var transport: js.UndefOr[EditorFileBrowserTransport] = js.undefined
}
object EditorFileBrowser {
  
  inline def apply(): EditorFileBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorFileBrowser] (val x: Self) extends AnyVal {
    
    inline def setFileTypes(value: String): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    inline def setMessages(value: EditorFileBrowserMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSchema(value: EditorFileBrowserSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTransport(value: EditorFileBrowserTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
