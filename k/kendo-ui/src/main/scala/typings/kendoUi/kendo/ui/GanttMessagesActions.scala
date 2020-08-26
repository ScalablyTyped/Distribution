package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttMessagesActions extends js.Object {
  var addChild: js.UndefOr[String] = js.native
  var append: js.UndefOr[String] = js.native
  var insertAfter: js.UndefOr[String] = js.native
  var insertBefore: js.UndefOr[String] = js.native
  var pdf: js.UndefOr[String] = js.native
}

object GanttMessagesActions {
  @scala.inline
  def apply(): GanttMessagesActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessagesActions]
  }
  @scala.inline
  implicit class GanttMessagesActionsOps[Self <: GanttMessagesActions] (val x: Self) extends AnyVal {
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
    def setAddChild(value: String): Self = this.set("addChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddChild: Self = this.set("addChild", js.undefined)
    @scala.inline
    def setAppend(value: String): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setInsertAfter(value: String): Self = this.set("insertAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertAfter: Self = this.set("insertAfter", js.undefined)
    @scala.inline
    def setInsertBefore(value: String): Self = this.set("insertBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    @scala.inline
    def setPdf(value: String): Self = this.set("pdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
  }
  
}

