package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderMessageMessage extends js.Object {
  var text: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ChatRenderMessageMessage {
  @scala.inline
  def apply(text: java.lang.String = null, `type`: java.lang.String = null): ChatRenderMessageMessage = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChatRenderMessageMessage]
  }
}

