package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerCreatedEvent extends MapEvent {
  var layer: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.Marker] = js.undefined
  var marker: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.mapNs.Marker] = js.undefined
}

object MapMarkerCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Map,
    layer: kendoDashUiLib.kendoNs.datavizNs.mapNs.Marker = null,
    marker: kendoDashUiLib.kendoNs.datavizNs.mapNs.Marker = null
  ): MapMarkerCreatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[MapMarkerCreatedEvent]
  }
}

