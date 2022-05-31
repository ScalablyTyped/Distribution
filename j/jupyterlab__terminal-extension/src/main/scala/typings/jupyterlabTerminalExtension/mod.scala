package typings.jupyterlabTerminalExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabTerminal.tokensMod.ITerminal.ITerminal
import typings.jupyterlabTerminal.tokensMod.ITerminalTracker
import typings.jupyterlabTerminalExtension.anon.PartialIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/terminal-extension", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default terminal extension.
    */
  @JSImport("@jupyterlab/terminal-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[ITerminalTracker] = js.native
  
  inline def addCommands(
    app: JupyterFrontEnd[IShell],
    tracker: WidgetTracker[MainAreaWidget[ITerminal]],
    settingRegistry: ISettingRegistry,
    options: PartialIOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCommands")(app.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
