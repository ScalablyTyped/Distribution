package typings.mapsjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait extentChangeStatsObj extends js.Object {
  
  var centerLat: Double = js.native
  
  var centerLon: Double = js.native
  
  var centerX: Double = js.native
  
  var centerY: Double = js.native
  
  var extents: envelope = js.native
  
  var mapScale: Double = js.native
  
  var mapScaleProjected: Double = js.native
  
  var mapUnitsPerPixel: Double = js.native
  
  var zoomLevel: Double = js.native
}
object extentChangeStatsObj {
  
  @scala.inline
  def apply(
    centerLat: Double,
    centerLon: Double,
    centerX: Double,
    centerY: Double,
    extents: envelope,
    mapScale: Double,
    mapScaleProjected: Double,
    mapUnitsPerPixel: Double,
    zoomLevel: Double
  ): extentChangeStatsObj = {
    val __obj = js.Dynamic.literal(centerLat = centerLat.asInstanceOf[js.Any], centerLon = centerLon.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any], mapScale = mapScale.asInstanceOf[js.Any], mapScaleProjected = mapScaleProjected.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[extentChangeStatsObj]
  }
  
  @scala.inline
  implicit class extentChangeStatsObjOps[Self <: extentChangeStatsObj] (val x: Self) extends AnyVal {
    
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
    def setCenterLat(value: Double): Self = this.set("centerLat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterLon(value: Double): Self = this.set("centerLon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterX(value: Double): Self = this.set("centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterY(value: Double): Self = this.set("centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtents(value: envelope): Self = this.set("extents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapScale(value: Double): Self = this.set("mapScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapScaleProjected(value: Double): Self = this.set("mapScaleProjected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUnitsPerPixel(value: Double): Self = this.set("mapUnitsPerPixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomLevel(value: Double): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
  }
}
