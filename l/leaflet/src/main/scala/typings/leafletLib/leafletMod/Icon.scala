package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Icon")
@js.native
class Icon[T /* <: BaseIconOptions */] protected () extends Layer {
  def this(options: T) = this()
  var options: T = js.native
  def createIcon(): stdLib.HTMLElement = js.native
  def createIcon(oldIcon: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  def createShadow(): stdLib.HTMLElement = js.native
  def createShadow(oldIcon: stdLib.HTMLElement): stdLib.HTMLElement = js.native
}

