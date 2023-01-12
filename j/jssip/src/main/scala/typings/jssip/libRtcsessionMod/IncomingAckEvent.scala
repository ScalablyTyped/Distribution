package typings.jssip.libRtcsessionMod

import typings.jssip.libRtcsessionMod.Originator.REMOTE
import typings.jssip.libSipmessageMod.IncomingRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingAckEvent extends StObject {
  
  var ack: IncomingRequest
  
  var originator: REMOTE
}
object IncomingAckEvent {
  
  inline def apply(ack: IncomingRequest, originator: REMOTE): IncomingAckEvent = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingAckEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncomingAckEvent] (val x: Self) extends AnyVal {
    
    inline def setAck(value: IncomingRequest): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setOriginator(value: REMOTE): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
