package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnSortable extends js.Object {
  var allowUnsort: js.UndefOr[Boolean] = js.native
  var compare: js.UndefOr[js.Function] = js.native
  var initialDirection: js.UndefOr[String] = js.native
}

object GridColumnSortable {
  @scala.inline
  def apply(): GridColumnSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnSortable]
  }
  @scala.inline
  implicit class GridColumnSortableOps[Self <: GridColumnSortable] (val x: Self) extends AnyVal {
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
    def setCompare(value: js.Function): Self = this.set("compare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    @scala.inline
    def setInitialDirection(value: String): Self = this.set("initialDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDirection: Self = this.set("initialDirection", js.undefined)
  }
  
}

