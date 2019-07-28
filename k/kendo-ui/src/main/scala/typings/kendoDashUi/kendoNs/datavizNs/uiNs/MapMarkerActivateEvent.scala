package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.mapNs.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerActivateEvent extends MapEvent {
  var layer: js.UndefOr[Marker] = js.undefined
  var marker: js.UndefOr[Marker] = js.undefined
}

object MapMarkerActivateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Map,
    layer: Marker = null,
    marker: Marker = null
  ): MapMarkerActivateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[MapMarkerActivateEvent]
  }
}

