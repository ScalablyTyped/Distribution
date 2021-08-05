package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Double
  
  var stations: js.Array[Station | Stop | Location]
}
object Duration {
  
  inline def apply(duration: Double, stations: js.Array[Station | Stop | Location]): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setStations(value: js.Array[Station | Stop | Location]): Self = StObject.set(x, "stations", value.asInstanceOf[js.Any])
    
    inline def setStationsVarargs(value: (Station | Stop | Location)*): Self = StObject.set(x, "stations", js.Array(value :_*))
  }
}
