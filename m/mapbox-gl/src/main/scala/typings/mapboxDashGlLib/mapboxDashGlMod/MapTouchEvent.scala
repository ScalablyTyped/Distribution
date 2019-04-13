package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapTouchEvent")
@js.native
class MapTouchEvent ()
  extends MapboxEvent[stdLib.TouchEvent] {
  var defaultPrevented: scala.Boolean = js.native
  var lngLat: LngLat = js.native
  var lngLats: js.Array[LngLat] = js.native
  var point: Point = js.native
  var points: js.Array[Point] = js.native
  @JSName("type")
  var type_MapTouchEvent: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart | mapboxDashGlLib.mapboxDashGlLibStrings.touchend | mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel = js.native
  def preventDefault(): scala.Unit = js.native
}

