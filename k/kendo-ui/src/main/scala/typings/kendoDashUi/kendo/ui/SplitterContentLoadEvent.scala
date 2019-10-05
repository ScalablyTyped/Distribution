package typings.kendoDashUi.kendo.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterContentLoadEvent extends SplitterEvent {
  var pane: js.UndefOr[Element] = js.undefined
}

object SplitterContentLoadEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Splitter,
    pane: Element = null
  ): SplitterContentLoadEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[SplitterContentLoadEvent]
  }
}

