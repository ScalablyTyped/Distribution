package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceResult extends js.Object {
  var address_components: js.UndefOr[js.Array[googlemapsLib.googleNs.mapsNs.GeocoderAddressComponent]] = js.undefined
  var adr_address: js.UndefOr[java.lang.String] = js.undefined
  var aspects: js.UndefOr[js.Array[PlaceAspectRating]] = js.undefined
  var formatted_address: js.UndefOr[java.lang.String] = js.undefined
  var formatted_phone_number: js.UndefOr[java.lang.String] = js.undefined
  var geometry: js.UndefOr[PlaceGeometry] = js.undefined
  var html_attributions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var international_phone_number: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var opening_hours: js.UndefOr[OpeningHours] = js.undefined
  var permanently_closed: js.UndefOr[scala.Boolean] = js.undefined
  var photos: js.UndefOr[js.Array[PlacePhoto]] = js.undefined
  var place_id: js.UndefOr[java.lang.String] = js.undefined
  var price_level: js.UndefOr[scala.Double] = js.undefined
  var rating: js.UndefOr[scala.Double] = js.undefined
  var reviews: js.UndefOr[js.Array[PlaceReview]] = js.undefined
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var utc_offset: js.UndefOr[scala.Double] = js.undefined
  var vicinity: js.UndefOr[java.lang.String] = js.undefined
  var website: js.UndefOr[java.lang.String] = js.undefined
}

object PlaceResult {
  @scala.inline
  def apply(
    name: java.lang.String,
    address_components: js.Array[googlemapsLib.googleNs.mapsNs.GeocoderAddressComponent] = null,
    adr_address: java.lang.String = null,
    aspects: js.Array[PlaceAspectRating] = null,
    formatted_address: java.lang.String = null,
    formatted_phone_number: java.lang.String = null,
    geometry: PlaceGeometry = null,
    html_attributions: js.Array[java.lang.String] = null,
    icon: java.lang.String = null,
    id: java.lang.String = null,
    international_phone_number: java.lang.String = null,
    opening_hours: OpeningHours = null,
    permanently_closed: js.UndefOr[scala.Boolean] = js.undefined,
    photos: js.Array[PlacePhoto] = null,
    place_id: java.lang.String = null,
    price_level: scala.Int | scala.Double = null,
    rating: scala.Int | scala.Double = null,
    reviews: js.Array[PlaceReview] = null,
    types: js.Array[java.lang.String] = null,
    url: java.lang.String = null,
    utc_offset: scala.Int | scala.Double = null,
    vicinity: java.lang.String = null,
    website: java.lang.String = null
  ): PlaceResult = {
    val __obj = js.Dynamic.literal(name = name)
    if (address_components != null) __obj.updateDynamic("address_components")(address_components)
    if (adr_address != null) __obj.updateDynamic("adr_address")(adr_address)
    if (aspects != null) __obj.updateDynamic("aspects")(aspects)
    if (formatted_address != null) __obj.updateDynamic("formatted_address")(formatted_address)
    if (formatted_phone_number != null) __obj.updateDynamic("formatted_phone_number")(formatted_phone_number)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    if (html_attributions != null) __obj.updateDynamic("html_attributions")(html_attributions)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (international_phone_number != null) __obj.updateDynamic("international_phone_number")(international_phone_number)
    if (opening_hours != null) __obj.updateDynamic("opening_hours")(opening_hours)
    if (!js.isUndefined(permanently_closed)) __obj.updateDynamic("permanently_closed")(permanently_closed)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (place_id != null) __obj.updateDynamic("place_id")(place_id)
    if (price_level != null) __obj.updateDynamic("price_level")(price_level.asInstanceOf[js.Any])
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (reviews != null) __obj.updateDynamic("reviews")(reviews)
    if (types != null) __obj.updateDynamic("types")(types)
    if (url != null) __obj.updateDynamic("url")(url)
    if (utc_offset != null) __obj.updateDynamic("utc_offset")(utc_offset.asInstanceOf[js.Any])
    if (vicinity != null) __obj.updateDynamic("vicinity")(vicinity)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[PlaceResult]
  }
}

