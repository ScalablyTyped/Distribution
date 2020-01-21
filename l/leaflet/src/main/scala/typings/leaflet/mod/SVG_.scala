package typings.leaflet.mod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "SVG")
@js.native
class SVG_ () extends Renderer

@JSImport("leaflet", "SVG")
@js.native
object SVG_ extends js.Object {
  def create(name: String): SVGElement = js.native
  def pointsToPath(rings: js.Array[PointExpression], close: Boolean): String = js.native
}

