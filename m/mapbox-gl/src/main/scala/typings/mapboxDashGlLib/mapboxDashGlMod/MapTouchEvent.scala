package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapTouchEvent")
@js.native
class MapTouchEvent ()
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.MapTouchEvent {
  /* CompleteClass */
  override var defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override var lngLat: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLat = js.native
  /* CompleteClass */
  override var lngLats: js.Array[mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLat] = js.native
  /* CompleteClass */
  override var originalEvent: stdLib.TouchEvent = js.native
  /* CompleteClass */
  override var point: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override var points: js.Array[mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point] = js.native
  /* CompleteClass */
  override var target: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Map = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_MapTouchEvent: mapboxDashGlLib.mapboxDashGlLibStrings.touchstart | mapboxDashGlLib.mapboxDashGlLibStrings.touchend | mapboxDashGlLib.mapboxDashGlLibStrings.touchcancel = js.native
  /* CompleteClass */
  override def preventDefault(): scala.Unit = js.native
}

