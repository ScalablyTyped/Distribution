package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderRequest extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var componentRestrictions: js.UndefOr[GeocoderComponentRestrictions] = js.undefined
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var placeId: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
}

object GeocoderRequest {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    componentRestrictions: GeocoderComponentRestrictions = null,
    location: LatLng | LatLngLiteral = null,
    placeId: java.lang.String = null,
    region: java.lang.String = null
  ): GeocoderRequest = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (componentRestrictions != null) __obj.updateDynamic("componentRestrictions")(componentRestrictions)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (placeId != null) __obj.updateDynamic("placeId")(placeId)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GeocoderRequest]
  }
}

