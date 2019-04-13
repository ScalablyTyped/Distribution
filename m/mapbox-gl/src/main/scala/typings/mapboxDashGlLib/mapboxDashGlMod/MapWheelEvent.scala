package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapWheelEvent")
@js.native
class MapWheelEvent ()
  extends MapboxEvent[stdLib.WheelEvent] {
  var defaultPrevented: scala.Boolean = js.native
  @JSName("type")
  var type_MapWheelEvent: mapboxDashGlLib.mapboxDashGlLibStrings.wheel = js.native
  def preventDefault(): scala.Unit = js.native
}

