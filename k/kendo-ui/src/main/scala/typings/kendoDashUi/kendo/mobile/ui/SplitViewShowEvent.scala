package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitViewShowEvent extends SplitViewEvent {
  var view: js.UndefOr[JQuery] = js.undefined
}

object SplitViewShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: SplitView,
    view: JQuery = null
  ): SplitViewShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[SplitViewShowEvent]
  }
}

