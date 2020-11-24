package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationElevationRequest extends js.Object {
  
  var locations: js.Array[LatLngLiteral | LatLng] = js.native
}
object LocationElevationRequest {
  
  @scala.inline
  def apply(locations: js.Array[LatLngLiteral | LatLng]): LocationElevationRequest = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationElevationRequest]
  }
  
  @scala.inline
  implicit class LocationElevationRequestOps[Self <: LocationElevationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocationsVarargs(value: (LatLngLiteral | LatLng)*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[LatLngLiteral | LatLng]): Self = this.set("locations", value.asInstanceOf[js.Any])
  }
}
