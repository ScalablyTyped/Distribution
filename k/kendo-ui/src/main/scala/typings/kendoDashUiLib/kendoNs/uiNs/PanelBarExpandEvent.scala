package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarExpandEvent extends PanelBarEvent {
  var item: js.UndefOr[stdLib.Element] = js.undefined
}

object PanelBarExpandEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: PanelBar,
    item: stdLib.Element = null
  ): PanelBarExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[PanelBarExpandEvent]
  }
}

