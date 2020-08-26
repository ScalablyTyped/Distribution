package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionSdpEvent extends js.Object {
  var originator: String = js.native
  var sdp: String = js.native
  var `type`: String = js.native
}

object SessionSdpEvent {
  @scala.inline
  def apply(originator: String, sdp: String, `type`: String): SessionSdpEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], sdp = sdp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSdpEvent]
  }
  @scala.inline
  implicit class SessionSdpEventOps[Self <: SessionSdpEvent] (val x: Self) extends AnyVal {
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
    def setOriginator(value: String): Self = this.set("originator", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdp(value: String): Self = this.set("sdp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

