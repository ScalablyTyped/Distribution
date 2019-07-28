package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.LatLngBoundsLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompletionRequest extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.undefined
  var input: String
  var location: js.UndefOr[LatLng] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var sessionToken: js.UndefOr[AutocompleteSessionToken] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object AutocompletionRequest {
  @scala.inline
  def apply(
    input: String,
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    componentRestrictions: ComponentRestrictions = null,
    location: LatLng = null,
    offset: Int | Double = null,
    radius: Int | Double = null,
    sessionToken: AutocompleteSessionToken = null,
    types: js.Array[String] = null
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

