package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TripWithRealtimeData
  extends StObject
     with RealtimeDataUpdatedAt {
  
  var trip: Trip
}
object TripWithRealtimeData {
  
  inline def apply(trip: Trip): TripWithRealtimeData = {
    val __obj = js.Dynamic.literal(trip = trip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripWithRealtimeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TripWithRealtimeData] (val x: Self) extends AnyVal {
    
    inline def setTrip(value: Trip): Self = StObject.set(x, "trip", value.asInstanceOf[js.Any])
  }
}
