package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridGroupable extends js.Object {
  var compare: js.UndefOr[js.Function] = js.native
  var dir: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var messages: js.UndefOr[GridGroupableMessages] = js.native
  var showFooter: js.UndefOr[Boolean] = js.native
}

object GridGroupable {
  @scala.inline
  def apply(): GridGroupable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGroupable]
  }
  @scala.inline
  implicit class GridGroupableOps[Self <: GridGroupable] (val x: Self) extends AnyVal {
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
    def setCompare(value: js.Function): Self = this.set("compare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMessages(value: GridGroupableMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
  }
  
}

