package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapPanEvent extends MapEvent {
  var center: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.Location] = js.undefined
  var origin: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.Location] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object MapPanEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Map,
    center: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = null,
    origin: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = null,
    originalEvent: js.Any = null
  ): MapPanEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (center != null) __obj.updateDynamic("center")(center)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MapPanEvent]
  }
}

