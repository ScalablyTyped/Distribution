package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
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
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (maxPriceLevel != null) __obj.updateDynamic("maxPriceLevel")(maxPriceLevel.asInstanceOf[js.Any])
    if (minPriceLevel != null) __obj.updateDynamic("minPriceLevel")(minPriceLevel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(openNow)) __obj.updateDynamic("openNow")(openNow.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rankBy != null) __obj.updateDynamic("rankBy")(rankBy.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceSearchRequest]
  }
}

