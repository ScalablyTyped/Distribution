package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarErrorEvent extends PanelBarEvent {
  var status: js.UndefOr[java.lang.String] = js.undefined
  var xhr: js.UndefOr[kendoDashUiLib.JQueryXHR] = js.undefined
}

object PanelBarErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: PanelBar,
    status: java.lang.String = null,
    xhr: kendoDashUiLib.JQueryXHR = null
  ): PanelBarErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (status != null) __obj.updateDynamic("status")(status)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[PanelBarErrorEvent]
  }
}

