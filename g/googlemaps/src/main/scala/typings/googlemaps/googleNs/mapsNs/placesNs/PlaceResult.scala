package typings.googlemaps.googleNs.mapsNs.placesNs

import typings.googlemaps.googleNs.mapsNs.GeocoderAddressComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceResult extends js.Object {
  var address_components: js.UndefOr[js.Array[GeocoderAddressComponent]] = js.undefined
  var adr_address: js.UndefOr[String] = js.undefined
  var aspects: js.UndefOr[js.Array[PlaceAspectRating]] = js.undefined
  var formatted_address: js.UndefOr[String] = js.undefined
  var formatted_phone_number: js.UndefOr[String] = js.undefined
  var geometry: js.UndefOr[PlaceGeometry] = js.undefined
  var html_attributions: js.UndefOr[js.Array[String]] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var international_phone_number: js.UndefOr[String] = js.undefined
  var name: String
  var opening_hours: js.UndefOr[OpeningHours] = js.undefined
  var permanently_closed: js.UndefOr[Boolean] = js.undefined
  var photos: js.UndefOr[js.Array[PlacePhoto]] = js.undefined
  var place_id: js.UndefOr[String] = js.undefined
  var price_level: js.UndefOr[Double] = js.undefined
  var rating: js.UndefOr[Double] = js.undefined
  var reviews: js.UndefOr[js.Array[PlaceReview]] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var utc_offset: js.UndefOr[Double] = js.undefined
  var vicinity: js.UndefOr[String] = js.undefined
  var website: js.UndefOr[String] = js.undefined
}

object PlaceResult {
  @scala.inline
  def apply(
    name: String,
    address_components: js.Array[GeocoderAddressComponent] = null,
    adr_address: String = null,
    aspects: js.Array[PlaceAspectRating] = null,
    formatted_address: String = null,
    formatted_phone_number: String = null,
    geometry: PlaceGeometry = null,
    html_attributions: js.Array[String] = null,
    icon: String = null,
    id: String = null,
    international_phone_number: String = null,
    opening_hours: OpeningHours = null,
    permanently_closed: js.UndefOr[Boolean] = js.undefined,
    photos: js.Array[PlacePhoto] = null,
    place_id: String = null,
    price_level: Int | Double = null,
    rating: Int | Double = null,
    reviews: js.Array[PlaceReview] = null,
    types: js.Array[String] = null,
    url: String = null,
    utc_offset: Int | Double = null,
    vicinity: String = null,
    website: String = null
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

