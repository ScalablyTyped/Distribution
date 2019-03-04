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

object AutocompletionRequest {
  @scala.inline
  def apply(
    input: java.lang.String,
    bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds | googlemapsLib.googleNs.mapsNs.LatLngBoundsLiteral = null,
    componentRestrictions: ComponentRestrictions = null,
    location: googlemapsLib.googleNs.mapsNs.LatLng = null,
    offset: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    sessionToken: AutocompleteSessionToken = null,
    types: js.Array[java.lang.String] = null
  ): AutocompletionRequest = {
    val __obj = js.Dynamic.literal(input = input)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (componentRestrictions != null) __obj.updateDynamic("componentRestrictions")(componentRestrictions)
    if (location != null) __obj.updateDynamic("location")(location)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[AutocompletionRequest]
  }
}

