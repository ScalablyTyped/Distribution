package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.touchcancel
import typings.mapboxDashGl.mapboxDashGlStrings.touchend
import typings.mapboxDashGl.mapboxDashGlStrings.touchstart
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapTouchEvent")
@js.native
class MapTouchEvent () extends MapboxEvent[TouchEvent] {
  var defaultPrevented: Boolean = js.native
  var lngLat: LngLat = js.native
  var lngLats: js.Array[LngLat] = js.native
  var point: Point = js.native
  var points: js.Array[Point] = js.native
  @JSName("type")
  var type_MapTouchEvent: touchstart | touchend | touchcancel = js.native
  def preventDefault(): Unit = js.native
}

