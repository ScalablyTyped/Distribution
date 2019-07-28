package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListFilterMenuInitEvent extends TreeListEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var field: js.UndefOr[String] = js.undefined
}

object TreeListFilterMenuInitEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    container: JQuery = null,
    field: String = null
  ): TreeListFilterMenuInitEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[TreeListFilterMenuInitEvent]
  }
}

