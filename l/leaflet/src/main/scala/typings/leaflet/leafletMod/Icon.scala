package typings.leaflet.leafletMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Icon")
@js.native
class Icon[T /* <: BaseIconOptions */] protected () extends Layer {
  def this(options: T) = this()
  var options: T = js.native
  def createIcon(): HTMLElement = js.native
  def createIcon(oldIcon: HTMLElement): HTMLElement = js.native
  def createShadow(): HTMLElement = js.native
  def createShadow(oldIcon: HTMLElement): HTMLElement = js.native
}

