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
  
  @scala.inline
  def apply(): StreetViewPanoramaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoramaData]
  }
  
  @scala.inline
  implicit class StreetViewPanoramaDataMutableBuilder[Self <: StreetViewPanoramaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setImageDate(value: String): Self = StObject.set(x, "imageDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDateUndefined: Self = StObject.set(x, "imageDate", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[StreetViewLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: StreetViewLink*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: StreetViewLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setTiles(value: StreetViewTileData): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesUndefined: Self = StObject.set(x, "tiles", js.undefined)
  }
}
