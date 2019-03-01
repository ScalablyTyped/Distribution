package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RowsArray extends js.Object {
  var rows: js.Array[iobrokerLib.iobrokerMod.Global.ioBrokerNs.GetObjectListItem]
}

object Anon_RowsArray {
  @scala.inline
  def apply(rows: js.Array[iobrokerLib.iobrokerMod.Global.ioBrokerNs.GetObjectListItem]): Anon_RowsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Anon_RowsArray]
  }
}

