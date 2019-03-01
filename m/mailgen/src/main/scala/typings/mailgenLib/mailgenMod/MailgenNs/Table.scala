package typings
package mailgenLib.mailgenMod.MailgenNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    __obj.asInstanceOf[Table]
  }
}

