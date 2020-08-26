package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.map.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapMarkerClickEvent extends MapEvent {
  var layer: js.UndefOr[Marker] = js.native
  var marker: js.UndefOr[Marker] = js.native
}

object MapMarkerClickEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Map): MapMarkerClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMarkerClickEvent]
  }
  @scala.inline
  implicit class MapMarkerClickEventOps[Self <: MapMarkerClickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayer(value: Marker): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
  }
  
}

