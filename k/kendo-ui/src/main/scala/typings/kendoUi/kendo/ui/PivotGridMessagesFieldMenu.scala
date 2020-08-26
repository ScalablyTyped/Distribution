package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGridMessagesFieldMenu extends js.Object {
  var cancel: js.UndefOr[String] = js.native
  var clear: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var filterFields: js.UndefOr[String] = js.native
  var include: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var ok: js.UndefOr[String] = js.native
  var operators: js.UndefOr[PivotGridMessagesFieldMenuOperators] = js.native
  var sortAscending: js.UndefOr[String] = js.native
  var sortDescending: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PivotGridMessagesFieldMenu {
  @scala.inline
  def apply(): PivotGridMessagesFieldMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridMessagesFieldMenu]
  }
  @scala.inline
  implicit class PivotGridMessagesFieldMenuOps[Self <: PivotGridMessagesFieldMenu] (val x: Self) extends AnyVal {
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
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterFields(value: String): Self = this.set("filterFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterFields: Self = this.set("filterFields", js.undefined)
    @scala.inline
    def setInclude(value: String): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setOk(value: String): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
    @scala.inline
    def setOperators(value: PivotGridMessagesFieldMenuOperators): Self = this.set("operators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperators: Self = this.set("operators", js.undefined)
    @scala.inline
    def setSortAscending(value: String): Self = this.set("sortAscending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortAscending: Self = this.set("sortAscending", js.undefined)
    @scala.inline
    def setSortDescending(value: String): Self = this.set("sortDescending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortDescending: Self = this.set("sortDescending", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

