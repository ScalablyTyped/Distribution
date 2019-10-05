package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Popup")
@js.native
class Popup () extends DivOverlay {
  def this(options: PopupOptions) = this()
  def this(options: PopupOptions, source: Layer) = this()
  @JSName("options")
  var options_Popup: PopupOptions = js.native
  def openOn(map: Map): this.type = js.native
}

@JSImport("leaflet", "popup")
@js.native
object popup extends js.Object {
  def apply(): Popup = js.native
  def apply(options: PopupOptions): Popup = js.native
  def apply(options: PopupOptions, source: Layer): Popup = js.native
}

