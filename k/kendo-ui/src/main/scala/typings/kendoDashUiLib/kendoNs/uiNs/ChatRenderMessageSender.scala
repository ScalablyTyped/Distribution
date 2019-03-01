package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderMessageSender extends js.Object {
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ChatRenderMessageSender {
  @scala.inline
  def apply(iconUrl: java.lang.String = null, id: js.Any = null, name: java.lang.String = null): ChatRenderMessageSender = {
    val __obj = js.Dynamic.literal()
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ChatRenderMessageSender]
  }
}

