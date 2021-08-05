package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitLine extends StObject {
  
  var agencies: js.Array[TransitAgency]
  
  var color: String
  
  var icon: String
  
  var name: String
  
  var short_name: String
  
  var text_color: String
  
  var url: String
  
  var vehicle: TransitVehicle
}
object TransitLine {
  
  inline def apply(
    agencies: js.Array[TransitAgency],
    color: String,
    icon: String,
    name: String,
    short_name: String,
    text_color: String,
    url: String,
    vehicle: TransitVehicle
  ): TransitLine = {
    val __obj = js.Dynamic.literal(agencies = agencies.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitLine]
  }
  
  extension [Self <: TransitLine](x: Self) {
    
    inline def setAgencies(value: js.Array[TransitAgency]): Self = StObject.set(x, "agencies", value.asInstanceOf[js.Any])
    
    inline def setAgenciesVarargs(value: TransitAgency*): Self = StObject.set(x, "agencies", js.Array(value :_*))
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    inline def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVehicle(value: TransitVehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
  }
}
