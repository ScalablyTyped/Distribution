package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeType extends js.Object {
  var endCol: Double = js.native
  var endRow: Double = js.native
  var startCol: Double = js.native
  var startRow: Double = js.native
}

object RangeType {
  @scala.inline
  def apply(endCol: Double, endRow: Double, startCol: Double, startRow: Double): RangeType = {
    val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeType]
  }
  @scala.inline
  implicit class RangeTypeOps[Self <: RangeType] (val x: Self) extends AnyVal {
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
    def setEndCol(value: Double): Self = this.set("endCol", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndRow(value: Double): Self = this.set("endRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartCol(value: Double): Self = this.set("startCol", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
  }
  
}

