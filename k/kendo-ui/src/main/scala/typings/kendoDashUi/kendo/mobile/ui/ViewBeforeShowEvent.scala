package typings.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewBeforeShowEvent
  extends typings.kendoDashUi.kendo.mobile.ui.ViewEvent {
  var view: js.UndefOr[typings.kendoDashUi.kendo.mobile.ui.View] = js.undefined
}

object ViewBeforeShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendo.mobile.ui.View,
    view: typings.kendoDashUi.kendo.mobile.ui.View = null
  ): ViewBeforeShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ViewBeforeShowEvent]
  }
}

