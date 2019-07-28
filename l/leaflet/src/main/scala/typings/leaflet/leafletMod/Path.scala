package typings.leaflet.leafletMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Path")
@js.native
abstract class Path () extends Layer {
  var options: PathOptions = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  def getElement(): js.UndefOr[Element] = js.native
  def redraw(): this.type = js.native
  def setStyle(style: PathOptions): this.type = js.native
}

