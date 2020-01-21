package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuAnimation extends js.Object {
  var close: js.UndefOr[MenuAnimationClose] = js.undefined
  var open: js.UndefOr[MenuAnimationOpen] = js.undefined
}

object MenuAnimation {
  @scala.inline
  def apply(close: MenuAnimationClose = null, open: MenuAnimationOpen = null): MenuAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuAnimation]
  }
}

