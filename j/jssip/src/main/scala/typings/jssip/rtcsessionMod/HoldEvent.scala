package typings.jssip.rtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoldEvent extends StObject {
  
  var originator: Originator
}
object HoldEvent {
  
  inline def apply(originator: Originator): HoldEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldEvent]
  }
  
  extension [Self <: HoldEvent](x: Self) {
    
    inline def setOriginator(value: Originator): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
  }
}
