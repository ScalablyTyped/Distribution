package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngLiteral extends _LatLngExpression {
  var lat: Double
  var lng: Double
}

object LatLngLiteral {
  @scala.inline
  def apply(lat: Double, lng: Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngLiteral]
  }
}

