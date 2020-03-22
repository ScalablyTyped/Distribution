package typings.jupyterlabVdom

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabDocregistry.mod.MimeDocument
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typings.luminoCoreutils.mod.Token
import typings.nteractTransformVdom.eventToObjectMod.SerializedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vdom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RenderedVDOM protected () extends IRenderer {
    /**
      * Create a new widget for rendering DOM.
      */
    def this(options: IRendererOptions) = this()
    def this(options: IRendererOptions, context: IContext[IModel]) = this()
    var _comms: js.Any = js.native
    var _mimeType: js.Any = js.native
    var _sessionContext: js.UndefOr[js.Any] = js.native
    var _timer: js.Any = js.native
    /**
      * Handle events for VDOM element.
      */
    def handleVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit = js.native
  }
  
  val IVDOMTracker: Token[typings.jupyterlabVdom.mod.IVDOMTracker] = js.native
  type IVDOMTracker = IWidgetTracker[MimeDocument]
}

