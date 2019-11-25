package typings.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewShowEvent
  extends typings.kendoDashUi.kendo.mobile.ui.ViewEvent {
  var view: js.UndefOr[typings.kendoDashUi.kendo.mobile.ui.View] = js.undefined
}

object ViewShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendo.mobile.ui.View,
    view: typings.kendoDashUi.kendo.mobile.ui.View = null
  ): ViewShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewShowEvent]
  }
}

