package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewInitEvent extends ViewEvent {
  var view: js.UndefOr[View] = js.undefined
}

object ViewInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: View,
    view: View = null
  ): ViewInitEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ViewInitEvent]
  }
}

