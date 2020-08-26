package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListColumnMenuMessages extends js.Object {
  var columns: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var lock: js.UndefOr[String] = js.native
  var settings: js.UndefOr[String] = js.native
  var sortAscending: js.UndefOr[String] = js.native
  var sortDescending: js.UndefOr[String] = js.native
  var unlock: js.UndefOr[String] = js.native
}

object TreeListColumnMenuMessages {
  @scala.inline
  def apply(): TreeListColumnMenuMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumnMenuMessages]
  }
  @scala.inline
  implicit class TreeListColumnMenuMessagesOps[Self <: TreeListColumnMenuMessages] (val x: Self) extends AnyVal {
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
    def setColumns(value: String): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setLock(value: String): Self = this.set("lock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    @scala.inline
    def setSettings(value: String): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setSortAscending(value: String): Self = this.set("sortAscending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortAscending: Self = this.set("sortAscending", js.undefined)
    @scala.inline
    def setSortDescending(value: String): Self = this.set("sortDescending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDescending: Self = this.set("sortDescending", js.undefined)
    @scala.inline
    def setUnlock(value: String): Self = this.set("unlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlock: Self = this.set("unlock", js.undefined)
  }
  
}

