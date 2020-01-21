package typings.lazyBrush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinates extends js.Object {
  var x: Double
  var y: Double
}

object Coordinates {
  @scala.inline
  def apply(x: Double, y: Double): Coordinates = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Coordinates]
  }
}

