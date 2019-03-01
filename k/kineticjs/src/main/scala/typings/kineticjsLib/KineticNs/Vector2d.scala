package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vector2d extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Vector2d {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Vector2d = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Vector2d]
  }
}

