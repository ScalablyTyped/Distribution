package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmOptions extends js.Object {
  var content: js.UndefOr[String] = js.native
  var initOpen: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.native
  var messages: js.UndefOr[ConfirmMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var open: js.UndefOr[js.Function1[/* e */ DialogEvent, Unit]] = js.native
  var title: js.UndefOr[String | Boolean] = js.native
}

object ConfirmOptions {
  @scala.inline
  def apply(): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmOptions]
  }
  @scala.inline
  implicit class ConfirmOptionsOps[Self <: ConfirmOptions] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setInitOpen(value: /* e */ DialogEvent => Unit): Self = this.set("initOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitOpen: Self = this.set("initOpen", js.undefined)
    @scala.inline
    def setMessages(value: ConfirmMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ DialogEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setTitle(value: String | Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

