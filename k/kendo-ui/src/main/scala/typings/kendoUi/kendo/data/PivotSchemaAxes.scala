package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotSchemaAxes extends js.Object {
  var columns: PivotSchemaColumnAxis = js.native
  var rows: PivotSchemaRowAxis = js.native
}

object PivotSchemaAxes {
  @scala.inline
  def apply(columns: PivotSchemaColumnAxis, rows: PivotSchemaRowAxis): PivotSchemaAxes = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotSchemaAxes]
  }
  @scala.inline
  implicit class PivotSchemaAxesOps[Self <: PivotSchemaAxes] (val x: Self) extends AnyVal {
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
    def setColumns(value: PivotSchemaColumnAxis): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: PivotSchemaRowAxis): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

