package typings
package atJupyterlabTerminalDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal-extension", JSImport.Namespace)
@js.native
object atJupyterlabTerminalDashExtensionMod extends js.Object {
  /**
    * The default terminal extension.
    */
  val default: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLabPlugin[atJupyterlabTerminalLib.atJupyterlabTerminalMod.ITerminalTracker] = js.native
  def addCommands(
    app: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLab,
    services: atJupyterlabServicesLib.atJupyterlabServicesMod.ServiceManager,
    tracker: atJupyterlabApputilsLib.atJupyterlabApputilsMod.InstanceTracker[
      atJupyterlabApputilsLib.atJupyterlabApputilsMod.MainAreaWidget[atJupyterlabTerminalLib.atJupyterlabTerminalMod.Terminal]
    ]
  ): scala.Unit = js.native
}

