package typings.jpm.anon

import typings.jpm.FFAddonSDK.SDKURL
import typings.jpm.requestMod.STResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content[ResponseType] extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[String | js.Object] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var onComplete: js.UndefOr[js.Function1[/* response */ STResponse[ResponseType], js.Any]] = js.undefined
  
  var overrideMimeType: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String | SDKURL] = js.undefined
}
object Content {
  
  @scala.inline
  def apply[ResponseType](): Content[ResponseType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content[ResponseType]]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content[?], ResponseType] (val x: Self & Content[ResponseType]) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    @scala.inline
    def setContent(value: String | js.Object): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* response */ STResponse[ResponseType] => js.Any): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    @scala.inline
    def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    @scala.inline
    def setUrl(value: String | SDKURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
