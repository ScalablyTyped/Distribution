package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionReplaceEvent extends js.Object {
  var request: IncomingRequest
  def accept(): Unit
  def reject(): Unit
}

object SessionReplaceEvent {
  @scala.inline
  def apply(accept: () => Unit, reject: () => Unit, request: IncomingRequest): SessionReplaceEvent = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), reject = js.Any.fromFunction0(reject), request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SessionReplaceEvent]
  }
}

