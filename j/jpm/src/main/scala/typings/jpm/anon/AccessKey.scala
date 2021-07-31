package typings.jpm.anon

import typings.jpm.contextMenuMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKey extends StObject {
  
  var accessKey: js.UndefOr[String] = js.undefined
  
  var contentScript: js.UndefOr[String] = js.undefined
  
  var contentScriptFile: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[Context | js.Array[Context]] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var label: String
  
  var onMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[js.Any], js.Any]] = js.undefined
}
object AccessKey {
  
  @scala.inline
  def apply(label: String): AccessKey = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
  
  @scala.inline
  implicit class AccessKeyMutableBuilder[Self <: AccessKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    @scala.inline
    def setContentScript(value: String): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFile(value: String): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    @scala.inline
    def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    @scala.inline
    def setContext(value: Context | js.Array[Context]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setContextVarargs(value: Context*): Self = StObject.set(x, "context", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessage(value: /* message */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
  }
}
