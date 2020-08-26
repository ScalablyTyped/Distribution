package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyMouseEvent extends MouseEvent {
  var edge: js.UndefOr[Double] = js.native
  var path: js.UndefOr[Double] = js.native
  var vertex: js.UndefOr[Double] = js.native
}

object PolyMouseEvent {
  @scala.inline
  def apply(latLng: LatLng, stop: () => Unit): PolyMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[PolyMouseEvent]
  }
  @scala.inline
  implicit class PolyMouseEventOps[Self <: PolyMouseEvent] (val x: Self) extends AnyVal {
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
    def setEdge(value: Double): Self = this.set("edge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    @scala.inline
    def setPath(value: Double): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setVertex(value: Double): Self = this.set("vertex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertex: Self = this.set("vertex", js.undefined)
  }
  
}

