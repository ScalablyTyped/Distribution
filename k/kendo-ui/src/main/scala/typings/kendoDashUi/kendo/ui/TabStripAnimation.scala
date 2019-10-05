package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripAnimation extends js.Object {
  var close: js.UndefOr[TabStripAnimationClose] = js.undefined
  var open: js.UndefOr[TabStripAnimationOpen] = js.undefined
}

object TabStripAnimation {
  @scala.inline
  def apply(close: TabStripAnimationClose = null, open: TabStripAnimationOpen = null): TabStripAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[TabStripAnimation]
  }
}

