package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.`raster-dem`
import typings.mapboxDashGl.mapboxDashGlStrings.canvas
import typings.mapboxDashGl.mapboxDashGlStrings.geojson
import typings.mapboxDashGl.mapboxDashGlStrings.image
import typings.mapboxDashGl.mapboxDashGlStrings.raster
import typings.mapboxDashGl.mapboxDashGlStrings.vector
import typings.mapboxDashGl.mapboxDashGlStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "ImageSource")
@js.native
class ImageSource ()
  extends ImageSourceRaw
     with AnySourceImpl {
  def this(options: ImageSourceOptions) = this()
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_ImageSourceRaw: image = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
  def updateImage(options: ImageSourceOptions): this.type = js.native
}

