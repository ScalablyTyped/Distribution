package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var canonical: CanonicalCoordinate
  var key: scala.Double
  var wrap: scala.Double
}

object Coordinate {
  @scala.inline
  def apply(canonical: CanonicalCoordinate, key: scala.Double, wrap: scala.Double): Coordinate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canonical")(canonical)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[Coordinate]
  }
}

