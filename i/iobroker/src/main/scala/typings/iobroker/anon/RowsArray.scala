package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.GetObjectListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowsArray extends js.Object {
  var rows: js.Array[GetObjectListItem]
}

object RowsArray {
  @scala.inline
  def apply(rows: js.Array[GetObjectListItem]): RowsArray = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsArray]
  }
}

