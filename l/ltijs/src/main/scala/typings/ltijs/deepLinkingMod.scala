package typings.ltijs

import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.ltijsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepLinkingMod {
  
  trait ContentItem extends StObject {
    
    var custom: js.UndefOr[Any] = js.undefined
    
    var title: String
    
    var `type`: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ContentItem {
    
    inline def apply(title: String, `type`: String): ContentItem = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentItem]
    }
    
    extension [Self <: ContentItem](x: Self) {
      
      inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait DeepLinkingMessageOptions extends StObject {
    
    var errlog: js.UndefOr[String] = js.undefined
    
    var errmessage: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object DeepLinkingMessageOptions {
    
    inline def apply(): DeepLinkingMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeepLinkingMessageOptions]
    }
    
    extension [Self <: DeepLinkingMessageOptions](x: Self) {
      
      inline def setErrlog(value: String): Self = StObject.set(x, "errlog", value.asInstanceOf[js.Any])
      
      inline def setErrlogUndefined: Self = StObject.set(x, "errlog", js.undefined)
      
      inline def setErrmessage(value: String): Self = StObject.set(x, "errmessage", value.asInstanceOf[js.Any])
      
      inline def setErrmessageUndefined: Self = StObject.set(x, "errmessage", js.undefined)
      
      inline def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait DeepLinkingService extends StObject {
    
    def createDeepLinkingForm(idtoken: IdToken, contentItems: js.Array[ContentItem], options: DeepLinkingMessageOptions): js.Promise[String | `false`]
    
    def createDeepLinkingMessage(idtoken: IdToken, contentItems: js.Array[ContentItem], options: DeepLinkingMessageOptions): js.Promise[String | `false`]
  }
  object DeepLinkingService {
    
    inline def apply(
      createDeepLinkingForm: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`],
      createDeepLinkingMessage: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`]
    ): DeepLinkingService = {
      val __obj = js.Dynamic.literal(createDeepLinkingForm = js.Any.fromFunction3(createDeepLinkingForm), createDeepLinkingMessage = js.Any.fromFunction3(createDeepLinkingMessage))
      __obj.asInstanceOf[DeepLinkingService]
    }
    
    extension [Self <: DeepLinkingService](x: Self) {
      
      inline def setCreateDeepLinkingForm(value: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`]): Self = StObject.set(x, "createDeepLinkingForm", js.Any.fromFunction3(value))
      
      inline def setCreateDeepLinkingMessage(value: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`]): Self = StObject.set(x, "createDeepLinkingMessage", js.Any.fromFunction3(value))
    }
  }
}
