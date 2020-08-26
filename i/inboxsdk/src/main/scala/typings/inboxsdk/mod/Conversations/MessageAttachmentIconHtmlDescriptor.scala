package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageAttachmentIconHtmlDescriptor
  extends MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  var iconHtml: String = js.native
}

object MessageAttachmentIconHtmlDescriptor {
  @scala.inline
  def apply(iconHtml: String, tooltip: String | HTMLElement): MessageAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentIconHtmlDescriptor]
  }
  @scala.inline
  implicit class MessageAttachmentIconHtmlDescriptorOps[Self <: MessageAttachmentIconHtmlDescriptor] (val x: Self) extends AnyVal {
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
    def setIconHtml(value: String): Self = this.set("iconHtml", value.asInstanceOf[js.Any])
  }
  
}

