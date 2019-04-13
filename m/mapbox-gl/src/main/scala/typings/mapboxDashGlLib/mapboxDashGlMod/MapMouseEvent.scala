package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapMouseEvent")
@js.native
class MapMouseEvent ()
  extends MapboxEvent[stdLib.MouseEvent] {
  var defaultPrevented: scala.Boolean = js.native
  var lngLat: LngLat = js.native
  var point: Point = js.native
  @JSName("type")
  var type_MapMouseEvent: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown | mapboxDashGlLib.mapboxDashGlLibStrings.mouseup | mapboxDashGlLib.mapboxDashGlLibStrings.click | mapboxDashGlLib.mapboxDashGlLibStrings.dblclick | mapboxDashGlLib.mapboxDashGlLibStrings.mousemove | mapboxDashGlLib.mapboxDashGlLibStrings.mouseover | mapboxDashGlLib.mapboxDashGlLibStrings.mouseenter | mapboxDashGlLib.mapboxDashGlLibStrings.mouseleave | mapboxDashGlLib.mapboxDashGlLibStrings.mouseout | mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu = js.native
  def preventDefault(): scala.Unit = js.native
}

