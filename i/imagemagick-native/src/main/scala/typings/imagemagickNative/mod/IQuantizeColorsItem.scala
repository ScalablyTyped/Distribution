package typings.imagemagickNative.mod

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
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuantizeColorsItem]
  }
}

