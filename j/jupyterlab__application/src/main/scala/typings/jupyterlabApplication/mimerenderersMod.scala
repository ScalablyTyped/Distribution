package typings.jupyterlabApplication

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabDocregistry.mod.MimeDocument
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/mimerenderers", JSImport.Namespace)
@js.native
object mimerenderersMod extends js.Object {
  val IMimeDocumentTracker: Token[typings.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): JupyterFrontEndPlugin[Unit] = js.native
  def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    JupyterFrontEndPlugin[Unit | typings.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker]
  ] = js.native
  type IMimeDocumentTracker = IWidgetTracker[MimeDocument]
}

