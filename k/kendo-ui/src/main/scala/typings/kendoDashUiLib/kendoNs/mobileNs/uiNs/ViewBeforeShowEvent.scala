package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewBeforeShowEvent extends ViewEvent {
  var view: js.UndefOr[View] = js.undefined
}

object ViewBeforeShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: View,
    view: View = null
  ): ViewBeforeShowEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ViewBeforeShowEvent]
  }
}

