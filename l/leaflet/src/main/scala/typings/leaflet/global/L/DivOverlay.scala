package typings.leaflet.global.L

import typings.leaflet.mod.DivOverlayOptions
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.TooltipOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("L.DivOverlay")
@js.native
open class DivOverlay ()
  extends typings.leaflet.mod.DivOverlay {
  def this(latlng: LatLngExpression) = this()
  def this(options: DivOverlayOptions) = this()
  def this(latlng: LatLngExpression, options: TooltipOptions) = this()
  def this(options: Unit, source: typings.leaflet.mod.Layer) = this()
  def this(options: DivOverlayOptions, source: typings.leaflet.mod.Layer) = this()
}
