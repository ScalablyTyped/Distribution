package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.GetObjectViewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rows extends js.Object {
  var rows: js.Array[GetObjectViewItem]
}

object Rows {
  @scala.inline
  def apply(rows: js.Array[GetObjectViewItem]): Rows = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows]
  }
}

