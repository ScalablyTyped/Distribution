package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterErrorEvent extends SplitterEvent {
  var status: js.UndefOr[String] = js.undefined
  var xhr: js.UndefOr[JQueryXHR] = js.undefined
}

object SplitterErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Splitter,
    status: String = null,
    xhr: JQueryXHR = null
  ): SplitterErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (status != null) __obj.updateDynamic("status")(status)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[SplitterErrorEvent]
  }
}

