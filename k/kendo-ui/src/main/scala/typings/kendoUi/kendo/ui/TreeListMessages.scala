package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListMessages extends js.Object {
  var commands: js.UndefOr[TreeListMessagesCommands] = js.native
  var loading: js.UndefOr[String] = js.native
  var noRows: js.UndefOr[String] = js.native
  var requestFailed: js.UndefOr[String] = js.native
  var retry: js.UndefOr[String] = js.native
}

object TreeListMessages {
  @scala.inline
  def apply(): TreeListMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListMessages]
  }
  @scala.inline
  implicit class TreeListMessagesOps[Self <: TreeListMessages] (val x: Self) extends AnyVal {
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
    def setCommands(value: TreeListMessagesCommands): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setNoRows(value: String): Self = this.set("noRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRows: Self = this.set("noRows", js.undefined)
    @scala.inline
    def setRequestFailed(value: String): Self = this.set("requestFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestFailed: Self = this.set("requestFailed", js.undefined)
    @scala.inline
    def setRetry(value: String): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
  }
  
}

