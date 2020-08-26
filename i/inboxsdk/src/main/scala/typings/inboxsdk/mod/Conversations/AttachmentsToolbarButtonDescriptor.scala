package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsToolbarButtonDescriptor extends js.Object {
  var iconUrl: String = js.native
  var tooltip: String = js.native
  def onClick(event: AttachmentsToolbarButtonEvent): Unit = js.native
}

object AttachmentsToolbarButtonDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: AttachmentsToolbarButtonEvent => Unit, tooltip: String): AttachmentsToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsToolbarButtonDescriptor]
  }
  @scala.inline
  implicit class AttachmentsToolbarButtonDescriptorOps[Self <: AttachmentsToolbarButtonDescriptor] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setOnClick(value: AttachmentsToolbarButtonEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

