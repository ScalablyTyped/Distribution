package typings.jupyterlabApplication

import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabDocregistry.mod.MimeDocument
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimerenderersMod {
  
  @JSImport("@jupyterlab/application/lib/mimerenderers", "IMimeDocumentTracker")
  @js.native
  val IMimeDocumentTracker: Token[typings.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  type IMimeDocumentTracker = IWidgetTracker[MimeDocument]
  
  @JSImport("@jupyterlab/application/lib/mimerenderers", "createRendermimePlugin")
  @js.native
  def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): JupyterFrontEndPlugin[Unit] = js.native
  
  @JSImport("@jupyterlab/application/lib/mimerenderers", "createRendermimePlugins")
  @js.native
  def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    JupyterFrontEndPlugin[Unit | typings.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker]
  ] = js.native
}
