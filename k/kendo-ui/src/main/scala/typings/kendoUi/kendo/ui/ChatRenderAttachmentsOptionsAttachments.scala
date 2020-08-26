package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatRenderAttachmentsOptionsAttachments extends js.Object {
  var content: js.UndefOr[js.Any] = js.native
  var contentType: js.UndefOr[String] = js.native
}

object ChatRenderAttachmentsOptionsAttachments {
  @scala.inline
  def apply(): ChatRenderAttachmentsOptionsAttachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderAttachmentsOptionsAttachments]
  }
  @scala.inline
  implicit class ChatRenderAttachmentsOptionsAttachmentsOps[Self <: ChatRenderAttachmentsOptionsAttachments] (val x: Self) extends AnyVal {
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
  }
  
}

