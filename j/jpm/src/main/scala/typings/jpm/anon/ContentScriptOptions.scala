package typings.jpm.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentScriptOptions extends js.Object {
  
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
  implicit class ContentScriptOptionsOps[Self <: ContentScriptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentScriptVarargs(value: String*): Self = this.set("contentScript", js.Array(value :_*))
    
    @scala.inline
    def setContentScript(value: String | js.Array[String]): Self = this.set("contentScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScript: Self = this.set("contentScript", js.undefined)
    
    @scala.inline
    def setContentScriptFileVarargs(value: String*): Self = this.set("contentScriptFile", js.Array(value :_*))
    
    @scala.inline
    def setContentScriptFile(value: String | js.Array[String]): Self = this.set("contentScriptFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScriptFile: Self = this.set("contentScriptFile", js.undefined)
    
    @scala.inline
    def setContentScriptOptions(value: js.Object): Self = this.set("contentScriptOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentScriptOptions: Self = this.set("contentScriptOptions", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ Error => _): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnMessage(value: /* message */ String => _): Self = this.set("onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
  }
}
