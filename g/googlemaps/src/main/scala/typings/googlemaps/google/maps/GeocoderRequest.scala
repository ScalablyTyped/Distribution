package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderRequest extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var componentRestrictions: js.UndefOr[GeocoderComponentRestrictions] = js.undefined
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var placeId: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object GeocoderRequest {
  @scala.inline
  def apply(
    address: String = null,
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    componentRestrictions: GeocoderComponentRestrictions = null,
    location: LatLng | LatLngLiteral = null,
    placeId: String = null,
    region: String = null
  ): GeocoderRequest = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (componentRestrictions != null) __obj.updateDynamic("componentRestrictions")(componentRestrictions.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (placeId != null) __obj.updateDynamic("placeId")(placeId.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderRequest]
  }
}

