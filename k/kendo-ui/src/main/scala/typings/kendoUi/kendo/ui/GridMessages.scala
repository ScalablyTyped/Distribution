package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridMessages extends js.Object {
  var commands: js.UndefOr[GridMessagesCommands] = js.native
  var expandCollapseColumnHeader: js.UndefOr[String] = js.native
  var noRecords: js.UndefOr[String] = js.native
}

object GridMessages {
  @scala.inline
  def apply(): GridMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMessages]
  }
  @scala.inline
  implicit class GridMessagesOps[Self <: GridMessages] (val x: Self) extends AnyVal {
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
    def setCommands(value: GridMessagesCommands): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    @scala.inline
    def setExpandCollapseColumnHeader(value: String): Self = this.set("expandCollapseColumnHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandCollapseColumnHeader: Self = this.set("expandCollapseColumnHeader", js.undefined)
    @scala.inline
    def setNoRecords(value: String): Self = this.set("noRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRecords: Self = this.set("noRecords", js.undefined)
  }
  
}

