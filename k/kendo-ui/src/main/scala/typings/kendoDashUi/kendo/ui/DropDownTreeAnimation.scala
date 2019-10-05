package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownTreeAnimation extends js.Object {
  var close: js.UndefOr[DropDownTreeAnimationClose] = js.undefined
  var open: js.UndefOr[DropDownTreeAnimationOpen] = js.undefined
}

object DropDownTreeAnimation {
  @scala.inline
  def apply(close: DropDownTreeAnimationClose = null, open: DropDownTreeAnimationOpen = null): DropDownTreeAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[DropDownTreeAnimation]
  }
}

