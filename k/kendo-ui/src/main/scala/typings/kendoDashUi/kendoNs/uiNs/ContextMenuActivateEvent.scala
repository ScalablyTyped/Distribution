package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuActivateEvent extends ContextMenuEvent {
  var item: js.UndefOr[Element] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ContextMenuActivateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ContextMenu,
    item: Element = null,
    target: Element = null,
    `type`: String = null
  ): ContextMenuActivateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContextMenuActivateEvent]
  }
}

