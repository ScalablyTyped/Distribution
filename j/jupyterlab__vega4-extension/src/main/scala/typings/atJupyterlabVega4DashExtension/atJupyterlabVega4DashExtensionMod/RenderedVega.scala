package typings.atJupyterlabVega4DashExtension.atJupyterlabVega4DashExtensionMod

import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vega4-extension", "RenderedVega")
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

