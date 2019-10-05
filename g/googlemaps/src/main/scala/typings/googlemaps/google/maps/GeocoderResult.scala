package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderResult extends js.Object {
  var address_components: js.Array[GeocoderAddressComponent]
  var formatted_address: String
  var geometry: GeocoderGeometry
  var partial_match: Boolean
  var place_id: String
  var postcode_localities: js.Array[String]
  var types: js.Array[String]
}

object GeocoderResult {
  @scala.inline
  def apply(
    address_components: js.Array[GeocoderAddressComponent],
    formatted_address: String,
    geometry: GeocoderGeometry,
    partial_match: Boolean,
    place_id: String,
    postcode_localities: js.Array[String],
    types: js.Array[String]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address_components = address_components, formatted_address = formatted_address, geometry = geometry, partial_match = partial_match, place_id = place_id, postcode_localities = postcode_localities, types = types)
  
    __obj.asInstanceOf[GeocoderResult]
  }
}

