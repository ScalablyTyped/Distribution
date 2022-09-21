package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingMessageEvent extends StObject {
  
  var message: String
}
object OutgoingMessageEvent {
  
  inline def apply(message: String): OutgoingMessageEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingMessageEvent]
  }
  
  extension [Self <: OutgoingMessageEvent](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
