package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridFilterable extends js.Object {
  var extra: js.UndefOr[Boolean] = js.native
  var messages: js.UndefOr[GridFilterableMessages] = js.native
  var mode: js.UndefOr[String] = js.native
  var operators: js.UndefOr[GridFilterableOperators] = js.native
}

object GridFilterable {
  @scala.inline
  def apply(): GridFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFilterable]
  }
  @scala.inline
  implicit class GridFilterableOps[Self <: GridFilterable] (val x: Self) extends AnyVal {
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
    def setMessages(value: GridFilterableMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOperators(value: GridFilterableOperators): Self = this.set("operators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperators: Self = this.set("operators", js.undefined)
  }
  
}

