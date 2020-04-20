package typings.leafletGeosearch

import typings.leafletGeosearch.mod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNortheast extends js.Object {
  var northeast: LatLngLiteral
  var southwest: LatLngLiteral
}

object AnonNortheast {
  @scala.inline
  def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): AnonNortheast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNortheast]
  }
}

