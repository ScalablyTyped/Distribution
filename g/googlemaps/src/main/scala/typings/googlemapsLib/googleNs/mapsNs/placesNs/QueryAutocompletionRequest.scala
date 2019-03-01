package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAutocompletionRequest extends js.Object {
  var bounds: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral
  ] = js.undefined
  var input: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[googlemapsLib.googleNs.mapsNs.LatLng] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
}

object QueryAutocompletionRequest {
  @scala.inline
  def apply(
    bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral = null,
    input: java.lang.String = null,
    location: googlemapsLib.googleNs.mapsNs.LatLng = null,
    offset: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null
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

