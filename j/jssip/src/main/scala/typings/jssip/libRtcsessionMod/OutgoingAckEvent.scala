package typings.jssip.libRtcsessionMod

import typings.jssip.libRtcsessionMod.Originator.LOCAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingAckEvent extends StObject {
  
  var originator: LOCAL
}
object OutgoingAckEvent {
  
  inline def apply(originator: LOCAL): OutgoingAckEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingAckEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutgoingAckEvent] (val x: Self) extends AnyVal {
    
    inline def setOriginator(value: LOCAL): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
