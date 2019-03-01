package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderAttachmentsOptionsAttachments extends js.Object {
  var content: js.UndefOr[js.Any] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
}

object ChatRenderAttachmentsOptionsAttachments {
  @scala.inline
  def apply(content: js.Any = null, contentType: java.lang.String = null): ChatRenderAttachmentsOptionsAttachments = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    __obj.asInstanceOf[ChatRenderAttachmentsOptionsAttachments]
  }
}

