package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.mapNs.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapClickEvent extends MapEvent {
  var location: js.UndefOr[Location] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object MapClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Map,
    location: Location = null,
    originalEvent: js.Any = null
  ): MapClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (location != null) __obj.updateDynamic("location")(location)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MapClickEvent]
  }
}

