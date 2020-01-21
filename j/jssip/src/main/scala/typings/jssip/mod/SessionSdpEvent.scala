package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionSdpEvent extends js.Object {
  var originator: String
  var sdp: String
  var `type`: String
}

object SessionSdpEvent {
  @scala.inline
  def apply(originator: String, sdp: String, `type`: String): SessionSdpEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], sdp = sdp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSdpEvent]
  }
}

