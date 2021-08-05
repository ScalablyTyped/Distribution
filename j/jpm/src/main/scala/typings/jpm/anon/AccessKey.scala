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
  
  inline def apply(label: String): AccessKey = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
  
  extension [Self <: AccessKey](x: Self) {
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setContentScript(value: String): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFile(value: String): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    inline def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    inline def setContext(value: Context | js.Array[Context]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContextVarargs(value: Context*): Self = StObject.set(x, "context", js.Array(value :_*))
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnMessage(value: /* message */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
  }
}
