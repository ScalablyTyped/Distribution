package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionUpdateEvent extends js.Object {
  var request: IncomingRequest
  def callback(): Unit
  def reject(options: SessionRejectOptions): Unit
}

object SessionUpdateEvent {
  @scala.inline
  def apply(callback: () => Unit, reject: SessionRejectOptions => Unit, request: IncomingRequest): SessionUpdateEvent = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), reject = js.Any.fromFunction1(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionUpdateEvent]
  }
}

