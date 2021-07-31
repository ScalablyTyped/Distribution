package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionUnholdEvent extends StObject {
  
  var originator: String
}
object SessionUnholdEvent {
  
  @scala.inline
  def apply(originator: String): SessionUnholdEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionUnholdEvent]
  }
  
  @scala.inline
  implicit class SessionUnholdEventMutableBuilder[Self <: SessionUnholdEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
