package typings.mapsjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait extentChangeStatsObj extends StObject {
  
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
  implicit class extentChangeStatsObjMutableBuilder[Self <: extentChangeStatsObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterLat(value: Double): Self = StObject.set(x, "centerLat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterLon(value: Double): Self = StObject.set(x, "centerLon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtents(value: envelope): Self = StObject.set(x, "extents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapScale(value: Double): Self = StObject.set(x, "mapScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapScaleProjected(value: Double): Self = StObject.set(x, "mapScaleProjected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUnitsPerPixel(value: Double): Self = StObject.set(x, "mapUnitsPerPixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
  }
}
