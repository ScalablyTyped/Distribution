package typings.jpm.anon

import typings.jpm.FFAddonSDK.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsPrivate extends js.Object {
  
  var isPrivate: js.UndefOr[Boolean] = js.native
  
  var onActivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  
  var onDeactivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  
  var onOpen: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  
  var url: String = js.native
}
object IsPrivate {
  
  @scala.inline
  def apply(url: String): IsPrivate = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrivate]
  }
  
  @scala.inline
  implicit class IsPrivateOps[Self <: IsPrivate] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrivate(value: Boolean): Self = this.set("isPrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrivate: Self = this.set("isPrivate", js.undefined)
    
    @scala.inline
    def setOnActivate(value: /* window */ BrowserWindow => _): Self = this.set("onActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActivate: Self = this.set("onActivate", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* window */ BrowserWindow => _): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnDeactivate(value: /* window */ BrowserWindow => _): Self = this.set("onDeactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDeactivate: Self = this.set("onDeactivate", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* window */ BrowserWindow => _): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
  }
}
