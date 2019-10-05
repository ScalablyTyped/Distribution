package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarErrorEvent extends PanelBarEvent {
  var status: js.UndefOr[String] = js.undefined
  var xhr: js.UndefOr[JQueryXHR] = js.undefined
}

object PanelBarErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PanelBar,
    status: String = null,
    xhr: JQueryXHR = null
  ): PanelBarErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (status != null) __obj.updateDynamic("status")(status)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[PanelBarErrorEvent]
  }
}

