package typings.mapboxGl.mod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "CanvasSource")
@js.native
class CanvasSource ()
  extends CanvasSourceRaw
     with AnySourceImpl {
  def getCanvas(): HTMLCanvasElement = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def setCoordinates(coordinates: js.Array[js.Array[Double]]): this.type = js.native
}

