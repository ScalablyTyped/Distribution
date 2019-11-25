package typings.iobroker

import typings.iobroker.iobrokerMod._Global_.ioBroker.GetObjectViewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rows extends js.Object {
  var rows: js.Array[GetObjectViewItem]
}

object Anon_Rows {
  @scala.inline
  def apply(rows: js.Array[GetObjectViewItem]): Anon_Rows = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Rows]
  }
}

