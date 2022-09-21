package typings.jpm.anon

import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allow extends StObject {
  
  var allow: js.UndefOr[Script] = js.undefined
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentScriptOptions: js.UndefOr[Any] = js.undefined
  
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.undefined
  
  var contentURL: js.UndefOr[String] = js.undefined
  
  var include: js.UndefOr[String | (js.Array[js.RegExp | String]) | js.RegExp] = js.undefined
  
  var onMessage: js.UndefOr[js.Function1[/* message */ String, Any]] = js.undefined
}
object Allow {
  
  inline def apply(): Allow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allow]
  }
  
  extension [Self <: Allow](x: Self) {
    
    inline def setAllow(value: Script): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    inline def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    inline def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value*))
    
    inline def setContentScriptOptions(value: Any): Self = StObject.set(x, "contentScriptOptions", value.asInstanceOf[js.Any])
    
    inline def setContentScriptOptionsUndefined: Self = StObject.set(x, "contentScriptOptions", js.undefined)
    
    inline def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    inline def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value*))
    
    inline def setContentScriptWhen(value: start | ready | end): Self = StObject.set(x, "contentScriptWhen", value.asInstanceOf[js.Any])
    
    inline def setContentScriptWhenUndefined: Self = StObject.set(x, "contentScriptWhen", js.undefined)
    
    inline def setContentURL(value: String): Self = StObject.set(x, "contentURL", value.asInstanceOf[js.Any])
    
    inline def setContentURLUndefined: Self = StObject.set(x, "contentURL", js.undefined)
    
    inline def setInclude(value: String | (js.Array[js.RegExp | String]) | js.RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setOnMessage(value: /* message */ String => Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
  }
}
