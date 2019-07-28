package typings.atJupyterlabVdom.atJupyterlabVdomMod

import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererOptions
import typings.atNteractTransformDashVdom.libEventDashToDashObjectMod.SerializedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vdom", "RenderedVDOM")
@js.native
class RenderedVDOM protected () extends IRenderer {
  /**
    * Create a new widget for rendering DOM.
    */
  def this(options: IRendererOptions) = this()
  def this(
    options: IRendererOptions,
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<DocumentRegistry.IModel> */ js.Any
  ) = this()
  var _comms: js.Any = js.native
  var _mimeType: js.Any = js.native
  var _session: js.UndefOr[js.Any] = js.native
  var _timer: js.Any = js.native
  /**
    * Handle events for VDOM element.
    */
  def handleVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit = js.native
}

