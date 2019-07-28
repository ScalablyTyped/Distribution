package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var canonical: CanonicalCoordinate
  var key: Double
  var wrap: Double
}

object Coordinate {
  @scala.inline
  def apply(canonical: CanonicalCoordinate, key: Double, wrap: Double): Coordinate = {
    val __obj = js.Dynamic.literal(canonical = canonical, key = key, wrap = wrap)
  
    __obj.asInstanceOf[Coordinate]
  }
}

