package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMouseEvent
  extends MapboxEvent[stdLib.MouseEvent] {
  var defaultPrevented: scala.Boolean
  var lngLat: LngLat
  var point: Point
  @JSName("type")
  var type_MapMouseEvent: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown | mapboxDashGlLib.mapboxDashGlLibStrings.mouseup | mapboxDashGlLib.mapboxDashGlLibStrings.click | mapboxDashGlLib.mapboxDashGlLibStrings.dblclick | mapboxDashGlLib.mapboxDashGlLibStrings.mousemove | mapboxDashGlLib.mapboxDashGlLibStrings.mouseover | mapboxDashGlLib.mapboxDashGlLibStrings.mouseenter | mapboxDashGlLib.mapboxDashGlLibStrings.mouseleave | mapboxDashGlLib.mapboxDashGlLibStrings.mouseout | mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu
  def preventDefault(): scala.Unit
}

object MapMouseEvent {
  @scala.inline
  def apply(
    defaultPrevented: scala.Boolean,
    lngLat: LngLat,
    originalEvent: stdLib.MouseEvent,
    point: Point,
    preventDefault: () => scala.Unit,
    target: Map,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown | mapboxDashGlLib.mapboxDashGlLibStrings.mouseup | mapboxDashGlLib.mapboxDashGlLibStrings.click | mapboxDashGlLib.mapboxDashGlLibStrings.dblclick | mapboxDashGlLib.mapboxDashGlLibStrings.mousemove | mapboxDashGlLib.mapboxDashGlLibStrings.mouseover | mapboxDashGlLib.mapboxDashGlLibStrings.mouseenter | mapboxDashGlLib.mapboxDashGlLibStrings.mouseleave | mapboxDashGlLib.mapboxDashGlLibStrings.mouseout | mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu
  ): MapMouseEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented, lngLat = lngLat, originalEvent = originalEvent, point = point, preventDefault = js.Any.fromFunction0(preventDefault), target = target)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMouseEvent]
  }
}

