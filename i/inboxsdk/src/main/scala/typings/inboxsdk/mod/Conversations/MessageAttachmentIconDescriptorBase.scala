package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageAttachmentIconDescriptorBase extends js.Object {
  var iconClass: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var tooltip: String | HTMLElement = js.native
}

object MessageAttachmentIconDescriptorBase {
  @scala.inline
  def apply(tooltip: String | HTMLElement): MessageAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentIconDescriptorBase]
  }
  @scala.inline
  implicit class MessageAttachmentIconDescriptorBaseOps[Self <: MessageAttachmentIconDescriptorBase] (val x: Self) extends AnyVal {
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
    def setTooltip(value: String | HTMLElement): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

