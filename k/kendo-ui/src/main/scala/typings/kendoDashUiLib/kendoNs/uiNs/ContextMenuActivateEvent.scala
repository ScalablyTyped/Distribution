package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuActivateEvent extends ContextMenuEvent {
  var item: js.UndefOr[stdLib.Element] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ContextMenuActivateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ContextMenu,
    item: stdLib.Element = null,
    target: stdLib.Element = null,
    `type`: java.lang.String = null
  ): ContextMenuActivateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (item != null) __obj.updateDynamic("item")(item)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContextMenuActivateEvent]
  }
}

