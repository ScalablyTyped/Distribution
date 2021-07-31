package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionSdpEvent extends StObject {
  
  var originator: String
  
  var sdp: String
  
  var `type`: String
}
object SessionSdpEvent {
  
  @scala.inline
  def apply(originator: String, sdp: String, `type`: String): SessionSdpEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], sdp = sdp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSdpEvent]
  }
  
  @scala.inline
  implicit class SessionSdpEventMutableBuilder[Self <: SessionSdpEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginator(value: String): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdp(value: String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
