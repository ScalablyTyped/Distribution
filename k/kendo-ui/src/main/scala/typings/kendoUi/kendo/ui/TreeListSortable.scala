package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListSortable extends js.Object {
  var allowUnsort: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
}

object TreeListSortable {
  @scala.inline
  def apply(): TreeListSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListSortable]
  }
  @scala.inline
  implicit class TreeListSortableOps[Self <: TreeListSortable] (val x: Self) extends AnyVal {
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
    def setAllowUnsort(value: Boolean): Self = this.set("allowUnsort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnsort: Self = this.set("allowUnsort", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

