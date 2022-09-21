package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTime extends StObject {
  
  var baseTime: Double
  
  var distance: Double
  
  var flags: js.Array[String]
  
  var text: String
  
  var trafficTime: Double
  
  var travelTime: Double
}
object BaseTime {
  
  inline def apply(
    baseTime: Double,
    distance: Double,
    flags: js.Array[String],
    text: String,
    trafficTime: Double,
    travelTime: Double
  ): BaseTime = {
    val __obj = js.Dynamic.literal(baseTime = baseTime.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trafficTime = trafficTime.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTime]
  }
  
  extension [Self <: BaseTime](x: Self) {
    
    inline def setBaseTime(value: Double): Self = StObject.set(x, "baseTime", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTrafficTime(value: Double): Self = StObject.set(x, "trafficTime", value.asInstanceOf[js.Any])
    
    inline def setTravelTime(value: Double): Self = StObject.set(x, "travelTime", value.asInstanceOf[js.Any])
  }
}
