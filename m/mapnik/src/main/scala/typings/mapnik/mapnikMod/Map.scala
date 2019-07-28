package typings.mapnik.mapnikMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapnik", "Map")
@js.native
class Map protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  def load(xml: String): Unit = js.native
  def load(xml: String, callback: js.Function2[/* err */ Error, /* map */ this.type, Unit]): Unit = js.native
  def render(images: Image): Unit = js.native
  def render(images: Image, callback: js.Function2[/* err */ Error, /* map */ Image, Unit]): Unit = js.native
  def render(images: VectorTile): Unit = js.native
  def render(images: VectorTile, callback: js.Function2[/* err */ Error, /* map */ Image, Unit]): Unit = js.native
  def zoomAll(): Unit = js.native
}

