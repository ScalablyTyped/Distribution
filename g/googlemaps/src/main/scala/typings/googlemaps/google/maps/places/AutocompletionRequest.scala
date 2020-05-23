package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompletionRequest extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.undefined
  var input: String
  var location: js.UndefOr[LatLng] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The location where {@link AutocompletePrediction#distance_meters} is calculated from.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/places-autocomplete-service#AutocompletionRequest.origin Maps JavaScript API}
    */
  var origin: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
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
    offset: js.UndefOr[Double] = js.undefined,
    origin: LatLng | LatLngLiteral = null,
    radius: js.UndefOr[Double] = js.undefined,
    sessionToken: AutocompleteSessionToken = null,
    types: js.Array[String] = null
  ): AutocompletionRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (componentRestrictions != null) __obj.updateDynamic("componentRestrictions")(componentRestrictions.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompletionRequest]
  }
}

