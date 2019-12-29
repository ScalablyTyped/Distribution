package typings.atJupyterlabVega5DashExtension

import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IExtension
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRenderer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererFactory
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IRendererOptions
import typings.atJupyterlabVega5DashExtension.atJupyterlabVega5DashExtensionStrings.applicationSlashvndDotvegaDotv5Plussignjson
import typings.atJupyterlabVega5DashExtension.atJupyterlabVega5DashExtensionStrings.applicationSlashvndDotvegaliteDotv3Plussignjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/vega5-extension", JSImport.Namespace)
@js.native
object atJupyterlabVega5DashExtensionMod extends js.Object {
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
  
  val VEGALITE_MIME_TYPE: applicationSlashvndDotvegaliteDotv3Plussignjson = js.native
  val VEGA_MIME_TYPE: applicationSlashvndDotvegaDotv5Plussignjson = js.native
  val default: IExtension = js.native
  val rendererFactory: IRendererFactory = js.native
}

