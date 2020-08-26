package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageAttachmentIconUrlDescriptor
  extends MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  var iconUrl: String = js.native
}

object MessageAttachmentIconUrlDescriptor {
  @scala.inline
  def apply(iconUrl: String, tooltip: String | HTMLElement): MessageAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentIconUrlDescriptor]
  }
  @scala.inline
  implicit class MessageAttachmentIconUrlDescriptorOps[Self <: MessageAttachmentIconUrlDescriptor] (val x: Self) extends AnyVal {
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
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
  }
  
}

