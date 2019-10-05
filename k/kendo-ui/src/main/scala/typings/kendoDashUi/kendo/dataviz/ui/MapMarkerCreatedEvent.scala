package typings.kendoDashUi.kendo.dataviz.ui

import typings.kendoDashUi.kendo.dataviz.map.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerCreatedEvent extends MapEvent {
  var layer: js.UndefOr[Marker] = js.undefined
  var marker: js.UndefOr[Marker] = js.undefined
}

object MapMarkerCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Map,
    layer: Marker = null,
    marker: Marker = null
  ): MapMarkerCreatedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[MapMarkerCreatedEvent]
  }
}

