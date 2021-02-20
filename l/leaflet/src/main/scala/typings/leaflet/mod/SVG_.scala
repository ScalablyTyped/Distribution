package typings.leaflet.mod

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "SVG")
@js.native
class SVG_ () extends Renderer {
  def this(options: RendererOptions) = this()
}
object SVG_ {
  
  @JSImport("leaflet", "SVG.create")
  @js.native
  def create(name: String): SVGElement = js.native
  
  @JSImport("leaflet", "SVG.pointsToPath")
  @js.native
  def pointsToPath(rings: js.Array[PointExpression], close: Boolean): String = js.native
}
