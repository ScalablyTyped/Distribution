package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatMessages extends js.Object {
  var placeholder: js.UndefOr[String] = js.native
  var sendButton: js.UndefOr[String] = js.native
  var toggleButton: js.UndefOr[String] = js.native
}

object ChatMessages {
  @scala.inline
  def apply(): ChatMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessages]
  }
  @scala.inline
  implicit class ChatMessagesOps[Self <: ChatMessages] (val x: Self) extends AnyVal {
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
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSendButton(value: String): Self = this.set("sendButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendButton: Self = this.set("sendButton", js.undefined)
    @scala.inline
    def setToggleButton(value: String): Self = this.set("toggleButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleButton: Self = this.set("toggleButton", js.undefined)
  }
  
}

