package typings.libpq.mod

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
    val __obj = js.Dynamic.literal(be_pid = be_pid.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], relname = relname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotifyMsg]
  }
}

