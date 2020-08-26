package typings.mariasql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MariaInfo extends js.Object {
  var affectedRows: Double = js.native
  var insertId: Double = js.native
  var numRows: Double = js.native
}

object MariaInfo {
  @scala.inline
  def apply(affectedRows: Double, insertId: Double, numRows: Double): MariaInfo = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], numRows = numRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[MariaInfo]
  }
  @scala.inline
  implicit class MariaInfoOps[Self <: MariaInfo] (val x: Self) extends AnyVal {
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
    def setAffectedRows(value: Double): Self = this.set("affectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertId(value: Double): Self = this.set("insertId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumRows(value: Double): Self = this.set("numRows", value.asInstanceOf[js.Any])
  }
  
}

