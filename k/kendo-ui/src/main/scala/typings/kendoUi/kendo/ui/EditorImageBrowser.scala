package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorImageBrowser extends StObject {
  
  var fileTypes: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[EditorImageBrowserMessages] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var schema: js.UndefOr[EditorImageBrowserSchema] = js.native
  
  var transport: js.UndefOr[EditorImageBrowserTransport] = js.native
}
object EditorImageBrowser {
  
  @scala.inline
  def apply(): EditorImageBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowser]
  }
  
  @scala.inline
  implicit class EditorImageBrowserMutableBuilder[Self <: EditorImageBrowser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileTypes(value: String): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    @scala.inline
    def setMessages(value: EditorImageBrowserMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSchema(value: EditorImageBrowserSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setTransport(value: EditorImageBrowserTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}
