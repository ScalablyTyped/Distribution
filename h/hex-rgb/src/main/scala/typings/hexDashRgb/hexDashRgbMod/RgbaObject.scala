package typings.hexDashRgb.hexDashRgbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbaObject extends js.Object {
  var alpha: Double
  var blue: Double
  var green: Double
  var red: Double
}

object RgbaObject {
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, red: Double): RgbaObject = {
    val __obj = js.Dynamic.literal(alpha = alpha, blue = blue, green = green, red = red)
  
    __obj.asInstanceOf[RgbaObject]
  }
}

