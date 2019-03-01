package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FlashBitmap extends js.Object {
  var bits: js.Any
  var cTab: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var depth: js.Any
  var height: js.Any
  var width: js.Any
}

object _FlashBitmap {
  @scala.inline
  def apply(
    bits: js.Any,
    depth: js.Any,
    height: js.Any,
    width: js.Any,
    cTab: js.Array[java.lang.String] = null
  ): _FlashBitmap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bits")(bits)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (cTab != null) __obj.updateDynamic("cTab")(cTab)
    __obj.asInstanceOf[_FlashBitmap]
  }
}

