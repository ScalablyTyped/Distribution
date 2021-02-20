package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionUpdateEvent extends StObject {
  
  def callback(): Unit = js.native
  
  def reject(options: SessionRejectOptions): Unit = js.native
  
  var request: IncomingRequest = js.native
}
object SessionUpdateEvent {
  
  @scala.inline
  def apply(callback: () => Unit, reject: SessionRejectOptions => Unit, request: IncomingRequest): SessionUpdateEvent = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), reject = js.Any.fromFunction1(reject), request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionUpdateEvent]
  }
  
  @scala.inline
  implicit class SessionUpdateEventMutableBuilder[Self <: SessionUpdateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReject(value: SessionRejectOptions => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequest(value: IncomingRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
