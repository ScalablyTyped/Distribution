package typings.atJupyterlabApplication.libMimerenderersMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typings.atJupyterlabDocregistry.libMod.MimeDocument
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IExtension
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IExtensionModule
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/mimerenderers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IMimeDocumentTracker: Token[typings.atJupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker] = js.native
  def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): js.Any = js.native
  def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JupyterFrontEndPlugin<void | IMimeDocumentTracker> */ _
  ] = js.native
}

