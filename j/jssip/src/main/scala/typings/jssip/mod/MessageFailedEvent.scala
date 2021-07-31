package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageFailedEvent extends StObject {
  
  var cause: js.UndefOr[String] = js.undefined
  
  var originator: String
  
  var response: js.UndefOr[IncomingResponse] = js.undefined
}
object MessageFailedEvent {
  
  @scala.inline
  def apply(originator: String): MessageFailedEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFailedEvent]
  }
  
  @scala.inline
  implicit class MessageFailedEventMutableBuilder[Self <: MessageFailedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: IncomingResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
