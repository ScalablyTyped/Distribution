package typings.imagemagickDashNative.imagemagickDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuantizeColorsItem extends js.Object {
  var b: Double
  var g: Double
  var hex: String
  var r: Double
}

object IQuantizeColorsItem {
  @scala.inline
  def apply(b: Double, g: Double, hex: String, r: Double): IQuantizeColorsItem = {
    val __obj = js.Dynamic.literal(b = b, g = g, hex = hex, r = r)
  
    __obj.asInstanceOf[IQuantizeColorsItem]
  }
}

