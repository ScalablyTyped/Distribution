package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableCursorOffset extends js.Object {
  var left: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object SortableCursorOffset {
  @scala.inline
  def apply(left: Int | Double = null, top: Int | Double = null): SortableCursorOffset = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableCursorOffset]
  }
}

