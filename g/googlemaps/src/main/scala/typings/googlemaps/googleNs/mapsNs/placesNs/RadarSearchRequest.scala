package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.LatLngBoundsLiteral
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadarSearchRequest extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var keyword: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object RadarSearchRequest {
  @scala.inline
  def apply(
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    keyword: String = null,
    location: LatLng | LatLngLiteral = null,
    name: String = null,
    radius: Int | Double = null,
    `type`: String = null,
    types: js.Array[String] = null
  ): RadarSearchRequest = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[RadarSearchRequest]
  }
}

