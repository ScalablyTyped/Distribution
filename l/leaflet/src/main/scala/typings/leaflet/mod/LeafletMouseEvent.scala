package typings.leaflet.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.DomEvent._PropagableEvent because Already inherited */ @js.native
trait LeafletMouseEvent extends LeafletEvent {
  var containerPoint: Point_ = js.native
  var latlng: LatLng_ = js.native
  var layerPoint: Point_ = js.native
  var originalEvent: MouseEvent = js.native
}

object LeafletMouseEvent {
  @scala.inline
  def apply(
    containerPoint: Point_,
    latlng: LatLng_,
    layer: js.Any,
    layerPoint: Point_,
    originalEvent: MouseEvent,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): LeafletMouseEvent = {
    val __obj = js.Dynamic.literal(containerPoint = containerPoint.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], layerPoint = layerPoint.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafletMouseEvent]
  }
  @scala.inline
  implicit class LeafletMouseEventOps[Self <: LeafletMouseEvent] (val x: Self) extends AnyVal {
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
    def setContainerPoint(value: Point_): Self = this.set("containerPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatlng(value: LatLng_): Self = this.set("latlng", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerPoint(value: Point_): Self = this.set("layerPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: MouseEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
  }
  
}

