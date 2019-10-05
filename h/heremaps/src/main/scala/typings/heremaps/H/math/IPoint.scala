package typings.heremaps.H.math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a 2-dimensional point consisting a x and y coordinate.
  * @property x {number} - The point's coordinate on X-axis.
  * @property y {number} - The point's coordinate on Y-axis.
  */
trait IPoint extends js.Object {
  var x: Double
  var y: Double
}

object IPoint {
  @scala.inline
  def apply(x: Double, y: Double): IPoint = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[IPoint]
  }
}

