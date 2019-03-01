package typings
package imagemagickDashNativeLib.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuantizeColorsItem extends js.Object {
  var b: scala.Double
  var g: scala.Double
  var hex: java.lang.String
  var r: scala.Double
}

object IQuantizeColorsItem {
  @scala.inline
  def apply(b: scala.Double, g: scala.Double, hex: java.lang.String, r: scala.Double): IQuantizeColorsItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[IQuantizeColorsItem]
  }
}

