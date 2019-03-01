package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderAttachmentsOptions extends js.Object {
  var attachmentLayout: js.UndefOr[java.lang.String] = js.undefined
  var attachments: js.UndefOr[ChatRenderAttachmentsOptionsAttachments] = js.undefined
}

object ChatRenderAttachmentsOptions {
  @scala.inline
  def apply(
    attachmentLayout: java.lang.String = null,
    attachments: ChatRenderAttachmentsOptionsAttachments = null
  ): ChatRenderAttachmentsOptions = {
    val __obj = js.Dynamic.literal()
    if (attachmentLayout != null) __obj.updateDynamic("attachmentLayout")(attachmentLayout)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    __obj.asInstanceOf[ChatRenderAttachmentsOptions]
  }
}

