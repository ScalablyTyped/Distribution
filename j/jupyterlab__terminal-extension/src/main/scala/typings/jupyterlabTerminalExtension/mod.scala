package typings.jupyterlabTerminalExtension

import org.scalablytyped.runtime.Shortcut
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The default terminal extension.
    */
  @JSImport("@jupyterlab/terminal-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[ITerminalTracker] = js.native
  
  @JSImport("@jupyterlab/terminal-extension", "addCommands")
  @js.native
  def addCommands(
    app: JupyterFrontEnd[IShell],
    tracker: WidgetTracker[MainAreaWidget[ITerminal]],
    settingRegistry: ISettingRegistry,
    options: PartialIOptions
  ): Unit = js.native
  
  type _To = JupyterFrontEndPlugin[ITerminalTracker]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[ITerminalTracker] = default
}
