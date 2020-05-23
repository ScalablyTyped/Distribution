package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
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
    radius: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    types: js.Array[String] = null
  ): TextSearchRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSearchRequest]
  }
}

