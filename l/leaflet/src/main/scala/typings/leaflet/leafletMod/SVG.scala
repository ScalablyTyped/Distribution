package typings.leaflet.leafletMod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "SVG")
@js.native
class SVG () extends Renderer

@JSImport("leaflet", "SVG")
@js.native
object SVG extends js.Object {
  def create(name: String): SVGElement = js.native
  def pointsToPath(rings: js.Array[PointExpression], close: Boolean): String = js.native
}

@JSImport("leaflet", "svg")
@js.native
object svg extends js.Object {
  def apply(): SVG = js.native
  def apply(options: RendererOptions): SVG = js.native
}

