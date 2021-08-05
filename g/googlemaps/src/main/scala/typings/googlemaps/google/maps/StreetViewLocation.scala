package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewLocation extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var latLng: js.UndefOr[LatLng] = js.undefined
  
  var pano: js.UndefOr[String] = js.undefined
  
  var shortDescription: js.UndefOr[String] = js.undefined
}
object StreetViewLocation {
  
  inline def apply(): StreetViewLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewLocation]
  }
  
  extension [Self <: StreetViewLocation](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    inline def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    inline def setPanoUndefined: Self = StObject.set(x, "pano", js.undefined)
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
  }
}
