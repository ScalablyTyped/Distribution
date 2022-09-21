package typings.jpm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentScriptOptions extends StObject {
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptOptions: js.UndefOr[js.Object] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Any]] = js.undefined
  
  var onMessage: js.UndefOr[js.Function1[/* message */ String, Any]] = js.undefined
}
object ContentScriptOptions {
  
  inline def apply(): ContentScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentScriptOptions]
  }
  
  extension [Self <: ContentScriptOptions](x: Self) {
    
    inline def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    inline def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value*))
    
    inline def setContentScriptOptions(value: js.Object): Self = StObject.set(x, "contentScriptOptions", value.asInstanceOf[js.Any])
    
    inline def setContentScriptOptionsUndefined: Self = StObject.set(x, "contentScriptOptions", js.undefined)
    
    inline def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    inline def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value*))
    
    inline def setOnError(value: /* error */ js.Error => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnMessage(value: /* message */ String => Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
  }
}
