package typings.atJupyterlabConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker
  import typings.atJupyterlabConsole.libPanelMod.ConsolePanel

  type IConsoleTracker = IWidgetTracker[ConsolePanel]
}
