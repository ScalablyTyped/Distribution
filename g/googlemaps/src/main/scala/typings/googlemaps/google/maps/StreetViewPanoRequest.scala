package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewPanoRequest extends StObject {
  
  var pano: String
}
object StreetViewPanoRequest {
  
  @scala.inline
  def apply(pano: String): StreetViewPanoRequest = {
    val __obj = js.Dynamic.literal(pano = pano.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewPanoRequest]
  }
  
  @scala.inline
  implicit class StreetViewPanoRequestMutableBuilder[Self <: StreetViewPanoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPano(value: String): Self = StObject.set(x, "pano", value.asInstanceOf[js.Any])
  }
}
