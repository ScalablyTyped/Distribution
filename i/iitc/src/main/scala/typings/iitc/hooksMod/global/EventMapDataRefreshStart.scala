package typings.iitc.hooksMod.global

import typings.leaflet.mod.LatLngBounds_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMapDataRefreshStart extends StObject {
  
  var bounds: LatLngBounds_
  
  var dataZoom: Double
  
  var mapZoom: Double
  
  var minPortalLevel: Double
  
  var tileBounds: LatLngBounds_
}
object EventMapDataRefreshStart {
  
  inline def apply(
    bounds: LatLngBounds_,
    dataZoom: Double,
    mapZoom: Double,
    minPortalLevel: Double,
    tileBounds: LatLngBounds_
  ): EventMapDataRefreshStart = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], dataZoom = dataZoom.asInstanceOf[js.Any], mapZoom = mapZoom.asInstanceOf[js.Any], minPortalLevel = minPortalLevel.asInstanceOf[js.Any], tileBounds = tileBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMapDataRefreshStart]
  }
  
  extension [Self <: EventMapDataRefreshStart](x: Self) {
    
    inline def setBounds(value: LatLngBounds_): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setDataZoom(value: Double): Self = StObject.set(x, "dataZoom", value.asInstanceOf[js.Any])
    
    inline def setMapZoom(value: Double): Self = StObject.set(x, "mapZoom", value.asInstanceOf[js.Any])
    
    inline def setMinPortalLevel(value: Double): Self = StObject.set(x, "minPortalLevel", value.asInstanceOf[js.Any])
    
    inline def setTileBounds(value: LatLngBounds_): Self = StObject.set(x, "tileBounds", value.asInstanceOf[js.Any])
  }
}
