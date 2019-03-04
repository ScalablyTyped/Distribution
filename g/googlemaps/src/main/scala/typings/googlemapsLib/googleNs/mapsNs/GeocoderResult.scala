package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderResult extends js.Object {
  var address_components: js.Array[GeocoderAddressComponent]
  var formatted_address: java.lang.String
  var geometry: GeocoderGeometry
  var partial_match: scala.Boolean
  var place_id: java.lang.String
  var postcode_localities: js.Array[java.lang.String]
  var types: js.Array[java.lang.String]
}

object GeocoderResult {
  @scala.inline
  def apply(
    address_components: js.Array[GeocoderAddressComponent],
    formatted_address: java.lang.String,
    geometry: GeocoderGeometry,
    partial_match: scala.Boolean,
    place_id: java.lang.String,
    postcode_localities: js.Array[java.lang.String],
    types: js.Array[java.lang.String]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address_components = address_components, formatted_address = formatted_address, geometry = geometry, partial_match = partial_match, place_id = place_id, postcode_localities = postcode_localities, types = types)
  
    __obj.asInstanceOf[GeocoderResult]
  }
}

