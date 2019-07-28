package typings.iobroker

import typings.iobroker.iobrokerMod.Global.ioBrokerNs.GetObjectListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowsArray extends js.Object {
  var rows: js.Array[GetObjectListItem]
}

object Anon_RowsArray {
  @scala.inline
  def apply(rows: js.Array[GetObjectListItem]): Anon_RowsArray = {
    val __obj = js.Dynamic.literal(rows = rows)
  
    __obj.asInstanceOf[Anon_RowsArray]
  }
}

