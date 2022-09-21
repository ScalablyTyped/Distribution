package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioAvailabilityChangedEvent extends StObject {
  
  var available: Boolean
}
object AudioAvailabilityChangedEvent {
  
  inline def apply(available: Boolean): AudioAvailabilityChangedEvent = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioAvailabilityChangedEvent]
  }
  
  extension [Self <: AudioAvailabilityChangedEvent](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
  }
}
