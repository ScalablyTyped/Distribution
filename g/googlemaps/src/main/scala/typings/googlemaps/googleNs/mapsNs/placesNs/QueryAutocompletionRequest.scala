package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.LatLngBoundsLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAutocompletionRequest extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[LatLng] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object QueryAutocompletionRequest {
  @scala.inline
  def apply(
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    input: String = null,
    location: LatLng = null,
    offset: Int | Double = null,
    radius: Int | Double = null
  ): QueryAutocompletionRequest = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input)
    if (location != null) __obj.updateDynamic("location")(location)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompletionRequest]
  }
}

