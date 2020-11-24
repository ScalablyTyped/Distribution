package typings.jupyterlabConsole

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabConsole.panelMod.ConsolePanel
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/console/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  
  val IConsoleTracker: Token[typings.jupyterlabConsole.tokensMod.IConsoleTracker] = js.native
  type IConsoleTracker = IWidgetTracker[ConsolePanel]
}
