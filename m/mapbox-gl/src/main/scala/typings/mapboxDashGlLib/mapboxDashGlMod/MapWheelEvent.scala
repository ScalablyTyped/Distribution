package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapWheelEvent")
@js.native
class MapWheelEvent ()
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.MapWheelEvent {
  /* CompleteClass */
  override var defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override var originalEvent: stdLib.WheelEvent = js.native
  /* CompleteClass */
  override var target: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Map = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_MapWheelEvent: mapboxDashGlLib.mapboxDashGlLibStrings.wheel = js.native
  /* CompleteClass */
  override def preventDefault(): scala.Unit = js.native
}

