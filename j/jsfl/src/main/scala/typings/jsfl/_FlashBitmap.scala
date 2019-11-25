package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FlashBitmap extends js.Object {
  var bits: js.Any
  var cTab: js.UndefOr[js.Array[String]] = js.undefined
  var depth: js.Any
  var height: js.Any
  var width: js.Any
}

object _FlashBitmap {
  @scala.inline
  def apply(bits: js.Any, depth: js.Any, height: js.Any, width: js.Any, cTab: js.Array[String] = null): _FlashBitmap = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (cTab != null) __obj.updateDynamic("cTab")(cTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FlashBitmap]
  }
}

