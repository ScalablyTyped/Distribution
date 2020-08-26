package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Popup")
@js.native
class Popup_ () extends DivOverlay {
  def this(options: PopupOptions) = this()
  def this(options: js.UndefOr[scala.Nothing], source: Layer) = this()
  def this(options: PopupOptions, source: Layer) = this()
  @JSName("options")
  var options_Popup_ : PopupOptions = js.native
  def openOn(map: Map_): this.type = js.native
}

