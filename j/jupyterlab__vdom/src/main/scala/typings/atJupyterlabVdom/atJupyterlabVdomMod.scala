package typings.atJupyterlabVdom

import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabDocregistry.libMod.MimeDocument
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IContext
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRenderer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererOptions
import typings.atNteractTransformDashVdom.libEventDashToDashObjectMod.SerializedEvent
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vdom", JSImport.Namespace)
@js.native
object atJupyterlabVdomMod extends js.Object {
  @js.native
  class RenderedVDOM protected () extends IRenderer {
    /**
      * Create a new widget for rendering DOM.
      */
    def this(options: IRendererOptions) = this()
    def this(options: IRendererOptions, context: IContext[IModel]) = this()
    var _comms: js.Any = js.native
    var _mimeType: js.Any = js.native
    var _session: js.UndefOr[js.Any] = js.native
    var _timer: js.Any = js.native
    /**
      * Handle events for VDOM element.
      */
    def handleVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit = js.native
  }
  
  val IVDOMTracker: Token[typings.atJupyterlabVdom.atJupyterlabVdomMod.IVDOMTracker] = js.native
  type IVDOMTracker = IWidgetTracker[MimeDocument]
}

