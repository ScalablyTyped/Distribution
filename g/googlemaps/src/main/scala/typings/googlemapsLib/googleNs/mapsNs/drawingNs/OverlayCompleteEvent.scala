package typings
package googlemapsLib.googleNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The properties of an overlaycomplete event on a DrawingManager.. */
trait OverlayCompleteEvent extends js.Object {
  /** The completed overlay. */
  var overlay: googlemapsLib.googleNs.mapsNs.Marker | googlemapsLib.googleNs.mapsNs.Polygon | googlemapsLib.googleNs.mapsNs.Polyline | googlemapsLib.googleNs.mapsNs.Rectangle | googlemapsLib.googleNs.mapsNs.Circle
  /** The completed overlay's type. */
  var `type`: OverlayType
}

object OverlayCompleteEvent {
  @scala.inline
  def apply(
    overlay: googlemapsLib.googleNs.mapsNs.Marker | googlemapsLib.googleNs.mapsNs.Polygon | googlemapsLib.googleNs.mapsNs.Polyline | googlemapsLib.googleNs.mapsNs.Rectangle | googlemapsLib.googleNs.mapsNs.Circle,
    `type`: OverlayType
  ): OverlayCompleteEvent = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OverlayCompleteEvent]
  }
}

