package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuDeactivateEvent extends ContextMenuEvent {
  var item: js.UndefOr[stdLib.Element] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ContextMenuDeactivateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: ContextMenu,
    item: stdLib.Element = null,
    target: stdLib.Element = null,
    `type`: java.lang.String = null
  ): ContextMenuDeactivateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContextMenuDeactivateEvent]
  }
}

