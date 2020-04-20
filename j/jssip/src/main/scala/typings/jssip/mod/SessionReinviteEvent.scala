package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionReinviteEvent extends js.Object {
  var request: IncomingRequest
  def callback(): Unit
  def reject(options: SessionRejectOptions): Unit
}

object SessionReinviteEvent {
  @scala.inline
  def apply(callback: () => Unit, reject: SessionRejectOptions => Unit, request: IncomingRequest): SessionReinviteEvent = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), reject = js.Any.fromFunction1(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionReinviteEvent]
  }
}

