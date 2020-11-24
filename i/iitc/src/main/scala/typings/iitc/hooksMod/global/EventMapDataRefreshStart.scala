package typings.iitc.hooksMod.global

import typings.leaflet.mod.LatLngBounds_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMapDataRefreshStart extends js.Object {
  
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
  implicit class EventMapDataRefreshStartOps[Self <: EventMapDataRefreshStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBounds(value: LatLngBounds_): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataZoom(value: Double): Self = this.set("dataZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapZoom(value: Double): Self = this.set("mapZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPortalLevel(value: Double): Self = this.set("minPortalLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileBounds(value: LatLngBounds_): Self = this.set("tileBounds", value.asInstanceOf[js.Any])
  }
}
