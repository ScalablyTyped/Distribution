package typings.jupyterlabApplication

import typings.jupyterlabApplication.jupyterlabApplicationStrings.desktop
import typings.jupyterlabApplication.jupyterlabApplicationStrings.mobile
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabDocregistry.mod.MimeDocument
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMimerenderersMod {
  
  @JSImport("@jupyterlab/application/lib/mimerenderers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/application/lib/mimerenderers", "IMimeDocumentTracker")
  @js.native
  val IMimeDocumentTracker: Token[typings.jupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker] = js.native
  type IMimeDocumentTracker = IWidgetTracker[MimeDocument]
  
  inline def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRendermimePlugin")(tracker.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[JupyterFrontEndPlugin[Unit, IShell, desktop | mobile]]
  
  inline def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    JupyterFrontEndPlugin[
      Unit | typings.jupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker, 
      Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRendermimePlugins")(extensions.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    JupyterFrontEndPlugin[
      Unit | typings.jupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker, 
      Any, 
      Any
    ]
  ]]
}
