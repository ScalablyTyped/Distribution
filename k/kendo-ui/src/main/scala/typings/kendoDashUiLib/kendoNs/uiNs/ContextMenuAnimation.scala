package typings
package kendoDashUiLib.kendoNs.uiNs

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
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[ContextMenuAnimation]
  }
}

