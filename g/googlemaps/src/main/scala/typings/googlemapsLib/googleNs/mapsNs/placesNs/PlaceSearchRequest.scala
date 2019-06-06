package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceSearchRequest extends js.Object {
  var bounds: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral
  ] = js.undefined
  var keyword: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
  ] = js.undefined
  var maxPriceLevel: js.UndefOr[scala.Double] = js.undefined
  var minPriceLevel: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var openNow: js.UndefOr[scala.Boolean] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var rankBy: js.UndefOr[RankBy] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PlaceSearchRequest {
  @scala.inline
  def apply(
    bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral = null,
    keyword: java.lang.String = null,
    location: googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral = null,
    maxPriceLevel: scala.Int | scala.Double = null,
    minPriceLevel: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    openNow: js.UndefOr[scala.Boolean] = js.undefined,
    radius: scala.Int | scala.Double = null,
    rankBy: RankBy = null,
    `type`: java.lang.String = null,
    types: js.Array[java.lang.String] = null
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

