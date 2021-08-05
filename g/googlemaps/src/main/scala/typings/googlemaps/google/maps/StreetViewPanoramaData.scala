package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewPanoramaData extends StObject {
  
  var copyright: js.UndefOr[String] = js.undefined
  
  var imageDate: js.UndefOr[String] = js.undefined
  
  var links: js.UndefOr[js.Array[StreetViewLink]] = js.undefined
  
  var location: js.UndefOr[StreetViewLocation] = js.undefined
  
  var tiles: js.UndefOr[StreetViewTileData] = js.undefined
}
object StreetViewPanoramaData {
  
  inline def apply(): StreetViewPanoramaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoramaData]
  }
  
  extension [Self <: StreetViewPanoramaData](x: Self) {
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setImageDate(value: String): Self = StObject.set(x, "imageDate", value.asInstanceOf[js.Any])
    
    inline def setImageDateUndefined: Self = StObject.set(x, "imageDate", js.undefined)
    
    inline def setLinks(value: js.Array[StreetViewLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: StreetViewLink*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setLocation(value: StreetViewLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setTiles(value: StreetViewTileData): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    inline def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
  }
}
