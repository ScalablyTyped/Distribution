package typings
package libpqLib.libpqMod.LibpqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyMsg extends js.Object {
  var be_pid: scala.Double
  var extra: java.lang.String
  var relname: java.lang.String
}

object NotifyMsg {
  @scala.inline
  def apply(be_pid: scala.Double, extra: java.lang.String, relname: java.lang.String): NotifyMsg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("be_pid")(be_pid)
    __obj.updateDynamic("extra")(extra)
    __obj.updateDynamic("relname")(relname)
    __obj.asInstanceOf[NotifyMsg]
  }
}

