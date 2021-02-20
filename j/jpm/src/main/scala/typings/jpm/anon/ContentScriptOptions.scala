package typings.jpm.anon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentScriptOptions extends StObject {
  
  var contentScript: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentScriptOptions: js.UndefOr[js.Object] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ Error, _]] = js.native
  
  var onMessage: js.UndefOr[js.Function1[/* message */ String, _]] = js.native
}
object ContentScriptOptions {
  
  @scala.inline
  def apply(): ContentScriptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentScriptOptions]
  }
  
  @scala.inline
  implicit class ContentScriptOptionsMutableBuilder[Self <: ContentScriptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
    
    @scala.inline
    def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value :_*))
    
    @scala.inline
    def setContentScriptOptions(value: js.Object): Self = StObject.set(x, "contentScriptOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptOptionsUndefined: Self = StObject.set(x, "contentScriptOptions", js.undefined)
    
    @scala.inline
    def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
    
    @scala.inline
    def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value :_*))
    
    @scala.inline
    def setOnError(value: /* error */ Error => _): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnMessage(value: /* message */ String => _): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
  }
}
