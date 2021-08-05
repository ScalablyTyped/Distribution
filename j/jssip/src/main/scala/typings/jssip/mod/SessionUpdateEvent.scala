package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionUpdateEvent extends StObject {
  
  def callback(): Unit
  
  def reject(options: SessionRejectOptions): Unit
  
  var request: IncomingRequest
}
object SessionUpdateEvent {
  
  inline def apply(callback: () => Unit, reject: SessionRejectOptions => Unit, request: IncomingRequest): SessionUpdateEvent = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), reject = js.Any.fromFunction1(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionUpdateEvent]
  }
  
  extension [Self <: SessionUpdateEvent](x: Self) {
    
    inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setReject(value: SessionRejectOptions => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    
    inline def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
