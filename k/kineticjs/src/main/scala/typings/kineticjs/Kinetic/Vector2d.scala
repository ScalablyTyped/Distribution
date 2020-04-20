package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector2d extends js.Object {
  var x: Double
  var y: Double
}

object Vector2d {
  @scala.inline
  def apply(x: Double, y: Double): Vector2d = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vector2d]
  }
}

