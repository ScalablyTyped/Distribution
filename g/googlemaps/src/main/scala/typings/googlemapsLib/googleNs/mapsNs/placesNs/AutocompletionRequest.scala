package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompletionRequest extends js.Object {
  var bounds: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral
  ] = js.undefined
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.undefined
  var input: java.lang.String
  var location: js.UndefOr[googlemapsLib.googleNs.mapsNs.LatLng] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var sessionToken: js.UndefOr[AutocompleteSessionToken] = js.undefined
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

