package typings
package hexDashRgbLib.hexDashRgbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbaObj extends js.Object {
  var alpha: scala.Double
  var blue: scala.Double
  var green: scala.Double
  var red: scala.Double
}

object RgbaObj {
  @scala.inline
  def apply(alpha: scala.Double, blue: scala.Double, green: scala.Double, red: scala.Double): RgbaObj = {
    val __obj = js.Dynamic.literal(alpha = alpha, blue = blue, green = green, red = red)
  
    __obj.asInstanceOf[RgbaObj]
  }
}

