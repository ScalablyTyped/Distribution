package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashRectangle extends js.Object {
  var bottom: scala.Double
  var left: scala.Double
  var right: scala.Double
  var top: scala.Double
}

object FlashRectangle {
  @scala.inline
  def apply(bottom: scala.Double, left: scala.Double, right: scala.Double, top: scala.Double): FlashRectangle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[FlashRectangle]
  }
}

