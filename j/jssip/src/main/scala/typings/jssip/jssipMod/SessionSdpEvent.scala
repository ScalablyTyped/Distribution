package typings.jssip.jssipMod

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
    val __obj = js.Dynamic.literal(originator = originator, sdp = sdp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SessionSdpEvent]
  }
}

