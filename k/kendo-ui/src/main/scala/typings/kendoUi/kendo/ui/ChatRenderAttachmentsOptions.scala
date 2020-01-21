package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderAttachmentsOptions extends js.Object {
  var attachmentLayout: js.UndefOr[String] = js.undefined
  var attachments: js.UndefOr[ChatRenderAttachmentsOptionsAttachments] = js.undefined
}

object ChatRenderAttachmentsOptions {
  @scala.inline
  def apply(attachmentLayout: String = null, attachments: ChatRenderAttachmentsOptionsAttachments = null): ChatRenderAttachmentsOptions = {
    val __obj = js.Dynamic.literal()
    if (attachmentLayout != null) __obj.updateDynamic("attachmentLayout")(attachmentLayout.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRenderAttachmentsOptions]
  }
}

