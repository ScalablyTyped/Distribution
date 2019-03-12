package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTouchEvent
  extends MapboxEvent[stdLib.TouchEvent] {
  var defaultPrevented: scala.Boolean
  var lngLat: LngLat
  var lngLats: js.Array[LngLat]
  var point: Point
  var points: js.Array[Point]
  @JSName("type")
  var type_MapTouchEvent: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart | mapboxDashGlLib.mapboxDashGlLibStrings.touchend | mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel
  def preventDefault(): scala.Unit
}

object MapTouchEvent {
  @scala.inline
  def apply(
    defaultPrevented: scala.Boolean,
    lngLat: LngLat,
    lngLats: js.Array[LngLat],
    originalEvent: stdLib.TouchEvent,
    point: Point,
    points: js.Array[Point],
    preventDefault: () => scala.Unit,
    target: Map,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart | mapboxDashGlLib.mapboxDashGlLibStrings.touchend | mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel
  ): MapTouchEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented, lngLat = lngLat, lngLats = lngLats, originalEvent = originalEvent, point = point, points = points, preventDefault = js.Any.fromFunction0(preventDefault), target = target)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTouchEvent]
  }
}

