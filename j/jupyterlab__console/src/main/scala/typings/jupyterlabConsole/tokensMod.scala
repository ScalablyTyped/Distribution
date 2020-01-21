package typings.jupyterlabConsole

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabConsole.panelMod.ConsolePanel
import typings.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val IConsoleTracker: Token[typings.jupyterlabConsole.tokensMod.IConsoleTracker] = js.native
  type IConsoleTracker = IWidgetTracker[ConsolePanel]
}

