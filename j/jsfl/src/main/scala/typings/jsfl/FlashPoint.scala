package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashPoint extends js.Object {
  var x: Double
  var y: Double
}

object FlashPoint {
  @scala.inline
  def apply(x: Double, y: Double): FlashPoint = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[FlashPoint]
  }
}

