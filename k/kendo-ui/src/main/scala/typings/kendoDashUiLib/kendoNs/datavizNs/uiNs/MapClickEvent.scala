package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapClickEvent extends MapEvent {
  var location: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.Location] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object MapClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Map,
    location: kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = null,
    originalEvent: js.Any = null
  ): MapClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (location != null) __obj.updateDynamic("location")(location)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MapClickEvent]
  }
}

