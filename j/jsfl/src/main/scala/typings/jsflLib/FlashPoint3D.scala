package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashPoint3D extends FlashPoint {
  var z: scala.Double
}

object FlashPoint3D {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): FlashPoint3D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[FlashPoint3D]
  }
}

