package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`raster-dem`
import typings.mapboxGl.mapboxGlStrings.canvas
import typings.mapboxGl.mapboxGlStrings.geojson
import typings.mapboxGl.mapboxGlStrings.image_
import typings.mapboxGl.mapboxGlStrings.raster
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.video
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "CanvasSource")
@js.native
class CanvasSource ()
  extends CanvasSourceRaw
     with AnySourceImpl {
  /* CompleteClass */
  override var canvas: String | HTMLCanvasElement = js.native
  /* CompleteClass */
  override var coordinates: js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas = js.native
  /* CompleteClass */
  @JSName("type")
  override var type_CanvasSourceRaw: canvas = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
}

