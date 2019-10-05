package typings.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewTransitionEndEvent
  extends typings.kendoDashUi.kendo.mobile.ui.ViewEvent {
  var `type`: js.UndefOr[String] = js.undefined
}

object ViewTransitionEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendo.mobile.ui.View,
    `type`: String = null
  ): ViewTransitionEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ViewTransitionEndEvent]
  }
}

