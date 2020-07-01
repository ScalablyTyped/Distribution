package typings.ltijs.deepLinkingMod

import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.ltijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepLinkingService extends js.Object {
  def createDeepLinkingForm(idtoken: IdToken, contentItems: js.Array[ContentItem], options: DeepLinkingMessageOptions): js.Promise[String | `false`]
  def createDeepLinkingMessage(idtoken: IdToken, contentItems: js.Array[ContentItem], options: DeepLinkingMessageOptions): js.Promise[String | `false`]
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
}

