package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.`raster-dem`
import typings.mapboxDashGl.mapboxDashGlStrings.canvas
import typings.mapboxDashGl.mapboxDashGlStrings.geojson
import typings.mapboxDashGl.mapboxDashGlStrings.image_
import typings.mapboxDashGl.mapboxDashGlStrings.raster
import typings.mapboxDashGl.mapboxDashGlStrings.vector
import typings.mapboxDashGl.mapboxDashGlStrings.video
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "VideoSource")
@js.native
class VideoSource ()
  extends VideoSourceRaw
     with AnySourceImpl {
  def this(options: VideoSourceOptions) = this()
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_VideoSourceRaw: video = js.native
  def getVideo(): HTMLVideoElement = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
}

