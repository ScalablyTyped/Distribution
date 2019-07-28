package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.click
import typings.mapboxDashGl.mapboxDashGlStrings.contextmenu
import typings.mapboxDashGl.mapboxDashGlStrings.dblclick
import typings.mapboxDashGl.mapboxDashGlStrings.mousedown
import typings.mapboxDashGl.mapboxDashGlStrings.mouseenter
import typings.mapboxDashGl.mapboxDashGlStrings.mouseleave
import typings.mapboxDashGl.mapboxDashGlStrings.mousemove
import typings.mapboxDashGl.mapboxDashGlStrings.mouseout
import typings.mapboxDashGl.mapboxDashGlStrings.mouseover
import typings.mapboxDashGl.mapboxDashGlStrings.mouseup
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapMouseEvent")
@js.native
class MapMouseEvent () extends MapboxEvent[MouseEvent] {
  var defaultPrevented: Boolean = js.native
  var lngLat: LngLat = js.native
  var point: Point = js.native
  @JSName("type")
  var type_MapMouseEvent: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
  def preventDefault(): Unit = js.native
}

