package typings.looksSame.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * coordinate bounds
  */
trait CoordBounds extends js.Object {
  /**
    * Y-coordinate of bottom right corner
    */
  var bottom: Double
  /**
    * X-coordinate of upper left corner
    */
  var left: Double
  /**
    * X-coordinate of bottom right corner
    */
  var right: Double
  /**
    * Y-coordinate of upper left corner
    */
  var top: Double
}

object CoordBounds {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): CoordBounds = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CoordBounds]
  }
}

