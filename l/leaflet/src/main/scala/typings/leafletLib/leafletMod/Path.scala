package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Path")
@js.native
abstract class Path () extends Layer {
  var options: PathOptions = js.native
  def bringToBack(): this.type = js.native
  def bringToFront(): this.type = js.native
  def getElement(): js.UndefOr[stdLib.Element] = js.native
  def redraw(): this.type = js.native
  def setStyle(style: PathOptions): this.type = js.native
}

