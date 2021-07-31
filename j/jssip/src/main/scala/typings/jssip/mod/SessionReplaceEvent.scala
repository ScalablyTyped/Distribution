package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionReplaceEvent extends StObject {
  
  def accept(): Unit
  
  def reject(): Unit
  
  var request: IncomingRequest
}
object SessionReplaceEvent {
  
  @scala.inline
  def apply(accept: () => Unit, reject: () => Unit, request: IncomingRequest): SessionReplaceEvent = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), reject = js.Any.fromFunction0(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionReplaceEvent]
  }
  
  @scala.inline
  implicit class SessionReplaceEventMutableBuilder[Self <: SessionReplaceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
