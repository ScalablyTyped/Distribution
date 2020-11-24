package typings.ltijs.deepLinkingMod

import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.ltijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepLinkingService extends js.Object {
  
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
  implicit class DeepLinkingServiceOps[Self <: DeepLinkingService] (val x: Self) extends AnyVal {
    
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
    def setCreateDeepLinkingForm(value: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`]): Self = this.set("createDeepLinkingForm", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateDeepLinkingMessage(value: (IdToken, js.Array[ContentItem], DeepLinkingMessageOptions) => js.Promise[String | `false`]): Self = this.set("createDeepLinkingMessage", js.Any.fromFunction3(value))
  }
}
