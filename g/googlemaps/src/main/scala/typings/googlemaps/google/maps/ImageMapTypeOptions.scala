package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageMapTypeOptions extends StObject {
  
  var alt: js.UndefOr[String] = js.native
  
  def getTileUrl(tileCoord: Point, zoom: Double): String = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var minZoom: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var tileSize: Size = js.native
}
object ImageMapTypeOptions {
  
  @scala.inline
  def apply(getTileUrl: (Point, Double) => String, tileSize: Size): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal(getTileUrl = js.Any.fromFunction2(getTileUrl), tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
  
  @scala.inline
  implicit class ImageMapTypeOptionsMutableBuilder[Self <: ImageMapTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setGetTileUrl(value: (Point, Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
  }
}
