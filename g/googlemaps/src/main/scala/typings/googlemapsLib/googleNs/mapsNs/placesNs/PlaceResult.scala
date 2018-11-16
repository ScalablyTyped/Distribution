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

