package typings.leafletDashGeosearch.leafletDashGeosearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngLiteral extends js.Object {
  var lat: Double
  var lng: Double
}

object LatLngLiteral {
  @scala.inline
  def apply(lat: Double, lng: Double): LatLngLiteral = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[LatLngLiteral]
  }
}

