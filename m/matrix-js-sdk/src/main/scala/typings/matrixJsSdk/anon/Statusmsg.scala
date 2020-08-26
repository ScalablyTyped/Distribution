package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statusmsg extends js.Object {
  var presence: String = js.native
  // One of "online", "offline" or "unavailable"
  var status_msg: String = js.native
}

object Statusmsg {
  @scala.inline
  def apply(presence: String, status_msg: String): Statusmsg = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any], status_msg = status_msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statusmsg]
  }
  @scala.inline
  implicit class StatusmsgOps[Self <: Statusmsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPresence(value: String): Self = this.set("presence", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus_msg(value: String): Self = this.set("status_msg", value.asInstanceOf[js.Any])
  }
  
}

