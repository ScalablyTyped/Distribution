package typings.iobroker

import typings.iobroker.mod._Global_.ioBroker.GetObjectListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowsArray extends js.Object {
  var rows: js.Array[GetObjectListItem]
}

object AnonRowsArray {
  @scala.inline
  def apply(rows: js.Array[GetObjectListItem]): AnonRowsArray = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRowsArray]
  }
}

