package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListFilterable extends js.Object {
  var extra: js.UndefOr[Boolean] = js.native
  var messages: js.UndefOr[TreeListFilterableMessages] = js.native
  var operators: js.UndefOr[TreeListFilterableOperators] = js.native
}

object TreeListFilterable {
  @scala.inline
  def apply(): TreeListFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListFilterable]
  }
  @scala.inline
  implicit class TreeListFilterableOps[Self <: TreeListFilterable] (val x: Self) extends AnyVal {
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
    def setExtra(value: Boolean): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setMessages(value: TreeListFilterableMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setOperators(value: TreeListFilterableOperators): Self = this.set("operators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperators: Self = this.set("operators", js.undefined)
  }
  
}

