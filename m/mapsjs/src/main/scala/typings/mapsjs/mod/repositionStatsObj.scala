package typings.mapsjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait repositionStatsObj extends StObject {
  
  var centerX: Double
  
  var centerY: Double
  
  var mapUnitsPerPixel: Double
  
  var zoomLevel: Double
}
object repositionStatsObj {
  
  @scala.inline
  def apply(centerX: Double, centerY: Double, mapUnitsPerPixel: Double, zoomLevel: Double): repositionStatsObj = {
    val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[repositionStatsObj]
  }
  
  @scala.inline
  implicit class repositionStatsObjMutableBuilder[Self <: repositionStatsObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUnitsPerPixel(value: Double): Self = StObject.set(x, "mapUnitsPerPixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
  }
}
