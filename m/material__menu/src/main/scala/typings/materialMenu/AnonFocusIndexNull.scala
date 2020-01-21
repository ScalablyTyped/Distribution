package typings.materialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusIndexNull extends js.Object {
  var focusIndex: js.UndefOr[Double | Null] = js.undefined
}

object AnonFocusIndexNull {
  @scala.inline
  def apply(focusIndex: Int | Double = null): AnonFocusIndexNull = {
    val __obj = js.Dynamic.literal()
    if (focusIndex != null) __obj.updateDynamic("focusIndex")(focusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocusIndexNull]
  }
}

