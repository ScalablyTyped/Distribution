package typings.iitc.hooksMod.global

import typings.leaflet.mod.LatLngBounds_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMapDataRefreshStart extends StObject {
  
  var bounds: LatLngBounds_ = js.native
  
  var dataZoom: Double = js.native
  
  var mapZoom: Double = js.native
  
  var minPortalLevel: Double = js.native
  
  var tileBounds: LatLngBounds_ = js.native
}
object EventMapDataRefreshStart {
  
  @scala.inline
  def apply(
    bounds: LatLngBounds_,
    dataZoom: Double,
    mapZoom: Double,
    minPortalLevel: Double,
    tileBounds: LatLngBounds_
  ): EventMapDataRefreshStart = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], dataZoom = dataZoom.asInstanceOf[js.Any], mapZoom = mapZoom.asInstanceOf[js.Any], minPortalLevel = minPortalLevel.asInstanceOf[js.Any], tileBounds = tileBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMapDataRefreshStart]
  }
  
  @scala.inline
  implicit class EventMapDataRefreshStartMutableBuilder[Self <: EventMapDataRefreshStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LatLngBounds_): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataZoom(value: Double): Self = StObject.set(x, "dataZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapZoom(value: Double): Self = StObject.set(x, "mapZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPortalLevel(value: Double): Self = StObject.set(x, "minPortalLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileBounds(value: LatLngBounds_): Self = StObject.set(x, "tileBounds", value.asInstanceOf[js.Any])
  }
}
