package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewTileData extends StObject {
  
  var centerHeading: js.UndefOr[Double] = js.native
  
  def getTileUrl(pano: String, tileZoom: Double, tileX: Double, tileY: Double): String = js.native
  
  var tileSize: js.UndefOr[Size] = js.native
  
  var worldSize: js.UndefOr[Size] = js.native
}
object StreetViewTileData {
  
  @scala.inline
  def apply(getTileUrl: (String, Double, Double, Double) => String): StreetViewTileData = {
    val __obj = js.Dynamic.literal(getTileUrl = js.Any.fromFunction4(getTileUrl))
    __obj.asInstanceOf[StreetViewTileData]
  }
  
  @scala.inline
  implicit class StreetViewTileDataMutableBuilder[Self <: StreetViewTileData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterHeading(value: Double): Self = StObject.set(x, "centerHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterHeadingUndefined: Self = StObject.set(x, "centerHeading", js.undefined)
    
    @scala.inline
    def setGetTileUrl(value: (String, Double, Double, Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    
    @scala.inline
    def setWorldSize(value: Size): Self = StObject.set(x, "worldSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldSizeUndefined: Self = StObject.set(x, "worldSize", js.undefined)
  }
}
