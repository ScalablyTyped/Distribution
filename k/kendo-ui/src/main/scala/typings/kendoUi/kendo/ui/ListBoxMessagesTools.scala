package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxMessagesTools extends js.Object {
  var moveDown: js.UndefOr[String] = js.native
  var moveUp: js.UndefOr[String] = js.native
  var remove: js.UndefOr[String] = js.native
  var transferAllFrom: js.UndefOr[String] = js.native
  var transferAllTo: js.UndefOr[String] = js.native
  var transferFrom: js.UndefOr[String] = js.native
  var transferTo: js.UndefOr[String] = js.native
}

object ListBoxMessagesTools {
  @scala.inline
  def apply(): ListBoxMessagesTools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxMessagesTools]
  }
  @scala.inline
  implicit class ListBoxMessagesToolsOps[Self <: ListBoxMessagesTools] (val x: Self) extends AnyVal {
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
    def setMoveDown(value: String): Self = this.set("moveDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveDown: Self = this.set("moveDown", js.undefined)
    @scala.inline
    def setMoveUp(value: String): Self = this.set("moveUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveUp: Self = this.set("moveUp", js.undefined)
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setTransferAllFrom(value: String): Self = this.set("transferAllFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferAllFrom: Self = this.set("transferAllFrom", js.undefined)
    @scala.inline
    def setTransferAllTo(value: String): Self = this.set("transferAllTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferAllTo: Self = this.set("transferAllTo", js.undefined)
    @scala.inline
    def setTransferFrom(value: String): Self = this.set("transferFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferFrom: Self = this.set("transferFrom", js.undefined)
    @scala.inline
    def setTransferTo(value: String): Self = this.set("transferTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferTo: Self = this.set("transferTo", js.undefined)
  }
  
}

