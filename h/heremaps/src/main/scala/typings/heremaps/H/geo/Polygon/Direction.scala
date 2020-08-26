package typings.heremaps.H.geo.Polygon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://developer.here.com/documentation/maps/api_reference/H.geo.Polygon.html#.Direction}
  */
@js.native
trait Direction extends js.Object {
  var NORTH: Double = js.native
  var SOUTH: Double = js.native
}

object Direction {
  @scala.inline
  def apply(NORTH: Double, SOUTH: Double): Direction = {
    val __obj = js.Dynamic.literal(NORTH = NORTH.asInstanceOf[js.Any], SOUTH = SOUTH.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNORTH(value: Double): Self = this.set("NORTH", value.asInstanceOf[js.Any])
    @scala.inline
    def setSOUTH(value: Double): Self = this.set("SOUTH", value.asInstanceOf[js.Any])
  }
  
}

