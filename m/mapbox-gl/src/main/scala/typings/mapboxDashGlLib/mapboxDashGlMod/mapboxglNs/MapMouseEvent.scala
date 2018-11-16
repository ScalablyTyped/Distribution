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

