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
    preventDefault: js.Function0[scala.Unit],
    target: Map,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart | mapboxDashGlLib.mapboxDashGlLibStrings.touchend | mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel
  ): MapTouchEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("lngLat")(lngLat)
    __obj.updateDynamic("lngLats")(lngLats)
    __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("points")(points)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MapTouchEvent]
  }
}

