package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSearchRequest extends js.Object {
  var bounds: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral
  ] = js.undefined
  var location: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
  ] = js.undefined
  var query: java.lang.String
  var radius: js.UndefOr[scala.Double] = js.undefined
   /* Deprecated. Will be removed February 16, 2017 */ var `type`: js.UndefOr[java.lang.String] = js.undefined
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TextSearchRequest {
  @scala.inline
  def apply(
    query: java.lang.String,
    bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral = null,
    location: googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral = null,
    radius: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    types: js.Array[java.lang.String] = null
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

