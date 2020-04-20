package typings.googlemaps.google.maps

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
    val __obj = js.Dynamic.literal(long_name = long_name.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderAddressComponent]
  }
}

