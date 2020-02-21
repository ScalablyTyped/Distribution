package typings.heremaps.H.geo.Polygon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://developer.here.com/documentation/maps/api_reference/H.geo.Polygon.html#.Direction}
  */
trait Direction extends js.Object {
  var NORTH: Double
  var SOUTH: Double
}

object Direction {
  @scala.inline
  def apply(NORTH: Double, SOUTH: Double): Direction = {
    val __obj = js.Dynamic.literal(NORTH = NORTH.asInstanceOf[js.Any], SOUTH = SOUTH.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Direction]
  }
}

