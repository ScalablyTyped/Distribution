package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteOptions extends js.Object {
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var placeIdOnly: js.UndefOr[Boolean] = js.undefined
  var strictBounds: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
}

object AutocompleteOptions {
  @scala.inline
  def apply(
    bounds: LatLngBounds | LatLngBoundsLiteral = null,
    componentRestrictions: ComponentRestrictions = null,
    fields: js.Array[String] = null,
    placeIdOnly: js.UndefOr[Boolean] = js.undefined,
    strictBounds: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    types: js.Array[String] = null
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (componentRestrictions != null) __obj.updateDynamic("componentRestrictions")(componentRestrictions)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(placeIdOnly)) __obj.updateDynamic("placeIdOnly")(placeIdOnly)
    if (!js.isUndefined(strictBounds)) __obj.updateDynamic("strictBounds")(strictBounds)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[AutocompleteOptions]
  }
}

