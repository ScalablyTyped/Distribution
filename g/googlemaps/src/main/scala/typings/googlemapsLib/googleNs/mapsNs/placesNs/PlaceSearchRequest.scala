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
   /* Deprecated. Will be removed February 16, 2017 */var `type`: js.UndefOr[java.lang.String] = js.undefined
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

