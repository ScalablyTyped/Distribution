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
trait OverlayCompleteEvent extends js.Object {
  /** The completed overlay. */
  var overlay: Marker | Polygon | Polyline | Rectangle | Circle
  /** The completed overlay's type. */
  var `type`: OverlayType
}

object OverlayCompleteEvent {
  @scala.inline
  def apply(overlay: Marker | Polygon | Polyline | Rectangle | Circle, `type`: OverlayType): OverlayCompleteEvent = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OverlayCompleteEvent]
  }
}

