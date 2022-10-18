package typings.jssip.libRtcsessionMod

import typings.std.RTCIceCandidate
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IceCandidateEvent extends StObject {
  
  var candidate: RTCIceCandidate
  
  def ready(): Unit
  @JSName("ready")
  var ready_Original: VoidFunction
}
object IceCandidateEvent {
  
  inline def apply(candidate: RTCIceCandidate, ready: () => Unit): IceCandidateEvent = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[IceCandidateEvent]
  }
  
  extension [Self <: IceCandidateEvent](x: Self) {
    
    inline def setCandidate(value: RTCIceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
  }
}
