package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HammerPoint extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object HammerPoint {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): HammerPoint = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[HammerPoint]
  }
}

