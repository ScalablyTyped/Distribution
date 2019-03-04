package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapZoomEndEvent extends MapEvent {
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object MapZoomEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Map,
    originalEvent: js.Any = null
  ): MapZoomEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MapZoomEndEvent]
  }
}

