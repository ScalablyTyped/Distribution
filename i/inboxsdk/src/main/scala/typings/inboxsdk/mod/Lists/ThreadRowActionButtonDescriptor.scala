package typings.inboxsdk.mod.Lists

import typings.inboxsdk.inboxsdkStrings.LINK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadRowActionButtonDescriptor extends js.Object {
  var className: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var title: String = js.native
  var `type`: LINK = js.native
  var url: String = js.native
}

object ThreadRowActionButtonDescriptor {
  @scala.inline
  def apply(title: String, `type`: LINK, url: String): ThreadRowActionButtonDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowActionButtonDescriptor]
  }
  @scala.inline
  implicit class ThreadRowActionButtonDescriptorOps[Self <: ThreadRowActionButtonDescriptor] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: LINK): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

