package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewTileData extends StObject {
  
  var centerHeading: js.UndefOr[Double] = js.undefined
  
  def getTileUrl(pano: String, tileZoom: Double, tileX: Double, tileY: Double): String
  
  var tileSize: js.UndefOr[Size] = js.undefined
  
  var worldSize: js.UndefOr[Size] = js.undefined
}
object StreetViewTileData {
  
  inline def apply(getTileUrl: (String, Double, Double, Double) => String): StreetViewTileData = {
    val __obj = js.Dynamic.literal(getTileUrl = js.Any.fromFunction4(getTileUrl))
    __obj.asInstanceOf[StreetViewTileData]
  }
  
  extension [Self <: StreetViewTileData](x: Self) {
    
    inline def setCenterHeading(value: Double): Self = StObject.set(x, "centerHeading", value.asInstanceOf[js.Any])
    
    inline def setCenterHeadingUndefined: Self = StObject.set(x, "centerHeading", js.undefined)
    
    inline def setGetTileUrl(value: (String, Double, Double, Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction4(value))
    
    inline def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    inline def setWorldSize(value: Size): Self = StObject.set(x, "worldSize", value.asInstanceOf[js.Any])
    
    inline def setWorldSizeUndefined: Self = StObject.set(x, "worldSize", js.undefined)
  }
}
