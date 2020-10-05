package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderResult extends js.Object {
  var address_components: js.Array[GeocoderAddressComponent] = js.native
  var formatted_address: String = js.native
  var geometry: GeocoderGeometry = js.native
  var partial_match: Boolean = js.native
  var place_id: String = js.native
  var postcode_localities: js.Array[String] = js.native
  var types: js.Array[String] = js.native
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
    val __obj = js.Dynamic.literal(address_components = address_components.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], partial_match = partial_match.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], postcode_localities = postcode_localities.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResult]
  }
  @scala.inline
  implicit class GeocoderResultOps[Self <: GeocoderResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress_componentsVarargs(value: GeocoderAddressComponent*): Self = this.set("address_components", js.Array(value :_*))
    @scala.inline
    def setAddress_components(value: js.Array[GeocoderAddressComponent]): Self = this.set("address_components", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatted_address(value: String): Self = this.set("formatted_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometry(value: GeocoderGeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartial_match(value: Boolean): Self = this.set("partial_match", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlace_id(value: String): Self = this.set("place_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostcode_localitiesVarargs(value: String*): Self = this.set("postcode_localities", js.Array(value :_*))
    @scala.inline
    def setPostcode_localities(value: js.Array[String]): Self = this.set("postcode_localities", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

