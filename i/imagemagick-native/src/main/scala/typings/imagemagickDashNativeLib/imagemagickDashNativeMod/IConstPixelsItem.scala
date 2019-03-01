package typings
package imagemagickDashNativeLib.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstPixelsItem extends js.Object {
  var blue: scala.Double
  var green: scala.Double
  var opacity: scala.Double
  var red: scala.Double
}

object IConstPixelsItem {
  @scala.inline
  def apply(blue: scala.Double, green: scala.Double, opacity: scala.Double, red: scala.Double): IConstPixelsItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("red")(red)
    __obj.asInstanceOf[IConstPixelsItem]
  }
}

