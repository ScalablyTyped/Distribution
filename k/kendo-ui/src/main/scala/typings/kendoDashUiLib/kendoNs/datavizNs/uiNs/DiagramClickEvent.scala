package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramClickEvent extends DiagramEvent {
  var item: js.UndefOr[js.Any] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var point: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point] = js.undefined
}

object DiagramClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    item: js.Any = null,
    meta: js.Any = null,
    point: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point = null
  ): DiagramClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (item != null) __obj.updateDynamic("item")(item)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (point != null) __obj.updateDynamic("point")(point)
    __obj.asInstanceOf[DiagramClickEvent]
  }
}

