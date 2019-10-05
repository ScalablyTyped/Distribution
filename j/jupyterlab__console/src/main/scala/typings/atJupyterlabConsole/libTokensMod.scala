package typings.atJupyterlabConsole

import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.atJupyterlabConsole.libPanelMod.ConsolePanel
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/tokens", JSImport.Namespace)
@js.native
object libTokensMod extends js.Object {
  val IConsoleTracker: Token[typings.atJupyterlabConsole.libTokensMod.IConsoleTracker] = js.native
  type IConsoleTracker = IWidgetTracker[ConsolePanel]
}

