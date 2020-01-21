package typings.iobroker

import typings.iobroker.mod._Global_.ioBroker.GetObjectViewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRows extends js.Object {
  var rows: js.Array[GetObjectViewItem]
}

object AnonRows {
  @scala.inline
  def apply(rows: js.Array[GetObjectViewItem]): AnonRows = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRows]
  }
}

