package typings.googlemaps.google.maps

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Time extends StObject {
  
  var text: String
  
  var time_zone: String
  
  var value: Date
}
object Time {
  
  inline def apply(text: String, time_zone: String, value: Date): Time = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], time_zone = time_zone.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  extension [Self <: Time](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
