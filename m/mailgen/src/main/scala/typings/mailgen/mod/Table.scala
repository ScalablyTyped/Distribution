package typings.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends js.Object {
  var columns: js.UndefOr[js.Array[ColumnOptions]] = js.undefined
  var data: js.Array[_]
}

object Table {
  @scala.inline
  def apply(data: js.Array[_], columns: js.Array[ColumnOptions] = null): Table = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

