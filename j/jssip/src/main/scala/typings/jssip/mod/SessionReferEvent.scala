package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionReferEvent extends StObject {
  
  def accept(): Unit = js.native
  
  def reject(): Unit = js.native
  
  var request: IncomingRequest = js.native
}
object SessionReferEvent {
  
  @scala.inline
  def apply(accept: () => Unit, reject: () => Unit, request: IncomingRequest): SessionReferEvent = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction0(accept), reject = js.Any.fromFunction0(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionReferEvent]
  }
  
  @scala.inline
  implicit class SessionReferEventMutableBuilder[Self <: SessionReferEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: () => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
