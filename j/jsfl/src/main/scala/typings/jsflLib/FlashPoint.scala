package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashPoint extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object FlashPoint {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): FlashPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[FlashPoint]
  }
}

