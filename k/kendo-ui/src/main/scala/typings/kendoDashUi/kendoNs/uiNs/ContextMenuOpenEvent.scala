package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQueryEventObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuOpenEvent extends ContextMenuEvent {
  var event: js.UndefOr[JQueryEventObject] = js.undefined
  var item: js.UndefOr[Element] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ContextMenuOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ContextMenu,
    event: JQueryEventObject = null,
    item: Element = null,
    target: Element = null,
    `type`: String = null
  ): ContextMenuOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    if (item != null) __obj.updateDynamic("item")(item)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContextMenuOpenEvent]
  }
}

