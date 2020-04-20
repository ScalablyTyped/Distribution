package typings.jimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRadius extends js.Object {
  var radius: Double
  var x: Double
  var y: Double
}

object AnonRadius {
  @scala.inline
  def apply(radius: Double, x: Double, y: Double): AnonRadius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRadius]
  }
}

