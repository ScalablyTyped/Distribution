package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "CanvasSource")
@js.native
class CanvasSource ()
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.CanvasSource {
  /* CompleteClass */
  override var canvas: java.lang.String | stdLib.HTMLCanvasElement = js.native
  /* CompleteClass */
  override var coordinates: js.Array[js.Array[scala.Double]] = js.native
  /* CompleteClass */
  override var `type`: mapboxDashGlLib.mapboxDashGlLibStrings.vector | mapboxDashGlLib.mapboxDashGlLibStrings.raster | mapboxDashGlLib.mapboxDashGlLibStrings.`raster-dem` | mapboxDashGlLib.mapboxDashGlLibStrings.geojson | mapboxDashGlLib.mapboxDashGlLibStrings.image | mapboxDashGlLib.mapboxDashGlLibStrings.video | mapboxDashGlLib.mapboxDashGlLibStrings.canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_CanvasSourceRaw: mapboxDashGlLib.mapboxDashGlLibStrings.canvas = js.native
  /* CompleteClass */
  override def getCanvas(): stdLib.HTMLCanvasElement = js.native
  /* CompleteClass */
  override def pause(): scala.Unit = js.native
  /* CompleteClass */
  override def play(): scala.Unit = js.native
  /* CompleteClass */
  override def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type = js.native
}

