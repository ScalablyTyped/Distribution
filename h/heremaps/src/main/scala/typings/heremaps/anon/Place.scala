package typings.heremaps.anon

import typings.heremaps.H.service.RoutingService.RoutingServicePlace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Place extends StObject {
  
  var place: RoutingServicePlace
  
  var time: String
}
object Place {
  
  inline def apply(place: RoutingServicePlace, time: String): Place = {
    val __obj = js.Dynamic.literal(place = place.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Place]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Place] (val x: Self) extends AnyVal {
    
    inline def setPlace(value: RoutingServicePlace): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
