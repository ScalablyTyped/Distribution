package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuOpenEvent extends ContextMenuEvent {
  var event: js.UndefOr[kendoDashUiLib.JQueryEventObject] = js.undefined
  var item: js.UndefOr[stdLib.Element] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ContextMenuOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: ContextMenu,
    event: kendoDashUiLib.JQueryEventObject = null,
    item: stdLib.Element = null,
    target: stdLib.Element = null,
    `type`: java.lang.String = null
  ): ContextMenuOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    if (item != null) __obj.updateDynamic("item")(item)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContextMenuOpenEvent]
  }
}

