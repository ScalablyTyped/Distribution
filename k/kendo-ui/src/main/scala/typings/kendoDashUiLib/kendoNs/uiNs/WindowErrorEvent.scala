package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowErrorEvent extends WindowEvent {
  var status: js.UndefOr[java.lang.String] = js.undefined
  var xhr: js.UndefOr[kendoDashUiLib.JQueryXHR] = js.undefined
}

object WindowErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Window,
    status: java.lang.String = null,
    xhr: kendoDashUiLib.JQueryXHR = null
  ): WindowErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (status != null) __obj.updateDynamic("status")(status)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[WindowErrorEvent]
  }
}

