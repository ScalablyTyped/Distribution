package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathElevationRequest extends StObject {
  
  var path: js.UndefOr[js.Array[LatLngLiteral | LatLng]] = js.native
  
  var samples: js.UndefOr[Double] = js.native
}
object PathElevationRequest {
  
  @scala.inline
  def apply(): PathElevationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathElevationRequest]
  }
  
  @scala.inline
  implicit class PathElevationRequestMutableBuilder[Self <: PathElevationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: js.Array[LatLngLiteral | LatLng]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: (LatLngLiteral | LatLng)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
  }
}
