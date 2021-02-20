package typings.ltijs

import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.ltijsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepLinkingMod {
  
  @js.native
  trait ContentItem extends StObject {
    
    var custom: js.UndefOr[js.Any] = js.native
    
    var title: String = js.native
    
    var `type`: String = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object ContentItem {
    
    @scala.inline
    def apply(title: String, `type`: String): ContentItem = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentItem]
    }
    
    @scala.inline
    implicit class ContentItemMutableBuilder[Self <: ContentItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait DeepLinkingMessageOptions extends StObject {
    
    var errlog: js.UndefOr[String] = js.native
    
    var errmessage: js.UndefOr[String] = js.native
    
    var log: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
  }
  object DeepLinkingMessageOptions {
    
    @scala.inline
    def apply(): DeepLinkingMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepLinkingMessageOptions]
    }
    
    @scala.inline
    implicit class DeepLinkingMessageOptionsMutableBuilder[Self <: DeepLinkingMessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrlog(value: String): Self = StObject.set(x, "errlog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrlogUndefined: Self = StObject.set(x, "errlog", js.undefined)
      
      @scala.inline
      def setErrmessage(value: String): Self = StObject.set(x, "errmessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrmessageUndefined: Self = StObject.set(x, "errmessage", js.undefined)
      
      @scala.inline
      def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait DeepLinkingService extends StObject {
    
    def createDeepLinkingForm(idtoken: IdToken, contentItems: js.Array[ContentItem], options: DeepLinkingMessageOptions): js.Promise[String | `false`] = js.native
    
    def createDeepLinkingMessage(idtoken: IdToken, contentItems: js.Array[ContentItem], options: DeepLinkingMessageOptions): js.Promise[String | `false`] = js.native
  }
  object DeepLinkingService {
    
    @scala.inline
    def apply(
      createDeepLinkingForm: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`],
      createDeepLinkingMessage: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`]
    ): DeepLinkingService = {
      val __obj = js.Dynamic.literal(createDeepLinkingForm = js.Any.fromFunction3(createDeepLinkingForm), createDeepLinkingMessage = js.Any.fromFunction3(createDeepLinkingMessage))
      __obj.asInstanceOf[DeepLinkingService]
    }
    
    @scala.inline
    implicit class DeepLinkingServiceMutableBuilder[Self <: DeepLinkingService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateDeepLinkingForm(value: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`]): Self = StObject.set(x, "createDeepLinkingForm", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateDeepLinkingMessage(value: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`]): Self = StObject.set(x, "createDeepLinkingMessage", js.Any.fromFunction3(value))
    }
  }
}
