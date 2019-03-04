package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapBoxZoomEvent
  extends MapboxEvent[stdLib.MouseEvent] {
  var boxZoomBounds: LngLatBounds
  @JSName("type")
  var type_MapBoxZoomEvent: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomstart | mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomend | mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomcancel
}

object MapBoxZoomEvent {
  @scala.inline
  def apply(
    boxZoomBounds: LngLatBounds,
    originalEvent: stdLib.MouseEvent,
    target: Map,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomstart | mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomend | mapboxDashGlLib.mapboxDashGlLibStrings.boxzoomcancel
  ): MapBoxZoomEvent = {
    val __obj = js.Dynamic.literal(boxZoomBounds = boxZoomBounds, originalEvent = originalEvent, target = target)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapBoxZoomEvent]
  }
}

