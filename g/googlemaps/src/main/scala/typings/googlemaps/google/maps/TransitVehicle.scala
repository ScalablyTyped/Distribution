package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitVehicle extends StObject {
  
  var icon: String
  
  var local_icon: String
  
  var name: String
  
  var `type`: VehicleType
}
object TransitVehicle {
  
  inline def apply(icon: String, local_icon: String, name: String, `type`: VehicleType): TransitVehicle = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], local_icon = local_icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitVehicle]
  }
  
  extension [Self <: TransitVehicle](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setLocal_icon(value: String): Self = StObject.set(x, "local_icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: VehicleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
