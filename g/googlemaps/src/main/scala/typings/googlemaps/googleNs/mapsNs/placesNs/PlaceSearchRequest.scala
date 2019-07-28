package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.LatLngBoundsLiteral
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceSearchRequest extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var keyword: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  var maxPriceLevel: js.UndefOr[Double] = js.undefined
  var minPriceLevel: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var openNow: js.UndefOr[Boolean] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var rankBy: js.UndefOr[RankBy] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object PlaceSearchRequest {
  @scala.inline
  def apply(
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    keyword: String = null,
    location: LatLng | LatLngLiteral = null,
    maxPriceLevel: Int | Double = null,
    minPriceLevel: Int | Double = null,
    name: String = null,
    openNow: js.UndefOr[Boolean] = js.undefined,
    radius: Int | Double = null,
    rankBy: RankBy = null,
    `type`: String = null,
    types: js.Array[String] = null
  ): PlaceSearchRequest = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (maxPriceLevel != null) __obj.updateDynamic("maxPriceLevel")(maxPriceLevel.asInstanceOf[js.Any])
    if (minPriceLevel != null) __obj.updateDynamic("minPriceLevel")(minPriceLevel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(openNow)) __obj.updateDynamic("openNow")(openNow)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rankBy != null) __obj.updateDynamic("rankBy")(rankBy)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[PlaceSearchRequest]
  }
}

