package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadRowAttachmentIconHtmlDescriptor
  extends ThreadRowAttachmentIconDescriptorBase
     with ThreadRowAttachmentIconDescriptor {
  var iconHtml: String = js.native
}

object ThreadRowAttachmentIconHtmlDescriptor {
  @scala.inline
  def apply(iconHtml: String): ThreadRowAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowAttachmentIconHtmlDescriptor]
  }
  @scala.inline
  implicit class ThreadRowAttachmentIconHtmlDescriptorOps[Self <: ThreadRowAttachmentIconHtmlDescriptor] (val x: Self) extends AnyVal {
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

