package typings.jssip.mod

import typings.std.RTCIceCandidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionIceCandidateEvent extends StObject {
  
  var candidate: RTCIceCandidate
  
  def ready(): Unit
}
object SessionIceCandidateEvent {
  
  inline def apply(candidate: RTCIceCandidate, ready: () => Unit): SessionIceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[SessionIceCandidateEvent]
  }
  
  extension [Self <: SessionIceCandidateEvent](x: Self) {
    
    inline def setCandidate(value: RTCIceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
  }
}
