package typings.atJupyterlabTerminalDashExtension

import typings.atJupyterlabApplication.atJupyterlabApplicationMod.JupyterFrontEnd
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IShell
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.WidgetTracker
import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry
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
  val default: JupyterFrontEndPlugin[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ITerminalTracker */ js.Any
  ] = js.native
  def addCommands(
    app: JupyterFrontEnd[IShell],
    tracker: WidgetTracker[
      MainAreaWidget[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ITerminal.ITerminal */ _
      ]
    ],
    settingRegistry: ISettingRegistry,
    options: Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ITerminal.IOptions */ _
    ]
  ): Unit = js.native
}

