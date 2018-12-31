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

