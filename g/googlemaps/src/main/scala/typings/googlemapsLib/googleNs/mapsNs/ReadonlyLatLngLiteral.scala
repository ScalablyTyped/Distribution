package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyLatLngLiteral extends js.Object {
  /** @see {@link LatLngLiteral#lat} */
  val lat: scala.Double
  /** @see {@link LatLngLiteral#lng} */
  val lng: scala.Double
}

object ReadonlyLatLngLiteral {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double): ReadonlyLatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[ReadonlyLatLngLiteral]
  }
}

