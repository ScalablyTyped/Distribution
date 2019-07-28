package typings.libpq.libpqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyMsg extends js.Object {
  var be_pid: Double
  var extra: String
  var relname: String
}

object NotifyMsg {
  @scala.inline
  def apply(be_pid: Double, extra: String, relname: String): NotifyMsg = {
    val __obj = js.Dynamic.literal(be_pid = be_pid, extra = extra, relname = relname)
  
    __obj.asInstanceOf[NotifyMsg]
  }
}

