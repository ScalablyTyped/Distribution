package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceResult extends js.Object {
  var address_components: js.Array[googlemapsLib.googleNs.mapsNs.GeocoderAddressComponent]
  var adr_address: java.lang.String
  var aspects: js.Array[PlaceAspectRating]
  var formatted_address: java.lang.String
  var formatted_phone_number: java.lang.String
  var geometry: PlaceGeometry
  var html_attributions: js.Array[java.lang.String]
  var icon: java.lang.String
  var id: java.lang.String
  var international_phone_number: java.lang.String
  var name: java.lang.String
  var opening_hours: OpeningHours
  var permanently_closed: scala.Boolean
  var photos: js.Array[PlacePhoto]
  var place_id: java.lang.String
  var price_level: scala.Double
  var rating: scala.Double
  var reviews: js.Array[PlaceReview]
  var types: js.Array[java.lang.String]
  var url: java.lang.String
  var utc_offset: scala.Double
  var vicinity: java.lang.String
  var website: java.lang.String
}

object PlaceResult {
  @scala.inline
  def apply(
    address_components: js.Array[googlemapsLib.googleNs.mapsNs.GeocoderAddressComponent],
    adr_address: java.lang.String,
    aspects: js.Array[PlaceAspectRating],
    formatted_address: java.lang.String,
    formatted_phone_number: java.lang.String,
    geometry: PlaceGeometry,
    html_attributions: js.Array[java.lang.String],
    icon: java.lang.String,
    id: java.lang.String,
    international_phone_number: java.lang.String,
    name: java.lang.String,
    opening_hours: OpeningHours,
    permanently_closed: scala.Boolean,
    photos: js.Array[PlacePhoto],
    place_id: java.lang.String,
    price_level: scala.Double,
    rating: scala.Double,
    reviews: js.Array[PlaceReview],
    types: js.Array[java.lang.String],
    url: java.lang.String,
    utc_offset: scala.Double,
    vicinity: java.lang.String,
    website: java.lang.String
  ): PlaceResult = {
    val __obj = js.Dynamic.literal(address_components = address_components, adr_address = adr_address, aspects = aspects, formatted_address = formatted_address, formatted_phone_number = formatted_phone_number, geometry = geometry, html_attributions = html_attributions, icon = icon, id = id, international_phone_number = international_phone_number, name = name, opening_hours = opening_hours, permanently_closed = permanently_closed, photos = photos, place_id = place_id, price_level = price_level, rating = rating, reviews = reviews, types = types, url = url, utc_offset = utc_offset, vicinity = vicinity, website = website)
  
    __obj.asInstanceOf[PlaceResult]
  }
}

