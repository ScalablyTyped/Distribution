package typings.mapboxGl.mod

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
    val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
}

