package typings.leafletDashGeosearch

import typings.leafletDashGeosearch.leafletDashGeosearchMod.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Northeast extends js.Object {
  var northeast: LatLngLiteral
  var southwest: LatLngLiteral
}

object Anon_Northeast {
  @scala.inline
  def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): Anon_Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Northeast]
  }
}

