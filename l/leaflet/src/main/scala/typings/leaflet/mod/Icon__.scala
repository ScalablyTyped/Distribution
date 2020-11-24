package typings.leaflet.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Icon")
@js.native
class Icon__[T /* <: BaseIconOptions */] protected () extends Layer {
  def this(options: T) = this()
  
  def createIcon(): HTMLElement = js.native
  def createIcon(oldIcon: HTMLElement): HTMLElement = js.native
  
  def createShadow(): HTMLElement = js.native
  def createShadow(oldIcon: HTMLElement): HTMLElement = js.native
  
  var options: T = js.native
}
