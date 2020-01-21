package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectAnimation extends js.Object {
  var close: js.UndefOr[MultiSelectAnimationClose] = js.undefined
  var open: js.UndefOr[MultiSelectAnimationOpen] = js.undefined
}

object MultiSelectAnimation {
  @scala.inline
  def apply(close: MultiSelectAnimationClose = null, open: MultiSelectAnimationOpen = null): MultiSelectAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectAnimation]
  }
}

