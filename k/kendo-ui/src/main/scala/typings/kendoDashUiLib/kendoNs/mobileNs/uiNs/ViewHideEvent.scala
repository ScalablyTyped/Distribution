package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewHideEvent extends ViewEvent {
  var view: js.UndefOr[View] = js.undefined
}

object ViewHideEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: View,
    view: View = null
  ): ViewHideEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ViewHideEvent]
  }
}

