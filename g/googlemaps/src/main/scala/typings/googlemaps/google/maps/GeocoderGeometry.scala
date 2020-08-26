package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocoderGeometry extends js.Object {
  var bounds: LatLngBounds = js.native
  var location: LatLng = js.native
  var location_type: GeocoderLocationType = js.native
  var viewport: LatLngBounds = js.native
}

object GeocoderGeometry {
  @scala.inline
  def apply(
    bounds: LatLngBounds,
    location: LatLng,
    location_type: GeocoderLocationType,
    viewport: LatLngBounds
  ): GeocoderGeometry = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderGeometry]
  }
  @scala.inline
  implicit class GeocoderGeometryOps[Self <: GeocoderGeometry] (val x: Self) extends AnyVal {
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
    def setBounds(value: LatLngBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: LatLng): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation_type(value: GeocoderLocationType): Self = this.set("location_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewport(value: LatLngBounds): Self = this.set("viewport", value.asInstanceOf[js.Any])
  }
  
}

