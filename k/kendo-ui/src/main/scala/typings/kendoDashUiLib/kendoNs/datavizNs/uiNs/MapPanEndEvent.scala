package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapPanEndEvent extends MapEvent {
  var center: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.Location] = js.undefined
  var origin: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.Location] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object MapPanEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Map,
    center: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = null,
    origin: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = null,
    originalEvent: js.Any = null
  ): MapPanEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (center != null) __obj.updateDynamic("center")(center)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MapPanEndEvent]
  }
}

