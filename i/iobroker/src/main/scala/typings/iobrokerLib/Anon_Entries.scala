package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entries extends js.Object {
  var entries: js.Array[iobrokerLib.iobrokerMod.Global.ioBrokerNs.ChownFileResult]
  var id: java.lang.String
}

object Anon_Entries {
  @scala.inline
  def apply(entries: js.Array[iobrokerLib.iobrokerMod.Global.ioBrokerNs.ChownFileResult], id: java.lang.String): Anon_Entries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entries")(entries)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Entries]
  }
}

