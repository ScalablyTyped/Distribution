package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesRenderCanvasCanvasRendererMod.RenderConfigurations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderRendererMod {
  
  @JSImport("html2canvas/dist/types/render/renderer", "Renderer")
  @js.native
  open class Renderer protected () extends StObject {
    def this(context: Context, options: RenderConfigurations) = this()
    
    /* protected */ val context: Context = js.native
    
    /* protected */ val options: RenderConfigurations = js.native
  }
}
