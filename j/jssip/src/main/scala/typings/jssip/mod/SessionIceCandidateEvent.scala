package typings.jssip.mod

import typings.std.RTCIceCandidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionIceCandidateEvent extends StObject {
  
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
  implicit class SessionIceCandidateEventMutableBuilder[Self <: SessionIceCandidateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidate(value: RTCIceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
  }
}
