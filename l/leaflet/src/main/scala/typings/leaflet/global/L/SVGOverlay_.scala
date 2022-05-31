package typings.leaflet.global.L

import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.LatLngBoundsExpression
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.SVGOverlay")
@js.native
class SVGOverlay_ protected ()
  extends typings.leaflet.mod.SVGOverlay_ {
  /** SVGOverlay doesn't extend ImageOverlay because SVGOverlay.getElement returns SVGElement */
  def this(svgImage: String, bounds: LatLngBoundsExpression) = this()
  def this(svgImage: SVGElement, bounds: LatLngBoundsExpression) = this()
  def this(svgImage: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
  def this(svgImage: SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
}
