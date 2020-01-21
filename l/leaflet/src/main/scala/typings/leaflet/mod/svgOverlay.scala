package typings.leaflet.mod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "svgOverlay")
@js.native
object svgOverlay extends js.Object {
  def apply(svgImage: String, bounds: LatLngBoundsExpression): SVGOverlay_ = js.native
  def apply(svgImage: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): SVGOverlay_ = js.native
  def apply(svgImage: SVGElement, bounds: LatLngBoundsExpression): SVGOverlay_ = js.native
  def apply(svgImage: SVGElement, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): SVGOverlay_ = js.native
}

