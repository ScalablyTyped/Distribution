package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Tooltip")
@js.native
open class Tooltip_ () extends DivOverlay {
  def this(latlng: LatLngExpression) = this()
  def this(options: TooltipOptions) = this()
  def this(latlng: LatLngExpression, options: TooltipOptions) = this()
  def this(options: Unit, source: Layer) = this()
  def this(options: TooltipOptions, source: Layer) = this()
  
  @JSName("options")
  var options_Tooltip_ : TooltipOptions = js.native
  
  def setOpacity(`val`: Double): Unit = js.native
}
