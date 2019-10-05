package typings.atJupyterlabTerminal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTokensMod {
  import typings.atJupyterlabApputils.atJupyterlabApputilsMod.MainAreaWidget
  import typings.atJupyterlabApputils.libWidgettrackerMod.IWidgetTracker

  type ITerminalTracker = IWidgetTracker[MainAreaWidget[typings.atJupyterlabTerminal.libTokensMod.ITerminal.ITerminal]]
}
