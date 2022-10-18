package typings.jupyterlabTerminalExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabTerminal.libTokensMod.ITerminal.ITerminal
import typings.jupyterlabTerminal.libTokensMod.ITerminalTracker
import typings.jupyterlabTerminalExtension.anon.PartialIOptions
import typings.jupyterlabTerminalExtension.jupyterlabTerminalExtensionStrings.desktop
import typings.jupyterlabTerminalExtension.jupyterlabTerminalExtensionStrings.mobile
import typings.jupyterlabTranslation.libTokensMod.ITranslator
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
  val default: JupyterFrontEndPlugin[ITerminalTracker, IShell, desktop | mobile] = js.native
  
  inline def addCommands(
    app: JupyterFrontEnd[IShell, desktop | mobile],
    tracker: WidgetTracker[MainAreaWidget[ITerminal]],
    settingRegistry: ISettingRegistry,
    translator: ITranslator,
    options: PartialIOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCommands")(app.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any], translator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
