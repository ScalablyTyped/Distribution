package typings.jupyterlabConsole

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabConsole.panelMod.ConsolePanel
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @JSImport("@jupyterlab/console/lib/tokens", "IConsoleTracker")
  @js.native
  val IConsoleTracker: Token[typings.jupyterlabConsole.tokensMod.IConsoleTracker] = js.native
  type IConsoleTracker = IWidgetTracker[ConsolePanel]
}
