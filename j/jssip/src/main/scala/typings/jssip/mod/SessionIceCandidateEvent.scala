package typings.jssip.mod

import typings.std.RTCIceCandidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionIceCandidateEvent extends js.Object {
  
  var candidate: RTCIceCandidate = js.native
  
  def ready(): Unit = js.native
}
object SessionIceCandidateEvent {
  
  @scala.inline
  def apply(candidate: RTCIceCandidate, ready: () => Unit): SessionIceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[SessionIceCandidateEvent]
  }
  
  @scala.inline
  implicit class SessionIceCandidateEventOps[Self <: SessionIceCandidateEvent] (val x: Self) extends AnyVal {
    
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
    def setCandidate(value: RTCIceCandidate): Self = this.set("candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
  }
}
