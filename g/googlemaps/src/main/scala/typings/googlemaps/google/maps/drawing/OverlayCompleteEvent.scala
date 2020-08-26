package typings.googlemaps.google.maps.drawing

import typings.googlemaps.google.maps.Circle
import typings.googlemaps.google.maps.Marker
import typings.googlemaps.google.maps.Polygon
import typings.googlemaps.google.maps.Polyline
import typings.googlemaps.google.maps.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The properties of an overlaycomplete event on a DrawingManager.. */
@js.native
trait OverlayCompleteEvent extends js.Object {
  /** The completed overlay. */
  var overlay: Marker | Polygon | Polyline | Rectangle | Circle = js.native
  /** The completed overlay's type. */
  var `type`: OverlayType = js.native
}

object OverlayCompleteEvent {
  @scala.inline
  def apply(overlay: Marker | Polygon | Polyline | Rectangle | Circle, `type`: OverlayType): OverlayCompleteEvent = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayCompleteEvent]
  }
  @scala.inline
  implicit class OverlayCompleteEventOps[Self <: OverlayCompleteEvent] (val x: Self) extends AnyVal {
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
    def setOverlay(value: Marker | Polygon | Polyline | Rectangle | Circle): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: OverlayType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

