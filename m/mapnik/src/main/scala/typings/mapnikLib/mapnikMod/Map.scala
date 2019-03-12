package typings
package mapnikLib.mapnikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapnik", "Map")
@js.native
class Map protected () extends js.Object {
  def this(x: scala.Double, y: scala.Double) = this()
  def load(xml: java.lang.String): scala.Unit = js.native
  def load(
    xml: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* map */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def render(images: Image): scala.Unit = js.native
  def render(images: Image, callback: js.Function2[/* err */ stdLib.Error, /* map */ Image, scala.Unit]): scala.Unit = js.native
  def render(images: VectorTile): scala.Unit = js.native
  def render(images: VectorTile, callback: js.Function2[/* err */ stdLib.Error, /* map */ Image, scala.Unit]): scala.Unit = js.native
  def zoomAll(): scala.Unit = js.native
}

