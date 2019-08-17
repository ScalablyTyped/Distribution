package typings.atJupyterlabTerminalDashExtension

import typings.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IShell
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry
import typings.atJupyterlabTerminal.libTokensMod.ITerminalNs.IOptions
import typings.atJupyterlabTerminal.libTokensMod.ITerminalNs.ITerminal
import typings.atJupyterlabTerminal.libTokensMod.ITerminalTracker
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal-extension", JSImport.Namespace)
@js.native
object atJupyterlabTerminalDashExtensionMod extends js.Object {
  /**
    * The default terminal extension.
    */
  val default: JupyterFrontEndPlugin[ITerminalTracker] = js.native
  def addCommands(
    app: JupyterFrontEnd[IShell],
    tracker: WidgetTracker[MainAreaWidget[ITerminal]],
    settingRegistry: ISettingRegistry,
    options: Partial[IOptions]
  ): Unit = js.native
}

