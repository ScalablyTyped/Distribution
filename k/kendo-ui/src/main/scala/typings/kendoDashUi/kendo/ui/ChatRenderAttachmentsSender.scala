package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderAttachmentsSender extends js.Object {
  var iconUrl: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object ChatRenderAttachmentsSender {
  @scala.inline
  def apply(iconUrl: String = null, id: js.Any = null, name: String = null): ChatRenderAttachmentsSender = {
    val __obj = js.Dynamic.literal()
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRenderAttachmentsSender]
  }
}

