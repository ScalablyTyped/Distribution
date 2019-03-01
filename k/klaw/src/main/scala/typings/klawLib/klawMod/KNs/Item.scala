package typings
package klawLib.klawMod.KNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var path: java.lang.String
  var stats: nodeLib.fsMod.Stats
}

object Item {
  @scala.inline
  def apply(path: java.lang.String, stats: nodeLib.fsMod.Stats): Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[Item]
  }
}

