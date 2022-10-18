package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesRenderCanvasCanvasRendererMod.RenderConfigurations
import typings.html2canvas.distTypesRenderRendererMod.Renderer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderCanvasForeignobjectRendererMod {
  
  @JSImport("html2canvas/dist/types/render/canvas/foreignobject-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/render/canvas/foreignobject-renderer", "ForeignObjectRenderer")
  @js.native
  open class ForeignObjectRenderer protected () extends Renderer {
    def this(context: Context, options: RenderConfigurations) = this()
    
    var canvas: HTMLCanvasElement = js.native
    
    var ctx: CanvasRenderingContext2D = js.native
    
    def render(element: HTMLElement): js.Promise[HTMLCanvasElement] = js.native
  }
  
  inline def loadSerializedSVG(svg: Node): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSerializedSVG")(svg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
}
