package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewTransitionStartEvent
  extends typings.kendoDashUi.kendoNs.mobileNs.uiNs.ViewEvent {
  var `type`: js.UndefOr[String] = js.undefined
}

object ViewTransitionStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendoNs.mobileNs.uiNs.View,
    `type`: String = null
  ): ViewTransitionStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ViewTransitionStartEvent]
  }
}

