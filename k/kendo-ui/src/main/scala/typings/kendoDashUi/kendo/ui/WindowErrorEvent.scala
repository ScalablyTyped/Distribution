package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowErrorEvent extends WindowEvent {
  var status: js.UndefOr[String] = js.undefined
  var xhr: js.UndefOr[JQueryXHR] = js.undefined
}

object WindowErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Window,
    status: String = null,
    xhr: JQueryXHR = null
  ): WindowErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (status != null) __obj.updateDynamic("status")(status)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[WindowErrorEvent]
  }
}

