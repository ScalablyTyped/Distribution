package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuAnimation extends js.Object {
  var close: js.UndefOr[ContextMenuAnimationClose] = js.undefined
  var open: js.UndefOr[ContextMenuAnimationOpen] = js.undefined
}

object ContextMenuAnimation {
  @scala.inline
  def apply(close: ContextMenuAnimationClose = null, open: ContextMenuAnimationOpen = null): ContextMenuAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuAnimation]
  }
}

