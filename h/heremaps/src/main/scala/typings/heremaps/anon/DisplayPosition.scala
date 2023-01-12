package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayPosition extends StObject {
  
  var Address: AdditionalData
  
  var DisplayPosition: Longitude
  
  var LocationId: String
  
  var LocationType: String
  
  var MapView: BottomRight
  
  var NavigationPosition: js.Array[Longitude]
}
object DisplayPosition {
  
  inline def apply(
    Address: AdditionalData,
    DisplayPosition: Longitude,
    LocationId: String,
    LocationType: String,
    MapView: BottomRight,
    NavigationPosition: js.Array[Longitude]
  ): DisplayPosition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DisplayPosition = DisplayPosition.asInstanceOf[js.Any], LocationId = LocationId.asInstanceOf[js.Any], LocationType = LocationType.asInstanceOf[js.Any], MapView = MapView.asInstanceOf[js.Any], NavigationPosition = NavigationPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayPosition] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: AdditionalData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setDisplayPosition(value: Longitude): Self = StObject.set(x, "DisplayPosition", value.asInstanceOf[js.Any])
    
    inline def setLocationId(value: String): Self = StObject.set(x, "LocationId", value.asInstanceOf[js.Any])
    
    inline def setLocationType(value: String): Self = StObject.set(x, "LocationType", value.asInstanceOf[js.Any])
    
    inline def setMapView(value: BottomRight): Self = StObject.set(x, "MapView", value.asInstanceOf[js.Any])
    
    inline def setNavigationPosition(value: js.Array[Longitude]): Self = StObject.set(x, "NavigationPosition", value.asInstanceOf[js.Any])
    
    inline def setNavigationPositionVarargs(value: Longitude*): Self = StObject.set(x, "NavigationPosition", js.Array(value*))
  }
}
