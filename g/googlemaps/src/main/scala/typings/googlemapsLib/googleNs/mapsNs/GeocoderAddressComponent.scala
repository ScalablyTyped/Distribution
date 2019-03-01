package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderAddressComponent extends js.Object {
  var long_name: java.lang.String
  var short_name: java.lang.String
  var types: js.Array[java.lang.String]
}

object GeocoderAddressComponent {
  @scala.inline
  def apply(long_name: java.lang.String, short_name: java.lang.String, types: js.Array[java.lang.String]): GeocoderAddressComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("long_name")(long_name)
    __obj.updateDynamic("short_name")(short_name)
    __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[GeocoderAddressComponent]
  }
}

