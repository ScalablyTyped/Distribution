package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Tooltip")
@js.native
class Tooltip_ () extends DivOverlay {
  def this(options: TooltipOptions) = this()
  def this(options: TooltipOptions, source: Layer) = this()
  @JSName("options")
  var options_Tooltip_ : TooltipOptions = js.native
  def setOpacity(`val`: Double): Unit = js.native
}

