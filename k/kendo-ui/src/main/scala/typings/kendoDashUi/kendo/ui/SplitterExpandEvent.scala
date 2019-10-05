package typings.kendoDashUi.kendo.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterExpandEvent extends SplitterEvent {
  var pane: js.UndefOr[Element] = js.undefined
}

object SplitterExpandEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Splitter,
    pane: Element = null
  ): SplitterExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[SplitterExpandEvent]
  }
}

