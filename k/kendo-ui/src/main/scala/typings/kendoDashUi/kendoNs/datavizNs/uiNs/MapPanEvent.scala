package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.mapNs.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapPanEvent extends MapEvent {
  var center: js.UndefOr[Location] = js.undefined
  var origin: js.UndefOr[Location] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object MapPanEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Map,
    center: Location = null,
    origin: Location = null,
    originalEvent: js.Any = null
  ): MapPanEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (center != null) __obj.updateDynamic("center")(center)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MapPanEvent]
  }
}

