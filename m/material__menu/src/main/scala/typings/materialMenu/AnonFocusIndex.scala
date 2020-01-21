package typings.materialMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusIndex extends js.Object {
  var focusIndex: js.UndefOr[Null] = js.undefined
}

object AnonFocusIndex {
  @scala.inline
  def apply(focusIndex: js.UndefOr[scala.Nothing] = js.undefined): AnonFocusIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusIndex)) __obj.updateDynamic("focusIndex")(focusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocusIndex]
  }
}

