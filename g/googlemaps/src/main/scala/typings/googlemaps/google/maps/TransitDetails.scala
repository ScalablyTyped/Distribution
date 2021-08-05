package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitDetails extends StObject {
  
  var arrival_stop: TransitStop
  
  var arrival_time: Time
  
  var departure_stop: TransitStop
  
  var departure_time: Time
  
  var headsign: String
  
  var headway: Double
  
  var line: TransitLine
  
  var num_stops: Double
}
object TransitDetails {
  
  inline def apply(
    arrival_stop: TransitStop,
    arrival_time: Time,
    departure_stop: TransitStop,
    departure_time: Time,
    headsign: String,
    headway: Double,
    line: TransitLine,
    num_stops: Double
  ): TransitDetails = {
    val __obj = js.Dynamic.literal(arrival_stop = arrival_stop.asInstanceOf[js.Any], arrival_time = arrival_time.asInstanceOf[js.Any], departure_stop = departure_stop.asInstanceOf[js.Any], departure_time = departure_time.asInstanceOf[js.Any], headsign = headsign.asInstanceOf[js.Any], headway = headway.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], num_stops = num_stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitDetails]
  }
  
  extension [Self <: TransitDetails](x: Self) {
    
    inline def setArrival_stop(value: TransitStop): Self = StObject.set(x, "arrival_stop", value.asInstanceOf[js.Any])
    
    inline def setArrival_time(value: Time): Self = StObject.set(x, "arrival_time", value.asInstanceOf[js.Any])
    
    inline def setDeparture_stop(value: TransitStop): Self = StObject.set(x, "departure_stop", value.asInstanceOf[js.Any])
    
    inline def setDeparture_time(value: Time): Self = StObject.set(x, "departure_time", value.asInstanceOf[js.Any])
    
    inline def setHeadsign(value: String): Self = StObject.set(x, "headsign", value.asInstanceOf[js.Any])
    
    inline def setHeadway(value: Double): Self = StObject.set(x, "headway", value.asInstanceOf[js.Any])
    
    inline def setLine(value: TransitLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setNum_stops(value: Double): Self = StObject.set(x, "num_stops", value.asInstanceOf[js.Any])
  }
}
