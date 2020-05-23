package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statusmsg extends js.Object {
  var presence: String
  // One of "online", "offline" or "unavailable"
  var status_msg: String
}

object Statusmsg {
  @scala.inline
  def apply(presence: String, status_msg: String): Statusmsg = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any], status_msg = status_msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statusmsg]
  }
}

