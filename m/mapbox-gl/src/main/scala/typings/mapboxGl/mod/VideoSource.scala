package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`raster-dem`
import typings.mapboxGl.mapboxGlStrings.canvas
import typings.mapboxGl.mapboxGlStrings.geojson
import typings.mapboxGl.mapboxGlStrings.image_
import typings.mapboxGl.mapboxGlStrings.raster
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.video
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

