package typings.jpm.anon

import typings.jpm.jpmStrings.end
import typings.jpm.jpmStrings.ready
import typings.jpm.jpmStrings.start
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allow extends StObject {
  
  var allow: js.UndefOr[Script] = js.native
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptOptions: js.UndefOr[js.Any] = js.native
  
  var contentScriptWhen: js.UndefOr[start | ready | end] = js.native
  
  var contentURL: js.UndefOr[String] = js.native
  
  var include: js.UndefOr[String | (js.Array[RegExp | String]) | RegExp] = js.native
  
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.native
}
object Allow {
  
  @scala.inline
  def apply(): Allow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allow]
  }
  
  @scala.inline
  implicit class AllowMutableBuilder[Self <: Allow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: Script): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    @scala.inline
    def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    @scala.inline
    def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value :_*))
    
    @scala.inline
    def setContentScriptOptions(value: js.Any): Self = StObject.set(x, "contentScriptOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptOptionsUndefined: Self = StObject.set(x, "contentScriptOptions", js.undefined)
    
    @scala.inline
    def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    @scala.inline
    def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value :_*))
    
    @scala.inline
    def setContentScriptWhen(value: start | ready | end): Self = StObject.set(x, "contentScriptWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptWhenUndefined: Self = StObject.set(x, "contentScriptWhen", js.undefined)
    
    @scala.inline
    def setContentURL(value: String): Self = StObject.set(x, "contentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentURLUndefined: Self = StObject.set(x, "contentURL", js.undefined)
    
    @scala.inline
    def setInclude(value: String | (js.Array[RegExp | String]) | RegExp): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (RegExp | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setOnMessage(value: /* message */ String => _): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
  }
}
