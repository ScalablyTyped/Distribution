package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.GeocoderAddressComponent
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
  var plus_code: js.UndefOr[PlacePlusCode] = js.undefined
  var price_level: js.UndefOr[Double] = js.undefined
  var rating: js.UndefOr[Double] = js.undefined
  var reviews: js.UndefOr[js.Array[PlaceReview]] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var user_ratings_total: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated utc_offset is deprecated as of November 2019 and will be turned off in November 2020.
    *      Use PlaceResult.utc_offset_minutes instead.
    */
  var utc_offset: js.UndefOr[Double] = js.undefined
  var utc_offset_minutes: js.UndefOr[Double] = js.undefined
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
    plus_code: PlacePlusCode = null,
    price_level: js.UndefOr[Double] = js.undefined,
    rating: js.UndefOr[Double] = js.undefined,
    reviews: js.Array[PlaceReview] = null,
    types: js.Array[String] = null,
    url: String = null,
    user_ratings_total: js.UndefOr[Double] = js.undefined,
    utc_offset: js.UndefOr[Double] = js.undefined,
    utc_offset_minutes: js.UndefOr[Double] = js.undefined,
    vicinity: String = null,
    website: String = null
  ): PlaceResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (address_components != null) __obj.updateDynamic("address_components")(address_components.asInstanceOf[js.Any])
    if (adr_address != null) __obj.updateDynamic("adr_address")(adr_address.asInstanceOf[js.Any])
    if (aspects != null) __obj.updateDynamic("aspects")(aspects.asInstanceOf[js.Any])
    if (formatted_address != null) __obj.updateDynamic("formatted_address")(formatted_address.asInstanceOf[js.Any])
    if (formatted_phone_number != null) __obj.updateDynamic("formatted_phone_number")(formatted_phone_number.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (html_attributions != null) __obj.updateDynamic("html_attributions")(html_attributions.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (international_phone_number != null) __obj.updateDynamic("international_phone_number")(international_phone_number.asInstanceOf[js.Any])
    if (opening_hours != null) __obj.updateDynamic("opening_hours")(opening_hours.asInstanceOf[js.Any])
    if (!js.isUndefined(permanently_closed)) __obj.updateDynamic("permanently_closed")(permanently_closed.get.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (place_id != null) __obj.updateDynamic("place_id")(place_id.asInstanceOf[js.Any])
    if (plus_code != null) __obj.updateDynamic("plus_code")(plus_code.asInstanceOf[js.Any])
    if (!js.isUndefined(price_level)) __obj.updateDynamic("price_level")(price_level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rating)) __obj.updateDynamic("rating")(rating.get.asInstanceOf[js.Any])
    if (reviews != null) __obj.updateDynamic("reviews")(reviews.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(user_ratings_total)) __obj.updateDynamic("user_ratings_total")(user_ratings_total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(utc_offset)) __obj.updateDynamic("utc_offset")(utc_offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(utc_offset_minutes)) __obj.updateDynamic("utc_offset_minutes")(utc_offset_minutes.get.asInstanceOf[js.Any])
    if (vicinity != null) __obj.updateDynamic("vicinity")(vicinity.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceResult]
  }
}

