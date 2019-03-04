package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripErrorEvent extends TabStripEvent {
  var status: js.UndefOr[java.lang.String] = js.undefined
  var xhr: js.UndefOr[kendoDashUiLib.JQueryXHR] = js.undefined
}

object TabStripErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TabStrip,
    status: java.lang.String = null,
    xhr: kendoDashUiLib.JQueryXHR = null
  ): TabStripErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (status != null) __obj.updateDynamic("status")(status)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[TabStripErrorEvent]
  }
}

