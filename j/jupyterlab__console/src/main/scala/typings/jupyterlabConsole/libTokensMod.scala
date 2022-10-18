package typings.jupyterlabConsole

import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabConsole.libPanelMod.ConsolePanel
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @JSImport("@jupyterlab/console/lib/tokens", "IConsoleTracker")
  @js.native
  val IConsoleTracker: Token[typings.jupyterlabConsole.libTokensMod.IConsoleTracker] = js.native
  type IConsoleTracker = IWidgetTracker[ConsolePanel]
}
