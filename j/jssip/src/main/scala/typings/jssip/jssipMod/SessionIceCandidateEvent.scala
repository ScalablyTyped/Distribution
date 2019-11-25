package typings.jssip.jssipMod

import typings.std.RTCIceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionIceCandidateEvent extends js.Object {
  var candidate: RTCIceCandidate
  def ready(): Unit
}

object SessionIceCandidateEvent {
  @scala.inline
  def apply(candidate: RTCIceCandidate, ready: () => Unit): SessionIceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready))
  
    __obj.asInstanceOf[SessionIceCandidateEvent]
  }
}

