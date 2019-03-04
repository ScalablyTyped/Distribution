package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterExpandEvent extends SplitterEvent {
  var pane: js.UndefOr[stdLib.Element] = js.undefined
}

object SplitterExpandEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Splitter,
    pane: stdLib.Element = null
  ): SplitterExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[SplitterExpandEvent]
  }
}

