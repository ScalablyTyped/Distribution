package typings.leaflet.global.L

import typings.leaflet.mod.PointExpression
import typings.leaflet.mod.RendererOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.SVG")
@js.native
class SVG_ ()
  extends typings.leaflet.mod.SVG_ {
  def this(options: RendererOptions) = this()
}
object SVG_ {
  
  @JSGlobal("L.SVG")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(name: String): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  inline def pointsToPath(rings: js.Array[PointExpression], close: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pointsToPath")(rings.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[String]
}
