package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadRowDateDescriptor extends js.Object {
  var text: String = js.native
  var textColor: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[String] = js.native
}

object ThreadRowDateDescriptor {
  @scala.inline
  def apply(text: String): ThreadRowDateDescriptor = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowDateDescriptor]
  }
  @scala.inline
  implicit class ThreadRowDateDescriptorOps[Self <: ThreadRowDateDescriptor] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

