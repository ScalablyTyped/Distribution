package typings.griddleReact.mod.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableProps extends js.Object {
  var NoResults: js.UndefOr[js.Any] = js.native
  var TableBody: js.UndefOr[js.Any] = js.native
  var TableHeading: js.UndefOr[js.Any] = js.native
  var visibleRows: js.UndefOr[Double] = js.native
}

object TableProps {
  @scala.inline
  def apply(): TableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps]
  }
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
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
    def setNoResults(value: js.Any): Self = this.set("NoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResults: Self = this.set("NoResults", js.undefined)
    @scala.inline
    def setTableBody(value: js.Any): Self = this.set("TableBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableBody: Self = this.set("TableBody", js.undefined)
    @scala.inline
    def setTableHeading(value: js.Any): Self = this.set("TableHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableHeading: Self = this.set("TableHeading", js.undefined)
    @scala.inline
    def setVisibleRows(value: Double): Self = this.set("visibleRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleRows: Self = this.set("visibleRows", js.undefined)
  }
  
}

