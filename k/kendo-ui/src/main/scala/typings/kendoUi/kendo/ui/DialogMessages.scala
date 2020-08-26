package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogMessages extends js.Object {
  var close: js.UndefOr[String] = js.native
  var promptInput: js.UndefOr[String] = js.native
}

object DialogMessages {
  @scala.inline
  def apply(): DialogMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogMessages]
  }
  @scala.inline
  implicit class DialogMessagesOps[Self <: DialogMessages] (val x: Self) extends AnyVal {
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
    def setClose(value: String): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setPromptInput(value: String): Self = this.set("promptInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromptInput: Self = this.set("promptInput", js.undefined)
  }
  
}

