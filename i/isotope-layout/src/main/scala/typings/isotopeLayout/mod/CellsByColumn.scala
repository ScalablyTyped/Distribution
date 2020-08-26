package typings.isotopeLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellsByColumn extends js.Object {
  var columnWidth: js.UndefOr[Double | String] = js.native
  var rowHeight: js.UndefOr[Double | String] = js.native
}

object CellsByColumn {
  @scala.inline
  def apply(): CellsByColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellsByColumn]
  }
  @scala.inline
  implicit class CellsByColumnOps[Self <: CellsByColumn] (val x: Self) extends AnyVal {
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
    def setColumnWidth(value: Double | String): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setRowHeight(value: Double | String): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
  }
  
}

