package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomAnimEvent extends LeafletEvent {
  var center: LatLng_ = js.native
  var noUpdate: Boolean = js.native
  var zoom: Double = js.native
}

object ZoomAnimEvent {
  @scala.inline
  def apply(
    center: LatLng_,
    layer: js.Any,
    noUpdate: Boolean,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String,
    zoom: Double
  ): ZoomAnimEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], noUpdate = noUpdate.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomAnimEvent]
  }
  @scala.inline
  implicit class ZoomAnimEventOps[Self <: ZoomAnimEvent] (val x: Self) extends AnyVal {
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
    def setCenter(value: LatLng_): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoUpdate(value: Boolean): Self = this.set("noUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
  
}

