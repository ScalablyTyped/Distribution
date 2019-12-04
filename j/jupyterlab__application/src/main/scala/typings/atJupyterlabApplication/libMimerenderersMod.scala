package typings.atJupyterlabApplication

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryMod.MimeDocument
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IExtension
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IExtensionModule
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/mimerenderers", JSImport.Namespace)
@js.native
object libMimerenderersMod extends js.Object {
  val IMimeDocumentTracker: Token[typings.atJupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker] = js.native
  def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): JupyterFrontEndPlugin[Unit] = js.native
  def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    JupyterFrontEndPlugin[Unit | typings.atJupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker]
  ] = js.native
  type IMimeDocumentTracker = IWidgetTracker[MimeDocument]
}

