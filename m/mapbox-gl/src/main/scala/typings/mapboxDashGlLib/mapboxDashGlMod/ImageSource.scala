package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ImageSource")
@js.native
class ImageSource ()
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.ImageSource {
  def this(options: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.ImageSourceOptions) = this()
  /* CompleteClass */
  override var `type`: mapboxDashGlLib.mapboxDashGlLibStrings.vector | mapboxDashGlLib.mapboxDashGlLibStrings.raster | mapboxDashGlLib.mapboxDashGlLibStrings.`raster-dem` | mapboxDashGlLib.mapboxDashGlLibStrings.geojson | mapboxDashGlLib.mapboxDashGlLibStrings.image | mapboxDashGlLib.mapboxDashGlLibStrings.video | mapboxDashGlLib.mapboxDashGlLibStrings.canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_ImageSourceRaw: mapboxDashGlLib.mapboxDashGlLibStrings.image = js.native
  /* CompleteClass */
  override def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type = js.native
}

