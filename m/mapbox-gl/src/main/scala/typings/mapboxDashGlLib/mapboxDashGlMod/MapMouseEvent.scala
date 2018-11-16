package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapMouseEvent")
@js.native
class MapMouseEvent ()
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.MapMouseEvent {
  /* CompleteClass */
  override var defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override var lngLat: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.LngLat = js.native
  /* CompleteClass */
  override var originalEvent: stdLib.MouseEvent = js.native
  /* CompleteClass */
  override var point: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Point = js.native
  /* CompleteClass */
  override var target: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.Map = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_MapMouseEvent: mapboxDashGlLib.mapboxDashGlLibStrings.mousedown | mapboxDashGlLib.mapboxDashGlLibStrings.mouseup | mapboxDashGlLib.mapboxDashGlLibStrings.click | mapboxDashGlLib.mapboxDashGlLibStrings.dblclick | mapboxDashGlLib.mapboxDashGlLibStrings.mousemove | mapboxDashGlLib.mapboxDashGlLibStrings.mouseover | mapboxDashGlLib.mapboxDashGlLibStrings.mouseenter | mapboxDashGlLib.mapboxDashGlLibStrings.mouseleave | mapboxDashGlLib.mapboxDashGlLibStrings.mouseout | mapboxDashGlLib.mapboxDashGlLibStrings.contextmenu = js.native
  /* CompleteClass */
  override def preventDefault(): scala.Unit = js.native
}

