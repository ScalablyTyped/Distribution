package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarContentLoadEvent extends PanelBarEvent {
  var contentElement: js.UndefOr[Element] = js.undefined
  var item: js.UndefOr[Element] = js.undefined
}

object PanelBarContentLoadEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PanelBar,
    contentElement: Element = null,
    item: Element = null
  ): PanelBarContentLoadEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (contentElement != null) __obj.updateDynamic("contentElement")(contentElement)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[PanelBarContentLoadEvent]
  }
}

