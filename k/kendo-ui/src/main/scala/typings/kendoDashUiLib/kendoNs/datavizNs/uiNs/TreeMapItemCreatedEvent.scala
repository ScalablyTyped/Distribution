package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMapItemCreatedEvent extends TreeMapEvent {
  var element: js.UndefOr[kendoDashUiLib.JQuery | stdLib.Element] = js.undefined
}

object TreeMapItemCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeMap,
    element: kendoDashUiLib.JQuery | stdLib.Element = null
  ): TreeMapItemCreatedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeMapItemCreatedEvent]
  }
}

