package typings.griddleReact.mod.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHeadingProps extends js.Object {
  var TableHeadingCell: js.Any = js.native
  var columnIds: js.UndefOr[js.Array[Double]] = js.native
  var columnTitles: js.UndefOr[js.Array[String]] = js.native
}

object TableHeadingProps {
  @scala.inline
  def apply(TableHeadingCell: js.Any): TableHeadingProps = {
    val __obj = js.Dynamic.literal(TableHeadingCell = TableHeadingCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeadingProps]
  }
  @scala.inline
  implicit class TableHeadingPropsOps[Self <: TableHeadingProps] (val x: Self) extends AnyVal {
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
    def setTableHeadingCell(value: js.Any): Self = this.set("TableHeadingCell", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnIdsVarargs(value: Double*): Self = this.set("columnIds", js.Array(value :_*))
    @scala.inline
    def setColumnIds(value: js.Array[Double]): Self = this.set("columnIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIds: Self = this.set("columnIds", js.undefined)
    @scala.inline
    def setColumnTitlesVarargs(value: String*): Self = this.set("columnTitles", js.Array(value :_*))
    @scala.inline
    def setColumnTitles(value: js.Array[String]): Self = this.set("columnTitles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnTitles: Self = this.set("columnTitles", js.undefined)
  }
  
}

