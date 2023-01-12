package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoAvailabilityChangedEvent extends StObject {
  
  var available: Boolean
}
object VideoAvailabilityChangedEvent {
  
  inline def apply(available: Boolean): VideoAvailabilityChangedEvent = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoAvailabilityChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoAvailabilityChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
  }
}
