package typings.jssip.libRtcsessionMod

import typings.jssip.libRtcsessionMod.Originator.LOCAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingEvent extends StObject {
  
  var originator: LOCAL
}
object IncomingEvent {
  
  inline def apply(originator: LOCAL): IncomingEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingEvent]
  }
  
  extension [Self <: IncomingEvent](x: Self) {
    
    inline def setOriginator(value: LOCAL): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
