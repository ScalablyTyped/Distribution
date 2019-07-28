package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderMessageMessage extends js.Object {
  var text: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ChatRenderMessageMessage {
  @scala.inline
  def apply(text: String = null, `type`: String = null): ChatRenderMessageMessage = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChatRenderMessageMessage]
  }
}

