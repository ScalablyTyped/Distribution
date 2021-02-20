package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreetViewLocation extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var latLng: js.UndefOr[LatLng] = js.native
  
  var pano: js.UndefOr[String] = js.native
  
  var shortDescription: js.UndefOr[String] = js.native
}
object StreetViewLocation {
  
  @scala.inline
  def apply(): StreetViewLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewLocation]
  }
  
  @scala.inline
  implicit class StreetViewLocationMutableBuilder[Self <: StreetViewLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    @scala.inline
    def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanoUndefined: Self = StObject.set(x, "pano", js.undefined)
    
    @scala.inline
    def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
  }
}
