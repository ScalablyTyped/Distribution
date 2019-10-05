package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Tooltip")
@js.native
class Tooltip () extends DivOverlay {
  def this(options: TooltipOptions) = this()
  def this(options: TooltipOptions, source: Layer) = this()
  @JSName("options")
  var options_Tooltip: TooltipOptions = js.native
  def setOpacity(`val`: Double): Unit = js.native
}

@JSImport("leaflet", "tooltip")
@js.native
object tooltip extends js.Object {
  def apply(): Tooltip = js.native
  def apply(options: TooltipOptions): Tooltip = js.native
  def apply(options: TooltipOptions, source: Layer): Tooltip = js.native
}

