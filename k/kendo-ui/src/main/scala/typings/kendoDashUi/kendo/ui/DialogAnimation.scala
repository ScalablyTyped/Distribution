package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogAnimation extends js.Object {
  var close: js.UndefOr[DialogAnimationClose] = js.undefined
  var open: js.UndefOr[DialogAnimationOpen] = js.undefined
}

object DialogAnimation {
  @scala.inline
  def apply(close: DialogAnimationClose = null, open: DialogAnimationOpen = null): DialogAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAnimation]
  }
}

