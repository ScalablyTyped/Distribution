package typings
package hexDashRgbLib.hexDashRgbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbaObject extends js.Object {
  var alpha: scala.Double
  var blue: scala.Double
  var green: scala.Double
  var red: scala.Double
}

object RgbaObject {
  @scala.inline
  def apply(alpha: scala.Double, blue: scala.Double, green: scala.Double, red: scala.Double): RgbaObject = {
    val __obj = js.Dynamic.literal(alpha = alpha, blue = blue, green = green, red = red)
  
    __obj.asInstanceOf[RgbaObject]
  }
}

