package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatRenderAttachmentsOptions extends js.Object {
  var attachmentLayout: js.UndefOr[String] = js.native
  var attachments: js.UndefOr[ChatRenderAttachmentsOptionsAttachments] = js.native
}

object ChatRenderAttachmentsOptions {
  @scala.inline
  def apply(): ChatRenderAttachmentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderAttachmentsOptions]
  }
  @scala.inline
  implicit class ChatRenderAttachmentsOptionsOps[Self <: ChatRenderAttachmentsOptions] (val x: Self) extends AnyVal {
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
    def setAttachmentLayout(value: String): Self = this.set("attachmentLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentLayout: Self = this.set("attachmentLayout", js.undefined)
    @scala.inline
    def setAttachments(value: ChatRenderAttachmentsOptionsAttachments): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
  }
  
}

