package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderAddressComponent extends js.Object {
  var long_name: String
  var short_name: String
  var types: js.Array[String]
}

object GeocoderAddressComponent {
  @scala.inline
  def apply(long_name: String, short_name: String, types: js.Array[String]): GeocoderAddressComponent = {
    val __obj = js.Dynamic.literal(long_name = long_name, short_name = short_name, types = types)
  
    __obj.asInstanceOf[GeocoderAddressComponent]
  }
}

