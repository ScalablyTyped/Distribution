package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashPoint3D extends FlashPoint {
  var z: Double
}

object FlashPoint3D {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): FlashPoint3D = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[FlashPoint3D]
  }
}

