package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListAnimation extends js.Object {
  var close: js.UndefOr[DropDownListAnimationClose] = js.undefined
  var open: js.UndefOr[DropDownListAnimationOpen] = js.undefined
}

object DropDownListAnimation {
  @scala.inline
  def apply(close: DropDownListAnimationClose = null, open: DropDownListAnimationOpen = null): DropDownListAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[DropDownListAnimation]
  }
}

