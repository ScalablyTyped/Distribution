package typings.jupyterlabVega5Extension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/vega5-extension", JSImport.Default)
  @js.native
  val default: IExtension = js.native
  
  @JSImport("@jupyterlab/vega5-extension", "RenderedVega")
  @js.native
  class RenderedVega protected () extends IRenderer {
    /**
      * Create a new widget for rendering Vega/Vega-Lite.
      */
    def this(options: IRendererOptions) = this()
    
    var _mimeType: js.Any = js.native
    
    var _resolver: js.Any = js.native
    
    var _result: js.Any = js.native
  }
  
  @JSImport("@jupyterlab/vega5-extension", "VEGALITE3_MIME_TYPE")
  @js.native
  val VEGALITE3_MIME_TYPE: /* "application/vnd.vegalite.v3+json" */ String = js.native
  
  @JSImport("@jupyterlab/vega5-extension", "VEGALITE4_MIME_TYPE")
  @js.native
  val VEGALITE4_MIME_TYPE: /* "application/vnd.vegalite.v4+json" */ String = js.native
  
  @JSImport("@jupyterlab/vega5-extension", "VEGA_MIME_TYPE")
  @js.native
  val VEGA_MIME_TYPE: /* "application/vnd.vega.v5+json" */ String = js.native
  
  @JSImport("@jupyterlab/vega5-extension", "rendererFactory")
  @js.native
  val rendererFactory: IRendererFactory = js.native
  
  type _To = IExtension
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IExtension = default
}
