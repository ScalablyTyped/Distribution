package typings.jupyterlabPdfExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/pdf-extension", JSImport.Default)
  @js.native
  val default: IExtension | js.Array[IExtension] = js.native
  
  @JSImport("@jupyterlab/pdf-extension", "RenderedPDF")
  @js.native
  open class RenderedPDF () extends IRenderer {
    
    /* private */ var _base64: Any = js.native
    
    /* private */ var _disposable: Any = js.native
    
    /* private */ var _object: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /**
      * Handle a `before-hide` message.
      */
    /* protected */ def onBeforeHide(): Unit = js.native
  }
  
  @JSImport("@jupyterlab/pdf-extension", "rendererFactory")
  @js.native
  val rendererFactory: IRendererFactory = js.native
  
  type _To = IExtension | js.Array[IExtension]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IExtension | js.Array[IExtension] = default
}
