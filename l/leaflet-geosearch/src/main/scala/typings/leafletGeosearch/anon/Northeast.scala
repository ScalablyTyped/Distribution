package typings.leafletGeosearch.anon

import typings.leafletGeosearch.mod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Northeast extends js.Object {
  var northeast: LatLngLiteral
  var southwest: LatLngLiteral
}

object Northeast {
  @scala.inline
  def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Northeast]
  }
}

