package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadRowButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[Boolean] = js.native
  var iconClass: js.UndefOr[String] = js.native
  var iconUrl: String = js.native
  var title: String = js.native
  def onClick(event: ThreadRowButtonClickEvent): Unit = js.native
}

object ThreadRowButtonDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: ThreadRowButtonClickEvent => Unit, title: String): ThreadRowButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonDescriptor]
  }
  @scala.inline
  implicit class ThreadRowButtonDescriptorOps[Self <: ThreadRowButtonDescriptor] (val x: Self) extends AnyVal {
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
    def setOnClick(value: ThreadRowButtonClickEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasDropdown(value: Boolean): Self = this.set("hasDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDropdown: Self = this.set("hasDropdown", js.undefined)
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
  }
  
}

