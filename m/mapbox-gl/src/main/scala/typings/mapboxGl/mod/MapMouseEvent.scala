package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.click
import typings.mapboxGl.mapboxGlStrings.contextmenu
import typings.mapboxGl.mapboxGlStrings.dblclick
import typings.mapboxGl.mapboxGlStrings.mousedown
import typings.mapboxGl.mapboxGlStrings.mouseenter
import typings.mapboxGl.mapboxGlStrings.mouseleave
import typings.mapboxGl.mapboxGlStrings.mousemove
import typings.mapboxGl.mapboxGlStrings.mouseout
import typings.mapboxGl.mapboxGlStrings.mouseover
import typings.mapboxGl.mapboxGlStrings.mouseup
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

