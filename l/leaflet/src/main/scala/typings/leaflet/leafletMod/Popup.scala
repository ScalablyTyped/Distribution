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

