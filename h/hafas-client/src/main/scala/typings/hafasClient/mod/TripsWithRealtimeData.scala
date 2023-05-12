package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TripsWithRealtimeData
  extends StObject
     with RealtimeDataUpdatedAt {
  
  var trips: js.Array[Trip]
}
object TripsWithRealtimeData {
  
  inline def apply(trips: js.Array[Trip]): TripsWithRealtimeData = {
    val __obj = js.Dynamic.literal(trips = trips.asInstanceOf[js.Any])
    __obj.asInstanceOf[TripsWithRealtimeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TripsWithRealtimeData] (val x: Self) extends AnyVal {
    
    inline def setTrips(value: js.Array[Trip]): Self = StObject.set(x, "trips", value.asInstanceOf[js.Any])
    
    inline def setTripsVarargs(value: Trip*): Self = StObject.set(x, "trips", js.Array(value*))
  }
}
