package typings.jupyterlabPdfExtension

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/pdf-extension", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RenderedPDF () extends IRenderer {
    var _base64: js.Any = js.native
    var _disposable: js.Any = js.native
    var _object: js.Any = js.native
    var _ready: js.Any = js.native
    /**
      * Handle a `before-hide` message.
      */
    /* protected */ def onBeforeHide(): Unit = js.native
  }
  
  val default: IExtension | js.Array[IExtension] = js.native
  val rendererFactory: IRendererFactory = js.native
}

