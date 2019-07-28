package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.LatLngBoundsLiteral
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSearchRequest extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var query: String
  var radius: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object TextSearchRequest {
  @scala.inline
  def apply(
    query: String,
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    location: LatLng | LatLngLiteral = null,
    radius: Int | Double = null,
    `type`: String = null,
    types: js.Array[String] = null
  ): TextSearchRequest = {
    val __obj = js.Dynamic.literal(query = query)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[TextSearchRequest]
  }
}

