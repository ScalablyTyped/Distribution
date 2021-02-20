package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayPosition extends StObject {
  
  var Address: AdditionalData = js.native
  
  var DisplayPosition: Longitude = js.native
  
  var LocationId: String = js.native
  
  var LocationType: String = js.native
  
  var MapView: BottomRight = js.native
  
  var NavigationPosition: js.Array[Longitude] = js.native
}
object DisplayPosition {
  
  @scala.inline
  def apply(
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
  implicit class DisplayPositionMutableBuilder[Self <: DisplayPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: AdditionalData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPosition(value: Longitude): Self = StObject.set(x, "DisplayPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "LocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "LocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapView(value: BottomRight): Self = StObject.set(x, "MapView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationPosition(value: js.Array[Longitude]): Self = StObject.set(x, "NavigationPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationPositionVarargs(value: Longitude*): Self = StObject.set(x, "NavigationPosition", js.Array(value :_*))
  }
}
