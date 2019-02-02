package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "VideoSource")
@js.native
class VideoSource ()
  extends mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.VideoSource {
  def this(options: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.VideoSourceOptions) = this()
  /* CompleteClass */
  override var `type`: mapboxDashGlLib.mapboxDashGlLibStrings.vector | mapboxDashGlLib.mapboxDashGlLibStrings.raster | mapboxDashGlLib.mapboxDashGlLibStrings.`raster-dem` | mapboxDashGlLib.mapboxDashGlLibStrings.geojson | mapboxDashGlLib.mapboxDashGlLibStrings.image | mapboxDashGlLib.mapboxDashGlLibStrings.video | mapboxDashGlLib.mapboxDashGlLibStrings.canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_VideoSourceRaw: mapboxDashGlLib.mapboxDashGlLibStrings.video = js.native
  /* CompleteClass */
  override def getVideo(): stdLib.HTMLVideoElement = js.native
  /* CompleteClass */
  override def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type = js.native
}

