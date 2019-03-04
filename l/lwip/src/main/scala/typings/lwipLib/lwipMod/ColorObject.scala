package typings
package lwipLib.lwipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorObject extends js.Object {
  var a: js.UndefOr[scala.Double] = js.undefined
  var b: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object ColorObject {
  @scala.inline
  def apply(b: scala.Double, g: scala.Double, r: scala.Double, a: scala.Int | scala.Double = null): ColorObject = {
    val __obj = js.Dynamic.literal(b = b, g = g, r = r)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorObject]
  }
}

