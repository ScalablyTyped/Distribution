package typings.jupyterlabDocmanagerExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabDocmanagerExtension.jupyterlabDocmanagerExtensionStrings.desktop
import typings.jupyterlabDocmanagerExtension.jupyterlabDocmanagerExtensionStrings.mobile
import typings.jupyterlabServices.libContentsMod.Contents.IModel
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Export the plugins as default.
    */
  @JSImport("@jupyterlab/docmanager-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = js.native
  
  object ToolbarItems {
    
    @JSImport("@jupyterlab/docmanager-extension", "ToolbarItems")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create save button toolbar item.
      *
      */
    inline def createSaveButton(commands: CommandRegistry, fileChanged: ISignal[Any, IModel]): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createSaveButton")(commands.asInstanceOf[js.Any], fileChanged.asInstanceOf[js.Any])).asInstanceOf[Widget]
  }
  
  @JSImport("@jupyterlab/docmanager-extension", "downloadPlugin")
  @js.native
  val downloadPlugin: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/docmanager-extension", "openBrowserTabPlugin")
  @js.native
  val openBrowserTabPlugin: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/docmanager-extension", "pathStatusPlugin")
  @js.native
  val pathStatusPlugin: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/docmanager-extension", "savingStatusPlugin")
  @js.native
  val savingStatusPlugin: JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = js.native
  
  type _To = js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[Any, IShell, desktop | mobile]] = default
}
