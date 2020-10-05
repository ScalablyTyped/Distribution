package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderRequest extends js.Object {
  var address: js.UndefOr[String] = js.native
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
  var componentRestrictions: js.UndefOr[GeocoderComponentRestrictions] = js.native
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.native
  var placeId: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
}

object GeocoderRequest {
  @scala.inline
  def apply(): GeocoderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderRequest]
  }
  @scala.inline
  implicit class GeocoderRequestOps[Self <: GeocoderRequest] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setComponentRestrictions(value: GeocoderComponentRestrictions): Self = this.set("componentRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRestrictions: Self = this.set("componentRestrictions", js.undefined)
    @scala.inline
    def setLocation(value: LatLng | LatLngLiteral): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceId: Self = this.set("placeId", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

