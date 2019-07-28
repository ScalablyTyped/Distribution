package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HammerPoint extends js.Object {
  var x: Double
  var y: Double
}

object HammerPoint {
  @scala.inline
  def apply(x: Double, y: Double): HammerPoint = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[HammerPoint]
  }
}

