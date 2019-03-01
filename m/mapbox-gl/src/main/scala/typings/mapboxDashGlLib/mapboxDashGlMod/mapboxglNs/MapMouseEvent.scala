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
    preventDefault: js.Function0[scala.Unit],
    target: Map,
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown | mapboxDashGlLib.mapboxDashGlLibStrings.mouseup | mapboxDashGlLib.mapboxDashGlLibStrings.click | mapboxDashGlLib.mapboxDashGlLibStrings.dblclick | mapboxDashGlLib.mapboxDashGlLibStrings.mousemove | mapboxDashGlLib.mapboxDashGlLibStrings.mouseover | mapboxDashGlLib.mapboxDashGlLibStrings.mouseenter | mapboxDashGlLib.mapboxDashGlLibStrings.mouseleave | mapboxDashGlLib.mapboxDashGlLibStrings.mouseout | mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu
  ): MapMouseEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("lngLat")(lngLat)
    __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MapMouseEvent]
  }
}

