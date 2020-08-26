package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotConfiguratorSortable extends js.Object {
  var allowUnsort: js.UndefOr[Boolean] = js.native
}

object PivotConfiguratorSortable {
  @scala.inline
  def apply(): PivotConfiguratorSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorSortable]
  }
  @scala.inline
  implicit class PivotConfiguratorSortableOps[Self <: PivotConfiguratorSortable] (val x: Self) extends AnyVal {
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
  }
  
}

