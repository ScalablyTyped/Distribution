package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewTransitionStartEvent extends ViewEvent {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ViewTransitionStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: View,
    `type`: java.lang.String = null
  ): ViewTransitionStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ViewTransitionStartEvent]
  }
}

