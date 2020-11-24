package typings.jpm.anon

import typings.jpm.FFAddonSDK.SDKURL
import typings.jpm.requestMod.STResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content[ResponseType] extends js.Object {
  
  var anonymous: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[String | js.Object] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* response */ STResponse[ResponseType], _]] = js.native
  
  var overrideMimeType: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String | SDKURL] = js.native
}
object Content {
  
  @scala.inline
  def apply[ResponseType](): Content[ResponseType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content[ResponseType]]
  }
  
  @scala.inline
  implicit class ContentOps[Self <: Content[_], ResponseType] (val x: Self with Content[ResponseType]) extends AnyVal {
    
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
    def setAnonymous(value: Boolean): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    
    @scala.inline
    def setContent(value: String | js.Object): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* response */ STResponse[ResponseType] => _): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOverrideMimeType(value: String): Self = this.set("overrideMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideMimeType: Self = this.set("overrideMimeType", js.undefined)
    
    @scala.inline
    def setUrl(value: String | SDKURL): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
