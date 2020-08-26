package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListColumnMenu extends js.Object {
  var columns: js.UndefOr[Boolean] = js.native
  var filterable: js.UndefOr[Boolean] = js.native
  var messages: js.UndefOr[TreeListColumnMenuMessages] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
}

object TreeListColumnMenu {
  @scala.inline
  def apply(): TreeListColumnMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnMenu]
  }
  @scala.inline
  implicit class TreeListColumnMenuOps[Self <: TreeListColumnMenu] (val x: Self) extends AnyVal {
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
    def setColumns(value: Boolean): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    @scala.inline
    def setMessages(value: TreeListColumnMenuMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
  }
  
}

