package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rows extends js.Object {
  var rows: js.Array[iobrokerLib.iobrokerMod.Global.ioBrokerNs.GetObjectViewItem]
}

object Anon_Rows {
  @scala.inline
  def apply(rows: js.Array[iobrokerLib.iobrokerMod.Global.ioBrokerNs.GetObjectViewItem]): Anon_Rows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Anon_Rows]
  }
}

