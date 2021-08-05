package typings.googlemaps.google.maps

import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapType extends StObject {
  
  var alt: js.UndefOr[String] = js.undefined
  
  def getTile(tileCoord: Point, zoom: Double, ownerDocument: Document): Element
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var projection: js.UndefOr[Projection] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  def releaseTile(tile: Element): Unit
  
  var tileSize: js.UndefOr[Size] = js.undefined
}
object MapType {
  
  inline def apply(getTile: (Point, Double, Document) => Element, releaseTile: Element => Unit): MapType = {
    val __obj = js.Dynamic.literal(getTile = js.Any.fromFunction3(getTile), releaseTile = js.Any.fromFunction1(releaseTile))
    __obj.asInstanceOf[MapType]
  }
  
  extension [Self <: MapType](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setGetTile(value: (Point, Double, Document) => Element): Self = StObject.set(x, "getTile", js.Any.fromFunction3(value))
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setReleaseTile(value: Element => Unit): Self = StObject.set(x, "releaseTile", js.Any.fromFunction1(value))
    
    inline def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
  }
}
