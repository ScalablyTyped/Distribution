package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionConfirmedEvent extends StObject {
  
  var originator: String = js.native
  
  var response: js.UndefOr[IncomingResponse] = js.native
}
object SessionConfirmedEvent {
  
  @scala.inline
  def apply(originator: String): SessionConfirmedEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionConfirmedEvent]
  }
  
  @scala.inline
  implicit class SessionConfirmedEventMutableBuilder[Self <: SessionConfirmedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
